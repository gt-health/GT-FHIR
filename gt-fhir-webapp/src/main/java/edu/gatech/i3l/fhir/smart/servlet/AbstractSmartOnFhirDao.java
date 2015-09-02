/**
 * 
 */
package edu.gatech.i3l.fhir.smart.servlet;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author MC142
 *
 */
public abstract class AbstractSmartOnFhirDao<T extends Serializable> {
	private Class<T> clazz;
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;
	
	public void setClazz( Class< T > clazzToSet ){
	      this.clazz = clazzToSet;
	   }

	   public T findOne( Long id ){
	      return this.entityManager.find( this.clazz, id );
	   }
	   
	   public List< T > findAll(){
	      return this.entityManager.createQuery( "from " + this.clazz.getName() )
	       .getResultList();
	   }

	   public void save( T entity ){
	      this.entityManager.persist( entity );
	   }

	   public void update( T entity ){
	      this.entityManager.merge( entity );
	   }

	   public void delete( T entity ){
	      this.entityManager.remove( entity );
	   }
	   
	   public void deleteById( Long entityId ){
	      T entity = this.findOne( entityId );

	      this.delete( entity );
	   }	
}
