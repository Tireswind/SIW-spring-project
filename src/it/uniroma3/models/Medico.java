package it.uniroma3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="findAllDoctors", query="SELECT m FROM Medico m")
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String cognome;

	@OneToOne
	@JoinColumn(name="specializzazione")
	private Specializzazione spec;

	public Medico(String name, String surname, Specializzazione specialisation){
		this.nome = name;
		this.cognome = surname;
		this.spec = specialisation;
	}

	public Medico(){

	}

}
