package it.uniroma3.persistence;

import java.io.Serializable;
import java.util.List;

import it.uniroma3.models.Esame;

public interface EsameDao<T> extends Serializable {
	public void create(Esame exam);
	//public void edit(T admin);
	//public void delete(T admin);
	public void remove(Long id);
	public Esame find(Long id);
	public List<Esame> findAll();
}


