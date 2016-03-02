package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Flag;
import edu.gatech.i3l.fhir.dstu2.entities.Alert;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Created by mark on 02/03/16.
 */
public class FlagFhirResourceDao extends BaseFhirResourceDao<Flag>{
    public FlagFhirResourceDao() {
        setResourceEntity(Alert.class);
        setValidateBean(true);
    }
    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {};
    }
}
