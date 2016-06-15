package it.uniroma3.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-06-15T08:53:21.066+0200")
@StaticMetamodel(Specializzazione.class)
public class Specializzazione_ {
	public static volatile SingularAttribute<Specializzazione, Long> codice;
	public static volatile SingularAttribute<Specializzazione, String> descrizione;
	public static volatile ListAttribute<Specializzazione, TipologiaEsame> esamiAbilitati;
}
