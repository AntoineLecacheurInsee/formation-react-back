package fr.insee.formation.react.gestion.application.domain.usecase;

import fr.insee.formation.react.gestion.application.domain.model.Application;
import fr.insee.formation.react.gestion.application.domain.port.ApplicationProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ListerApplicationUseCase {

    private final ApplicationProvider applicationProvider;

    public List<Application> executer() {
        return applicationProvider.findAll();
    }
}
