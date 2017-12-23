package edu.gatech.i3l.fhir.dstu3.entities;

import java.math.BigDecimal;
import java.util.Date;
//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;
import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.context.FhirVersionEnum;
//import ca.uhn.fhir.model.api.IResource;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
//import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
//import ca.uhn.fhir.model.dstu2.composite.CodingDt;
//import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
//import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import org.hl7.fhir.dstu3.model.MedicationDispense;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.SimpleQuantity;

//import ca.uhn.fhir.model.primitive.DateTimeDt;
//import ca.uhn.fhir.model.primitive.IdDt;
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
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="drug_concept_id")
	@NotNull
	private Concept medication;
	
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

	public Concept getMedication() {
		return medication;
	}

	public void setMedication(Concept medication) {
		this.medication = medication;
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
	public MedicationDispense getRelatedResource() {
		MedicationDispense resource = new MedicationDispense();
		resource.setId(this.getIdDt());
		Reference patientReference = new Reference(Person.RES_TYPE+"/"+this.getPerson().getId());
		resource.setSubject(patientReference);
		// resource.setMedication(new ResourceReferenceDt(new IdDt("Medication", this.medication.getId())));
		// we return medication with contained codeable concept instead of reference.
	
		// Adding medication to Contained.
		Coding medCoding = new Coding(this.getMedication().getVocabulary().getSystemUri(), this.getMedication().getConceptCode(), this.getMedication().getName());
		CodeableConcept medCodeable = new CodeableConcept();
		medCodeable.addCoding(medCoding);
		resource.setMedication(medCodeable);
		
//		CodeableConceptDt medCodeableConcept = new CodeableConceptDt(this.getMedication().getVocabulary().getSystemUri(), 
//				this.getMedication().getConceptCode());
//		//medCodeableConcept.getCodingFirstRep().setDisplay(this.medication.getName());
//		resource.setMedication(medCodeableConcept);
		
		resource.setWhenPrepared(this.startDate);
		if (this.quantity != null){
			Concept unitConcept = this.getDoseUnitConcept();
			SimpleQuantity quantity = new SimpleQuantity();
			quantity.setValue(this.quantity.doubleValue());
			if (unitConcept != null) {
				quantity.setUnit(unitConcept.getConceptCode());
				quantity.setSystem("http://unitsofmeasure.org");
			}
			resource.setQuantity(quantity);
		}
		if (this.daysSupply != null) {
			SimpleQuantity supplySimpleQuantity = new SimpleQuantity();
			supplySimpleQuantity.setValue(this.daysSupply);
			resource.setDaysSupply(supplySimpleQuantity);
		}
		
		return resource;
								
	}

	@Override
	public IResourceEntity constructEntityFromResource(IBaseResource resource) {
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
		if (medicationDispense.getMedication() instanceof CodeableConcept) {
			Long valueAsConceptId = ocm.get(((CodeableConcept) 
					medicationDispense.getMedication()).getCodingFirstRep().getCode(),
					OmopConceptMapping.CLINICAL_FINDING);
			if (valueAsConceptId != null){
				this.medication = new Concept();
				this.medication.setConceptCode(valueAsConceptId.toString());
			}
		} else if (medicationDispense.getMedication() instanceof Reference) {
			Reference medicationRef = (Reference) medicationDispense.getMedication();
			Long medicationRefId = medicationRef.getReferenceElement().getIdPartAsLong();
			if(medicationRef != null){
				this.medication = new Concept();
				this.medication.setId(medicationRefId);
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
