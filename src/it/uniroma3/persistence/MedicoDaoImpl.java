package it.uniroma3.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.models.Medico;
import it.uniroma3.models.Specializzazione;


@Repository
public class MedicoDaoImpl <T> implements MedicoDao<T> {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(AmministratoreDaoImpl.class);
	private Class<T> doctorClass;

	public MedicoDaoImpl(){

	}

	public MedicoDaoImpl(Class<T> doctorClass) {
		this.doctorClass = doctorClass;
	}

	@Autowired
	@PersistenceContext(unitName = "clinica-unit")
	private EntityManager em;

	@Override
	@Transactional
	public void create(Medico doctor) {
		em.persist(doctor);
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
			Medico toRemove = find(id);
			if (toRemove != null) {
				em.remove(toRemove);
			}
		}
	}

	@Override
	public Medico find(Long id) {
		return em.find(Medico.class, id);
		//return (Medico) em.find(doctorClass, id);
	}

	@Override
	public List<Medico> findAll() {
		List<Medico> doctorList = em.createQuery("SELECT m FROM Medico m", Medico.class).getResultList();
		return doctorList;
	}

}
