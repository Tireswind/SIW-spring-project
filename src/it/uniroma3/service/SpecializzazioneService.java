package it.uniroma3.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import it.uniroma3.models.Specializzazione;;

public interface SpecializzazioneService {
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public List<Specializzazione> listSpec();

	@Secured({"ROLE_ADMIN"})
	public void insertSpec(Specializzazione spec);

	@Secured({"ROLE_ADMIN"})
	public void deleteSpec(Long doctorId);
	
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public Specializzazione findSpecFromId(Long id);

}
