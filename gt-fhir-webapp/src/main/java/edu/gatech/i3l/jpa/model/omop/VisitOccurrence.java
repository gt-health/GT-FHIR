/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop;

import java.util.Date;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;

/**
 * @author MC142
 *
 */
public class VisitOccurrence extends BaseResourceEntity {
	private Long id;
	private Person person;
	private Date startDate;
	private Date endDate;
	private Concept placeOfServiceConcept;
	private CareSite careSite;
	private String placeOfServiceSourceValue;
	
	public VisitOccurrence() {
		super();
	}
	
	public VisitOccurrence(Long id, Person person, Date startDate, Date endDate,
			Concept placeOfServiceConcept, CareSite careSite, String placeOfServiceSourceValue) {
		super();
		
		this.id = id;
		this.person = person;
		this.startDate = startDate;
		this.endDate = endDate;
		this.placeOfServiceConcept = placeOfServiceConcept;
		this.careSite = careSite;
		this.placeOfServiceSourceValue = placeOfServiceSourceValue;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Concept getPlaceOfServiceConcept() {
		return placeOfServiceConcept;
	}
	
	public void setPlaceOfServiceConcept(Concept placeOfServiceConcept) {
		this.placeOfServiceConcept = placeOfServiceConcept;
	}
	
	public CareSite getCareSite() {
		return careSite;
	}
	
	public void setCareSite(CareSite careSite) {
		this.careSite = careSite;
	}
	
	public String getPlaceOfServiceSourceValue() {
		return placeOfServiceSourceValue;
	}
	
	public void setPlaceOfServiceSourceValue(String placeOfServiceSourceValue) {
		this.placeOfServiceSourceValue = placeOfServiceSourceValue;
	}
	
	/* (non-Javadoc)
	 * @see edu.gatech.i3l.jpa.model.omop.IResourceTable#getRelatedResource()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Encounter getRelatedResource() {
		Encounter encounter = new Encounter();
		
		// set parameters
		
		return encounter;
	}


	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getResourceType()
	 */
	@Override
	public String getResourceType() {
		return "Encounter";
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdDt getIdDt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateLink(String chain) {
		// TODO Auto-generated method stub
		return null;
	}

}
