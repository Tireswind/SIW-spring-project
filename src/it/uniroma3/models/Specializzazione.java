package it.uniroma3.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="findAllSpecialisations", query="SELECT s FROM Specializzazione s")
public class Specializzazione {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;

	@Column(nullable = false)
	private String descrizione;

	@OneToMany
	@JoinColumn(name="specializzazione_abilitante")
	private List<TipologiaEsame> esamiAbilitati;

	public Specializzazione(String description){
		this.descrizione = description;
	}

	public Specializzazione(){

	}

}
