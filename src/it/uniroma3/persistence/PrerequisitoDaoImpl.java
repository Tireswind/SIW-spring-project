package it.uniroma3.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.models.Prerequisito;;

@Repository
public class PrerequisitoDaoImpl <T> implements PrerequisitoDao<T> {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(AmministratoreDaoImpl.class);
	private Class<T> requirementClass;

	public PrerequisitoDaoImpl(){

	}

	public PrerequisitoDaoImpl(Class<T> requirementClass) {
		this.requirementClass = requirementClass;
	}

	@Autowired
	@PersistenceContext(unitName = "clinica-unit")
	private EntityManager em;

	@Override
	@Transactional
	public void create(Prerequisito requirement) {
		em.persist(requirement);
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
			Prerequisito toRemove = find(id);
			if (toRemove != null) {
				em.remove(toRemove);
			}
		}
	}

	@Override
	public Prerequisito find(Long id) {
		return (Prerequisito) em.find(requirementClass, id);
	}

	@Override
	public List<Prerequisito> findAll() {
		List<Prerequisito> requirementList = em.createQuery("SELECT p FROM Prerequisito p", Prerequisito.class).getResultList();
		return requirementList;
	}

}
