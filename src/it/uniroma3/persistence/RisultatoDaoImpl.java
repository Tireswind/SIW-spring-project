package it.uniroma3.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Risultato;;

@Repository
public class RisultatoDaoImpl <T> implements RisultatoDao<T> {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(AmministratoreDaoImpl.class);
	private Class<T> resultClass;

	public RisultatoDaoImpl(){

	}

	public RisultatoDaoImpl(Class<T> resultClass) {
		this.resultClass = resultClass;
	}

	@Autowired
	@PersistenceContext(unitName = "clinica-unit")
	private EntityManager em;

	@Override
	@Transactional
	public void create(Risultato result) {
		em.persist(result);
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
			Risultato toRemove = find(id);
			if (toRemove != null) {
				em.remove(toRemove);
			}
		}
	}

	@Override
	public Risultato find(Long id) {
		return (Risultato) em.find(resultClass, id);
	}

	@Override
	public List<Risultato> findAll() {
		List<Risultato> resultList = em.createQuery("SELECT r FROM Risultato r", Risultato.class).getResultList();
		return resultList;
	}

	@Override
	public Map<String, Risultato> findResultsByExam(Esame e) {
		Query q = em.createQuery("SELECT r FROM Risultato r WHERE r.esame_relativo = :esame");
		q.setParameter("esame", e);
		List<Risultato> results = q.getResultList();
		Map<String, Risultato> mappa = new HashMap<>();
		for (Risultato r : results){
			mappa.put(r.getDescrizione(), r);
		}
		return mappa;
	}


}