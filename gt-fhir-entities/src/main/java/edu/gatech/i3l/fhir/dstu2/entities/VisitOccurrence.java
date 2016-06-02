/**
 * 
 */
package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.Encounter.SP_DATE;
import static ca.uhn.fhir.model.dstu2.resource.Encounter.SP_PATIENT;

import java.text.SimpleDateFormat;
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
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="visit_concept_id")
	private Concept visitConcept;
	
	@Column(name="visit_start_date", nullable=false)
	@NotNull
	private Date startDate;
	
	@Column(name="visit_start_time")
	private String startTime;
	
	@Column(name="visit_end_date", nullable=false)
	@NotNull
	private Date endDate;
	
	@Column(name="visit_end_time")
	private String endTime;
	
	@ManyToOne
	@JoinColumn(name="visit_type_concept_id")
	private Concept visitTypeConcept;
	
	@ManyToOne
	@JoinColumn(name="provider_id")
	private Provider provider;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="care_site_id")
	@NotNull
	private CareSite careSite; //FIXME field names should reflect fhir names, for validation purposes.
	
	@Column(name="visit_source_value")
	private String visitSourceValue;
	
	@ManyToOne
	@JoinColumn(name="visit_source_concept_id")
	private Concept visitSourceConcept;

	public VisitOccurrence() {
		super();
	}
	
	public VisitOccurrence(Long id, Person person, Concept visitConcept, Date startDate, 
			String startTime, Date endDate, String endTime, Concept visitTypeConcept, 
			Provider provider, CareSite careSite, String visitSourceValue, Concept visitSourceConcept) {
		super();
		
		this.id = id;
		this.person = person;
		this.visitConcept = visitConcept;
		this.startDate = startDate;
		this.startTime = startTime;
		this.endDate = endDate;
		this.endTime = endTime;
		this.visitTypeConcept = visitTypeConcept;
		this.provider = provider;
		this.careSite = careSite;
		this.visitSourceValue = visitSourceValue;
		this.visitSourceConcept = visitSourceConcept;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Concept getVisitConcept() {
		return visitConcept;
	}
	
	public void setVisitConcept(Concept visitConcept) {
		this.visitConcept = visitConcept;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public Concept getVisitTypeConcept() {
		return visitTypeConcept;
	}
	
	public void setVisitTypeConcept(Concept visitTypeConcept) {
		this.visitTypeConcept = visitTypeConcept;
	}
	
	public Provider getProvider() {
		return provider;
	}
	
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	
	public CareSite getCareSite() {
		return careSite;
	}
	
	public void setCareSite(CareSite careSite) {
		this.careSite = careSite;
	}
	
	public String getVisitSourceValue() {
		return visitSourceValue;
	}
	
	public void setVisitSourceValue(String visitSourceValue) {
		this.visitSourceValue = visitSourceValue;
	}
	
	public Concept getVisitSourceConcept() {
		return visitSourceConcept;
	}
	
	public void setVisitSourceConcept(Concept visitSourceConcept) {
		this.visitSourceConcept = visitSourceConcept;
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
			this.person = new Person();
			this.person.setId(patientRef);
		}
		/* Set Period */
		this.startDate = encounter.getPeriod().getStart();
		SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
		this.startTime = fmt.format(this.startDate);
		
		this.endDate = encounter.getPeriod().getEnd();
		this.endTime = fmt.format(this.endDate);
		
		/* Set care site */
		Long locationRef = encounter.getLocationFirstRep().getLocation().getReference().getIdPartAsLong();
		if (locationRef > 0L){
			CareSite careSite = (CareSite) OmopConceptMapping.getInstance().loadEntityById(CareSite.class, locationRef);
			if (careSite != null) {
				this.careSite = careSite;
//				/* Set place of service concept */
//				this.placeOfServiceConcept = new Concept();
//				this.placeOfServiceConcept.setId(this.careSite.getPlaceOfServiceConcept().getId()); //TODO add test case, to avoid optionallity of care site 
			}
			
		}
		
		Long providerRef = encounter.getServiceProvider().getReference().getIdPartAsLong();
		if (providerRef > 0L) {
			Provider provider = (Provider) OmopConceptMapping.getInstance().loadEntityById(Provider.class, providerRef);
			if (provider != null) {
				this.provider = provider;
			}
		}
		
		return this;
	}
	
	@Override
	public Encounter getRelatedResource() {
		Encounter encounter = new Encounter();
		
		encounter.setId(this.getIdDt());
		String visitString = this.visitConcept.getName().toLowerCase();
		if (visitString.contains("inpatient")) {
			encounter.setClassElement(EncounterClassEnum.INPATIENT);			
		} else if (visitString.toLowerCase().contains("outpatient")) {
			encounter.setClassElement(EncounterClassEnum.OUTPATIENT);			
		} else if (visitString.toLowerCase().contains("ambulatory")
				|| visitString.toLowerCase().contains("office")) {
			encounter.setClassElement(EncounterClassEnum.AMBULATORY);			
		} else if (visitString.toLowerCase().contains("home")) {
			encounter.setClassElement(EncounterClassEnum.HOME);			
		} else if (visitString.toLowerCase().contains("emergency")) {
			encounter.setClassElement(EncounterClassEnum.EMERGENCY);			
		} else if (visitString.toLowerCase().contains("field")) {
			encounter.setClassElement(EncounterClassEnum.FIELD);			
		} else if (visitString.toLowerCase().contains("daytime")) {
			encounter.setClassElement(EncounterClassEnum.DAYTIME);			
		} else if (visitString.toLowerCase().contains("virtual")) {
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
			Provider prov = this.getProvider();
			if (prov != null) {
				ResourceReferenceDt serviceProviderReference = new ResourceReferenceDt(new IdDt(prov.RESOURCE_TYPE, prov.getId()));
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