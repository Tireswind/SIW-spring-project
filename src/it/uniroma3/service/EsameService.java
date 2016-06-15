package it.uniroma3.service;

import java.util.List;
import java.util.Map;

import org.springframework.security.access.annotation.Secured;
import it.uniroma3.models.Esame;
import it.uniroma3.models.Medico;
import it.uniroma3.models.Paziente;
import it.uniroma3.models.Risultato;

public interface EsameService {
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN", "ROLE_ANONYMOUS"})
	public List<Esame> listExam();

	@Secured({"ROLE_ADMIN"})
	public void insertExam(Esame exam);

	@Secured({"ROLE_ADMIN"})
	public void deleteExam(Long examId);

	void merge(Esame e);

	@Secured({"ROLE_ADMIN"})
	List<Esame> getExamFromDoctor(Medico m);

	@Secured({"ROLE_ADMIN", "ROLE_USER", "ROLE_GUEST"})
	Esame getExamById(Long parameter);

	@Secured({"ROLE_ADMIN", "ROLE_USER", "ROLE_GUEST"})
	Map<String, Risultato> resultsById(Long id);

	@Secured({"ROLE_ADMIN", "ROLE_USER", "ROLE_GUEST"})
	List<Esame> listExamForPatientId(Paziente paziente);

}
