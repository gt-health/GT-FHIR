/**
 * 
 */
package edu.gatech.i3l.hl7.fhir.jpa.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import edu.gatech.i3l.jpa.model.omop.ext.VisitOccurrenceFhirExtTable;

/**
 * @author MC142
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
public class EncounterFhirResourceDao extends BaseFhirResourceDao<Encounter> {
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(EncounterFhirResourceDao.class);

	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

	public EncounterFhirResourceDao() {
		setResourceEntity(VisitOccurrenceFhirExtTable.class);
	}

	@Override
	public Predicate translatePredicateDateGreaterThan(String arg0, Date arg1,
			Root<? extends IResourceEntity> arg2, CriteriaBuilder arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predicate translatePredicateDateLessThan(String arg0, Date arg1,
			Root<? extends IResourceEntity> arg2, CriteriaBuilder arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predicate translatePredicateString(String arg0, String arg1,
			Root<? extends IResourceEntity> arg2, CriteriaBuilder arg3) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
