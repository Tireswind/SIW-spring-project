package it.uniroma3.persistence;

import java.io.Serializable;
import java.util.List;

import it.uniroma3.models.Medico;

public interface MedicoDao <T> extends Serializable {
	public void create(Medico doctor);
	//public void edit(T admin);
	//public void delete(T admin);
	public void remove(Long id);
	public Medico find(Long id);
	public List<Medico> findAll();
}
