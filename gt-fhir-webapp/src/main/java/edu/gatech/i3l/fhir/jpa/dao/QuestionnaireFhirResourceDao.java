package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Questionnaire;
import edu.gatech.i3l.fhir.dstu2.entities.QuestionsAnswers;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

public class QuestionnaireFhirResourceDao extends BaseFhirResourceDao<Questionnaire>{
    public QuestionnaireFhirResourceDao() {
        setResourceEntity(QuestionsAnswers.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder(){};
    }
}
