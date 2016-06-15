package it.uniroma3.persistence;

import java.io.Serializable;
import java.util.List;

import it.uniroma3.models.Specializzazione;;

public interface SpecializzazioneDao<T> extends Serializable {
	public void create(Specializzazione spec);
	//public void edit(T admin);
	//public void delete(T admin);
	public void remove(Long id);
	public Specializzazione find(Long id);
	public List<Specializzazione> findAll();
	Specializzazione findById(Long id);

}
