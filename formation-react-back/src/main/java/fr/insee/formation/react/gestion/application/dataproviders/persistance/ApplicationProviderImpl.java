package fr.insee.formation.react.gestion.application.dataproviders.persistance;

import fr.insee.formation.react.gestion.application.domain.model.Application;
import fr.insee.formation.react.gestion.application.domain.port.ApplicationProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ApplicationProviderImpl implements ApplicationProvider {

    ApplicationRepository applicationRepository;

    private static Application tableToModel(ApplicationTable applicationTable) {
        return Application.builder()
                .id(applicationTable.getId())
                .nom(applicationTable.getNom())
                .version(applicationTable.getVersion())
                .etat(applicationTable.getEtat())
                .build();
    }

    private static ApplicationTable modelToTable(Application application) {
        return ApplicationTable.builder()
                .id(application.getId())
                .nom(application.getNom())
                .version(application.getVersion())
                .etat(application.getEtat())
                .build();
    }

    @Override
    public List<Application> findAll() {
        return applicationRepository.findAll()
                .stream()
                .map(ApplicationProviderImpl::tableToModel)
                .toList();
    }

    @Override
    public Optional<Application> getById(Long idApplication) {
        return applicationRepository.findById(idApplication)
                .map(ApplicationProviderImpl::tableToModel);
    }

    @Override
    public Optional<Application> findByNom(String nom) {
        return applicationRepository.findByNom(nom)
                .map(ApplicationProviderImpl::tableToModel);
    }

    @Override
    public Optional<Application> save(Application application) {
        ApplicationTable applicationTable = modelToTable(application);
        ApplicationTable applicationPersists = applicationRepository.save(applicationTable);
        return Optional.ofNullable(tableToModel(applicationPersists));
    }

    @Override
    public void delete(Long id) {

    }
}
