package it.uniroma3.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import it.uniroma3.models.Prerequisito;

public interface PrerequisitoService {
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public List<Prerequisito> listRequirement();

	@Secured({"ROLE_ADMIN"})
	public void insertRequirement(Prerequisito requirement);

	@Secured({"ROLE_ADMIN"})
	public void deleteRequirement(Long requirementId);

}
