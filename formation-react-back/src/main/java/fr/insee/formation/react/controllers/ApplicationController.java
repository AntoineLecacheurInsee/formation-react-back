package fr.insee.formation.react.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.insee.formation.react.services.ApplicationDto;
import fr.insee.formation.react.services.ApplicationService;

@RestController
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@PostMapping("/applications")
	public ApplicationDto creer(@RequestBody ApplicationDto dto) {
		return applicationService.creer(dto);
	}
}
