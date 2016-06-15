package it.uniroma3.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-06-15T13:55:18.694+0200")
@StaticMetamodel(Esame.class)
public class Esame_ {
	public static volatile SingularAttribute<Esame, Long> codice;
	public static volatile SingularAttribute<Esame, Paziente> paziente;
	public static volatile SingularAttribute<Esame, Medico> esaminatore;
	public static volatile SingularAttribute<Esame, TipologiaEsame> tipologiaEsame;
	public static volatile SingularAttribute<Esame, Date> dataPrenotazione;
	public static volatile SingularAttribute<Esame, Date> dataEsecuzione;
	public static volatile ListAttribute<Esame, Risultato> risultati;
}
