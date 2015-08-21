package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_ENCOUNTER;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_PATIENT;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_SUBJECT;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_VALUE_CONCEPT;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_VALUE_QUANTITY;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_VALUE_STRING;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IDatatype;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Observation.Related;
import ca.uhn.fhir.model.dstu2.valueset.ObservationRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ObservationReliabilityEnum;
import ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.enums.Omop4ConceptsFixedIds;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Table(name="observation")
public class Observation extends BaseResourceEntity{

	private static final String RES_TYPE = "Observation";
	private static final ObservationStatusEnum STATUS = ObservationStatusEnum.FINAL;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="observation_id")
	private Long id;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="person_id", nullable=false)
	@NotNull
	private Person person;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="observation_concept_id", nullable=false)
	@NotNull
	private Concept observationConcept;
	
	@Column(name="observation_date", nullable=false)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date date;
	
	@Column(name="observation_time")
//	@Temporal(TemporalType.TIME)
	private Date time;
	
	@Column(name="value_as_string")
	private String valueAsString;
	
	@Column(name="value_as_number")
	private BigDecimal valueAsNumber;
	
	@Column(name="range_low")
	private BigDecimal rangeLow;

	@Column(name="range_high")
	private BigDecimal rangeHigh;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="value_as_concept_id")
	private Concept valueAsConcept;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="relevant_condition_concept_id")
	private Concept relevantCondition;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="observation_type_concept_id", nullable=false)
	@NotNull
	private Concept type;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="associated_provider_id")
	private Provider provider;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="visit_occurrence_id")
	private VisitOccurrence visitOccurrence;
	
	@Column(name="observation_source_value")
	private String sourceValue;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="unit_concept_id")
	private Concept unit;
	
	@Column(name="units_source_value")
	private String unitsSourceValue;

	public Observation() {
		super();
	}

	public Observation(Long id, Person person, Concept observationConcept,
			Date date, String valueAsString, BigDecimal valueAsNumber,
			Concept valueAsConcept, Concept relevantCondition, Concept type,
			Provider provider, VisitOccurrence visitOccurrence,
			String sourceValue, Concept unit, String unitsSourceValue) {
		super();
		this.id = id;
		this.person = person;
		this.observationConcept = observationConcept;
		this.date = date;
		this.valueAsString = valueAsString;
		this.valueAsNumber = valueAsNumber;
		this.valueAsConcept = valueAsConcept;
		this.relevantCondition = relevantCondition;
		this.type = type;
		this.provider = provider;
		this.visitOccurrence = visitOccurrence;
		this.sourceValue = sourceValue;
		this.unit = unit;
		this.unitsSourceValue = unitsSourceValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getTime() {
		return time;
	}
	
	public void setTime(Date time) {
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
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

	public Concept getRelevantCondition() {
		return relevantCondition;
	}

	public void setRelevantCondition(Concept relevantCondition) {
		this.relevantCondition = relevantCondition;
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

	public String getUnitsSourceValue() {
		return unitsSourceValue;
	}

	public void setUnitsSourceValue(String unitsSourceValue) {
		this.unitsSourceValue = unitsSourceValue;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		ca.uhn.fhir.model.dstu2.resource.Observation observation = (ca.uhn.fhir.model.dstu2.resource.Observation) resource;
		OmopConceptMapping ocm = OmopConceptMapping.getInstance();
		
		this.date =((DateTimeDt) observation.getApplies()).getValue();
		this.time = ((DateTimeDt) observation.getApplies()).getValue();
		
		/* Set subject: currently supporting only type Person 
		 * TODO create entity-complement to specify other types of subjects */
		IdDt reference = observation.getSubject().getReference();
		if(reference.getIdPartAsLong() != null){
			if("Patient".equals(reference.getResourceType())){
				if(this.person ==null)
					this.person = new Person();
				this.person.setId(reference.getIdPartAsLong());
			} else if("Group".equals(reference.getResourceType())){
				//
			} else if("Device".equals(reference.getResourceType())){
				//
			} else if("Location".equals(reference.getResourceType())){
				//
			}
		}
		
		/*Set visit occurrence */
		Long visitOccurrenceId = observation.getEncounter().getReference().getIdPartAsLong();
		if(visitOccurrenceId != null){
			if(this.visitOccurrence == null)
				this.visitOccurrence = new VisitOccurrence();
			this.visitOccurrence.setId(visitOccurrenceId);
		}
		
		Long observationConceptId = ocm.get(observation.getCode().getCodingFirstRep().getCode(), OmopConceptMapping.LOINC_CODE);
		if(observationConceptId != null){
			if(this.observationConcept == null)
				this.observationConcept = new Concept();
			this.observationConcept.setId(observationConceptId); 
		}
		
		/* Set the type of the observation */
		if(this.type == null)
			this.type = new Concept();
		if(observation.getMethod().getCodingFirstRep() != null){
			this.type.setId(Omop4ConceptsFixedIds.OBSERVATION_FROM_LAB_NUMERIC_RESULT.getConceptId()); //assuming all results on this table are quantitative: http://hl7.org/fhir/2015May/valueset-observation-methods.html
		} else {
			this.type.setId(Omop4ConceptsFixedIds.OBSERVATION_FROM_EHR.getConceptId());
		}
		
		/* Set the value of the observation */
		IDatatype value = observation.getValue();
		if(value instanceof QuantityDt){
			Long unitId = ocm.get(((QuantityDt) value).getUnits(), OmopConceptMapping.UCUM_CODE, OmopConceptMapping.UCUM_CODE_STANDARD, OmopConceptMapping.UCUM_CODE_CUSTOM);
			this.valueAsNumber = ((QuantityDt) value).getValue();
			if(unitId != null){
				if(this.unit == null)
					this.unit = new Concept();
				this.unit.setId(unitId); 
			}
			this.rangeHigh = observation.getReferenceRangeFirstRep().getHigh().getValue();
			this.rangeLow = observation.getReferenceRangeFirstRep().getLow().getValue();
		} else if(value instanceof CodeableConceptDt){
			Long valueAsConceptId = ocm.get(((CodeableConceptDt) value).getCodingFirstRep().getCode(), OmopConceptMapping.CLINICAL_FINDING);
			if(valueAsConceptId != null){
				if(this.valueAsConcept == null)
					this.valueAsConcept = new Concept();
				this.valueAsConcept.setId(valueAsConceptId);
			}
		} else {
			this.valueAsString = ((StringDt)value).getValue();
		}
		
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
		
		CodeableConceptDt code = new CodeableConceptDt(this.observationConcept.getVocabulary().getSystemUri(), this.observationConcept.getConceptCode());
		//code.getCodingFirstRep().setDisplay(this.observationConcept.toString());
		code.getCodingFirstRep().setDisplay(this.observationConcept.getName());
		observation.setCode(code);
		observation.setStatus(STATUS);
//		observation.setMethod(new CodeableConceptDt(theSystem, theCode));
		
		// Smart on FHIR wants reliability. We don't have this in the database. 
		// So, we put "ok".
		observation.setReliability(ObservationReliabilityEnum.OK);
		
		IDatatype value = null;
		if (this.valueAsString != null){
			value = new StringDt(this.valueAsString); 
		} else 	if(this.valueAsNumber != null ){
			QuantityDt quantity = new QuantityDt(this.valueAsNumber.doubleValue());
			quantity.setUnits(this.unit.getConceptCode());//Unit is defined as a concept code in omop v4, then unit and code are the same in this case
			quantity.setCode(this.unit.getConceptCode());
			quantity.setSystem(this.unit.getVocabulary().getSystemUri());
			value = quantity;
			if(this.rangeLow != null)
				observation.getReferenceRangeFirstRep().setLow(new QuantityDt(this.rangeLow.doubleValue()));
			if(this.rangeHigh != null)
				observation.getReferenceRangeFirstRep().setHigh(new QuantityDt(this.rangeHigh.doubleValue()));			
		} else if (this.valueAsConcept != null){
			CodeableConceptDt valueAsConcept = new CodeableConceptDt(this.valueAsConcept.getVocabulary().getSystemUri(), //vocabulary is a required attribute for concept, then it's expected to not be null
					this.valueAsConcept.getConceptCode());
			value = valueAsConcept;
		}
		observation.setValue(value);
		
		// We may have related resources within observation. 
		// If this observation has the relationshipType, it should be specified
		// in the observation source field with comma separated values.
		String[] relatedResource = this.sourceValue.split(",");
		if (relatedResource.length > 1) {
			ObservationRelationshipTypeEnum obsRelationshipType = null;
			if (relatedResource[0].equalsIgnoreCase("COMP")) {
				obsRelationshipType = ObservationRelationshipTypeEnum.HAS_COMPONENT;
			} else if (relatedResource[0].equalsIgnoreCase("MBR")) {
				obsRelationshipType = ObservationRelationshipTypeEnum.HAS_MEMBER;				
			} else if (relatedResource[0].equalsIgnoreCase("DRIV")) {
				obsRelationshipType = ObservationRelationshipTypeEnum.DERIVED_FROM;				
			} else if (relatedResource[0].equalsIgnoreCase("SEQL")) {
				obsRelationshipType = ObservationRelationshipTypeEnum.SEQUEL_TO;				
			} else if (relatedResource[0].equalsIgnoreCase("RPLC")) {
				obsRelationshipType = ObservationRelationshipTypeEnum.REPLACES;				
			} else if (relatedResource[0].equalsIgnoreCase("QUALF")) {
				obsRelationshipType = ObservationRelationshipTypeEnum.QUALIFIED_BY;				
			} else if (relatedResource[0].equalsIgnoreCase("INTF")) {
				obsRelationshipType = ObservationRelationshipTypeEnum.INTERFERED_BY;				
			} 
			
			if (obsRelationshipType != null) {
				List<Related>relateds = new ArrayList<Related>();
				for (int i=1; i<relatedResource.length; i++) {
					Related related = new Related();
					related.setType(obsRelationshipType);
					ResourceReferenceDt referencedResDt = new ResourceReferenceDt("Observation/"+relatedResource[i]);
					related.setTarget(referencedResDt);
					relateds.add(related);
				}
				observation.setRelated(relateds);
			}
		}
		
		if(//this.date != null && 
				this.time != null){ //WARNING notice that the resource field 'appliesDate' relies only on the entity field 'time'
			DateTimeDt appliesDate = new DateTimeDt(this.time);
			observation.setApplies(appliesDate);
		}
		if(this.person != null)
			observation.setSubject(new ResourceReferenceDt(this.person.getIdDt()));  
		if(this.visitOccurrence != null)
			observation.setEncounter(new ResourceReferenceDt(this.visitOccurrence.getRelatedResource()));
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
			switch (theSearchParam) {
			case SP_SUBJECT:
				return "person";
			case SP_PATIENT:
				return "person";
			case SP_ENCOUNTER:
				return "visitOccurrence";
			case SP_VALUE_QUANTITY:
				return "valueAsNumber";
			case SP_VALUE_STRING:
				return "valueAsString";
			case SP_VALUE_CONCEPT:
				return "valueAsConcept";
			default:
				break;
			}
		return theSearchParam;
	}
	
	
}
