package it.uniroma3.persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.models.Esame;

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

}

