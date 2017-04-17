















package ca.uhn.fhir.model.dstu2.composite;

import java.net.URI;
import java.math.BigDecimal;
import org.apache.commons.lang3.StringUtils;
import java.util.*;
import ca.uhn.fhir.model.api.*;
import ca.uhn.fhir.model.primitive.*;
import ca.uhn.fhir.model.api.annotation.*;
import ca.uhn.fhir.model.base.composite.*;

import ca.uhn.fhir.model.dstu2.valueset.AddressTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AddressUseEnum;
import ca.uhn.fhir.model.dstu2.valueset.AggregationModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.BindingStrengthEnum;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.valueset.ConstraintSeverityEnum;
import ca.uhn.fhir.model.dstu2.valueset.ContactPointSystemEnum;
import ca.uhn.fhir.model.dstu2.valueset.ContactPointUseEnum;
import ca.uhn.fhir.model.dstu2.resource.Device;
import ca.uhn.fhir.model.dstu2.valueset.EventTimingEnum;
import ca.uhn.fhir.model.dstu2.valueset.IdentifierTypeCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.IdentifierUseEnum;
import ca.uhn.fhir.model.dstu2.valueset.NameUseEnum;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.dstu2.valueset.PropertyRepresentationEnum;
import ca.uhn.fhir.model.dstu2.valueset.QuantityComparatorEnum;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.RangeDt;
import ca.uhn.fhir.model.dstu2.resource.RelatedPerson;
import ca.uhn.fhir.model.dstu2.valueset.SignatureTypeCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.SlicingRulesEnum;
import ca.uhn.fhir.model.api.TemporalPrecisionEnum;
import ca.uhn.fhir.model.dstu2.valueset.TimingAbbreviationEnum;
import ca.uhn.fhir.model.dstu2.valueset.UnitsOfTimeEnum;
import ca.uhn.fhir.model.dstu2.resource.ValueSet;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.primitive.Base64BinaryDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.IntegerDt;
import ca.uhn.fhir.model.primitive.MarkdownDt;
import ca.uhn.fhir.model.primitive.PositiveIntDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.UnsignedIntDt;
import ca.uhn.fhir.model.primitive.UriDt;

/**
 * HAPI/FHIR <b>TimingDt</b> Datatype
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Need to able to track proposed timing schedules. There are several different ways to do this: one or more specified times, a simple rules like three times a day, or  before/after meals
 * </p> 
 */
