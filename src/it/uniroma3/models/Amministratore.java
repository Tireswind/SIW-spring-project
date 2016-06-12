package it.uniroma3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="findAllAdmins", query="SELECT a FROM Amministratore a"),
	@NamedQuery(name="findAdmin", query="SELECT a FROM Amministratore a WHERE a.id = :id")
})

public class Amministratore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String cognome;

	@Column(nullable = false)
	private String id;

	@Column(nullable = false)
	private String password;
	
	public Amministratore() {
		
	}

	public Amministratore(String id, String password, String name, String surname){
		this.id = id;
		this.password = password;
		this.nome = name;
		this.cognome = surname;
	}
	public Amministratore(String id, String password){
		this.id = id;
		this.password = password;
	}

	public Long getCodice() {
		return codice;
	}

	public void setCodice(Long codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
