package it.uniroma3.persistence;

import java.io.Serializable;
import java.util.List;

import it.uniroma3.models.Prerequisito;

public interface PrerequisitoDao <T> extends Serializable {
	public void create(Prerequisito requirement);
	//public void edit(T admin);
	//public void delete(T admin);
	public void remove(Long id);
	public Prerequisito find(Long id);
	public List<Prerequisito> findAll();

}
