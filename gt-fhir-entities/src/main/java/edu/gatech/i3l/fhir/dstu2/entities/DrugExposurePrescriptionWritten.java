package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.MedicationPrescription.SP_ENCOUNTER;
import static ca.uhn.fhir.model.dstu2.resource.MedicationPrescription.SP_MEDICATION;
import static ca.uhn.fhir.model.dstu2.resource.MedicationPrescription.SP_PATIENT;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.MedicationPrescription;
import ca.uhn.fhir.model.dstu2.resource.MedicationPrescription.Dispense;
import ca.uhn.fhir.model.dstu2.resource.MedicationPrescription.DosageInstruction;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Audited
@DiscriminatorValue("PrescriptionWritten")
public class DrugExposurePrescriptionWritten extends DrugExposurePrescription {
	
	public static final String RES_TYPE = "MedicationPrescription";
	
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
	@JoinColumn(name="person_id", updatable= false, nullable=false)
	private Person person;
	
	/**
	 * For this entity, drug type (name of the concept) is Prescription Written; it is declared with id 38000177 and vocabulary_id 36,
	 * in an Omop v4.0 compliant database, but this implementation is database independent, since we use {@link OmopConceptMapping} to 
	 * gather the information in the database.
	 */
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="drug_type_concept_id", updatable= false, nullable=false)
	private Concept drugExposureType;
	
	/**
	 * Reflects the date the prescription was written.
	 * @fhir dateWritten
	 */
	@Column(name="drug_exposure_start_date", updatable= false, nullable=false)
	private Date startDate;
	
	/**
	 * @fhir prescriber
	 */
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
	@JoinColumn(name="prescribing_provider_id", updatable= false)
	private Provider prescribingProvider;
	
	/**
	 * @fhir encounter
	 */
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
	@JoinColumn(name="visit_occurrence_id", updatable= false, nullable=false)
	private VisitOccurrenceComplement visitOccurrence;
	
	/**
	 * @notice  Note that this is not a direct reference to a specific condition record, {@link ConditionOccurrence}, in the condition table, but rather a 
	 * condition concept in the vocabulary.
	 * @fhir reason
	 */
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="relevant_condition_concept_id", updatable= false)
	private Concept relevantCondition; //TODO check other cases where a Concept can be taken as COndition
	
	/*
	 *****************************
	 * ATTRIBUTES FOR DISPENSE
	 *****************************/
	/**
	 * RxNorm.
	 * Generally in concept class 'Clinical Drug'.
	 */
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="drug_concept_id", updatable= false, nullable=false)
	private Concept medication;
	
	/**
	 * @fhir quantity
	 */
	@Column(name="quantity", updatable= false)
	private BigDecimal quantity;
	
	/**
	 * The period of validity of the prescription, in days, counting from the initial date of this prescription.
	 * @fhir validityPeriod
	 */
	@Column(name="days_supply", updatable= false)
	private Integer daysSupply;
	
	/**
	 * @omop The number of refills after the initial prescription. The initial prescription is not counted, values start with 0.
	 * @fhir numberOfRepeatsAllowed
	 */
	@Column(name="refills", updatable= false)
	private Integer refills;
	
	/*
	 * ********************************
	 * END ATTRIBUTES FOR DISPENSE
	 * ********************************/

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
	
	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Provider getPrescribingProvider() {
		return prescribingProvider;
	}

	public void setPrescribingProvider(Provider prescribingProvider) {
		this.prescribingProvider = prescribingProvider;
	}

	public VisitOccurrenceComplement getVisitOccurrence() {
		return visitOccurrence;
	}

	public void setVisitOccurrence(VisitOccurrenceComplement visitOccurrence) {
		this.visitOccurrence = visitOccurrence;
	}

	public Concept getRelevantCondition() {
		return relevantCondition;
	}

	public void setRelevantCondition(Concept relevantCondition) {
		this.relevantCondition = relevantCondition;
	}

	public Integer getDaysSupply() {
		return daysSupply;
	}

	public void setDaysSupply(Integer daysSupply) {
		this.daysSupply = daysSupply;
	}

	public Integer getRefills() {
		return refills;
	}

	public void setRefills(Integer refills) {
		this.refills = refills;
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
		case SP_ENCOUNTER:
			return "visitOccurrence";
		case SP_PATIENT:
			return "person";
		case SP_MEDICATION:
			return "medication.name";
		default:
			break;
		}
		return theSearchParam;
	}

	@Override
	public IResource getRelatedResource() {
		MedicationPrescription resource = new MedicationPrescription();
		resource.setId(this.getIdDt());
		resource.setDateWritten(new DateTimeDt(this.startDate));
		/*  Begin Setting Dispense */
		Dispense dispense = new Dispense();
		dispense.setMedication(new ResourceReferenceDt(new IdDt("Medication", this.medication.getId())));
		if(this.refills != null)
			dispense.setNumberOfRepeatsAllowed(this.refills);
		if(this.quantity != null)
			dispense.setQuantity(new QuantityDt(this.quantity.doubleValue()));
		//setting validity
		Calendar c = Calendar.getInstance();
		c.setTime(this.startDate);
		PeriodDt period = new PeriodDt();
		period.setStart(new DateTimeDt(c.getTime()));
		if(this.daysSupply != null){
			c.add(Calendar.DAY_OF_MONTH, this.daysSupply);
			period.setEnd(new DateTimeDt(c.getTime()));
		}
		dispense.setValidityPeriod(period);
		
		resource.setDispense(dispense);
		/* End Setting Dispense */
		resource.setEncounter(new ResourceReferenceDt(this.visitOccurrence.getIdDt()));
		resource.setPatient(new ResourceReferenceDt(this.person.getIdDt()));
		if(this.relevantCondition != null)
			//FIXME the reference above doesn't corresponde to a ResourceEntity; it should be a reference to Resource Condition
			resource.setReason(new ResourceReferenceDt(new IdDt("Condition", this.relevantCondition.getId())));
		if(this.prescribingProvider != null)
			resource.setPrescriber(new ResourceReferenceDt(this.prescribingProvider.getIdDt()));
		
		DosageInstruction dosage = new DosageInstruction();
		QuantityDt dose = new QuantityDt();
		dose.setValue(this.quantity);
		dose.setUnits(this.getComplement().getUnit());//TODO in a subsequent version, unit should be  Concept on database
		dosage.setDose(dose);
		resource.addDosageInstruction(dosage);
		
		return resource;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		MedicationPrescription mp = (MedicationPrescription) resource;
		IdDt medicationRef = mp.getMedication().getReference();
		if(medicationRef != null){
			if(this.medication == null)
				this.medication = new Concept();
			this.medication.setId(medicationRef.getIdPartAsLong()); 
		}
		IdDt patientRef = mp.getPatient().getReference();
		if(patientRef != null){
			if(this.person == null)
				this.person = new Person();
			this.person.setId(patientRef.getIdPartAsLong());
		}
		return this;
	}


}
