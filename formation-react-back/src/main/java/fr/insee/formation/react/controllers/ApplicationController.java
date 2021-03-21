package fr.insee.formation.react.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.insee.formation.react.services.ApplicationDto;
import fr.insee.formation.react.services.ApplicationService;

@RestController
public class ApplicationController {
	
	private ApplicationService applicationService;
	
	@PostMapping("/applications")
	public ApplicationDto creer(@RequestBody ApplicationDto dto) {
		return applicationService.creer(dto);
	}
}
