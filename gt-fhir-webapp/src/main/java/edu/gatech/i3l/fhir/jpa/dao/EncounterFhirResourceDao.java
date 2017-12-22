/**
 * 
 */
package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.model.dstu2.resource.Encounter;
import edu.gatech.i3l.fhir.dstu3.entities.VisitOccurrence;
//import edu.gatech.i3l.fhir.dstu2.entities.VisitOccurrenceComplement;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * @author Myung Choi
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
public class EncounterFhirResourceDao extends BaseFhirResourceDao<Encounter> {

	
	public EncounterFhirResourceDao() {
		super();
		setResourceEntity(VisitOccurrence.class);
		setValidateBean(true);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {
			
		};
	}
	

}
