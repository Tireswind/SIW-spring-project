package it.uniroma3.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.models.Amministratore;

@Repository
public class AmministratoreDaoImpl<T> implements AmministratoreDao<T> {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(AmministratoreDaoImpl.class);
	private Class<T> adminClass;

	public AmministratoreDaoImpl(){

	}

	public AmministratoreDaoImpl(Class<T> adminClass) {
		this.adminClass = adminClass;
	}

	@Autowired
	@PersistenceContext(unitName = "clinica-unit")
	private EntityManager em;

	@Override
	@Transactional
	public void create(Amministratore admin) {
		em.persist(admin);
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
	@Transactional
	@Override
	public void remove(Long id) {
		if (id != null) {
			Amministratore toRemove = find(id);
			if (toRemove != null) {
				em.remove(toRemove);
			}
		}
	}

	@Override
	public Amministratore find(Long id) {
		return (Amministratore) em.find(adminClass, id);
	}

	@Override
	public List<Amministratore> findAll() {
		List<Amministratore> adminList = em.createQuery("SELECT a FROM Amministratore a", Amministratore.class).getResultList();
		return adminList;
	}

}





