package it.uniroma3.persistence;
import java.io.Serializable;
import java.util.List;

import it.uniroma3.models.Amministratore;

public interface AmministratoreDao<T> extends Serializable {
	public void create(Amministratore admin);
	//public void edit(T admin);
	//public void delete(T admin);
	public void remove(Long id);
	public Amministratore find(Long id);
	public List<Amministratore> findAll();

}

