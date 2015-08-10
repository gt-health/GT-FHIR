/**
 * 
 */
package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.query.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.query.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import edu.gatech.i3l.fhir.dstu2.entities.VisitOccurrenceComplement;

/**
 * @author Myung Choi
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
public class EncounterFhirResourceDao extends BaseFhirResourceDao<Encounter> {

	
	public EncounterFhirResourceDao() {
		super();
		setResourceEntity(VisitOccurrenceComplement.class);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {
			
		};
	}
	

}
