package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.QuestionnaireResponse;
import edu.gatech.i3l.fhir.dstu2.entities.QuestionsAnswers;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16
 */
public class QuestionnaireResponseFhirResourceDao  extends BaseFhirResourceDao<QuestionnaireResponse>{
    public QuestionnaireResponseFhirResourceDao() {
        setResourceEntity(QuestionsAnswers.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder(){};
    }
}
