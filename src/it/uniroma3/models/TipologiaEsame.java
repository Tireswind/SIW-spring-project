package it.uniroma3.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="findAllExamTypes", query="SELECT t FROM TipologiaEsame t")
public class TipologiaEsame {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;

	@Column(nullable = false)
	private String nome;

	@OneToMany
	@JoinColumn(name="tipologie_associate")
	private List<Prerequisito> requisiti;

	@Column(nullable = true)//yes
	private String descrizione;

	@Column(nullable = false)
	private double prezzo;
	
	@ManyToOne
	private Specializzazione specializzazione_abilitante;

	public Specializzazione getSpecializzazione_abilitante() {
		return specializzazione_abilitante;
	}

	public void setSpecializzazione_abilitante(Specializzazione specializzazione_abilitante) {
		this.specializzazione_abilitante = specializzazione_abilitante;
	}

	public TipologiaEsame(){

	}

	public TipologiaEsame(String nome, String description){
		this.nome = nome;
		this.descrizione = description;
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

	public List<Prerequisito> getRequisiti() {
		return requisiti;
	}

	public void setRequisiti(List<Prerequisito> requisiti) {
		this.requisiti = requisiti;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String toString(){
		return this.nome;
	}

}
