package edu.gatech.i3l.hl7.fhir.jpa.dao;

import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu2.resource.Location;

public class LocationFhirResourceDao extends BaseFhirResourceDao<Location>{

	public LocationFhirResourceDao() {
		setResourceEntity(edu.gatech.i3l.jpa.model.omop.Location.class);
	}

	@Override
	public Predicate translatePredicateString(String theParamName,
			String likeExpression, Root<? extends IResourceEntity> from,
			CriteriaBuilder theBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predicate translatePredicateDateLessThan(String theParamName,
			Date upperBound, Root<? extends IResourceEntity> from,
			CriteriaBuilder theBuilder, boolean inclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predicate translatePredicateDateGreaterThan(String theParamName,
			Date lowerBound, Root<? extends IResourceEntity> from,
			CriteriaBuilder theBuilder, boolean inclusive) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
