/**
 * 
 */
package edu.gatech.i3l.fhir.smart.servlet;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.commons.lang3.time.DateUtils;

import edu.gatech.i3l.fhir.jpa.dao.BaseFhirSystemDao;

/**
 * @author mc142
 *
 */
public class SmartOnFhirLaunchContextDao<T> extends BaseFhirSystemDao<T> implements ISmartFhirSystem<T> {
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(SmartOnFhirLaunchContextDao.class);

//	public SmartOnFhirLaunchContextDao() {
//		super();
//		setClazz(SmartLaunchContext.class);
//	}

	@SuppressWarnings("unchecked")
	public T findOne(Long id) {
		return (T) getBaseFhirDao().getEntityManager().find(SmartLaunchContext.class, id);
	}

	public void deleteOneDayOld () {
		// Get today's date. And, delete any entries that are one day old.
		EntityManager em = getBaseFhirDao().getEntityManager();
		Date yesterday = DateUtils.addDays(new Date(), -1);
		Query q = em.createQuery("DELETE FROM SmartLaunchContext s WHERE s.createdAt < :yesterday");
		q.setParameter("yesterday", yesterday);		
		q.executeUpdate();		
	}
	
	@SuppressWarnings("unchecked")
	public T findOneAndDelete(Long id) {
		deleteOneDayOld();		
		return findOne(id);
	}
	
	@SuppressWarnings("unchecked")
	public void saveAndDelete (T entity) {
		save (entity);
		deleteOneDayOld();
		
		
//		SmartLaunchContext smartLaunchContext = (SmartLaunchContext) entity;
//		EntityManager em = getBaseFhirDao().getEntityManager();
//		Query q = em.createQuery("select s from SmartLaunchContext s where s.username=:username and s.createdBy=:who and s.clientId=:what")
//				.setParameter("username", smartLaunchContext.getUsername())
//				.setParameter("who", smartLaunchContext.getCreatedBy())
//				.setParameter("what", smartLaunchContext.getClientId());
//		
//		List<SmartLaunchContext> launchContextEntities = q.getResultList();
//		if (launchContextEntities.isEmpty()) {
//			save (entity);
//		} else {
//			// We may have multiple entries (not supposed to). But if so, we just use the first one.
//			SmartLaunchContext toBeUpdated = launchContextEntities.get(0);
//			smartLaunchContext.setLaunchId(toBeUpdated.getLaunchId());
//			update((T) smartLaunchContext);
//		}
	}
	
	public void save(T entity) {
		EntityManager em = getBaseFhirDao().getEntityManager();
		em.persist(entity);
		em.flush();
	}

	public void update(T entity) {
		getBaseFhirDao().getEntityManager().merge(entity);
	}

	public void delete(T entity) {
		getBaseFhirDao().getEntityManager().remove(entity);
	}

	public void deleteById(Long entityId) {
		T entity = this.findOne(entityId);

		this.delete(entity);
	}

}
