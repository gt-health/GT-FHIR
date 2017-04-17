















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
 * HAPI/FHIR <b>ContactPointDt</b> Datatype
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Need to track phone, fax, mobile, sms numbers, email addresses, twitter tags, etc.
 * </p> 
 */
@DatatypeDef(name="ContactPoint") 
public class ContactPointDt
        extends  BaseIdentifiableElement         implements ICompositeDatatype{

	/**
	 * Constructor
	 */
	public ContactPointDt() {
		// nothing
	}


	@Child(name="system", type=CodeDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Telecommunications form for contact point - what communications system is required to make use of the contact"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/contact-point-system")
	private BoundCodeDt<ContactPointSystemEnum> mySystem;
	
	@Child(name="value", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address)."
	)
	private StringDt myValue;
	
	@Child(name="use", type=CodeDt.class, order=2, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the purpose for the contact point"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/contact-point-use")
	private BoundCodeDt<ContactPointUseEnum> myUse;
	
	@Child(name="rank", type=PositiveIntDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values"
	)
	private PositiveIntDt myRank;
	
	@Child(name="period", type=PeriodDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Time period when the contact point was/is in use"
	)
	private PeriodDt myPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySystem,  myValue,  myUse,  myRank,  myPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySystem, myValue, myUse, myRank, myPeriod);
	}

	/**
	 * Gets the value(s) for <b>system</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Telecommunications form for contact point - what communications system is required to make use of the contact
     * </p> 
	 */
	public BoundCodeDt<ContactPointSystemEnum> getSystemElement() {  
		if (mySystem == null) {
			mySystem = new BoundCodeDt<ContactPointSystemEnum>(ContactPointSystemEnum.VALUESET_BINDER);
		}
		return mySystem;
	}

	
	/**
	 * Gets the value(s) for <b>system</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Telecommunications form for contact point - what communications system is required to make use of the contact
     * </p> 
	 */
	public String getSystem() {  
		return getSystemElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Telecommunications form for contact point - what communications system is required to make use of the contact
     * </p> 
	 */
	public ContactPointDt setSystem(BoundCodeDt<ContactPointSystemEnum> theValue) {
		mySystem = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Telecommunications form for contact point - what communications system is required to make use of the contact
     * </p> 
	 */
	public ContactPointDt setSystem(ContactPointSystemEnum theValue) {
		setSystem(new BoundCodeDt<ContactPointSystemEnum>(ContactPointSystemEnum.VALUESET_BINDER, theValue));
		
/*
		getSystemElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     * </p> 
	 */
	public StringDt getValueElement() {  
		if (myValue == null) {
			myValue = new StringDt();
		}
		return myValue;
	}

	
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     * </p> 
	 */
	public String getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     * </p> 
	 */
	public ContactPointDt setValue(StringDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual contact point details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     * </p> 
	 */
	public ContactPointDt setValue( String theString) {
		myValue = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>use</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the purpose for the contact point
     * </p> 
	 */
	public BoundCodeDt<ContactPointUseEnum> getUseElement() {  
		if (myUse == null) {
			myUse = new BoundCodeDt<ContactPointUseEnum>(ContactPointUseEnum.VALUESET_BINDER);
		}
		return myUse;
	}

	
	/**
	 * Gets the value(s) for <b>use</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the purpose for the contact point
     * </p> 
	 */
	public String getUse() {  
		return getUseElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>use</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the purpose for the contact point
     * </p> 
	 */
	public ContactPointDt setUse(BoundCodeDt<ContactPointUseEnum> theValue) {
		myUse = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>use</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the purpose for the contact point
     * </p> 
	 */
	public ContactPointDt setUse(ContactPointUseEnum theValue) {
		setUse(new BoundCodeDt<ContactPointUseEnum>(ContactPointUseEnum.VALUESET_BINDER, theValue));
		
/*
		getUseElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>rank</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values
     * </p> 
	 */
	public PositiveIntDt getRankElement() {  
		if (myRank == null) {
			myRank = new PositiveIntDt();
		}
		return myRank;
	}

	
	/**
	 * Gets the value(s) for <b>rank</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values
     * </p> 
	 */
	public Integer getRank() {  
		return getRankElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>rank</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values
     * </p> 
	 */
	public ContactPointDt setRank(PositiveIntDt theValue) {
		myRank = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>rank</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a preferred order in which to use a set of contacts. Contacts are ranked with lower values coming before higher values
     * </p> 
	 */
	public ContactPointDt setRank( int theInteger) {
		myRank = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time period when the contact point was/is in use
     * </p> 
	 */
	public PeriodDt getPeriod() {  
		if (myPeriod == null) {
			myPeriod = new PeriodDt();
		}
		return myPeriod;
	}

	/**
	 * Sets the value(s) for <b>period</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Time period when the contact point was/is in use
     * </p> 
	 */
	public ContactPointDt setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  


}