package it.uniroma3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.models.Prerequisito;
import it.uniroma3.persistence.PrerequisitoDao;

@Service
public class PrerequisitoServiceImpl implements PrerequisitoService{

	@Autowired
	private PrerequisitoDao<Prerequisito> requirementDao;

	@Override
	public List<Prerequisito> listRequirement() {
		return this.requirementDao.findAll();
	}
	@Override
	public void insertRequirement(Prerequisito requirement) {
		this.requirementDao.create(requirement);		
	}
	@Override
	public void deleteRequirement(Long requirementId) {
		this.requirementDao.remove(requirementId);
	}
}
