package edu.gatech.i3l.fhir.dstu3.entities;

//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Date;
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
import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.context.FhirVersionEnum;
//import ca.uhn.fhir.model.api.IDatatype;
//import ca.uhn.fhir.model.api.IResource;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DateTimeType;
//import org.hl7.fhir.dstu3.model.Dosage;
//import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Identifier;
//import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
//import ca.uhn.fhir.model.dstu2.composite.CodingDt;
//import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
//import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
//import ca.uhn.fhir.model.dstu2.composite.RangeDt;
//import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
//import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import org.hl7.fhir.dstu3.model.MedicationAdministration;
import org.hl7.fhir.dstu3.model.MedicationAdministration.MedicationAdministrationDosageComponent;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.SimpleQuantity;

//import ca.uhn.fhir.model.dstu2.resource.MedicationAdministration.Dosage;
//import ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DispenseRequest;
//import ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction;
//import ca.uhn.fhir.model.dstu2.valueset.MedicationAdministrationStatusEnum;
//import ca.uhn.fhir.model.primitive.DateTimeDt;
//import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.enums.Omop4ConceptsFixedIds;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;
import edu.gatech.i3l.omop.mapping.StaticVariables;

@Entity
@Audited
@DiscriminatorValue("DrugAdministration")
public final class DrugExposureAdministration extends DrugExposure {

