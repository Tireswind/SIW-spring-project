package it.uniroma3.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.models.Specializzazione;

@Repository
public class SpecializzazioneDaoImpl <T> implements SpecializzazioneDao<T> {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(AmministratoreDaoImpl.class);
	private Class<T> specClass;

	public SpecializzazioneDaoImpl(){

	}

	public SpecializzazioneDaoImpl(Class<T> specClass) {
		this.specClass = specClass;
	}

	@Autowired
	@PersistenceContext(unitName = "clinica-unit")
	private EntityManager em;

	@Override
	@Transactional
	public void create(Specializzazione spec) {
		em.persist(spec);
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
			Specializzazione toRemove = find(id);
			if (toRemove != null) {
				em.remove(toRemove);
			}
		}
	}

	@Override
	public Specializzazione find(Long id) {
		return (Specializzazione) em.find(specClass, id);
	}

	@Override
	public List<Specializzazione> findAll() {
		List<Specializzazione> specList = em.createQuery("SELECT s FROM Specializzazione s", Specializzazione.class).getResultList();
		return specList;
	}

	@Override
	public Specializzazione findById(Long id) {
		//Query q = em.createQuery("SELECT s FROM Specializzazione s WHERE s.codice = ?");
		//q.setParameter(1, id);
		return em.find(Specializzazione.class, id);
		//return (Specializzazione) q.getSingleResult();
	}


}