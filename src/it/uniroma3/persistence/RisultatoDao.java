package it.uniroma3.persistence;

import java.io.Serializable;
import java.util.List;

import it.uniroma3.models.Risultato;;

public interface RisultatoDao <T> extends Serializable {
	public void create(Risultato result);
	//public void edit(T admin);
	//public void delete(T admin);
	public void remove(Long id);
	public Risultato find(Long id);
	public List<Risultato> findAll();

}
