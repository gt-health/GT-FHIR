package edu.gatech.i3l.hl7.fhir.jpa.dao;

import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu2.resource.Observation;

public class ObservationFhirResourceDao extends BaseFhirResourceDao<Observation>{
	
	

	public ObservationFhirResourceDao() {
		super();
		setResourceEntity(edu.gatech.i3l.jpa.model.omop.Observation.class); //TODO set this automatically; this is error prone since we need to remember to set this on each dao class
	}

	@Override
	public Predicate translatePredicateDateGreaterThan(String arg0, Date arg1,
			Root<? extends IResourceEntity> arg2, CriteriaBuilder arg3,
			boolean arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predicate translatePredicateDateLessThan(String arg0, Date arg1,
			Root<? extends IResourceEntity> arg2, CriteriaBuilder arg3,
			boolean arg4) {
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
