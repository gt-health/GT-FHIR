package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.IResource;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;

/**
 * This interface contains general funtions to manage the DAO layer, as well as functions related to the ones in {@link IFhirResourceDao}, 
 * but performing operations 'persist', 'merge', 'flush' and 'remove'.
 * @see IFhirResourceDao
 * @author Ismael Sarmento
 */
public interface IFhirDao extends IDao{

	FhirContext getContext();
	
	DaoConfig getConfig();

	<T extends IBaseResource> IFhirResourceDao<T> getDao(Class<T> nextType);

	List<IBaseResource> loadResourcesById(Set<? extends IIdType> includePids);

	BaseResourceEntity updateEntity(IBaseResource resource, BaseResourceEntity entity, boolean b, Date date);
	
	BaseResourceEntity updateEntity(IBaseResource theResource, BaseResourceEntity baseResourceEntity, boolean theUpdateHistory, Date theDeletedTimestampOrNull,
			boolean thePerformIndexing, boolean theUpdateVersion);

	//void validateResourceForStorage(IResource theResource);
}
