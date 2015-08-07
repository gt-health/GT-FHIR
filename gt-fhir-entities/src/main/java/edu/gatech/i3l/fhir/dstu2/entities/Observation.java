package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_ENCOUNTER;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_SUBJECT;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_VALUE_CONCEPT;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_VALUE_QUANTITY;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_VALUE_STRING;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IDatatype;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;

@Entity
@Table(name="observation")
public class Observation extends BaseResourceEntity{

	private static final String RES_TYPE = "Observation";
	private static final ObservationStatusEnum STATUS = ObservationStatusEnum.FINAL;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="observation_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="person_id", nullable=false)
	private Person person;
	
	@ManyToOne
	@JoinColumn(name="observation_concept_id", nullable=false)
	private Concept observationConcept;
	
	@Column(name="observation_date", nullable=false)
	//@Type(type="org.joda.time.contrib.hibernate.PersistentLocalDate")
	private Date date;
	
	@Column(name="observation_time")
	//@Type(type="org.joda.time.contrib.hibernate.PersistentLocalTimeAsTime")
	private Date time;
	
	@Column(name="value_as_string")
	private String valueAsString;
	
	@Column(name="value_as_number")
	private BigDecimal valueAsNumber;
	
	@Column(name="range_low")
	private BigDecimal rangeLow;

	@Column(name="range_high")
	private BigDecimal rangeHigh;
	
	@ManyToOne
	@JoinColumn(name="value_as_concept_id")
	private Concept valueAsConcept;
	
	@ManyToOne
	@JoinColumn(name="relevant_condition_concept_id")
	private Concept relevantCondition;
	
	@ManyToOne
	@JoinColumn(name="observation_type_concept_id", nullable=false)
	private Concept type;
	
	@ManyToOne
	@JoinColumn(name="associated_provider_id")
	private Provider provider;
	
	@ManyToOne
	@JoinColumn(name="visit_occurence_id")
	private VisitOccurrence visitOccurrence;
	
	@Column(name="observation_source_value")
	private String sourceValue;
	
	@ManyToOne
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
		this.date =((DateTimeDt) observation.getApplies()).getValue();
		this.time = ((DateTimeDt) observation.getApplies()).getValue();
		this.person.setId(observation.getSubject().getReference().getIdPartAsLong()); //TODO set subject to the other types of resources specified on fhir
		this.visitOccurrence.setId(observation.getEncounter().getReference().getIdPartAsLong());
		OmopConceptMapping ocm = OmopConceptMapping.getInstance();
//		this.observationConcept.setId(ocm.get(OmopConceptMapping.GENDER, observation.getCode().getCodingFirstRep().getCode())); 
		IDatatype value = observation.getValue();
		if(value instanceof QuantityDt){
			this.valueAsNumber = ((QuantityDt) value).getValue();
//			this.unit.setId(ocm.get(OmopConceptMapping.GENDER, ((QuantityDt) value).getUnits())); 
			this.rangeHigh = observation.getReferenceRangeFirstRep().getHigh().getValue();
			this.rangeLow = observation.getReferenceRangeFirstRep().getLow().getValue();
		} else if(value instanceof CodeableConceptDt){
//			this.valueAsConcept.setId(ocm.get(OmopConceptMapping.GENDER, ((CodeableConceptDt) value).getCodingFirstRep().getCode()));
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
		code.getCodingFirstRep().setDisplay(this.observationConcept.toString());
		observation.setCode(code);
		observation.setStatus(STATUS);
		
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
