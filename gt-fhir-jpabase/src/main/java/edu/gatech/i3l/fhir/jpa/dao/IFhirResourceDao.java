package edu.gatech.i3l.fhir.jpa.dao;

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
import java.util.Map;
import java.util.Set;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;

import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.api.ValidationModeEnum;
import ca.uhn.fhir.rest.api.EncodingEnum;
import ca.uhn.fhir.rest.api.server.IBundleProvider;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;

public interface IFhirResourceDao<T extends IBaseResource> extends IDao {

	DaoMethodOutcome create(T theResource);

	DaoMethodOutcome create(T theResource, String theIfNoneExist);

	/**
	 * @param thePerformIndexing
	 *           Use with caution! If you set this to false, you need to manually perform indexing or your resources
	 *           won't be indexed and searches won't work.
	 */
	DaoMethodOutcome create(T theResource, String theIfNoneExist, boolean thePerformIndexing);

	DaoMethodOutcome delete(IIdType theResource);

	DaoMethodOutcome deleteByUrl(String theString);

	Class<T> getResourceType();

	IBundleProvider history(Date theSince);

	IBundleProvider history(IIdType theId, Date theSince);

	IBundleProvider history(Long theId, Date theSince);

	/**
	 * 
	 * @param theId
	 * @return
	 * @throws ResourceNotFoundException
	 *            If the ID is not known to the server
	 */
	T read(IIdType theId);

	BaseResourceEntity readEntity(IIdType theId);

	/**
	 * @param theCheckForForcedId
	 *           If true, this method should fail if the requested ID contains a numeric PID which exists, but is
	 *           obscured by a "forced ID" so should not exist as far as the outside world is concerned.
	 */
	BaseResourceEntity readEntity(IIdType theId, boolean theCheckForForcedId);

	IBundleProvider search(Map<String, IQueryParameterType> theParams);

	IBundleProvider search(SearchParameterMap theMap);

	IBundleProvider search(String theParameterName, IQueryParameterType theValue);

	Set<Long> searchForIds(Map<String, IQueryParameterType> theParams);

	Set<Long> searchForIds(String theParameterName, IQueryParameterType theValue);

	Set<Long> searchForIdsWithAndOr(SearchParameterMap theParams);

	DaoMethodOutcome update(T theResource);

	DaoMethodOutcome update(T theResource, String theMatchUrl);

	/**
	 * @param thePerformIndexing
	 *           Use with caution! If you set this to false, you need to manually perform indexing or your resources
	 *           won't be indexed and searches won't work.
	 */
	DaoMethodOutcome update(T theResource, String theMatchUrl, boolean thePerformIndexing);

	/**
	 * Not supported in DSTU1!
	 */
	MethodOutcome validate(T theResource, IdDt theId, String theRawResource, EncodingEnum theEncoding, ValidationModeEnum theMode, String theProfile);

}
