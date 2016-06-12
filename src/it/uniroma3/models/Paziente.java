package it.uniroma3.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name="findAllPatients", query="SELECT p FROM Paziente p"),
	//	@NamedQuery(name="insertPatient", query="INSERT INTO Paziente p(codice, cognome, datadinascita, "
	//		+ "id, nome, password, sesso values(:cognome, :datadinascita, :id, :nome, :password, :sesso)")
})

public class Paziente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;

	@Column(nullable = false)//yes
	private String nome;

	@Column(nullable = false)//yes
	private String cognome;

	@Column(nullable = false)//yes
	private String sesso;

	@Column(nullable = false)//yes
	private Date dataDiNascita;

	@Column(nullable = false)
	private String id;

	@Column(nullable = false)//yes
	private String password;

	@OneToMany(mappedBy="paziente")
	private List<Esame> esami;
	
	public Paziente(){
	}


	public Paziente(String id, String password){
		this.id = id;
		this.password = password;
	}

	public Paziente(String name, String surname, String sex, Date birthDate, String id, String password){
		this.nome = name;
		this.cognome = surname;
		this.sesso = sex;
		this.dataDiNascita = birthDate;
		this.id = id;
		this.password = password;
	}

	public Paziente(String nome, String cognome, String id, String password){
		this.nome = nome;
		this.cognome = cognome;
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

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
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

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}	
}
