package fr.insee.formation.react.services;

import fr.insee.formation.react.entities.EtatApplication;

public class ApplicationDto {

	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ApplicationDto() {
		super();
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
	private String nom;
	private String version;
	private EtatApplication etat;
}
