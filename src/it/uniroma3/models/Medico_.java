package it.uniroma3.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-06-15T08:53:21.060+0200")
@StaticMetamodel(Medico.class)
public class Medico_ {
	public static volatile SingularAttribute<Medico, Long> codice;
	public static volatile SingularAttribute<Medico, String> nome;
	public static volatile SingularAttribute<Medico, String> cognome;
	public static volatile SingularAttribute<Medico, Specializzazione> spec;
}
