package it.uniroma3.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Risultato;
import it.uniroma3.persistence.RisultatoDao;

@Service
public class RisultatoServiceImpl implements RisultatoService{

	@Autowired
	private RisultatoDao<Risultato> resultDao;

	@Override
	public List<Risultato> listResult() {
		return this.resultDao.findAll();
	}
	@Override
	public void insertResult(Risultato result) {
		this.resultDao.create(result);		
	}
	@Override
	public void deleteResult(Long resultId) {
		this.resultDao.remove(resultId);
	}

	@Override
	public Map<String, Risultato> getResultsByExam(Esame e) {
		return this.resultDao.findResultsByExam(e);
	}
}
