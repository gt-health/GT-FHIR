package edu.gatech.i3l.jpa.model.omop;

import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_ENCOUNTER;
import static ca.uhn.fhir.model.dstu2.resource.Observation.SP_SUBJECT;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IDatatype;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.TemporalPrecisionEnum;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;

public class Observation extends BaseResourceEntity{

	private static final String RES_TYPE = "Observation";
	private static final ObservationStatusEnum STATUS = ObservationStatusEnum.FINAL;
	
	private Long id;
	private Person person;
	private Concept observationConcept;
	private Date date;
	private Date time;
	private String valueAsString;
	private BigDecimal valueAsNumber;
	private BigDecimal rangeLow;

	private BigDecimal rangeHigh;
	private Concept valueAsConcept;
	private Concept relevantCondition;
	private Concept type;
	private Provider provider;
	private VisitOccurrence visitOccurrence;
	private String sourceValue;
	
	private Concept unit;
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
	public IResourceEntity constructEntityFromResource(IResource arg0) {
		// TODO Auto-generated method stub
		return null;
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
		CodingDt coding = new CodingDt();
		coding.setDisplay(this.sourceValue);
		code.addCoding(coding );
		observation.setCode(code);
		observation.setStatus(STATUS);
		IDatatype value = null;
		if (this.valueAsString != null){
			value = new StringDt(this.valueAsString); 
		} else 	if(this.valueAsNumber != null ){
			QuantityDt quantity = new QuantityDt(this.valueAsNumber.doubleValue());
			quantity.setUnits(this.unit.getConceptCode());
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
		
		if(this.date != null && this.time != null){
			Calendar c = Calendar.getInstance();
			c.set(this.date.getYear(), this.date.getMonth(), this.date.getDay(), this.time.getHours(), this.time.getMinutes(), this.time.getSeconds());
			DateTimeDt appliesDate = new DateTimeDt(c.getTime(), TemporalPrecisionEnum.SECOND);
			observation.setApplies(appliesDate);
		}
		if(this.person != null)
			observation.setSubject(new ResourceReferenceDt(new IdDt(this.person.getId())));
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
	public String translateLink(String link) {
			switch (link) {
			case SP_SUBJECT:
				return "person";
			case SP_ENCOUNTER:
				return "visitOccurrence";
			default:
				break;
			}
		return link;
	}

	@Override
	public IdDt getIdDt() {
		return new IdDt(this.id);
	}
	
	
}
