package fr.insee.formation.react.entities;

public enum EtatApplication {

	ACTIVE("Active"), OBSOLETE("Obsolète");
	
	private EtatApplication(String libelle) {
		this.libelle = libelle;
	}

	private String libelle;

	public String getLibelle() {
		return libelle;
	}
	
}
