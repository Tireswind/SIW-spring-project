package it.uniroma3.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.openjpa.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Medico;
import it.uniroma3.models.Paziente;
import it.uniroma3.models.Risultato;

@Repository
public class EsameDaoImpl <T> implements EsameDao<T> {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(AmministratoreDaoImpl.class);
	private Class<T> examClass;

	public EsameDaoImpl(){

	}

	public EsameDaoImpl(Class<T> examClass) {
		this.examClass = examClass;
	}

	@Autowired
	@PersistenceContext(unitName = "clinica-unit")
	private EntityManager em;

	@Override
	@Transactional
	public void create(Esame exam) {
		em.persist(exam);
	}
	/*@Override
    public void edit(T entity) {
        logger.log(Level.FINE, "Saving {0}, {1} ", new Object[]{entity.getClass(), entity});
        getJpaTemplate().merge(entity);
    }*/
	/*@Override
    public void delete(T entity) {
        logger.log(Level.FINE, "Delete {0}, {1} ", new Object[]{entity.getClass(), entity});
        getJpaTemplate().remove(getJpaTemplate().merge(entity));
    }*/
	@Override
	@Transactional
	public void remove(Long id) {
		if (id != null) {
			Esame toRemove = find(id);
			if (toRemove != null) {
				em.remove(toRemove);
			}
		}
	}

	@Override
	public Esame find(Long id) {
		return (Esame) em.find(examClass, id);
	}

	@Override
	public List<Esame> findAll() {
		List<Esame> examList = em.createQuery("SELECT e FROM Esame e", Esame.class).getResultList();
		return examList;
	}

	@Override
	public List<Esame> getExamForPatient(Paziente paziente) {
		Query q = em.createQuery("SELECT e FROM Esame e WHERE e.paziente = :paziente");
		q.setParameter("paziente", paziente);
		return (List<Esame>)q.getResultList();
	}

	@Override
	public Map<String,Risultato> getResults(Long id) {
		Query q = em.createQuery("SELECT e.risultati FROM Esame e WHERE e.codice = ?");
		q.setParameter(1, id);
		try{
			Map<String, Risultato> mappaRisultati = (Map<String, Risultato>) q.getSingleResult();
			return (Map<String, Risultato>) q.getSingleResult();
		}catch(NoResultException e){
			Map<String, Risultato> diConsolamento = new HashMap<>();
			diConsolamento.put("no-results", new Risultato("no-descr",0.0));
			return diConsolamento;
		}

	}

	@Override
	public Esame getExamById(Long parameter) {
		return em.find(Esame.class, parameter);
	}

	@Override
	public List<Esame> getExamsByDoctor(Medico m) {
		Query q = em.createQuery("SELECT e FROM Esame e WHERE medico_esaminatore = :medico");
		q.setParameter("medico", m.getCodice());
		return (List<Esame>) q.getResultList();
	}

	@Override
	public void merge(Esame e) {
		em.merge(e);
	}

}


