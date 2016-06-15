package it.uniroma3.service;

import java.util.List;
import it.uniroma3.models.Amministratore;
import org.springframework.security.access.annotation.Secured;

public interface AmministratoreService {

	@Secured({"ROLE_ADMIN"})
	public List<Amministratore> listAdmin();

	@Secured({"ROLE_ADMIN"})
	public void insertAdmin(Amministratore admin);

	@Secured({"ROLE_ADMIN"})
	public void deleteAdmin(Long adminId);

}
