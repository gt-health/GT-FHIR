/**
 * 
 */
package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.Encounter.SP_DATE;
import static ca.uhn.fhir.model.dstu2.resource.Encounter.SP_PATIENT;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
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
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

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
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="person_id", nullable=false)
	@NotNull
	private Person person;
	
	@Column(name="visit_start_date", nullable=false)
	@NotNull
	private Date startDate;
	
	@Column(name="visit_end_date", nullable=false)
	@NotNull
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="place_of_service_concept_id", nullable=false)
	@Audited(targetAuditMode=RelationTargetAuditMode.NOT_AUDITED)
	@NotNull
	private Concept placeOfServiceConcept;
	
	/**
	 * The location (care site) here is set as required, since the field 'placeOfServiceConcept' is required in Omop v4.0 and it is derived
	 * from {@link CareSite#getPlaceOfServiceConcept()}.
	 * 
	 * @fhir Location, List of locations the patient has been at
	 * @fhirVersion 0.5.0
	 */
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="care_site_id")
	@NotNull
	private CareSite careSite; //FIXME field names should reflect fhir names, for validation purposes.
	
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
	
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
		Long patientRef = encounter.getPatient().getReference().getIdPartAsLong();
		if(patientRef != null){
			if(this.person == null)
				this.person = new Person();
			this.person.setId(patientRef);
		}
		/* Set Period */
		this.startDate = encounter.getPeriod().getStart();
		this.endDate = encounter.getPeriod().getEnd();

		/* Set care site */
		Long locationRef = encounter.getLocationFirstRep().getLocation().getReference().getIdPartAsLong();
		if(locationRef != null){
			CareSite careSite = (CareSite) OmopConceptMapping.getInstance().loadEntityById(CareSite.class, locationRef);
			if(careSite != null){
				this.careSite = careSite;
				/* Set place of service concept */
				if(this.placeOfServiceConcept == null)
					this.placeOfServiceConcept = new Concept();
				this.placeOfServiceConcept.setId(this.careSite.getPlaceOfServiceConcept().getId()); //TODO add test case, to avoid optionallity of care site 
			}
			
		}
		
		return this;
	}
	
	@Override
	public Encounter getRelatedResource() {
		Encounter encounter = new Encounter();
		
		encounter.setId(this.getIdDt());
		String place_of_service = this.placeOfServiceConcept.getName().toLowerCase();
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
		ResourceReferenceDt patientReference = new ResourceReferenceDt(new IdDt(Person.RESOURCE_TYPE, person.getId())); 
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
			encounter.getLocationFirstRep().getLocation().setReference(new IdDt(CareSite.RES_TYPE, careSite.getId()));
			
			// set serviceProvider
			Organization organization = careSite.getOrganization();
			if (organization != null) {
				ResourceReferenceDt serviceProviderReference = new ResourceReferenceDt(new IdDt(Organization.RESOURCE_TYPE, organization.getId()));
				encounter.setServiceProvider(serviceProviderReference);
			}
		}
		
		return encounter;
	}


	@Override
	public String translateSearchParam(String param) {
		switch (param) {
		case SP_PATIENT:
			return "person";
		case SP_DATE:
			return "startDate";
		default:
			break;
		}
		return param;
	}

}