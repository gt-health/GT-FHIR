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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.FhirSystemDaoDstu2;
import ca.uhn.fhir.jpa.entity.ResourceTable;
import ca.uhn.fhir.jpa.util.StopWatch;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.rest.server.IBundleProvider;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import edu.gatech.i3l.jpa.model.omop.Person;

public class BaseFhirSystemDao<T> extends FhirSystemDaoDstu2 {
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(BaseFhirSystemDao.class);

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void deleteAllTagsOnServer() {
		myEntityManager.createQuery("DELETE from ResourceTag t").executeUpdate();
	}

	@PersistenceContext()
	protected EntityManager myEntityManager;

	protected boolean hasValue(InstantDt theInstantDt) {
		return theInstantDt != null && theInstantDt.isEmpty() == false;
	}

	protected ResourceTable tryToLoadEntity(IdDt nextId) {
		ResourceTable entity;
		try {
			Long pid = translateForcedIdToPid(nextId);
			entity = myEntityManager.find(ResourceTable.class, pid);
		} catch (ResourceNotFoundException e) {
			entity = null;
		}
		return entity;
	}

	protected ResourceTable loadFirstEntityFromCandidateMatches(Set<Long> candidateMatches) {
		return myEntityManager.find(ResourceTable.class, candidateMatches.iterator().next());
	}

	@Override
	public IBundleProvider history(Date theSince) {
		StopWatch w = new StopWatch();
		IBundleProvider retVal = super.history(null, null, theSince);
		ourLog.info("Processed global history in {}ms", w.getMillisAndRestart());
		return retVal;
	}

	@Override
	public TagList getAllTags() {
		StopWatch w = new StopWatch();
		TagList retVal = super.getTags(null, null);
		ourLog.info("Processed getAllTags in {}ms", w.getMillisAndRestart());
		return retVal;
	}

	@Override
	public Map<String, Long> getResourceCounts() {
		Map<String, Long> retVal = new HashMap<String, Long>();
		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class); 
		criteria.select(builder.count(criteria.from(Person.class)));

		Long r = myEntityManager.createQuery(criteria).getSingleResult(); 
		retVal.put("Patient", r);//FIXME the only resource provided for now is Patient; this needs to be changed to support count of other resources

		return retVal;
	}

}
