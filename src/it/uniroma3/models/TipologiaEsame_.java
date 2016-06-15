package it.uniroma3.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-06-15T09:16:17.179+0200")
@StaticMetamodel(TipologiaEsame.class)
public class TipologiaEsame_ {
	public static volatile SingularAttribute<TipologiaEsame, Long> codice;
	public static volatile SingularAttribute<TipologiaEsame, String> nome;
	public static volatile ListAttribute<TipologiaEsame, Prerequisito> requisiti;
	public static volatile SingularAttribute<TipologiaEsame, String> descrizione;
	public static volatile SingularAttribute<TipologiaEsame, Double> prezzo;
	public static volatile SingularAttribute<TipologiaEsame, Specializzazione> specializzazione_abilitante;
}
