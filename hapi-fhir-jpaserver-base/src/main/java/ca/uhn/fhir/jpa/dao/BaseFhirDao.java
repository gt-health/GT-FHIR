package ca.uhn.fhir.jpa.dao;

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

import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.TagDefinition;
import ca.uhn.fhir.jpa.entity.TagTypeEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.dstu2.composite.MetaDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.server.IBundleProvider;

public class BaseFhirDao extends AbstractBaseFhirDao{
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(BaseFhirDao.class);
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

	@Autowired
	private PlatformTransactionManager myPlatformTransactionManager;

	public EntityManager getEntityManager() {
		return myEntityManager;
	}

	public IBundleProvider history(String theResourceName, Long theId, Date theSince) {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected TagList getTags(Class<? extends IResource> theResourceType, IdDt theResourceId) {
		// TODO Auto-generated method stub
				return null;
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

	@Override
	public TagDefinition getTag(TagTypeEnum tag, String theScheme, String theTerm, String theLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TagList getTags(Class<? extends IResource> theResourceType, IIdType theResourceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt toMetaDt(List<TagDefinition> tagDefinitions) {
		// TODO Auto-generated method stub
		return null;
	}
	
}