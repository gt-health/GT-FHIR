package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceException;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.server.exceptions.ForbiddenOperationException;
import ca.uhn.fhir.rest.server.exceptions.InternalErrorException;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;

public class BaseFhirDao extends AbstractBaseFhirDao{
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

	@Autowired
	private PlatformTransactionManager myPlatformTransactionManager;

	public EntityManager getEntityManager() {
		return myEntityManager;
	}

	public BaseResourceEntity updateEntity(final IBaseResource theResource, BaseResourceEntity entity, boolean theUpdateHistory, Date theDeletedTimestampOrNull) {
		return updateEntity(theResource, entity, theUpdateHistory, theDeletedTimestampOrNull, true, true);
	}

	public BaseResourceEntity updateEntity(final IBaseResource theResource, BaseResourceEntity entity, boolean theUpdateHistory, Date theDeletedTimestampOrNull, boolean thePerformIndexing,
			boolean theUpdateVersion) {
		entity.constructEntityFromResource(theResource);
		try{
			if (entity.getId() == null) {
				myEntityManager.persist(entity);
			} else {
				entity = myEntityManager.merge(entity);
			}
	
			myEntityManager.flush();
	
			if (theResource != null) {
				theResource.setId(new IdDt(entity.getId()));
			}
		} catch (PersistenceException e){
			Throwable cause = e.getCause();
			String message = null;
			while(cause != null){
				message = cause.getMessage();
				cause = cause.getCause();
			}
			if(message.contains("denied") || message.contains("forbidden")){
				throw new ForbiddenOperationException("This operation is not allowed for the current user on the selected server.");
			} else{
				throw new InternalErrorException(message);
			}
		}
		return entity;
	}

	@Override
	public List<IBaseResource> loadResourcesById(Set<? extends IIdType> includePids) {
		//nothing to do here
		return null;
	}

	
}