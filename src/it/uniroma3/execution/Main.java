package it.uniroma3.execution;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.models.Medico;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-unit");
		EntityManager em = emf.createEntityManager();
		
		Medico medico = new Medico("gino","de paoli",null);

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(medico);
		tx.commit();

		em.close();
		emf.close();

	}

}
