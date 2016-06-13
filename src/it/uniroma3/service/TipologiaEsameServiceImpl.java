package it.uniroma3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.uniroma3.models.TipologiaEsame;
import it.uniroma3.persistence.TipologiaEsameDao;

@Service
public class TipologiaEsameServiceImpl implements TipologiaEsameService{

	@Autowired
	private TipologiaEsameDao<TipologiaEsame> examTypeDao;

	@Override
	public List<TipologiaEsame> listExamType() {
		//messo a null perchè al momento nulla è stato caricato
		//return null;
		return this.examTypeDao.findAll();
	}
	@Override
	public void insertExamType(TipologiaEsame examType) {
		this.examTypeDao.create(examType);		
	}
	@Override
	public void deleteExamType(Long examTypeId) {
		this.examTypeDao.remove(examTypeId);
	}
}
