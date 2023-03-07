package fr.insee.formation.react.gestion.application.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    private Long id;
    private String nom;
    private String version;
    private EtatApplication etat;
}
