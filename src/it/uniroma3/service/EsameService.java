package it.uniroma3.service;

import java.util.List;
import org.springframework.security.access.annotation.Secured;
import it.uniroma3.models.Esame;

public interface EsameService {
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public List<Esame> listExam();

	@Secured({"ROLE_ADMIN"})
	public void insertExam(Esame exam);

	@Secured({"ROLE_ADMIN"})
	public void deleteExam(Long examId);

}
