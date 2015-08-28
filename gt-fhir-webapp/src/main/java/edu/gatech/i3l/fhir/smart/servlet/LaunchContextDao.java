/**
 * 
 */
package edu.gatech.i3l.fhir.smart.servlet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author MC142
 *
 */
public class LaunchContextDao {
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;
	
	@Autowired
	private PlatformTransactionManager myPlatformTransactionManager;

	public EntityManager getEntityManager() {
		return myEntityManager;
	}

	
}
