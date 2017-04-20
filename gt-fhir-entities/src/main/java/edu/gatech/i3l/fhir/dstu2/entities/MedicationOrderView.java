package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.MedicationOrder.SP_ENCOUNTER;
import static ca.uhn.fhir.model.dstu2.resource.MedicationOrder.SP_MEDICATION;
import static ca.uhn.fhir.model.dstu2.resource.MedicationOrder.SP_PATIENT;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;
import org.hl7.fhir.instance.model.Reference;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.RangeDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DispenseRequest;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.enums.Omop4ConceptsFixedIds;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;
import edu.gatech.i3l.omop.mapping.StaticVariables;

@Entity
@Audited
@DiscriminatorValue("PrescriptionWritten")
public final class MedicationOrderView extends DrugExposure {

	public static final String RES_TYPE = "MedicationOrder";

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "person_id", nullable = false)
	@NotNull
	private PersonComplement person;

	/**
	 * For this entity, drug type (name of the concept) is Prescription Written;
	 * it is declared with id 38000177 and vocabulary_id 36, in an Omop v4.0
	 * compliant database, but this implementation is database independent,
	 * since we use {@link OmopConceptMapping} to gather the information in the
	 * database.
	 */
	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "drug_type_concept_id", nullable = false)
	@NotNull
	private Concept drugExposureType;

	/**
	 * Reflects the date the prescription was written.
	 * 
	 * @fhir dateWritten
	 */
	@Column(name = "drug_exposure_start_date", nullable = false)
	@NotNull
	private Date startDate;

	@Column(name = "drug_exposure_end_date", nullable = true)
	private Date endDate;

	/**
	 * @fhir prescriber
	 */
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "provider_id")
	private Provider prescribingProvider;

	/**
	 * @fhir encounter
	 */
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "visit_occurrence_id")
	private VisitOccurrence visitOccurrence;

	/**
	 * @notice Note that this is not a direct reference to a specific condition
	 *         record, {@link ConditionOccurrence}, in the condition table, but
	 *         rather a condition concept in the vocabulary.
	 * @fhir reason
	 */
