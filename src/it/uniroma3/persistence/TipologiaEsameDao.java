package it.uniroma3.persistence;

import java.io.Serializable;
import java.util.List;

import it.uniroma3.models.TipologiaEsame;

public interface TipologiaEsameDao <T> extends Serializable {
	public void create(TipologiaEsame examType);
	//public void edit(T admin);
	//public void delete(T admin);
	public void remove(Long id);
	public TipologiaEsame find(Long id);
	public List<TipologiaEsame> findAll();

}
