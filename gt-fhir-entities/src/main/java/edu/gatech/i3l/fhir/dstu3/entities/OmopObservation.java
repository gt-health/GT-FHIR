package edu.gatech.i3l.fhir.dstu3.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IDatatype;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Table(name="observation")
public class OmopObservation extends BaseResourceEntity {

	/**
	 * 
	 */
	private static final String RES_TYPE = "Observation";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="observation_occurrence_seq_gen")
	@SequenceGenerator(name="observation_occurrence_seq_gen", sequenceName="observation_occurrence_id_seq", allocationSize=1)
	@Column(name = "observation_id")
	@Access(AccessType.PROPERTY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", nullable = false)
	@NotNull
	private PersonComplement person;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "observation_concept_id", nullable = false)
	@NotNull
	private Concept observationConcept;

	@Column(name = "observation_date", nullable = false)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date date;

	@Column(name = "observation_time")
	// @Temporal(TemporalType.TIME)
	private String time;

	@Column(name = "value_as_string")
	private String valueAsString;

	@Column(name = "value_as_number")
	private Double valueAsNumber;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "value_as_concept_id")
	private Concept valueAsConcept;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "observation_type_concept_id", nullable = false)
	@NotNull
	private Concept type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "provider_id")
	private Provider provider;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "visit_occurrence_id")
	private VisitOccurrence visitOccurrence;

	@Column(name = "observation_source_value")
	private String sourceValue;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "unit_concept_id")
	private Concept unit;

	@Column(name = "unit_source_value")
	private String unitSourceValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public PersonComplement getPerson() {
		return person;
	}

	public void setPerson(PersonComplement person) {
		this.person = person;
	}

	public Concept getObservationConcept() {
		return observationConcept;
	}

	public void setObservationConcept(Concept observationConcept) {
		this.observationConcept = observationConcept;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getValueAsString() {
		return valueAsString;
	}

	public void setValueAsString(String valueAsString) {
		this.valueAsString = valueAsString;
	}

	public Double getValueAsNumber() {
		return valueAsNumber;
	}

	public void setValueAsNumber(Double valueAsNumber) {
		this.valueAsNumber = valueAsNumber;
	}

	public Concept getValueAsConcept() {
		return valueAsConcept;
	}

	public void setValueAsConcept(Concept valueAsConcept) {
		this.valueAsConcept = valueAsConcept;
	}

	public Concept getType() {
		return type;
	}

	public void setType(Concept type) {
		this.type = type;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public VisitOccurrence getVisitOccurrence() {
		return visitOccurrence;
	}

	public void setVisitOccurrence(VisitOccurrence visitOccurrence) {
		this.visitOccurrence = visitOccurrence;
	}

	public String getSourceValue() {
		return sourceValue;
	}

	public void setSourceValue(String sourceValue) {
		this.sourceValue = sourceValue;
	}

	public Concept getUnit() {
		return unit;
	}

	public void setUnit(Concept unit) {
		this.unit = unit;
	}

	public String getUnitSourceValue() {
		return unitSourceValue;
	}

	public void setUnitSourceValue(String unitSourceValue) {
		this.unitSourceValue = unitSourceValue;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResource getRelatedResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		ca.uhn.fhir.model.dstu2.resource.Observation obs = (ca.uhn.fhir.model.dstu2.resource.Observation) resource;
		ResourceReferenceDt subjectReference = obs.getSubject();
		if (subjectReference != null) {
			if ("Patient".equals(subjectReference.getReference().getResourceType())) {
				PersonComplement person = PersonComplement.searchAndUpdate(subjectReference);
				if (person == null) return null; // We must have a patient
				this.setPerson(person);
			} else {
				// Group, Device, and Location are not supported in OMOP v5
				return null;
			}
		} else {
			// We must have subject reference.
			return null;
		}

		// We are writing to the database. Keep the source so we know where it is coming from
		OmopConceptMapping ocm = OmopConceptMapping.getInstance();
		if (obs.getId() != null) {
			// See if we already have this in the source field. If so,
			// then we want update not create
			OmopObservation origObservation = (OmopObservation) ocm.loadEntityBySource(OmopObservation.class, "OmopObservation", "sourceValue", obs.getId().getIdPart());
			if (origObservation == null)
				this.setSourceValue(obs.getId().getIdPart());
			else
				this.setId(origObservation.getId());
		}

		String code = obs.getCode().getCodingFirstRep().getCode();
		Long obsConceptRef = ocm.get(code);
		setObservationConcept(new Concept());
		if(obsConceptRef != null){
			getObservationConcept().setId(obsConceptRef);
		} else {
			getObservationConcept().setId(0L);
			System.out.println("Observation code not recognized: "+code+". System: "+obs.getCode().getCodingFirstRep().getSystem());
		}

		/* Set the value of the observation */
		boolean isValueString = false;
		IDatatype value = obs.getValue();
		if (value instanceof QuantityDt) {
			String unitCode = ((QuantityDt) value).getCode();
			if (unitCode == null) {
				unitCode = ((QuantityDt) value).getUnit();
			}
			Long unitId = ocm.get(unitCode);
			this.valueAsNumber = ((QuantityDt) value).getValue().doubleValue();
			if (unitId != null) {
				this.unit = new Concept();
				this.unit.setId(unitId);
			}
		} else if (value instanceof CodeableConceptDt) {
			Long valueAsConceptId = ocm.get(((CodeableConceptDt) value).getCodingFirstRep().getCode());
			if (valueAsConceptId != null) {
				this.valueAsConcept = new Concept();
				this.valueAsConcept.setId(valueAsConceptId);
			}
		} else if (value instanceof StringDt) {
			String valueAsString = ((StringDt) value).getValueAsString();
			if (valueAsString != null) {
				this.valueAsString = valueAsString;
				isValueString = true;
			}
		}
		
		if (obs.getEffective() instanceof DateTimeDt) {
			this.date = ((DateTimeDt) obs.getEffective()).getValue();
			SimpleDateFormat timeFormat = new SimpleDateFormat ("HH:mm:ss");
			this.time = timeFormat.format(((DateTimeDt) obs.getEffective()).getValue());
		} else if (obs.getEffective() instanceof PeriodDt) {
			// TODO: we need to handle period. We can probably use
			// we can use range_low and range_high. These are only available in Measurement
		}

		/* Set visit occurrence */
		Long visitOccurrenceId = obs.getEncounter().getReference().getIdPartAsLong();
		if (visitOccurrenceId != null) {
			this.visitOccurrence = new VisitOccurrence();
			this.visitOccurrence.setId(visitOccurrenceId);
		}

		/* measture type concept id - this is required field in OMOP v5. */
		setType (new Concept());
		CodeableConceptDt obsCategory = obs.getCategory();
		if (obsCategory.isEmpty()) {
			getType().setId(0L);
		} else {
			List<CodingDt> catCodes = obsCategory.getCoding();
			for (CodingDt catCode : catCodes) {
				if (catCode.getCode().equalsIgnoreCase("exam")) {
					if (isValueString)
						getType().setId(38000281L);
					else
						getType().setId(38000280L);
				} else if (catCode.getCode().equalsIgnoreCase("laboratory")) {
					if (isValueString)
						getType().setId(38000278L);
					else
						getType().setId(38000277L);
				} else if (catCode.getCode().equalsIgnoreCase("survey")) {
					getType().setId(45905771L);
				} else if (catCode.getCode().equalsIgnoreCase("vital-signs")) {
					getType().setId(38000280L);
				} else {
					getType().setId(0L);
				}
			}
		}
		
		return this;
	}
}
