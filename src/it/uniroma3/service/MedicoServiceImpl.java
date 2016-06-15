package it.uniroma3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.models.Medico;
import it.uniroma3.persistence.MedicoDao;

@Service
public class MedicoServiceImpl implements MedicoService{

	@Autowired
	private MedicoDao<Medico> doctorDao;

	@Override
	public List<Medico> listDoctor() {
		return null;
		//return this.doctorDao.findAll();
	}
	@Override
	public void insertDoctor(Medico doctor) {
		this.doctorDao.create(doctor);		
	}
	@Override
	public void deleteDoctor(Long doctorId) {
		this.doctorDao.remove(doctorId);
	}

	@Override
	public Medico getMedicoFromId(Long attribute) {
		return doctorDao.find(attribute);
	}
}