//	@ManyToOne(cascade = { CascadeType.MERGE })
//	@JoinColumn(name = "relevant_condition_concept_id")
//	private Concept relevantCondition; // TODO check other cases where a Concept
										// can be taken as COndition

	/*
	 *****************************
	 * ATTRIBUTES FOR DISPENSE
	 *****************************/
	/**
	 * RxNorm. Generally in concept class 'Clinical Drug'.
	 */
	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "drug_concept_id", nullable = false)
	@NotNull
	private Concept medication;

	/**
	 * @fhir quantity
	 */
	@Column(name = "quantity")
	private BigDecimal quantity;

	/**
	 * The period of validity of the prescription, in days, counting from the
	 * initial date of this prescription.
	 * 
	 * @fhir validityPeriod
	 */
	@Column(name = "days_supply")
	private Integer daysSupply;

	/**
	 * @omop The number of refills after the initial prescription. The initial
	 *       prescription is not counted, values start with 0.
	 * @fhir numberOfRepeatsAllowed
	 */
	@Column(name = "refills")
	@Min(0L)
	private Integer refills;

	/*
	 * ******************************** END ATTRIBUTES FOR DISPENSE
	 ********************************/

	public PersonComplement getPerson() {
		return person;
	}

	public void setPerson(PersonComplement person) {
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

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Provider getPrescribingProvider() {
		return prescribingProvider;
	}

	public void setPrescribingProvider(Provider prescribingProvider) {
		this.prescribingProvider = prescribingProvider;
	}

	public VisitOccurrence getVisitOccurrence() {
		return visitOccurrence;
	}

	public void setVisitOccurrence(VisitOccurrence visitOccurrence) {
		this.visitOccurrence = visitOccurrence;
	}

//	public Concept getRelevantCondition() {
//		return relevantCondition;
//	}
//
//	public void setRelevantCondition(Concept relevantCondition) {
//		this.relevantCondition = relevantCondition;
//	}
//
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
		MedicationOrder resource = new MedicationOrder();
		resource.setId(this.getIdDt());
		resource.setDateWritten(new DateTimeDt(this.startDate));
		/* Begin Setting Dispense */
		// ResourceReferenceDt medicationRef = new ResourceReferenceDt(new
		// IdDt("Medication", this.medication.getId()));

		// Adding medication to Contained.
		CodingDt medCoding = new CodingDt(this.getMedication().getVocabulary().getSystemUri(),
				this.getMedication().getConceptCode());
		medCoding.setDisplay(this.getMedication().getName());

		List<CodingDt> codingList = new ArrayList<CodingDt>();
		codingList.add(medCoding);
		CodeableConceptDt codeDt = new CodeableConceptDt();
		codeDt.setCoding(codingList);

		resource.setMedication(codeDt);
		
//		
//		Medication medResource = new Medication();
//		// No ID set
//		medResource.setCode(codeDt);
//
//		// Medication reference. This should point to the contained resource.
//		ResourceReferenceDt medRefDt = new ResourceReferenceDt();
//		medRefDt.setDisplay(this.getMedication().getName());
//		// Resource reference set, but no ID
//		medRefDt.setResource(medResource);
//
//		resource.setMedication(medRefDt);
		// End of contained medication.

		// resource.setMedication(medicationRef);
		DispenseRequest dispense = new DispenseRequest();
		dispense.setMedication(codeDt);
		
		// dispense.setMedication(medicationRef);
//		dispense.setMedication(medRefDt);

		if (this.refills != null)
			dispense.setNumberOfRepeatsAllowed(this.refills);
		if (this.quantity != null) {
			dispense.setQuantity(new SimpleQuantityDt(this.quantity.doubleValue()));
		}
		// setting validity
		Calendar c = Calendar.getInstance();
		c.setTime(this.startDate);
		PeriodDt period = new PeriodDt();
		period.setStart(new DateTimeDt(c.getTime()));
		if (this.endDate != null) {
			c.setTime(this.endDate);
			period.setEnd(new DateTimeDt(c.getTime()));
		}
		if (this.daysSupply != null) {
			c.add(Calendar.DAY_OF_MONTH, this.daysSupply);
			period.setEnd(new DateTimeDt(c.getTime()));
		}
		dispense.setValidityPeriod(period);

		resource.setDispenseRequest(dispense);
		/* End Setting Dispense */
		if (this.visitOccurrence != null) {
			resource.setEncounter(
					new ResourceReferenceDt(new IdDt(VisitOccurrence.RES_TYPE, this.visitOccurrence.getId())));
		}
		ResourceReferenceDt patientRef = new ResourceReferenceDt(new IdDt(Person.RES_TYPE, this.person.getId()));
		patientRef.setDisplay(this.person.getNameAsSingleString());
		resource.setPatient(patientRef);
		
//		if (this.relevantCondition != null)
//			// FIXME the reference above doesn't corresponde to a
//			// ResourceEntity; it should be a reference to Resource Condition
//			resource.setReason(new ResourceReferenceDt(new IdDt("Condition", this.relevantCondition.getId())));
		if (this.prescribingProvider != null) {
			ResourceReferenceDt prescriberRef = new ResourceReferenceDt(new IdDt(Provider.RESOURCE_TYPE, this.prescribingProvider.getId()));
			prescriberRef.setDisplay(this.prescribingProvider.getProviderName());
			resource.setPrescriber(prescriberRef);
		}

        Double doseValue = this.getEffectiveDrugDose();
        if (doseValue != null && doseValue >= 0.0)  {
        	DosageInstruction dosage = new DosageInstruction();
        	Concept myUnitConcept = this.getDoseUnitConcept();
        	SimpleQuantityDt dose;
        	if (myUnitConcept != null) {
        		dose = new SimpleQuantityDt(doseValue, "http://unitsofmeasure.org", myUnitConcept.getName());
        		dose.setCode(myUnitConcept.getConceptCode());
        	} else {
        		dose = new SimpleQuantityDt(doseValue);
        	}
			dosage.setDose(dose);
			resource.addDosageInstruction(dosage);
        }

//		DrugExposureComplement f_drug = this.getComplement();
//		if (f_drug != null) {
//			DosageInstruction dosage = new DosageInstruction();
//			// QuantityDt dose = new QuantityDt();
//			if (f_drug.getDose() != null && Pattern.matches(StaticVariables.fpRegex, f_drug.getDose())) {
//				Double doseValue = Double.valueOf(f_drug.getDose()); // Will not
//																		// throw
//																		// NumberFormatException
//				SimpleQuantityDt dose = new SimpleQuantityDt(doseValue, "http://unitsofmeasure.org",
//						this.getComplement().getUnit());
//				dosage.setDose(dose);
//				resource.addDosageInstruction(dosage);
//			}
//		}

		return resource;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		MedicationOrder medicationOrder = (MedicationOrder) resource;
		
		/* Set patient */
		ResourceReferenceDt patientResource =  medicationOrder.getPatient();
		if (patientResource == null) return null; // We have to have a patient
		
//		Long patientRef = patientResource.getReference().getIdPartAsLong();
		PersonComplement person = PersonComplement.searchAndUpdate(patientResource);
		if (person == null) return null; // We must have a patient
		
		this.setPerson(person);

		// We are writing to the database. Keep the source so we know where it is coming from
		if (medicationOrder.getId() != null) {
			// See if we already have this in the source field. If so,
			// then we want update not create
			MedicationOrderView origMed = (MedicationOrderView) OmopConceptMapping.getInstance().loadEntityBySource(MedicationOrderView.class, "MedicationOrderView", "drugSourceValue", medicationOrder.getId().getIdPart());
			if (origMed == null)
				this.setDrugSourceValue(medicationOrder.getId().getIdPart());
			else
				this.setId(origMed.getId());
		}

		/* Set drup exposure type */
		this.drugExposureType = new Concept();
		this.drugExposureType.setId(Omop4ConceptsFixedIds.PRESCRIPTION_WRITTEN.getConceptId());
		
		/* Set start date of prescription */
		this.startDate = medicationOrder.getDateWritten();
		

//		if (patientRef != null) {
//			PersonComplement person = (PersonComplement) OmopConceptMapping.getInstance()
//					.loadEntityById(PersonComplement.class, patientRef);
//			if (person != null) {
//				this.setPerson(person);
//			} else {
//				// See if we have already received this.
//				person = (PersonComplement) OmopConceptMapping.getInstance()
//						.loadEntityBySource(PersonComplement.class, "PersonComplement", "personSourceValue", patientRef.toString());
//				if (person != null) {
//					this.setPerson(person);
//				} else {
//					this.person = new PersonComplement();
//					this.person.setPersonSourceValue(patientRef.toString());
//				}
//			}
//		} else {
//			// Patient is not required field. But, OMOP requires it. If we 
//			// no Patient, return null.
//			return null;
//		}

		/* Set VisitOccurrence */
		ResourceReferenceDt visitResRef = medicationOrder.getEncounter();
		if (visitResRef != null) {
			Long encounterRef = visitResRef.getReference().getIdPartAsLong();
//	
//			WebApplicationContext myAppCtx = ContextLoaderListener.getCurrentWebApplicationContext();
//			EntityManager entityManager = myAppCtx.getBean("myBaseDao", BaseFhirDao.class).getEntityManager();
			if (encounterRef != null) {
				VisitOccurrence visitOccurrence = VisitOccurrence.searchAndUpdate(encounterRef, startDate, null, this.person);
				if (visitOccurrence != null)
					this.setVisitOccurrence(visitOccurrence);
				
				// See if this exists.
//				VisitOccurrence visitOccurrence = 
//						(VisitOccurrence) OmopConceptMapping.getInstance().loadEntityById(VisitOccurrence.class, encounterRef);
//				if (visitOccurrence != null) {
//					this.setVisitOccurrence(visitOccurrence);
//				} else {
//					// Check source column to see if we have received this before.
//					visitOccurrence = (VisitOccurrence) OmopConceptMapping.getInstance()
//							.loadEntityBySource(VisitOccurrence.class, "VisitOccurrence", "visitSourceValue", encounterRef.toString());
//					if (visitOccurrence != null) {
//						this.setVisitOccurrence(visitOccurrence);
//					} else {
//						this.visitOccurrence = new VisitOccurrence();
//						this.visitOccurrence.setVisitSourceValue(encounterRef.toString());
//						this.visitOccurrence.setStartDate(startDate);
//						this.visitOccurrence.setEndDate(startDate);
//						this.visitOccurrence.setPerson(this.person);
//					}
//				}
			}
		}
		
		/* Set Medication */
		Concept medication = new Concept();
		if (medicationOrder.getMedication() instanceof CodeableConceptDt) {
			CodeableConceptDt codeDt = (CodeableConceptDt) medicationOrder.getMedication();
			CodingDt medCoding = codeDt.getCodingFirstRep();
			if (medCoding != null) {
//				this.medication = new Concept();
//				String systemUri = medCoding.getSystem();
				String code = medCoding.getCode();
				medication.setId(OmopConceptMapping.getInstance().get(code));
			}
		} else if (medicationOrder.getMedication() instanceof ResourceReferenceDt) {
			Reference medicationRef = (Reference) medicationOrder.getMedication();
			String medId = medicationRef.getId();
			if (Pattern.matches(StaticVariables.fpRegex, medId)) {
				medication.setId(Long.valueOf(medId));
			}
		}
		this.setMedication(medication);

		// OMOP can handle only one dosage.
//		DrugExposureComplement f_drug = new DrugExposureComplement();

		/* dosageInstruction */
		DosageInstruction dosageInstruction = medicationOrder.getDosageInstructionFirstRep();
		if (dosageInstruction.getDose() instanceof RangeDt) {
			// This is doseRange
		} else if (dosageInstruction.getDose() instanceof SimpleQuantityDt) {
			SimpleQuantityDt doseQty = (SimpleQuantityDt) dosageInstruction.getDose();
			this.setEffectiveDrugDose(doseQty.getValue().doubleValue());
			this.setDoseUnitSourceValue(doseQty.getUnit());

			String doseUnitCode = null;
			String doseCode = doseQty.getCode();
			String doseUnit = doseQty.getUnit();
			if (doseCode != null && !doseCode.isEmpty()) {
				doseUnitCode = doseCode;
			} else if (doseUnit != null && !doseUnit.isEmpty()) {
				doseUnitCode = doseUnit;
			}
			
			if (doseUnitCode != null && !doseUnitCode.isEmpty()) {
				Long unitConceptId = OmopConceptMapping.getInstance().get(doseUnitCode);
				Concept myUnitConcept;
				if (unitConceptId > 0) {
					myUnitConcept = new Concept(unitConceptId);
					this.setDoseUnitConcept(myUnitConcept);
				}
			} 
//			f_drug.setDose(doseQty.getValue().toString());
//			f_drug.setUnit(doseQty.getUnit());
		}

//		this.setComplement(f_drug);

		/* dispense */
		DispenseRequest dispenseRequest = medicationOrder.getDispenseRequest();
		if (dispenseRequest != null) {
			Integer refills = dispenseRequest.getNumberOfRepeatsAllowed();
			if (refills != null) {
				this.setRefills(refills);
			} else {
				this.setRefills(0);
			}

			SimpleQuantityDt qty = dispenseRequest.getQuantity();
			if (qty != null) {
				this.setQuantity(qty.getValue());
			} else {
				this.setQuantity(BigDecimal.ZERO);
			}

			if (this.startDate == null) {
				PeriodDt validPeriod = dispenseRequest.getValidityPeriod();
				if (validPeriod != null) {
					this.startDate = validPeriod.getStart();
				}
			}
		}
		
		ResourceReferenceDt medOrderRef = medicationOrder.getPrescriber();
		if (medOrderRef != null) {
			if (!medOrderRef.isEmpty()) {
				Provider provider = Provider.searchAndUpdate(medOrderRef);
				if (provider != null) {
					this.setPrescribingProvider(provider);
				}
			}
			
//		 	Long prescriberID = medOrderRef.getReference().getIdPartAsLong();
//			if (prescriberID != null) {
//				Provider provider = (Provider) OmopConceptMapping.getInstance().loadEntityById(Provider.class, prescriberID);
//				if (provider != null) {
//					this.setPrescribingProvider(provider);
//				} else {
//					// See the source field and find if we have received this before
//					provider = (Provider) OmopConceptMapping.getInstance().loadEntityBySource(Provider.class, "Provider", "providerSourceValue", prescriberID.toString());
//					if (provider != null) {
//						this.setPrescribingProvider(provider);
//					} else {
//						// We don't have provider... Create one.
//						this.prescribingProvider = new Provider();
//						this.prescribingProvider.setProviderSourceValue(prescriberID.toString());
//					}
//				}
//			}
		}
		
		return this;
	}

}
