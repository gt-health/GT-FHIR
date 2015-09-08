/**
 * 
 */
package edu.gatech.i3l.fhir.smart.servlet;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.gatech.i3l.fhir.jpa.dao.IDao;
import edu.gatech.i3l.fhir.jpa.dao.IDaoListener;
import edu.gatech.i3l.fhir.jpa.dao.IFhirSystemDao;

/**
 * @author MC142
 *
 */
public interface ISmartFhirSystem<T> extends IFhirSystemDao<T> {
	public T findOne(Long id);

	public void saveIfNeeded (T entity);

	public void save(T entity);

	public void update(T entity);

	public void delete(T entity);

	public void deleteById(Long entityId);
}
