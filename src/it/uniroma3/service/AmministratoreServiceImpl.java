package it.uniroma3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.models.Amministratore;
import it.uniroma3.persistence.AmministratoreDao;

@Service
public class AmministratoreServiceImpl implements AmministratoreService{

	@Autowired
	private AmministratoreDao<Amministratore> adminDao;

	@Override
	public List<Amministratore> listAdmin() {
		return this.adminDao.findAll();
	}
	@Override
	public void insertAdmin(Amministratore admin) {
		this.adminDao.create(admin);		
	}
	@Override
	public void deleteAdmin(Long adminId) {
		this.adminDao.remove(adminId);
	}
}
