package it.uniroma3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.models.Paziente;
import it.uniroma3.persistence.PazienteDao;

@Service
public class PazienteServiceImpl implements PazienteService{

	@Autowired
	private PazienteDao<Paziente> patientDao;

	@Override
	public List<Paziente> listPatient() {
		return this.patientDao.findAll();
	}
	@Override
	public void insertPatient(Paziente patient) {
		this.patientDao.create(patient);		
	}
	@Override
	public void deletePatient(Long patientId) {
		this.patientDao.remove(patientId);
	}

	@Override
	public Paziente getPazienteFromId(Long id) {
		return this.patientDao.find(id);
	}

}
