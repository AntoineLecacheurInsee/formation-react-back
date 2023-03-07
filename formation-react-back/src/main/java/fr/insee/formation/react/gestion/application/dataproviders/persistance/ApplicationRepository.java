package fr.insee.formation.react.gestion.application.dataproviders.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplicationRepository extends JpaRepository<ApplicationTable, Long> {

    Optional<ApplicationTable> findByNom(String nom);
}
