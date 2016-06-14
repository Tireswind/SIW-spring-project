package it.uniroma3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findAllResults", query="SELECT r FROM Risultato r")
public class Risultato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;

	@Column(nullable = false)
	private String descrizione;
	
	@Column(nullable = false)
	private Double valore;

	public Risultato(String description, Double valore){
		this.descrizione = description;
		this.valore = valore;
	}
	public Risultato(){

	}
}
