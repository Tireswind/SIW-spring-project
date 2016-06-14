package it.uniroma3.models;

import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="findAllExams", query="SELECT e FROM Esame e")
public class Esame{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codice;
	
	private String diprova;

	public String getDiprova() {
		return diprova;
	}

	public void setDiprova(String diprova) {
		this.diprova = diprova;
	}

	@ManyToOne//yes
	@JoinColumn(name = "paziente_esaminato")
	private Paziente paziente;

	@OneToOne//yes
	@JoinColumn(name = "medico_esaminatore")
	private Medico esaminatore;

	@OneToOne
	@JoinColumn(name="tipologia_esame")
	private TipologiaEsame tipologiaEsame;

	@Column(nullable = false)
	private Date dataPrenotazione;

	@Column(nullable = false)
	private Date dataEsecuzione;

	@OneToMany//yes
	@JoinColumn(name="esame_relativo")
	private Map<String,Risultato> risultati;


	public Esame(Paziente patient, Medico doctor, TipologiaEsame examType, Date pren, Date exec){
		this.paziente = patient;
		this.esaminatore = doctor;
		this.tipologiaEsame = examType;
		this.dataPrenotazione = pren;
		this.dataEsecuzione = exec;
	}

	public Esame(){

	}

	public Long getCodice() {
		return codice;
	}

	public void setCodice(Long codice) {
		this.codice = codice;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public Medico getEsaminatore() {
		return esaminatore;
	}

	public void setEsaminatore(Medico esaminatore) {
		this.esaminatore = esaminatore;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public Date getDataEsecuzione() {
		return dataEsecuzione;
	}

	public void setDataEsecuzione(Date dataEsecuzione) {
		this.dataEsecuzione = dataEsecuzione;
	}

	public Map<String, Risultato> getRisultati() {
		return risultati;
	}

	public void setRisultati(Map<String, Risultato> risultati) {
		this.risultati = risultati;
	}

}
