package it.uniroma3.service;

import java.util.List;
import java.util.Map;

import org.springframework.security.access.annotation.Secured;
import it.uniroma3.models.Esame;
import it.uniroma3.models.Medico;
import it.uniroma3.models.Paziente;
import it.uniroma3.models.Risultato;

public interface EsameService {
	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public List<Esame> listExam();

	@Secured({"ROLE_ADMIN"})
	public void insertExam(Esame exam);

	@Secured({"ROLE_ADMIN"})
	public void deleteExam(Long examId);
	
	@Secured({"ROLE_USER"})
	public List<Esame> listExamForPatientId(Paziente paziente);

	@Secured({"ROLE_USER"})
	public Map<String,Risultato> resultsById(Long id);

	@Secured({"ROLE_USER", "ROLE_GUEST", "ROLE_ADMIN"})
	public Esame getExamById(Long long1);

	@Secured({"ROLE_ADMIN"})
	public List<Esame> getExamFromDoctor(Medico m);
	
	@Secured({"ROLE_ADMIN"})
	public void merge(Esame e);

}
