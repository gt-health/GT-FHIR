package edu.gatech.i3l.fhir.dstu2.entities;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IDatatype;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.resource.Observation.Component;
//import ca.uhn.fhir.model.dstu2.resource.Observation.Related;
//import ca.uhn.fhir.model.dstu2.valueset.ObservationRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;
import edu.gatech.i3l.fhir.jpa.dao.BaseFhirDao;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.enums.Omop4ConceptsFixedIds;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Table(name = "f_observation_view")
public class Observation extends BaseResourceEntity {

	private static final String RES_TYPE = "Observation";
	private static final ObservationStatusEnum STATUS = ObservationStatusEnum.FINAL;
	public static final Long SYSTOLIC_CONCEPT_ID = 3004249L;
	public static final Long DIASTOLIC_CONCEPT_ID = 3012888L;		

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	private BigDecimal valueAsNumber;

	@Column(name = "range_low")
	private BigDecimal rangeLow;

	@Column(name = "range_high")
	private BigDecimal rangeHigh;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "value_as_concept_id")
	private Concept valueAsConcept;

//	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
//	@JoinColumn(name = "relevant_condition_concept_id")
//	private Concept relevantCondition;

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

	@Column(name = "source_value")
	private String sourceValue;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "unit_concept_id")
	private Concept unit;

	@Column(name = "unit_source_value")
	private String unitSourceValue;

	public Observation() {
		super();
	}

	public Observation(Long id, PersonComplement person, Concept observationConcept, Date date, String time, String valueAsString,
			BigDecimal valueAsNumber, Concept valueAsConcept, /*Concept relevantCondition,*/ Concept type,
			Provider provider, VisitOccurrence visitOccurrence, String sourceValue, Concept unit,
			String unitsSourceValue) {
		super();
		this.id = id;
		this.person = person;
		this.observationConcept = observationConcept;
		this.date = date;
		this.time = time;
		this.valueAsString = valueAsString;
		this.valueAsNumber = valueAsNumber;
		this.valueAsConcept = valueAsConcept;
//		this.relevantCondition = relevantCondition;
		this.type = type;
		this.provider = provider;
		this.visitOccurrence = visitOccurrence;
		this.sourceValue = sourceValue;
		this.unit = unit;
		this.unitSourceValue = unitsSourceValue;
	}

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

	public BigDecimal getRangeLow() {
		return rangeLow;
	}

	public void setRangeLow(BigDecimal rangeLow) {
		this.rangeLow = rangeLow;
	}

	public BigDecimal getRangeHigh() {
		return rangeHigh;
	}

	public void setRangeHigh(BigDecimal rangeHigh) {
		this.rangeHigh = rangeHigh;
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

	public BigDecimal getValueAsNumber() {
		return valueAsNumber;
	}

	public void setValueAsNumber(BigDecimal valueAsNumber) {
		this.valueAsNumber = valueAsNumber;
	}

	public Concept getValueAsConcept() {
		return valueAsConcept;
	}

	public void setValueAsConcept(Concept valueAsConcept) {
		this.valueAsConcept = valueAsConcept;
	}

//	public Concept getRelevantCondition() {
//		return relevantCondition;
//	}
//
//	public void setRelevantCondition(Concept relevantCondition) {
//		this.relevantCondition = relevantCondition;
//	}

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
	public IResourceEntity constructEntityFromResource(IResource resource) {
		System.out.println("Trying to write to Observation View Table");
		// TODO: This is view, which is read-only. We need to come up with a way to write
		// to either measurement or observation tables in OMOP. We may write them manually
		// and just return null for this. But then, response will not be correct. Revisit this.
		ca.uhn.fhir.model.dstu2.resource.Observation observation = (ca.uhn.fhir.model.dstu2.resource.Observation) resource;
		OmopConceptMapping ocm = OmopConceptMapping.getInstance();

		if (observation.getEffective() instanceof DateTimeDt) {
			this.date = ((DateTimeDt) observation.getEffective()).getValue();
			SimpleDateFormat timeFormat = new SimpleDateFormat ("HH:mm:ss");
			this.time = timeFormat.format(((DateTimeDt) observation.getEffective()).getValue());
		} else if (observation.getEffective() instanceof PeriodDt) {
			// TODO: we need to handle period. We can probably use
			// we can use range_low and range_high. These are only available in Measurement
		}

		/*
		 * Set subject: currently supporting only type Person TODO create
		 * entity-complement to specify other types of subjects
		 */
		IdDt reference = observation.getSubject().getReference();
		if (reference.getIdPartAsLong() != null) {
			if ("Patient".equals(reference.getResourceType())) {
				this.person = new PersonComplement();
				this.person.setId(reference.getIdPartAsLong());
			} else if ("Group".equals(reference.getResourceType())) {
				//
			} else if ("Device".equals(reference.getResourceType())) {
				//
			} else if ("Location".equals(reference.getResourceType())) {
				//
			}
		}

		/* Set visit occurrence */
		Long visitOccurrenceId = observation.getEncounter().getReference().getIdPartAsLong();
		if (visitOccurrenceId != null) {
			this.visitOccurrence = new VisitOccurrence();
			this.visitOccurrence.setId(visitOccurrenceId);
		}

		Long observationConceptId = ocm.get(observation.getCode().getCodingFirstRep().getCode(),
				OmopConceptMapping.LOINC_CODE);
		if (observationConceptId != null) {
			this.observationConcept = new Concept();
			this.observationConcept.setId(observationConceptId);
		}

		/* Set the type of the observation */
		this.type = new Concept();
		if (observation.getMethod().getCodingFirstRep() != null) {
			this.type.setId(Omop4ConceptsFixedIds.OBSERVATION_FROM_LAB_NUMERIC_RESULT.getConceptId()); // assuming
																										// all
																										// results
																										// on
																										// this
																										// table
																										// are
																										// quantitative:
																										// http://hl7.org/fhir/2015May/valueset-observation-methods.html
		} else {
			this.type.setId(Omop4ConceptsFixedIds.OBSERVATION_FROM_EHR.getConceptId());
		}

		/* Set the value of the observation */
		IDatatype value = observation.getValue();
		if (value instanceof QuantityDt) {
			Long unitId = ocm.get(((QuantityDt) value).getUnit(), OmopConceptMapping.UCUM_CODE,
					OmopConceptMapping.UCUM_CODE_STANDARD, OmopConceptMapping.UCUM_CODE_CUSTOM);
			this.valueAsNumber = ((QuantityDt) value).getValue();
			if (unitId != null) {
				this.unit = new Concept();
				this.unit.setId(unitId);
			}
			this.rangeHigh = observation.getReferenceRangeFirstRep().getHigh().getValue();
			this.rangeLow = observation.getReferenceRangeFirstRep().getLow().getValue();
		} else if (value instanceof CodeableConceptDt) {
			Long valueAsConceptId = ocm.get(((CodeableConceptDt) value).getCodingFirstRep().getCode(),
					OmopConceptMapping.CLINICAL_FINDING);
			if (valueAsConceptId != null) {
				this.valueAsConcept = new Concept();
				this.valueAsConcept.setId(valueAsConceptId);
			}
		} else {
			this.valueAsString = ((StringDt) value).getValue();
		}

		// quick solution.
		this.sourceValue = "NA";

		return this;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public IResource getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.Observation observation = new ca.uhn.fhir.model.dstu2.resource.Observation();
		observation.setId(this.getIdDt());

		String systemUriString = this.observationConcept.getVocabulary().getSystemUri();
		String codeString = this.observationConcept.getConceptCode();
		String displayString = this.observationConcept.getName();
		
		// OMOP database maintains Systolic and Diastolic Blood Pressures separately.
		// FHIR however keeps them together. Observation DAO filters out Diastolic values.
		// Here, when we are reading systolic, we search for matching diastolic and put them
		// together. The Observation ID will be systolic's OMOP ID. 
		// public static final Long SYSTOLIC_CONCEPT_ID = new Long(3004249);
		// public static final Long DIASTOLIC_CONCEPT_ID = new Long(3012888);		
		if (SYSTOLIC_CONCEPT_ID.equals(this.observationConcept.getId())) {
			// Set coding for systolic and diastolic observation
			systemUriString = "http://loinc.org";
			codeString = "55284-4";
			displayString = "Blood pressure systolic & diastolic";
			
			List<Component> components = new ArrayList<Component>();
			// First we add systolic component.
			Component comp = new Component();
			CodeableConceptDt componentCode = new CodeableConceptDt(this.observationConcept.getVocabulary().getSystemUri(),
					this.observationConcept.getConceptCode());
			componentCode.getCodingFirstRep().setDisplay(this.observationConcept.getName());
			comp.setCode(componentCode);
			
			IDatatype compValue = null;
			if (this.valueAsNumber != null) {
				QuantityDt quantity = new QuantityDt(this.valueAsNumber.doubleValue());
				// Unit is defined as a concept code in omop v4, then unit and code are the same in this case
				if (this.unit != null) {
					quantity.setUnit(this.unit.getConceptCode());
					quantity.setCode(this.unit.getConceptCode());
					quantity.setSystem(this.unit.getVocabulary().getSystemUri());
				}
				compValue = quantity;
				comp.setValue(compValue);
				components.add(comp);
			}
			
			// Now search for diastolic component.
			WebApplicationContext myAppCtx = ContextLoaderListener.getCurrentWebApplicationContext();
			EntityManager entityManager = myAppCtx.getBean("myBaseDao", BaseFhirDao.class).getEntityManager();

			CriteriaBuilder builder = entityManager.getCriteriaBuilder();
			CriteriaQuery<Observation> criteria = builder.createQuery(Observation.class);
			Root<Observation> from = criteria.from(Observation.class);
			criteria.select(from).where(
					builder.equal(from.get("observationConcept").get("id"), DIASTOLIC_CONCEPT_ID),
					builder.equal(from.get("person").get("id"), this.person.getId()),
					builder.equal(from.get("date"), this.date),
					builder.equal(from.get("time"),  this.time)
					);
			TypedQuery<Observation> query = entityManager.createQuery(criteria);
			List<Observation> results = query.getResultList();
			if (results.size() > 0) {
				Observation diastolicOb = results.get(0);				
				comp = new Component();
				componentCode = new CodeableConceptDt(diastolicOb.observationConcept.getVocabulary().getSystemUri(),
						diastolicOb.observationConcept.getConceptCode());
				componentCode.getCodingFirstRep().setDisplay(diastolicOb.observationConcept.getName());
				comp.setCode(componentCode);
				
				compValue = null;
				if (diastolicOb.valueAsNumber != null) {
					QuantityDt quantity = new QuantityDt(diastolicOb.valueAsNumber.doubleValue());
					// Unit is defined as a concept code in omop v4, then unit and code are the same in this case
					if (diastolicOb.unit != null) {
						quantity.setUnit(diastolicOb.unit.getConceptCode());
						quantity.setCode(diastolicOb.unit.getConceptCode());
						quantity.setSystem(diastolicOb.unit.getVocabulary().getSystemUri());
					}
					compValue = quantity;
					comp.setValue(compValue);
					components.add(comp);
				}
			}
			
			if (components.size() > 0) {
				observation.setComponent(components);
			}
		} else {
			IDatatype value = null;
			if (this.valueAsNumber != null) {
				QuantityDt quantity = new QuantityDt(this.valueAsNumber.doubleValue());
				if (this.unit != null) {
					// Unit is defined as a concept code in omop v4, then unit and code are the same in this case				
					quantity.setUnit(this.unit.getConceptCode());
					quantity.setCode(this.unit.getConceptCode());
					quantity.setSystem(this.unit.getVocabulary().getSystemUri());
				}
				value = quantity;
			} else if (this.valueAsString != null) {
				value = new StringDt(this.valueAsString);
			} else if (this.valueAsConcept != null) {
				// vocabulary is a required attribute for concept, then it's expected to not be null
				CodeableConceptDt valueAsConcept = new CodeableConceptDt(this.valueAsConcept.getVocabulary().getSystemUri(), 
						this.valueAsConcept.getConceptCode());
				value = valueAsConcept;
			}
			observation.setValue(value);
		}

		if (this.rangeLow != null)
			observation.getReferenceRangeFirstRep().setLow(new SimpleQuantityDt(this.rangeLow.doubleValue()));
		if (this.rangeHigh != null)
			observation.getReferenceRangeFirstRep().setHigh(new SimpleQuantityDt(this.rangeHigh.doubleValue()));
		
		CodeableConceptDt code = new CodeableConceptDt(systemUriString, codeString);
		code.getCodingFirstRep().setDisplay(displayString);
		observation.setCode(code);
		
		observation.setStatus(STATUS);

		if (this.date != null) {
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = fmt.format(this.date);
			fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date myDate = null;
			try {
				if (this.time != null && this.time.isEmpty() == false) {
					myDate = fmt.parse(dateString+" "+this.time);
				} else {
					myDate = this.date;
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (myDate != null) {
				DateTimeDt appliesDate = new DateTimeDt(myDate);
				observation.setEffective(appliesDate);
			}
		}
//		if (// this.date != null &&
//		this.time != null) { // WARNING notice that the resource field
//								// 'appliesDate' relies only on the entity field
//								// 'time'
//			DateTimeDt appliesDate = new DateTimeDt(this.time);
//			observation.setEffective(appliesDate);
//		}
		if (this.person != null) {
			ResourceReferenceDt personRef = new ResourceReferenceDt(this.person.getIdDt());
			personRef.setDisplay(this.person.getNameAsSingleString());
			observation.setSubject(personRef);
		}
		if (this.visitOccurrence != null)
			observation.getEncounter().setReference(new IdDt (VisitOccurrence.RES_TYPE, this.visitOccurrence.getId()));
		
		if (this.type != null) {
			if (this.type.getId() == 44818701L) {
				// This is From physical examination.
				CodeableConceptDt typeConcept = new CodeableConceptDt();
				List<CodingDt> typeCodings = new ArrayList<CodingDt>();
				CodingDt typeCoding = new CodingDt("http://hl7.org/fhir/observation-category", "exam");
				typeCodings.add(typeCoding);
				typeConcept.setCoding(typeCodings);
				observation.setCategory(typeConcept);
			} else if (this.type.getId() == 44818702L) {
				CodeableConceptDt typeConcept = new CodeableConceptDt();
				// This is Lab result
				List<CodingDt> typeCodings = new ArrayList<CodingDt>();
				CodingDt typeCoding = new CodingDt("http://hl7.org/fhir/observation-category", "laboratory");
				typeCodings.add(typeCoding);
				typeConcept.setCoding(typeCodings);				
				observation.setCategory(typeConcept);
			} else if (this.type.getId() == 45905771L) {
				CodeableConceptDt typeConcept = new CodeableConceptDt();
				// This is Lab result
				List<CodingDt> typeCodings = new ArrayList<CodingDt>();
				CodingDt typeCoding = new CodingDt("http://hl7.org/fhir/observation-category", "survey");
				typeCodings.add(typeCoding);
				typeConcept.setCoding(typeCodings);				
				observation.setCategory(typeConcept);
			} else if (this.type.getId() == 38000277L || this.type.getId() == 38000278L) {
				CodeableConceptDt typeConcept = new CodeableConceptDt();
				// This is Lab result
				List<CodingDt> typeCodings = new ArrayList<CodingDt>();
				CodingDt typeCoding = new CodingDt("http://hl7.org/fhir/observation-category", "laboratory");
				typeCodings.add(typeCoding);
				typeConcept.setCoding(typeCodings);				
				observation.setCategory(typeConcept);
			} else if (this.type.getId() == 38000280L || this.type.getId() == 38000281L) {
				CodeableConceptDt typeConcept = new CodeableConceptDt();
				// This is Lab result
				List<CodingDt> typeCodings = new ArrayList<CodingDt>();
				CodingDt typeCoding = new CodingDt("http://hl7.org/fhir/observation-category", "exam");
				typeCodings.add(typeCoding);
				typeConcept.setCoding(typeCodings);				
				observation.setCategory(typeConcept);
			}
		}
		
		return observation;
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
		System.out.println("Observation Search:"+theSearchParam);
		switch (theSearchParam) {
		case ca.uhn.fhir.model.dstu2.resource.Observation.SP_SUBJECT:
			return "person";
		case ca.uhn.fhir.model.dstu2.resource.Observation.SP_PATIENT:
			return "person";
		case ca.uhn.fhir.model.dstu2.resource.Observation.SP_ENCOUNTER:
			return "visitOccurrence";
		case ca.uhn.fhir.model.dstu2.resource.Observation.SP_VALUE_QUANTITY:
			return "valueAsNumber";
		case ca.uhn.fhir.model.dstu2.resource.Observation.SP_VALUE_STRING:
			return "valueAsString";
		case ca.uhn.fhir.model.dstu2.resource.Observation.SP_VALUE_CONCEPT:
			return "valueAsConcept";
		default:
			break;
		}
		return theSearchParam;
	}

}
