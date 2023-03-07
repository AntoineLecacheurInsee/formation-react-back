package fr.insee.formation.react.gestion.application.domain.usecase;

import fr.insee.formation.react.gestion.application.domain.port.ApplicationProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SupprimerApplicationUseCase {

    private final ApplicationProvider applicationProvider;

    public void executer(Long idApplication) {
        applicationProvider.delete(idApplication);
    }
}
