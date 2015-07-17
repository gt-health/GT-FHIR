/**
 * 
 */
package edu.gatech.i3l.hl7.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.Encounter;

/**
 * @author MC142
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
public class EncounterFhirResourceDao extends BaseFhirResourceDao<Encounter> {

	@Override
	public PredicateBuilder getPredicateBuilder() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
