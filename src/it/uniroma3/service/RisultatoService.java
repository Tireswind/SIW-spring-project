package it.uniroma3.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import it.uniroma3.models.Risultato;

public interface RisultatoService {
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public List<Risultato> listResult();

	@Secured({"ROLE_ADMIN"})
	public void insertResult(Risultato result);

	@Secured({"ROLE_ADMIN"})
	public void deleteResult(Long doctorId);


}
