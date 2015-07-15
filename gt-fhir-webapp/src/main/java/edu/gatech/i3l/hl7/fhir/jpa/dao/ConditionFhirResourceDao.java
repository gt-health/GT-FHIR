package edu.gatech.i3l.hl7.fhir.jpa.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.jpa.dao.QueryHelper;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import edu.gatech.i3l.jpa.model.omop.ext.ConditionFhirExtTable;

@Transactional(propagation = Propagation.REQUIRED)
public class ConditionFhirResourceDao extends BaseFhirResourceDao<Condition> {

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(ConditionFhirResourceDao.class);

	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

	public ConditionFhirResourceDao() {
		setResourceEntity(ConditionFhirExtTable.class);
	}
	
	@PostConstruct
	public void  setQueryHelper(){
		setQueryHelper(new QueryHelper(getEntityManager(), getResourceEntity(), getResourceType(), getContext(), getBaseFhirDao()));
		setPredicateBuilder(this.predicateBuilder);	
	}
	
	PredicateBuilder predicateBuilder = new AbstractPredicateBuilder() {
	};

}
