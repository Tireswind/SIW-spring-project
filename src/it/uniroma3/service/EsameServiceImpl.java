package it.uniroma3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.models.Esame;
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


}
