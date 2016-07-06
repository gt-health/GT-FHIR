package edu.gatech.i3l.fhir.dstu2.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

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
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.dstu2.resource.MedicationAdministration;
import ca.uhn.fhir.model.dstu2.resource.MedicationAdministration.Dosage;
import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.mapping.StaticVariables;

@Entity
@Audited
@DiscriminatorValue("DrugAdministration")
public final class DrugExposureAdministration extends DrugExposure {

	public static final String RES_TYPE = "MedicationAdministration";
	
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
	
	@Column(name="drug_exposure_end_date", nullable=false)
	private Date endDate;
	
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
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
		MedicationAdministration resource = new MedicationAdministration();
		resource.setId(this.getIdDt());
		resource.setPatient(new ResourceReferenceDt(new IdDt(Person.RES_TYPE, this.person.getId())));

		// Adding medication to Contained.
		CodingDt medCoding = new CodingDt(this.getMedication().getVocabulary().getSystemUri(), this.getMedication().getConceptCode());
		medCoding.setDisplay(this.getMedication().getName());
		
		List<CodingDt> codingList = new ArrayList<CodingDt>();
		codingList.add(medCoding);
		CodeableConceptDt codeDt = new CodeableConceptDt();
		codeDt.setCoding(codingList);

		resource.setMedication(codeDt);
		
//        Medication medResource = new Medication();
//        // No ID set
//        medResource.setCode(codeDt);
//
//        // Medication reference. This should point to the contained resource.
//        ResourceReferenceDt medRefDt = new ResourceReferenceDt();
//        medRefDt.setDisplay(this.getMedication().getName());
//        // Resource reference set, but no ID
//        medRefDt.setResource(medResource);
//        
//        resource.setMedication(medRefDt);
        // End of contained medication.

        Double doseValue = this.getEffectiveDrugDose();
        if (doseValue >= 0.0)  {
        	Dosage dosage = new Dosage();
        	SimpleQuantityDt dose = new SimpleQuantityDt();
        	dose.setValue(doseValue);
        	Concept myDoseUnitConcept = this.getDoseUnitConcept();
        	if (myDoseUnitConcept != null) {
            	dose.setUnit(myDoseUnitConcept.getConceptCode());
        	}
        	dosage.setQuantity(dose);
        	resource.setDosage(dosage);
        }
//    	DrugExposureComplement f_drug = this.getComplement();
//		if (f_drug != null) {
//			Dosage dosage = new Dosage();
//			SimpleQuantityDt dose = new SimpleQuantityDt();
//			if (f_drug.getDose() != null && Pattern.matches(StaticVariables.fpRegex, f_drug.getDose())) {
//				Double doseValue = Double.valueOf(f_drug.getDose()); // Will not throw NumberFormatException
//				dose.setValue(doseValue);
//				dose.setUnit(this.getComplement().getUnit());
//				dosage.setQuantity(dose);
//				resource.setDosage(dosage);
//			} 
//		}

		
//		Calendar c = Calendar.getInstance();
//		c.setTime(this.startDate);
		if (this.endDate != null) {
//			c.setTime(this.endDate);
			PeriodDt period = new PeriodDt();
//			period.setStart(new DateTimeDt(c.getTime()));
//			period.setEnd(new DateTimeDt(c.getTime()));
			period.setStart(new DateTimeDt(this.startDate));
			period.setEnd(new DateTimeDt(this.endDate));
			resource.setEffectiveTime(period);
		} else {
			resource.setEffectiveTime(new DateTimeDt(this.startDate));
		}

		return resource;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		// TODO Auto-generated method stub
		return null;
	}

}
