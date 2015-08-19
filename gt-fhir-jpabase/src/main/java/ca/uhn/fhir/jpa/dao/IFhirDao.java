package ca.uhn.fhir.jpa.dao;
/*
 * #%L
 * HAPI FHIR JPA Server
 * %%
 * Copyright (C) 2014 - 2015 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.TagDefinition;
import ca.uhn.fhir.jpa.entity.TagTypeEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.dstu2.composite.MetaDt;
import ca.uhn.fhir.rest.server.IBundleProvider;

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

	TagDefinition getTag(TagTypeEnum tag, String theScheme, String theTerm, String theLabel);
	
	TagList getTags(Class<? extends IResource> theResourceType, IIdType theResourceId);

	BaseResourceEntity updateEntity(IResource resource, BaseResourceEntity entity, boolean b, Date date);
	
	BaseResourceEntity updateEntity(IResource theResource, BaseResourceEntity baseResourceEntity, boolean theUpdateHistory, Date theDeletedTimestampOrNull,
			boolean thePerformIndexing, boolean theUpdateVersion);

	IBundleProvider history(String myResourceName, Long theId, Date theSince);
	
	MetaDt toMetaDt(List<TagDefinition> tagDefinitions);

	//void validateResourceForStorage(IResource theResource);
}
