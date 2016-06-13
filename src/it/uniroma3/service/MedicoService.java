package it.uniroma3.service;

import java.util.List;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

import it.uniroma3.models.Medico;
@Component
public interface MedicoService {
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public List<Medico> listDoctor();

	@Secured({"ROLE_ADMIN"})
	public void insertDoctor(Medico doctor);

	@Secured({"ROLE_ADMIN"})
	public void deleteDoctor(Long doctorId);

}
