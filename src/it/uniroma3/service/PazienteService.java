package it.uniroma3.service;

import java.util.List;
import org.springframework.security.access.annotation.Secured;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Paziente;

public interface PazienteService {
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public List<Paziente> listPatient();

	@Secured({"ROLE_ADMIN"})
	public void insertPatient(Paziente patient);

	@Secured({"ROLE_ADMIN"})
	public void deletePatient(Long patientId);
	
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public Paziente getPazienteFromId(Long id);


}
