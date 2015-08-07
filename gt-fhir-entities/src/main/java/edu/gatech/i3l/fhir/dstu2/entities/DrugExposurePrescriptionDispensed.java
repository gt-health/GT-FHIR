package edu.gatech.i3l.fhir.dstu2.entities;

import java.math.BigDecimal;

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
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;

@Entity
@Audited
@DiscriminatorValue("PrescriptionDispensed")
public class DrugExposurePrescriptionDispensed extends DrugExposurePrescription{
	
	public static final String RES_TYPE = "MedicationDispense";
	
	@ManyToOne
	@JoinColumn(name="drug_type_concept_id", updatable= false, nullable=false)
	private Concept drugExposureType;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="person_id", updatable=false, nullable=false)
	private Person person;
	
	@Column(name="quantity", updatable=false)
	private BigDecimal quantity;
	
	@Column(name="days_supply",updatable=false)
	private Integer daysSupply;
	
	@ManyToOne
	@JoinColumn(name="drug_concept_id", updatable=false)
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
			return "medication.name";
		default:
			break;
		}
		return theSearchParam;
	}

	@Override
	public IResource getRelatedResource() {
		MedicationDispense resource = new MedicationDispense();
		resource.setId(this.getIdDt());
		resource.setPatient(new ResourceReferenceDt(this.person.getIdDt()));
		resource.setMedication(new ResourceReferenceDt(new IdDt("Medication", this.medication.getId())));
		if(this.quantity != null){
			QuantityDt quantity = new QuantityDt();
			quantity.setValue(this.quantity);
			quantity.setUnits(this.getComplement().getUnit());
			resource.setQuantity(quantity);
		}if(this.daysSupply != null)
			resource.setDaysSupply(new QuantityDt(this.daysSupply));
		return resource;
	}

	/*
	 * Not Updatable. So this is not meant to be implemented.
	 * @see ca.uhn.fhir.jpa.entity.IResourceEntity#constructEntityFromResource(ca.uhn.fhir.model.api.IResource)
	 */
	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		return null;
	}

}
