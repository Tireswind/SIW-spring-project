package it.uniroma3.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-06-15T08:53:21.061+0200")
@StaticMetamodel(Paziente.class)
public class Paziente_ {
	public static volatile SingularAttribute<Paziente, Long> codice;
	public static volatile SingularAttribute<Paziente, String> nome;
	public static volatile SingularAttribute<Paziente, String> cognome;
	public static volatile SingularAttribute<Paziente, String> sesso;
	public static volatile SingularAttribute<Paziente, Date> dataDiNascita;
	public static volatile SingularAttribute<Paziente, String> id;
	public static volatile SingularAttribute<Paziente, String> password;
	public static volatile ListAttribute<Paziente, Esame> esami;
}
