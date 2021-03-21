package fr.insee.formation.react.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Application {
	
	private static final String APPLICATION_ID_SEQ = "application_id_seq";

	@Id
	@SequenceGenerator(name = APPLICATION_ID_SEQ, sequenceName = APPLICATION_ID_SEQ, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= APPLICATION_ID_SEQ)	
	private Long id;
	
	@Column(columnDefinition = "text")
	private String nom;
	@Column(columnDefinition = "text")
	private String version;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Enumerated(EnumType.STRING)
	private EtatApplication etat;

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