	public static final String RES_TYPE = "MedicationAdministration";

	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "drug_type_concept_id", nullable = false)
	@NotNull
	private Concept drugExposureType;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
	@JoinColumn(name = "person_id", nullable = false)
	@NotNull
	private PersonComplement person;

	@Column(name = "drug_exposure_start_date", nullable = false)
	@NotNull
	private Date startDate;

	@Column(name = "drug_exposure_end_date", nullable = false)
	private Date endDate;

	@Column(name = "stop_reason")
	private String stopReason;

	@Column(name = "quantity")
	private Double quantity;

	@Column(name = "days_supply")
	private Integer daysSupply;

	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "drug_concept_id")
	@NotNull
	private Concept medication;

	/**
	 * @fhir encounter
	 */
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "visit_occurrence_id")
	private VisitOccurrence visitOccurrence;

	public PersonComplement getPerson() {
		return person;
	}

	public void setPerson(PersonComplement person) {
		this.person = person;
	}

	public String getStopReason() {
		return stopReason;
	}

	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
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

	public VisitOccurrence getVisitOccurrence() {
		return visitOccurrence;
	}

	public void setVisitOccurrence(VisitOccurrence visitOccurrence) {
		this.visitOccurrence = visitOccurrence;
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
		case MedicationAdministration.SP_PATIENT:
			return "person";
		case MedicationAdministration.SP_MEDICATION:
			return "medication";
		case MedicationAdministration.SP_EFFECTIVE_TIME:
			return "startDate";
		default:
			break;
		}
		return theSearchParam;
	}

	@Override
	public MedicationAdministration getRelatedResource() {
		MedicationAdministration resource = new MedicationAdministration();
		resource.setId(this.getIdDt());
		Reference patientReference = new Reference(Person.RES_TYPE + "/" + this.getPerson().getId());
		resource.setSubject(patientReference);

		// Adding medication to Contained.
		Coding medCoding = new Coding(this.getMedication().getVocabulary().getSystemUri(),
				this.getMedication().getConceptCode(), this.getMedication().getName());
		CodeableConcept medCodeable = new CodeableConcept();
		medCodeable.addCoding(medCoding);
		resource.setMedication(medCodeable);

		// Medication medResource = new Medication();
		// // No ID set
		// medResource.setCode(codeDt);
		//
		// // Medication reference. This should point to the contained resource.
		// ResourceReferenceDt medRefDt = new ResourceReferenceDt();
		// medRefDt.setDisplay(this.getMedication().getName());
		// // Resource reference set, but no ID
		// medRefDt.setResource(medResource);
		//
		// resource.setMedication(medRefDt);
		// End of contained medication.

		Double doseValue = this.getEffectiveDrugDose();
		if (doseValue == null || doseValue <= 0.0) {
			// If effective Drug Dose is not provided, then check if we have
			// quantity.
			doseValue = this.getQuantity();
		}

		if (doseValue != null && doseValue >= 0.0) {
			MedicationAdministrationDosageComponent medDosage = new MedicationAdministration.MedicationAdministrationDosageComponent();
			// Dosage dosage = new Dosage();
			SimpleQuantity dose = new SimpleQuantity();
			dose.setValue(doseValue);
			Concept myDoseUnitConcept = this.getDoseUnitConcept();
			if (myDoseUnitConcept != null) {
				dose.setUnit(myDoseUnitConcept.getConceptCode());
			}
			medDosage.setDose(dose);

			resource.setDosage(medDosage);
		}

		// DrugExposureComplement f_drug = this.getComplement();
		// if (f_drug != null) {
		// Dosage dosage = new Dosage();
		// SimpleQuantityDt dose = new SimpleQuantityDt();
		// if (f_drug.getDose() != null &&
		// Pattern.matches(StaticVariables.fpRegex, f_drug.getDose())) {
		// Double doseValue = Double.valueOf(f_drug.getDose()); // Will not
		// throw NumberFormatException
		// dose.setValue(doseValue);
		// dose.setUnit(this.getComplement().getUnit());
		// dosage.setQuantity(dose);
		// resource.setDosage(dosage);
		// }
		// }

		// Calendar c = Calendar.getInstance();
		// c.setTime(this.startDate);
		if (this.endDate != null) {
			// c.setTime(this.endDate);
			Period period = new Period();
			// period.setStart(new DateTimeDt(c.getTime()));
			// period.setEnd(new DateTimeDt(c.getTime()));
			period.setStart(this.startDate);
			period.setEnd(this.endDate);
			resource.setEffective(period);
		} else {
			resource.setEffective(new DateTimeType(this.startDate));
		}

		// Set the status. First check if we have anything in the stop_reason
		// column
		if (getStopReason() != null && !getStopReason().isEmpty()) {
			resource.setStatus(MedicationAdministration.MedicationAdministrationStatus.STOPPED);
		} else {
			// We have no stop reason. Check the effective time range.
			// If today falls within this range, we set status to in-progress.
			// If future, we set status to on-hold.
			// If past, we set status to completed.
			Date now = new Date();
			if (this.startDate.getTime() > now.getTime()) {
				resource.setStatus(MedicationAdministration.MedicationAdministrationStatus.ONHOLD);
			} else {
				if (this.endDate != null) {
					if (now.getTime() < this.endDate.getTime()) {
						resource.setStatus(MedicationAdministration.MedicationAdministrationStatus.INPROGRESS);
					} else {
						resource.setStatus(MedicationAdministration.MedicationAdministrationStatus.COMPLETED);
					}
				} else {
					// Administration should have start and end. But, if stop is
					// null
					// but start is not null, then we may have this drug still
					// in progress.
					resource.setStatus(MedicationAdministration.MedicationAdministrationStatus.INPROGRESS);
				}
			}
		}

		return resource;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IBaseResource resource) {
		if (resource instanceof MedicationAdministration) {
			MedicationAdministration medicationAdministration = (MedicationAdministration) resource;

			/* Set patient */
			Reference patientReference = medicationAdministration.getSubject();
			if (patientReference == null || patientReference.isEmpty())
				return null; // We have to have a patient

			PersonComplement person = PersonComplement.searchAndUpdate(patientReference);
			if (person == null)
				return null; // We must have a patient

			this.setPerson(person);

			// We are writing to the database. Keep the source so we know where
			// it is coming from
			if (medicationAdministration.getIdElement().getIdPartAsLong() != null) {
				this.setId(medicationAdministration.getIdElement().getIdPartAsLong());
			} else {
				// We are creating a new entry. But, before we do that, we need
				// to check if
				// this data has already been entered. Use its identifier again
				// source value to check
				//
				// See if we have identifier.
				Identifier identifier = medicationAdministration.getIdentifierFirstRep();
				String identifierValue = identifier.getValue();
				if (identifierValue != null && identifierValue.isEmpty() == false) {
					DrugExposureAdministration existingDrugExposure = (DrugExposureAdministration) OmopConceptMapping
							.getInstance().loadEntityBySource(DrugExposureAdministration.class,
									"DrugExposureAdministration", "drugSourceValue", identifierValue);
					if (existingDrugExposure != null) {
						this.setId(existingDrugExposure.getId());
					}

					this.setDrugSourceValue(identifierValue);
				}
			}

			/* Set drup exposure type */
			this.drugExposureType = new Concept();
			this.drugExposureType.setId(Omop4ConceptsFixedIds.MEDICATION_ADMINISTRATION.getConceptId());

			/* Set date of medication administration */
			if (medicationAdministration.getEffective() instanceof DateTimeType) {
				DateTimeType effectiveDateTime = (DateTimeType) medicationAdministration.getEffective();
				this.startDate = effectiveDateTime.getValue();
			} else if (medicationAdministration.getEffective() instanceof Period) {
				Period effectivePeriod = (Period) medicationAdministration.getEffective();
				this.startDate = effectivePeriod.getStart();
				this.endDate = effectivePeriod.getEnd();
			}

			/* Set VisitOccurrence */
			Reference visitResRef = medicationAdministration.getContext();
			if (visitResRef != null) {
				Long encounterRef = visitResRef.getReferenceElement().getIdPartAsLong();
				//
				// WebApplicationContext myAppCtx =
				// ContextLoaderListener.getCurrentWebApplicationContext();
				// EntityManager entityManager = myAppCtx.getBean("myBaseDao",
				// BaseFhirDao.class).getEntityManager();
				if (encounterRef != null) {
					VisitOccurrence visitOccurrence = VisitOccurrence.searchAndUpdate(encounterRef, startDate, null,
							this.person);
					if (visitOccurrence != null)
						this.setVisitOccurrence(visitOccurrence);
				}
			}

			/* Set Medication */
			Concept medication = new Concept();
			if (medicationAdministration.getMedication() instanceof CodeableConcept) {
				CodeableConcept codeDt = (CodeableConcept) medicationAdministration.getMedication();
				Coding medCoding = codeDt.getCodingFirstRep();
				if (medCoding != null && !medCoding.isEmpty()) {
					// this.medication = new Concept();
					// String systemUri = medCoding.getSystem();
					String code = medCoding.getCode();
					medication.setId(OmopConceptMapping.getInstance().get(code));
				}
			} else if (medicationAdministration.getMedication() instanceof Reference) {
				// TODO: We must check if this medication exists in the
				// Medication, which is Concept table of OMOP
				// in GT-FHIR.
				Reference medicationRef = (Reference) medicationAdministration.getMedication();
				String medId = medicationRef.getId();
				if (Pattern.matches(StaticVariables.fpRegex, medId)) {
					medication.setId(Long.valueOf(medId));
				}
			}
			this.setMedication(medication);

			// OMOP can handle only one dosage.
			// DrugExposureComplement f_drug = new DrugExposureComplement();

			/* dosageInstruction */
			MedicationAdministrationDosageComponent dosage = medicationAdministration.getDosage();
			if (dosage != null && !dosage.isEmpty()) {
				SimpleQuantity doseQty = dosage.getDose();
				if (doseQty != null && !doseQty.isEmpty()) {
					String doseUnitCode = doseQty.getCode();
					String doseUnit = doseQty.getUnit();
					this.setEffectiveDrugDose(doseQty.getValue().doubleValue());
					this.setDoseUnitSourceValue(doseUnit);

					if (doseUnitCode != null && !doseUnitCode.isEmpty()) {
						Long unitConceptId = OmopConceptMapping.getInstance().get(doseUnitCode);
						Concept myUnitConcept;
						if (unitConceptId > 0) {
							myUnitConcept = new Concept(unitConceptId);
							this.setDoseUnitConcept(myUnitConcept);
						}
					} else if (doseUnit != null && !doseUnit.isEmpty()) {
						this.setDoseUnitSourceValue(doseUnit);
					}
				}
			}
			return this;
		} else {
			return null;
		}
	}
}
