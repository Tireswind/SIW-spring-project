package it.uniroma3.persistence;

import java.io.Serializable;
import java.util.List;

import it.uniroma3.models.Paziente;

public interface PazienteDao <T> extends Serializable {
	public void create(Paziente patient);
	//public void edit(T admin);
	//public void delete(T admin);
	public void remove(Long id);
	public Paziente find(Long id);
	public List<Paziente> findAll();

}