@DatatypeDef(name="Timing") 
public class TimingDt
        extends  BaseIdentifiableElement         implements ICompositeDatatype{

	/**
	 * Constructor
	 */
	public TimingDt() {
		// nothing
	}


	@Child(name="event", type=DateTimeDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies specific times when the event occurs"
	)
	private java.util.List<DateTimeDt> myEvent;
	
	@Child(name="repeat", order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A set of rules that describe when the event should occur"
	)
	private Repeat myRepeat;
	
	@Child(name="code", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code for the timing pattern. Some codes such as BID are ubiquitous, but many institutions define their own additional codes"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/timing-abbreviation")
	private BoundCodeableConceptDt<TimingAbbreviationEnum> myCode;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myEvent,  myRepeat,  myCode);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myEvent, myRepeat, myCode);
	}

	/**
	 * Gets the value(s) for <b>event</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies specific times when the event occurs
     * </p> 
	 */
	public java.util.List<DateTimeDt> getEvent() {  
		if (myEvent == null) {
			myEvent = new java.util.ArrayList<DateTimeDt>();
		}
		return myEvent;
	}

	/**
	 * Sets the value(s) for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies specific times when the event occurs
     * </p> 
	 */
	public TimingDt setEvent(java.util.List<DateTimeDt> theValue) {
		myEvent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies specific times when the event occurs
     * </p> 
	 */
	public DateTimeDt addEvent() {
		DateTimeDt newType = new DateTimeDt();
		getEvent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>event</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifies specific times when the event occurs
	 * </p>
	 * @param theValue The event to add (must not be <code>null</code>)
	 */
	public TimingDt addEvent(DateTimeDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getEvent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>event</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies specific times when the event occurs
     * </p> 
	 */
	public DateTimeDt getEventFirstRep() {
		if (getEvent().isEmpty()) {
			return addEvent();
		}
		return getEvent().get(0); 
	}
 	/**
	 * Adds a new value for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies specific times when the event occurs
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public TimingDt addEvent( Date theDate,  TemporalPrecisionEnum thePrecision) {
		if (myEvent == null) {
			myEvent = new java.util.ArrayList<DateTimeDt>();
		}
		myEvent.add(new DateTimeDt(theDate, thePrecision));
		return this; 
	}

	/**
	 * Adds a new value for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies specific times when the event occurs
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public TimingDt addEvent( Date theDate) {
		if (myEvent == null) {
			myEvent = new java.util.ArrayList<DateTimeDt>();
		}
		myEvent.add(new DateTimeDt(theDate));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>repeat</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of rules that describe when the event should occur
     * </p> 
	 */
	public Repeat getRepeat() {  
		if (myRepeat == null) {
			myRepeat = new Repeat();
		}
		return myRepeat;
	}

	/**
	 * Sets the value(s) for <b>repeat</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of rules that describe when the event should occur
     * </p> 
	 */
	public TimingDt setRepeat(Repeat theValue) {
		myRepeat = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code for the timing pattern. Some codes such as BID are ubiquitous, but many institutions define their own additional codes
     * </p> 
	 */
	public BoundCodeableConceptDt<TimingAbbreviationEnum> getCode() {  
		if (myCode == null) {
			myCode = new BoundCodeableConceptDt<TimingAbbreviationEnum>(TimingAbbreviationEnum.VALUESET_BINDER);
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code for the timing pattern. Some codes such as BID are ubiquitous, but many institutions define their own additional codes
     * </p> 
	 */
	public TimingDt setCode(BoundCodeableConceptDt<TimingAbbreviationEnum> theValue) {
		myCode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code for the timing pattern. Some codes such as BID are ubiquitous, but many institutions define their own additional codes
     * </p> 
	 */
	public TimingDt setCode(TimingAbbreviationEnum theValue) {
		setCode(new BoundCodeableConceptDt<TimingAbbreviationEnum>(TimingAbbreviationEnum.VALUESET_BINDER, theValue));
		
/*
		getCode().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Block class for child element: <b>Timing.repeat</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of rules that describe when the event should occur
     * </p> 
	 */
	@Block()	
	public static class Repeat 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="bounds", order=0, min=0, max=1, summary=true, modifier=false, type={
		DurationDt.class, 		RangeDt.class, 		PeriodDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule"
	)
	private IDatatype myBounds;
	
	@Child(name="count", type=IntegerDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A total count of the desired number of repetitions"
	)
	private IntegerDt myCount;
	
	@Child(name="duration", type=DecimalDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="How long this thing happens for when it happens"
	)
	private DecimalDt myDuration;
	
	@Child(name="durationMax", type=DecimalDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The upper limit of how long this thing happens for when it happens"
	)
	private DecimalDt myDurationMax;
	
	@Child(name="durationUnits", type=CodeDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The units of time for the duration, in UCUM units"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/units-of-time")
	private BoundCodeDt<UnitsOfTimeEnum> myDurationUnits;
	
	@Child(name="frequency", type=IntegerDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided)"
	)
	private IntegerDt myFrequency;
	
	@Child(name="frequencyMax", type=IntegerDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private IntegerDt myFrequencyMax;
	
	@Child(name="period", type=DecimalDt.class, order=7, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the duration of time over which repetitions are to occur; e.g. to express \"3 times per day\", 3 would be the frequency and \"1 day\" would be the period"
	)
	private DecimalDt myPeriod;
	
	@Child(name="periodMax", type=DecimalDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \"do this once every 3-5 days"
	)
	private DecimalDt myPeriodMax;
	
	@Child(name="periodUnits", type=CodeDt.class, order=9, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The units of time for the period in UCUM units"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/units-of-time")
	private BoundCodeDt<UnitsOfTimeEnum> myPeriodUnits;
	
	@Child(name="when", type=CodeDt.class, order=10, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A real world event that the occurrence of the event should be tied to."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/event-timing")
	private BoundCodeDt<EventTimingEnum> myWhen;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myBounds,  myCount,  myDuration,  myDurationMax,  myDurationUnits,  myFrequency,  myFrequencyMax,  myPeriod,  myPeriodMax,  myPeriodUnits,  myWhen);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myBounds, myCount, myDuration, myDurationMax, myDurationUnits, myFrequency, myFrequencyMax, myPeriod, myPeriodMax, myPeriodUnits, myWhen);
	}

	/**
	 * Gets the value(s) for <b>bounds[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule
     * </p> 
	 */
	public IDatatype getBounds() {  
		return myBounds;
	}

	/**
	 * Sets the value(s) for <b>bounds[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule
     * </p> 
	 */
	public Repeat setBounds(IDatatype theValue) {
		myBounds = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>count</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A total count of the desired number of repetitions
     * </p> 
	 */
	public IntegerDt getCountElement() {  
		if (myCount == null) {
			myCount = new IntegerDt();
		}
		return myCount;
	}

	
	/**
	 * Gets the value(s) for <b>count</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A total count of the desired number of repetitions
     * </p> 
	 */
	public Integer getCount() {  
		return getCountElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>count</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A total count of the desired number of repetitions
     * </p> 
	 */
	public Repeat setCount(IntegerDt theValue) {
		myCount = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>count</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A total count of the desired number of repetitions
     * </p> 
	 */
	public Repeat setCount( int theInteger) {
		myCount = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>duration</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * How long this thing happens for when it happens
     * </p> 
	 */
	public DecimalDt getDurationElement() {  
		if (myDuration == null) {
			myDuration = new DecimalDt();
		}
		return myDuration;
	}

	
	/**
	 * Gets the value(s) for <b>duration</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * How long this thing happens for when it happens
     * </p> 
	 */
	public BigDecimal getDuration() {  
		return getDurationElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>duration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How long this thing happens for when it happens
     * </p> 
	 */
	public Repeat setDuration(DecimalDt theValue) {
		myDuration = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>duration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How long this thing happens for when it happens
     * </p> 
	 */
	public Repeat setDuration( long theValue) {
		myDuration = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>duration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How long this thing happens for when it happens
     * </p> 
	 */
	public Repeat setDuration( double theValue) {
		myDuration = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>duration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How long this thing happens for when it happens
     * </p> 
	 */
	public Repeat setDuration( java.math.BigDecimal theValue) {
		myDuration = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>durationMax</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The upper limit of how long this thing happens for when it happens
     * </p> 
	 */
	public DecimalDt getDurationMaxElement() {  
		if (myDurationMax == null) {
			myDurationMax = new DecimalDt();
		}
		return myDurationMax;
	}

	
	/**
	 * Gets the value(s) for <b>durationMax</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The upper limit of how long this thing happens for when it happens
     * </p> 
	 */
	public BigDecimal getDurationMax() {  
		return getDurationMaxElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>durationMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The upper limit of how long this thing happens for when it happens
     * </p> 
	 */
	public Repeat setDurationMax(DecimalDt theValue) {
		myDurationMax = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>durationMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The upper limit of how long this thing happens for when it happens
     * </p> 
	 */
	public Repeat setDurationMax( long theValue) {
		myDurationMax = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>durationMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The upper limit of how long this thing happens for when it happens
     * </p> 
	 */
	public Repeat setDurationMax( double theValue) {
		myDurationMax = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>durationMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The upper limit of how long this thing happens for when it happens
     * </p> 
	 */
	public Repeat setDurationMax( java.math.BigDecimal theValue) {
		myDurationMax = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>durationUnits</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The units of time for the duration, in UCUM units
     * </p> 
	 */
	public BoundCodeDt<UnitsOfTimeEnum> getDurationUnitsElement() {  
		if (myDurationUnits == null) {
			myDurationUnits = new BoundCodeDt<UnitsOfTimeEnum>(UnitsOfTimeEnum.VALUESET_BINDER);
		}
		return myDurationUnits;
	}

	
	/**
	 * Gets the value(s) for <b>durationUnits</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The units of time for the duration, in UCUM units
     * </p> 
	 */
	public String getDurationUnits() {  
		return getDurationUnitsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>durationUnits</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The units of time for the duration, in UCUM units
     * </p> 
	 */
	public Repeat setDurationUnits(BoundCodeDt<UnitsOfTimeEnum> theValue) {
		myDurationUnits = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>durationUnits</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The units of time for the duration, in UCUM units
     * </p> 
	 */
	public Repeat setDurationUnits(UnitsOfTimeEnum theValue) {
		setDurationUnits(new BoundCodeDt<UnitsOfTimeEnum>(UnitsOfTimeEnum.VALUESET_BINDER, theValue));
		
/*
		getDurationUnitsElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>frequency</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided)
     * </p> 
	 */
	public IntegerDt getFrequencyElement() {  
		if (myFrequency == null) {
			myFrequency = new IntegerDt();
		}
		return myFrequency;
	}

	
	/**
	 * Gets the value(s) for <b>frequency</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided)
     * </p> 
	 */
	public Integer getFrequency() {  
		return getFrequencyElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>frequency</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided)
     * </p> 
	 */
	public Repeat setFrequency(IntegerDt theValue) {
		myFrequency = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>frequency</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided)
     * </p> 
	 */
	public Repeat setFrequency( int theInteger) {
		myFrequency = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>frequencyMax</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public IntegerDt getFrequencyMaxElement() {  
		if (myFrequencyMax == null) {
			myFrequencyMax = new IntegerDt();
		}
		return myFrequencyMax;
	}

	
	/**
	 * Gets the value(s) for <b>frequencyMax</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Integer getFrequencyMax() {  
		return getFrequencyMaxElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>frequencyMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Repeat setFrequencyMax(IntegerDt theValue) {
		myFrequencyMax = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>frequencyMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Repeat setFrequencyMax( int theInteger) {
		myFrequencyMax = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the duration of time over which repetitions are to occur; e.g. to express \&quot;3 times per day\&quot;, 3 would be the frequency and \&quot;1 day\&quot; would be the period
     * </p> 
	 */
	public DecimalDt getPeriodElement() {  
		if (myPeriod == null) {
			myPeriod = new DecimalDt();
		}
		return myPeriod;
	}

	
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the duration of time over which repetitions are to occur; e.g. to express \&quot;3 times per day\&quot;, 3 would be the frequency and \&quot;1 day\&quot; would be the period
     * </p> 
	 */
	public BigDecimal getPeriod() {  
		return getPeriodElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>period</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the duration of time over which repetitions are to occur; e.g. to express \&quot;3 times per day\&quot;, 3 would be the frequency and \&quot;1 day\&quot; would be the period
     * </p> 
	 */
	public Repeat setPeriod(DecimalDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>period</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the duration of time over which repetitions are to occur; e.g. to express \&quot;3 times per day\&quot;, 3 would be the frequency and \&quot;1 day\&quot; would be the period
     * </p> 
	 */
	public Repeat setPeriod( long theValue) {
		myPeriod = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>period</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the duration of time over which repetitions are to occur; e.g. to express \&quot;3 times per day\&quot;, 3 would be the frequency and \&quot;1 day\&quot; would be the period
     * </p> 
	 */
	public Repeat setPeriod( double theValue) {
		myPeriod = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>period</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the duration of time over which repetitions are to occur; e.g. to express \&quot;3 times per day\&quot;, 3 would be the frequency and \&quot;1 day\&quot; would be the period
     * </p> 
	 */
	public Repeat setPeriod( java.math.BigDecimal theValue) {
		myPeriod = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>periodMax</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \&quot;do this once every 3-5 days
     * </p> 
	 */
	public DecimalDt getPeriodMaxElement() {  
		if (myPeriodMax == null) {
			myPeriodMax = new DecimalDt();
		}
		return myPeriodMax;
	}

	
	/**
	 * Gets the value(s) for <b>periodMax</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \&quot;do this once every 3-5 days
     * </p> 
	 */
	public BigDecimal getPeriodMax() {  
		return getPeriodMaxElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>periodMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \&quot;do this once every 3-5 days
     * </p> 
	 */
	public Repeat setPeriodMax(DecimalDt theValue) {
		myPeriodMax = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>periodMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \&quot;do this once every 3-5 days
     * </p> 
	 */
	public Repeat setPeriodMax( long theValue) {
		myPeriodMax = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>periodMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \&quot;do this once every 3-5 days
     * </p> 
	 */
	public Repeat setPeriodMax( double theValue) {
		myPeriodMax = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>periodMax</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \&quot;do this once every 3-5 days
     * </p> 
	 */
	public Repeat setPeriodMax( java.math.BigDecimal theValue) {
		myPeriodMax = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>periodUnits</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The units of time for the period in UCUM units
     * </p> 
	 */
	public BoundCodeDt<UnitsOfTimeEnum> getPeriodUnitsElement() {  
		if (myPeriodUnits == null) {
			myPeriodUnits = new BoundCodeDt<UnitsOfTimeEnum>(UnitsOfTimeEnum.VALUESET_BINDER);
		}
		return myPeriodUnits;
	}

	
	/**
	 * Gets the value(s) for <b>periodUnits</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The units of time for the period in UCUM units
     * </p> 
	 */
	public String getPeriodUnits() {  
		return getPeriodUnitsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>periodUnits</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The units of time for the period in UCUM units
     * </p> 
	 */
	public Repeat setPeriodUnits(BoundCodeDt<UnitsOfTimeEnum> theValue) {
		myPeriodUnits = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>periodUnits</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The units of time for the period in UCUM units
     * </p> 
	 */
	public Repeat setPeriodUnits(UnitsOfTimeEnum theValue) {
		setPeriodUnits(new BoundCodeDt<UnitsOfTimeEnum>(UnitsOfTimeEnum.VALUESET_BINDER, theValue));
		
/*
		getPeriodUnitsElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>when</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real world event that the occurrence of the event should be tied to.
     * </p> 
	 */
	public BoundCodeDt<EventTimingEnum> getWhenElement() {  
		if (myWhen == null) {
			myWhen = new BoundCodeDt<EventTimingEnum>(EventTimingEnum.VALUESET_BINDER);
		}
		return myWhen;
	}

	
	/**
	 * Gets the value(s) for <b>when</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real world event that the occurrence of the event should be tied to.
     * </p> 
	 */
	public String getWhen() {  
		return getWhenElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>when</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real world event that the occurrence of the event should be tied to.
     * </p> 
	 */
	public Repeat setWhen(BoundCodeDt<EventTimingEnum> theValue) {
		myWhen = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>when</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real world event that the occurrence of the event should be tied to.
     * </p> 
	 */
	public Repeat setWhen(EventTimingEnum theValue) {
		setWhen(new BoundCodeDt<EventTimingEnum>(EventTimingEnum.VALUESET_BINDER, theValue));
		
/*
		getWhenElement().setValueAsEnum(theValue);
*/
		return this;
	}

  


	}




}