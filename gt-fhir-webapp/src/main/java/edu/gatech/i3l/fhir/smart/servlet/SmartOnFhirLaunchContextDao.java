/**
 * 
 */
package edu.gatech.i3l.fhir.smart.servlet;

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

	public void save(T entity) {
		getBaseFhirDao().getEntityManager().merge(entity);
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
