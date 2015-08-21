package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.IdDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;

public class BaseFhirDao extends AbstractBaseFhirDao{
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

	@Autowired
	private PlatformTransactionManager myPlatformTransactionManager;

	public EntityManager getEntityManager() {
		return myEntityManager;
	}

	public BaseResourceEntity updateEntity(final IResource theResource, BaseResourceEntity entity, boolean theUpdateHistory, Date theDeletedTimestampOrNull) {
		return updateEntity(theResource, entity, theUpdateHistory, theDeletedTimestampOrNull, true, true);
	}

	public BaseResourceEntity updateEntity(final IResource theResource, BaseResourceEntity entity, boolean theUpdateHistory, Date theDeletedTimestampOrNull, boolean thePerformIndexing,
			boolean theUpdateVersion) {
		//TODO History
//		if (theResource != null) {
//			String resourceType = getContext().getResourceDefinition(theResource).getName();
//			if (isNotBlank(entity.getResourceType()) && !entity.getResourceType().equals(resourceType)) {
//				throw new UnprocessableEntityException("Existing resource ID[" + entity.getIdDt().toUnqualifiedVersionless() + "] is of type[" + entity.getResourceType() + "] - Cannot update with ["
//						+ resourceType + "]");
//			}
//		}
//
//		if (theUpdateHistory) {
//			final ResourceHistoryTable historyEntry = entity.toHistory();
//			myEntityManager.persist(historyEntry);
//		}
//
//		if (theUpdateVersion) {
//			entity.setVersion(entity.getVersion() + 1);
//		}
		entity.constructEntityFromResource(theResource);

		if (entity.getId() == null) {
			myEntityManager.persist(entity);
		} else {
			entity = myEntityManager.merge(entity);
		}

		myEntityManager.flush();

		if (theResource != null) {
			theResource.setId(new IdDt(entity.getId()));
		}

		return entity;
	}

	@Override
	public List<IBaseResource> loadResourcesById(Set<? extends IIdType> includePids) {
		// TODO Auto-generated method stub
		return null;
	}

	
}