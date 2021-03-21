package fr.insee.formation.react.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.insee.formation.react.entities.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

	Optional <Application> findByNom(String nom);
}
