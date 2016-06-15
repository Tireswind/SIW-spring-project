
package it.uniroma3.persistence;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Medico;
import it.uniroma3.models.Paziente;
import it.uniroma3.models.Risultato;

public interface EsameDao<T> extends Serializable {
	public void create(Esame exam);
	//public void edit(T admin);
	//public void delete(T admin);
	public void remove(Long id);
	public Esame find(Long id);
	public List<Esame> findAll();
	public List<Esame> getExamForPatient(Paziente paziente);
	public Map<String,Risultato> getResults(Long id);
	public Esame getExamById(Long parameter);
	List<Esame> getExamnsByDoctor(Medico m);
	void merge(Esame e);
}


