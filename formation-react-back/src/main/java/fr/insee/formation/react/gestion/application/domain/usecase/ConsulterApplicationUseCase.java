package fr.insee.formation.react.gestion.application.domain.usecase;

import fr.insee.formation.react.gestion.application.domain.model.Application;
import fr.insee.formation.react.gestion.application.domain.port.ApplicationProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ConsulterApplicationUseCase {

    private final ApplicationProvider applicationProvider;

    public Optional<Application> executer(Long idApplication) {
        return applicationProvider.getById(idApplication);
    }
}
