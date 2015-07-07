/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.jpa.model.omop.Location;

/**
 * @author MC142
 *
 */
public class VisitOccurrence extends BaseResourceEntity {
	
	public static final String RESOURCE_TYPE = "Encounter";

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
	@Override
	public Encounter getRelatedResource() {
		Encounter encounter = new Encounter();
		
		// http://hl7-fhir.github.io/encounter.html
		//
		encounter.setId(getIdDt());
		
		// set class
		String place_of_service = getPlaceOfServiceConcept().getName().toLowerCase();
		if (place_of_service.contains("inpatient")) {
			encounter.setClassElement(EncounterClassEnum.INPATIENT);			
		} else if (place_of_service.contains("outpatient")) {
			encounter.setClassElement(EncounterClassEnum.OUTPATIENT);			
		} else if (place_of_service.contains("ambulatory")
				|| place_of_service.contains("office")) {
			encounter.setClassElement(EncounterClassEnum.AMBULATORY);			
		} else if (place_of_service.toLowerCase().contains("home")) {
			encounter.setClassElement(EncounterClassEnum.HOME);			
		} else if (place_of_service.toLowerCase().contains("emergency")) {
			encounter.setClassElement(EncounterClassEnum.EMERGENCY);			
		} else if (place_of_service.toLowerCase().contains("field")) {
			encounter.setClassElement(EncounterClassEnum.FIELD);			
		} else if (place_of_service.toLowerCase().contains("daytime")) {
			encounter.setClassElement(EncounterClassEnum.DAYTIME);			
		} else if (place_of_service.toLowerCase().contains("virtual")) {
			encounter.setClassElement(EncounterClassEnum.VIRTUAL);			
		} else {
			encounter.setClassElement(EncounterClassEnum.OTHER);			
		}
		
		// set Patient Reference
		ResourceReferenceDt patientReference = new ResourceReferenceDt(person.getIdDt()); 
		encounter.setPatient(patientReference);
		
		// set Period
		PeriodDt visitPeriod = new PeriodDt();
		visitPeriod.setStartWithSecondsPrecision(startDate);
		visitPeriod.setEndWithSecondsPrecision(endDate);
		encounter.setPeriod(visitPeriod);
		
		// we get some information from care site.
		CareSite careSite = getCareSite();
		if (careSite != null) {
			// set Location
			Location location = careSite.getLocation();
			if (location != null) {
				ca.uhn.fhir.model.dstu2.resource.Encounter.Location encounterLocation = new ca.uhn.fhir.model.dstu2.resource.Encounter.Location();
				ResourceReferenceDt locationReference = new ResourceReferenceDt(location.getIdDt());
				encounterLocation.setLocation(locationReference);
				encounter.addLocation(encounterLocation);
			}
			
			// set serviceProvider
			Organization organization = careSite.getOrganization();
			if (organization != null) {
				ResourceReferenceDt serviceProviderReference = new ResourceReferenceDt(organization.getIdDt());
				encounter.setServiceProvider(serviceProviderReference);
			}
		}
		
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
	
	public IdDt getIdDt() {
		return new IdDt(getResourceType(), id);
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getResourceType()
	 */
	@Override
	public String getResourceType() {
		return RESOURCE_TYPE;
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

}