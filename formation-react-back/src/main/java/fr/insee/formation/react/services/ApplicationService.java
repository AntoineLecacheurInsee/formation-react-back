package fr.insee.formation.react.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	public List<ApplicationDto> lister() {
		return applicationRepository.findAll().stream()
				.map(entity -> {
					ApplicationDto dto = new ApplicationDto();
					dto.setId(entity.getId());
					dto.setNom(entity.getNom());
					dto.setVersion(entity.getVersion());
					dto.setEtat(entity.getEtat());
					return dto;
				})
				.collect(Collectors.toList());
	}
	
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
	
	public void supprimer(Long id) {
		applicationRepository.deleteById(id);
	}
}
