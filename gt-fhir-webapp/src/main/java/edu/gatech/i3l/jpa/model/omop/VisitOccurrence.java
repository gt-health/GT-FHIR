/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop;

import java.util.Collection;
import java.util.Date;

import ca.uhn.fhir.jpa.entity.BaseTag;
import ca.uhn.fhir.jpa.entity.TagDefinition;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.primitive.IdDt;

/**
 * @author MC142
 *
 */
public class VisitOccurrence extends BaseResourceTable {
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
	 * @see edu.gatech.i3l.jpa.model.omop.IResourceTable#getRelatedResourceType()
	 */
	@Override
	public Class<? extends IResource> getRelatedResourceType() {
		// TODO Auto-generated method stub
		return Encounter.class;
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#addTag(ca.uhn.fhir.jpa.entity.TagDefinition)
	 */
	@Override
	public BaseTag addTag(TagDefinition arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getIdDt()
	 */
	@Override
	public IdDt getIdDt() {
		return new IdDt(getResourceType(), id);
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getResourceType()
	 */
	@Override
	public String getResourceType() {
		return "Encounter";
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getTags()
	 */
	@Override
	public Collection<? extends BaseTag> getTags() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getVersion()
	 */
	@Override
	public long getVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
