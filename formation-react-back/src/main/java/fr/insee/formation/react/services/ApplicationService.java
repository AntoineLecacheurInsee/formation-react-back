package fr.insee.formation.react.services;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.insee.formation.react.entities.Application;
import fr.insee.formation.react.repositories.ApplicationRepository;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Transactional
	public ApplicationDto creer(ApplicationDto dto) {
		if(StringUtils.isNotEmpty(dto.getNom())) {
			Application entity = new Application();
			Optional<Application> optional = applicationRepository.findByNom(StringUtils.trim(dto.getNom()));
			if(optional.isPresent()) {
				entity = optional.get();
			}
			entity.setNom(StringUtils.trim(dto.getNom()));
			entity.setVersion(dto.getVersion());
			entity.setEtat(dto.getEtat());
			applicationRepository.save(entity);
			dto.setId(entity.getId());
		}		
		return dto;
	}
}
