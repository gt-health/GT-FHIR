package edu.gatech.i3l.fhir.dstu2.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IDatatype;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
import ca.uhn.fhir.model.dstu2.valueset.MedicationDispenseStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;
import edu.gatech.i3l.fhir.jpa.dao.BaseFhirDao;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.enums.Omop4ConceptsFixedIds;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Audited
@DiscriminatorValue("PrescriptionDispensed")
public final class DrugExposureDispensed extends DrugExposure{
	
	public static final String RES_TYPE = "MedicationDispense";
	private static final MedicationDispenseStatusEnum STATUS = MedicationDispenseStatusEnum.COMPLETED;
	
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
	public IResource getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.MedicationDispense resource = new ca.uhn.fhir.model.dstu2.resource.MedicationDispense();
		resource.setId(this.getIdDt());
		resource.setPatient(new ResourceReferenceDt(new IdDt(Person.RES_TYPE, this.person.getId())));
		// resource.setMedication(new ResourceReferenceDt(new IdDt("Medication", this.medication.getId())));
		// we return medication with contained codeable concept instead of reference.
	
		// Adding medication to Contained.
		CodingDt medCoding = new CodingDt(this.getMedication().getVocabulary().getSystemUri(), this.getMedication().getConceptCode());
		medCoding.setDisplay(this.getMedication().getName());
		
		List<CodingDt> codingList = new ArrayList<CodingDt>();
		codingList.add(medCoding);
		CodeableConceptDt codeDt = new CodeableConceptDt();
		codeDt.setCoding(codingList);

		resource.setMedication(codeDt);
		
//		CodeableConceptDt medCodeableConcept = new CodeableConceptDt(this.getMedication().getVocabulary().getSystemUri(), 
//				this.getMedication().getConceptCode());
//		//medCodeableConcept.getCodingFirstRep().setDisplay(this.medication.getName());
//		resource.setMedication(medCodeableConcept);
		
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
				this.medication = new Concept();
				this.medication.setConceptCode(valueAsConceptId.toString());
			}
		} else if (medicationDispense.getMedication() instanceof ResourceReferenceDt) {
			ResourceReferenceDt medicationRef = (ResourceReferenceDt) medicationDispense.getMedication();
			Long medicationRefId = medicationRef.getReference().getIdPartAsLong();
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
