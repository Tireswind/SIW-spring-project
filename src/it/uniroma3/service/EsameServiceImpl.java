package it.uniroma3.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Paziente;
import it.uniroma3.models.Risultato;
import it.uniroma3.persistence.EsameDao;

@Service
public class EsameServiceImpl implements EsameService{

	@Autowired
	private EsameDao<Esame> examDao;

	@Override
	public List<Esame> listExam() {
		return this.examDao.findAll();
	}
	@Override
	public void insertExam(Esame exam) {
		this.examDao.create(exam);		
	}
	@Override
	public void deleteExam(Long examId) {
		this.examDao.remove(examId);
	}
	
	@Override
	public Map<String,Risultato> resultsById(Long id) {
		return this.examDao.getResults(id);

	}
	@Override
	public List<Esame> listExamForPatientId(Paziente paziente) {
		return this.examDao.getExamForPatient(paziente);
	}
	@Override
	public Esame getExamById(Long parameter) {
		return this.examDao.getExamById(parameter);
	}


}
