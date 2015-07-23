/**
 * 
 */
package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

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

/**
 * @author Myung Choi
 *
 */
@Entity
@Table(name="visit_occurrence")
@Inheritance(strategy=InheritanceType.JOINED)
@Audited
public class VisitOccurrence extends BaseResourceEntity {
	
	public static final String RESOURCE_TYPE = "Encounter";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="visit_occurrence_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="person_id")
	private Person person;
	
	@Column(name="visit_start_date")
	private Date startDate;
	
	@Column(name="visit_end_date")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="place_of_service_concept_id")
	private Concept placeOfServiceConcept;
	
	@ManyToOne
	@JoinColumn(name="care_site_id")
	private CareSite careSite;
	
	@Column(name="place_of_service_source_value")
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
	 * @see edu.gatech.i3l.fhir.dstu2.entities.IResourceTable#getRelatedResource()
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
				Encounter.Location encounterLocation = new Encounter.Location();
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
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		Encounter encounter = (Encounter) resource;
		this.id = encounter.getId().getIdPartAsLong();
		this.person = new Person();
		this.person.setId(encounter.getPatient().getId().getIdPartAsLong());
		this.startDate = encounter.getPeriod().getStart();
		this.endDate = encounter.getPeriod().getEnd();
		this.careSite = new CareSite();
		Organization organization = new Organization();
		organization.setId(encounter.getServiceProvider().getId().getIdPartAsLong());
		Location location = new Location();
		location.setId(encounter.getLocationFirstRep().getId().getIdPartAsLong());
		this.careSite.setOrganization(organization);
		this.careSite.setLocation(location);
		//TODO set place of service concept
		return null;
	}

	@Override
	public String translateSearchParam(String param) {
		switch (param) {
		case Encounter.SP_PATIENT:
			return "person";
		default:
			break;
		}
		return param;
	}

}