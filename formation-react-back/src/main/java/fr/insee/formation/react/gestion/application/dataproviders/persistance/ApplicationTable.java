package fr.insee.formation.react.gestion.application.dataproviders.persistance;

import fr.insee.formation.react.gestion.application.domain.model.EtatApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "application")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicationTable {

    private static final String APPLICATION_ID_SEQ = "application_id_seq";

    @Id
    @SequenceGenerator(name = APPLICATION_ID_SEQ, sequenceName = APPLICATION_ID_SEQ, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = APPLICATION_ID_SEQ)
    private Long id;

    @Column(columnDefinition = "text")
    private String nom;
    @Column(columnDefinition = "text")
    private String version;
    @Enumerated(EnumType.STRING)
    private EtatApplication etat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public EtatApplication getEtat() {
        return etat;
    }

    public void setEtat(EtatApplication etat) {
        this.etat = etat;
    }

}
