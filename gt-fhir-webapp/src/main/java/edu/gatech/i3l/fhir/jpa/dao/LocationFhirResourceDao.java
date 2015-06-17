package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ca.uhn.fhir.jpa.dao.DaoMethodOutcome;
import ca.uhn.fhir.jpa.entity.TagTypeEnum;
import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.dstu2.composite.MetaDt;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.server.IBundleProvider;
import edu.gatech.i3l.jpa.model.omop.IResourceTable;

public class LocationFhirResourceDao extends BaseFhirResourceDao<Location>{

	public LocationFhirResourceDao() {
		setResourceTable(edu.gatech.i3l.jpa.model.omop.Location.class);
	}
	
	@Override
	public void addTag(IdDt theId, TagTypeEnum theTagType, String theScheme,
			String theTerm, String theLabel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DaoMethodOutcome create(Location theResource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome create(Location theResource, String theIfNoneExist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome create(Location theResource, String theIfNoneExist,
			boolean thePerformIndexing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome delete(IdDt theResource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome deleteByUrl(String theString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TagList getAllResourceTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TagList getTags(IdDt theResourceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBundleProvider history(Date theSince) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBundleProvider history(IdDt theId, Date theSince) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBundleProvider history(Long theId, Date theSince) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeTag(IdDt theId, TagTypeEnum theTagType, String theScheme,
			String theTerm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IBundleProvider search(Map<String, IQueryParameterType> theParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBundleProvider search(String theParameterName,
			IQueryParameterType theValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Long> searchForIds(Map<String, IQueryParameterType> theParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Long> searchForIds(String theParameterName,
			IQueryParameterType theValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome update(Location theResource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome update(Location theResource, String theMatchUrl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome update(Location theResource, String theMatchUrl,
			boolean thePerformIndexing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt metaGetOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt metaGetOperation(IdDt theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt metaDeleteOperation(IdDt theId1, MetaDt theMetaDel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt metaAddOperation(IdDt theId1, MetaDt theMetaAdd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predicate translatePredicateDateLessThan(String theParamName, Date upperBound, Root<? extends IResourceTable> from,
			CriteriaBuilder theBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predicate translatePredicateDateGreaterThan(String theParamName, Date lowerBound, Root<? extends IResourceTable> from,
			CriteriaBuilder theBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predicate translatePredicateString(String theParamName, String likeExpression, Root<? extends IResourceTable> from,
			CriteriaBuilder theBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

}
