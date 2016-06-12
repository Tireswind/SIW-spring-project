package it.uniroma3.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.models.Paziente;

@Repository
public class PazienteDaoImpl <T> implements PazienteDao<T> {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(AmministratoreDaoImpl.class);
	private Class<T> patientClass;

	public PazienteDaoImpl(){

	}

	public PazienteDaoImpl(Class<T> patientClass) {
		this.patientClass = patientClass;
	}

	@Autowired
	@PersistenceContext(unitName = "clinica-unit")
	private EntityManager em;

	@Override
	@Transactional
	public void create(Paziente patient) {
		em.persist(patient);
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
			Paziente toRemove = find(id);
			if (toRemove != null) {
				em.remove(toRemove);
			}
		}
	}

	@Override
	public Paziente find(Long id) {
		return (Paziente) em.find(patientClass, id);
	}

	@Override
	public List<Paziente> findAll() {
		List<Paziente> patientList = em.createQuery("SELECT p FROM Paziente p", Paziente.class).getResultList();
		return patientList;
	}

}