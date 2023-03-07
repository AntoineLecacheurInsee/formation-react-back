package fr.insee.formation.react.gestion.application.domain.port;

import fr.insee.formation.react.gestion.application.domain.model.Application;

import java.util.List;
import java.util.Optional;

public interface ApplicationProvider {

    List<Application> findAll();

    Optional<Application> getById(Long idApplication);

    Optional<Application> findByNom(String nom);

    Optional<Application> save(Application application);

    void delete(Long id);
}
