package it.uniroma3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findAllRequirements", query="SELECT p FROM Prerequisito p")
public class Prerequisito {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;

	@Column(nullable = false)
	private String descrizione;

	public Prerequisito(String description){
		this.descrizione = description;
	}

	public Prerequisito(){

	}

}
