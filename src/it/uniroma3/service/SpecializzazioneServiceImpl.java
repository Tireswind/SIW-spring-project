package it.uniroma3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.models.Specializzazione;
import it.uniroma3.persistence.SpecializzazioneDao;

@Service
public class SpecializzazioneServiceImpl implements SpecializzazioneService{

	@Autowired
	private SpecializzazioneDao<Specializzazione> specDao;

	@Override
	public List<Specializzazione> listSpec() {
		return this.specDao.findAll();
	}
	@Override
	public void insertSpec(Specializzazione spec) {
		this.specDao.create(spec);		
	}
	@Override
	public void deleteSpec(Long specId) {
		this.specDao.remove(specId);
	}
	@Override
	public Specializzazione findSpecFromId(Long id) {
		return this.specDao.findById(id);
	}

}
