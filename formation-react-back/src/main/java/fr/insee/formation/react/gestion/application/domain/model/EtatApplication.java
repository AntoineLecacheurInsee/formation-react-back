package fr.insee.formation.react.gestion.application.domain.model;

public enum EtatApplication {

    ACTIVE("Active"), OBSOLETE("Obsolète");

    private String libelle;

    private EtatApplication(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

}
