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
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.engine.spi.EntityEntry;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.FhirSystemDaoDstu2;
import ca.uhn.fhir.jpa.entity.ResourceTable;
import ca.uhn.fhir.jpa.util.StopWatch;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.rest.server.IBundleProvider;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import edu.gatech.i3l.jpa.model.omop.IResourceTable;
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
	
	private String myEntitiesPackage = "edu.gatech.i3l.jpa.model.omop";

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

	/**
	 * @return A map with the provided resource types and how many registries are stored in the database for each resource.
	 */
	@Override
	public Map<String, Long> getResourceCounts() {
		Map<String, Long> retVal = new HashMap<String, Long>();

		ClassPathScanningCandidateComponentProvider cpsccp = new ClassPathScanningCandidateComponentProvider(true); 
		TypeFilter filter = new AssignableTypeFilter(IResourceTable.class);
		cpsccp.addIncludeFilter(filter );
		Set<BeanDefinition> beans = cpsccp.findCandidateComponents(myEntitiesPackage);

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		for (BeanDefinition beanDefinition : beans) {
			String className = beanDefinition.getBeanClassName();
			try {
				Class<?> defClass = Class.forName(className);
				IResourceTable resEntity = (IResourceTable) defClass.newInstance();
				Class<? extends IResource> resType = resEntity.getRelatedResourceType();
				if(resType != null){
					CriteriaQuery<Long> criteria = builder.createQuery(Long.class); 
					criteria.select(builder.count(criteria.from(defClass)));
					Long r = myEntityManager.createQuery(criteria).getSingleResult(); 
					retVal.put(resType.getSimpleName(), r);					
				}
			} catch (ClassNotFoundException e) {
				ourLog.error("Resource count: the class {} wasn't found on the classpath.", className);
			} catch (InstantiationException e) {
				// TODO use mirrors lib
			} catch (IllegalAccessException e) {
			}
		}

		return retVal;
	}

}
