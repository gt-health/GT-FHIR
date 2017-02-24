package edu.gatech.i3l.fhir.dstu2.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.enums.Omop4ConceptsFixedIds;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Audited
@DiscriminatorValue("PrescriptionDispensed")
public final class DrugExposureDispensed extends DrugExposure{
	
	public static final String RES_TYPE = "MedicationDispense";
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="drug_type_concept_id", nullable=false)
	@NotNull
	private Concept drugExposureType;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
	@JoinColumn(name="person_id", nullable=false)
	@NotNull
	private Person person;
	
	@Column(name="drug_exposure_start_date", nullable=false)
	@NotNull
	private Date startDate;
	
	@Column(name="quantity")
	private BigDecimal quantity;
	
	@Column(name="days_supply")
	private Integer daysSupply;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Integer getDaysSupply() {
		return daysSupply;
	}

	public void setDaysSupply(Integer daysSupply) {
		this.daysSupply = daysSupply;
	}

	public Concept getDrugExposureType() {
		return drugExposureType;
	}

	public void setDrugExposureType(Concept drugExposureType) {
		this.drugExposureType = drugExposureType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public String getResourceType() {
		return RES_TYPE;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateSearchParam(String theSearchParam) {
		switch (theSearchParam) {
		case MedicationDispense.SP_PATIENT:
			return "person";
		case MedicationDispense.SP_MEDICATION:
			return "medication";
		default:
			break;
		}
		return theSearchParam;
	}

	@Override
	public IResource getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.MedicationDispense resource = new ca.uhn.fhir.model.dstu2.resource.MedicationDispense();
		resource.setId(this.getIdDt());
		resource.setPatient(new ResourceReferenceDt(new IdDt(Person.RES_TYPE, this.person.getId())));	
		resource.setMedication(medicationCodeableConcept());
				
		resource.setWhenPrepared(new DateTimeDt(this.startDate));
		if (this.quantity != null){
			Concept unitConcept = this.getDoseUnitConcept();
			SimpleQuantityDt quantity;
			if (unitConcept != null) {
				quantity = new SimpleQuantityDt(this.quantity.doubleValue(), "http://unitsofmeasure.org", unitConcept.getConceptCode());
			} else {
				quantity = new SimpleQuantityDt(this.quantity.doubleValue());
			}
			resource.setQuantity(quantity);
		}
		if (this.daysSupply != null)
			resource.setDaysSupply(new SimpleQuantityDt(this.daysSupply));
		
		return resource;
								
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		ca.uhn.fhir.model.dstu2.resource.MedicationDispense medicationDispense = (ca.uhn.fhir.model.dstu2.resource.MedicationDispense) resource;
		OmopConceptMapping ocm = OmopConceptMapping.getInstance();
		
		/* Set drup exposure type */
		this.drugExposureType = new Concept();
		Long destinationRef = medicationDispense.getDestination().getReference().getIdPartAsLong();
		if(destinationRef != null){
			this.drugExposureType.setId(Omop4ConceptsFixedIds.PRESCRIPTION_DISP_MAIL_ORDER.getConceptId());
		} else {
			this.drugExposureType.setId(Omop4ConceptsFixedIds.PRESCRIPTION_DISP_PHARMACY.getConceptId());
		}
		/* Set drug concept(medication) */
		if (medicationDispense.getMedication() instanceof CodeableConceptDt) {
			Long valueAsConceptId = ocm.get(((CodeableConceptDt) 
					medicationDispense.getMedication()).getCodingFirstRep().getCode(),
					OmopConceptMapping.CLINICAL_FINDING);
			if (valueAsConceptId != null){
				setMedication(new Concept());
				getMedication().setConceptCode(valueAsConceptId.toString());
			}
		} else if (medicationDispense.getMedication() instanceof ResourceReferenceDt) {
			ResourceReferenceDt medicationRef = (ResourceReferenceDt) medicationDispense.getMedication();
			Long medicationRefId = medicationRef.getReference().getIdPartAsLong();
			if(medicationRef != null){
				setMedication(new Concept());
				getMedication().setId(medicationRefId);
			}
		}
		
		/* Set patient */
		Long patientRef = medicationDispense.getPatient().getReference().getIdPartAsLong();
		if(patientRef != null){
			this.person = new Person();
			this.person.setId(patientRef);
		}
		
		this.startDate = medicationDispense.getWhenPrepared();
		return this;
	}

}
