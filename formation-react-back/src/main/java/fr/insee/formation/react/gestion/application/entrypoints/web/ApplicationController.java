package fr.insee.formation.react.gestion.application.entrypoints.web;

import fr.insee.formation.react.gestion.application.domain.model.Application;
import fr.insee.formation.react.gestion.application.domain.usecase.*;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/applications")
public class ApplicationController {
    private ListerApplicationUseCase listerApplicationUseCase;
    private AjouterApplicationUseCase ajouterApplicationUseCase;
    private ConsulterApplicationUseCase consulterApplicationUseCase;

    private RechercherApplicationUseCase rechercherApplicationUseCase;
    private SupprimerApplicationUseCase supprimerApplicationUseCase;

    @GetMapping()
    public List<Application> lister() {
        return listerApplicationUseCase.executer();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Application> getById(@PathVariable Long id) {
        Optional<Application> app = consulterApplicationUseCase.executer(id);
        return app.map(application -> ResponseEntity.ok(application))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

//    @GetMapping()
//    public ResponseEntity<Application> queryByName(@RequestParam String nom) {
//        Optional<Application> app = rechercherApplicationUseCase.executer(nom);
//        return app.map(application -> ResponseEntity.ok(application))
//                .orElseGet(() -> ResponseEntity.notFound().build());
//    }

    @PostMapping()
    public Application creer(@RequestBody Application application) {
        return ajouterApplicationUseCase.executer(application);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        supprimerApplicationUseCase.executer(id);
    }
}
