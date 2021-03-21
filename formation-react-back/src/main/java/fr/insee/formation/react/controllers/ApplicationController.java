package fr.insee.formation.react.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.insee.formation.react.services.ApplicationDto;
import fr.insee.formation.react.services.ApplicationService;

@RestController
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@GetMapping("/applications")
	public List<ApplicationDto> lister () {
		return applicationService.lister();
	}
	
	@PostMapping("/applications")
	public ApplicationDto creer(@RequestBody ApplicationDto dto) {
		return applicationService.creer(dto);
	}
	
	@DeleteMapping("/applications/{id}")
	public void supprimer(@PathVariable Long id) {
		applicationService.supprimer(id);
	}
}
