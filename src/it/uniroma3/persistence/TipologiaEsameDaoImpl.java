package it.uniroma3.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.models.TipologiaEsame;;

@Repository
public class TipologiaEsameDaoImpl <T> implements TipologiaEsameDao<T> {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(AmministratoreDaoImpl.class);
	private Class<T> examTypeClass;

	public TipologiaEsameDaoImpl(){

	}

	public TipologiaEsameDaoImpl(Class<T> examTypeClass) {
		this.examTypeClass = examTypeClass;
	}

	@Autowired
	@PersistenceContext(unitName = "clinica-unit")
	private EntityManager em;

	@Override
	@Transactional
	public void create(TipologiaEsame examType) {
		em.persist(examType);
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
			TipologiaEsame toRemove = find(id);
			if (toRemove != null) {
				em.remove(toRemove);
			}
		}
	}

	@Override
	public TipologiaEsame find(Long id) {
		return (TipologiaEsame) em.find(examTypeClass, id);
	}

	@Override
	public List<TipologiaEsame> findAll() {
		List<TipologiaEsame> examTypeList = em.createQuery("SELECT a FROM Amministratore a", TipologiaEsame.class).getResultList();
		return examTypeList;
	}

}