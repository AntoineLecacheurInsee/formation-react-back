package fr.insee.formation.react.gestion.application.domain.usecase;

import fr.insee.formation.react.gestion.application.domain.model.Application;
import fr.insee.formation.react.gestion.application.domain.port.ApplicationProvider;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@AllArgsConstructor
@Transactional(readOnly = true)
public class AjouterApplicationUseCase {

    private final ApplicationProvider applicationProvider;

    @Transactional
    public Application executer(Application application) {
        return applicationProvider.save(application)
                .orElseThrow(
                        () -> new ApplicationContextException("L'application n'a pas pu être sauvegardée")
                );
    }
}
