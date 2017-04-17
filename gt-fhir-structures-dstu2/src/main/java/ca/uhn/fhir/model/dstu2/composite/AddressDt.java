















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
 * HAPI/FHIR <b>AddressDt</b> Datatype
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * There is a variety of postal address formats defined around the world. This format defines a superset that is the basis for all addresses around the world
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Need to be able to record postal addresses, along with notes about their use
 * </p> 
 */
@DatatypeDef(name="Address") 
public class AddressDt
        extends  BaseIdentifiableElement         implements ICompositeDatatype{

	/**
	 * Constructor
	 */
	public AddressDt() {
		// nothing
	}


	@Child(name="use", type=CodeDt.class, order=0, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="The purpose of this address"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/address-use")
	private BoundCodeDt<AddressUseEnum> myUse;
	
	@Child(name="type", type=CodeDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/address-type")
	private BoundCodeDt<AddressTypeEnum> myType;
	
	@Child(name="text", type=StringDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A full text representation of the address"
	)
	private StringDt myText;
	
	@Child(name="line", type=StringDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information"
	)
	private java.util.List<StringDt> myLine;
	
	@Child(name="city", type=StringDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of the city, town, village or other community or delivery center"
	)
	private StringDt myCity;
	
	@Child(name="district", type=StringDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of the administrative area (county)"
	)
	private StringDt myDistrict;
	
	@Child(name="state", type=StringDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes)"
	)
	private StringDt myState;
	
	@Child(name="postalCode", type=StringDt.class, order=7, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A postal code designating a region defined by the postal service"
	)
	private StringDt myPostalCode;
	
	@Child(name="country", type=StringDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Country - a nation as commonly understood or generally accepted"
	)
	private StringDt myCountry;
	
	@Child(name="period", type=PeriodDt.class, order=9, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Time period when address was/is in use"
	)
	private PeriodDt myPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUse,  myType,  myText,  myLine,  myCity,  myDistrict,  myState,  myPostalCode,  myCountry,  myPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUse, myType, myText, myLine, myCity, myDistrict, myState, myPostalCode, myCountry, myPeriod);
	}

	/**
	 * Gets the value(s) for <b>use</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The purpose of this address
     * </p> 
	 */
	public BoundCodeDt<AddressUseEnum> getUseElement() {  
		if (myUse == null) {
			myUse = new BoundCodeDt<AddressUseEnum>(AddressUseEnum.VALUESET_BINDER);
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
     * The purpose of this address
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
     * The purpose of this address
     * </p> 
	 */
	public AddressDt setUse(BoundCodeDt<AddressUseEnum> theValue) {
		myUse = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>use</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The purpose of this address
     * </p> 
	 */
	public AddressDt setUse(AddressUseEnum theValue) {
		setUse(new BoundCodeDt<AddressUseEnum>(AddressUseEnum.VALUESET_BINDER, theValue));
		
/*
		getUseElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both
     * </p> 
	 */
	public BoundCodeDt<AddressTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<AddressTypeEnum>(AddressTypeEnum.VALUESET_BINDER);
		}
		return myType;
	}

	
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both
     * </p> 
	 */
	public String getType() {  
		return getTypeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both
     * </p> 
	 */
	public AddressDt setType(BoundCodeDt<AddressTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both
     * </p> 
	 */
	public AddressDt setType(AddressTypeEnum theValue) {
		setType(new BoundCodeDt<AddressTypeEnum>(AddressTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A full text representation of the address
     * </p> 
	 */
	public StringDt getTextElement() {  
		if (myText == null) {
			myText = new StringDt();
		}
		return myText;
	}

	
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A full text representation of the address
     * </p> 
	 */
	public String getText() {  
		return getTextElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A full text representation of the address
     * </p> 
	 */
	public AddressDt setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A full text representation of the address
     * </p> 
	 */
	public AddressDt setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>line</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information
     * </p> 
	 */
	public java.util.List<StringDt> getLine() {  
		if (myLine == null) {
			myLine = new java.util.ArrayList<StringDt>();
		}
		return myLine;
	}

	/**
	 * Sets the value(s) for <b>line</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information
     * </p> 
	 */
	public AddressDt setLine(java.util.List<StringDt> theValue) {
		myLine = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>line</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information
     * </p> 
	 */
	public StringDt addLine() {
		StringDt newType = new StringDt();
		getLine().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>line</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information
	 * </p>
	 * @param theValue The line to add (must not be <code>null</code>)
	 */
	public AddressDt addLine(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getLine().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>line</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information
     * </p> 
	 */
	public StringDt getLineFirstRep() {
		if (getLine().isEmpty()) {
			return addLine();
		}
		return getLine().get(0); 
	}
 	/**
	 * Adds a new value for <b>line</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This component contains the house number, apartment number, street name, street direction,  P.O. Box number, delivery hints, and similar address information
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public AddressDt addLine( String theString) {
		if (myLine == null) {
			myLine = new java.util.ArrayList<StringDt>();
		}
		myLine.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>city</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the city, town, village or other community or delivery center
     * </p> 
	 */
	public StringDt getCityElement() {  
		if (myCity == null) {
			myCity = new StringDt();
		}
		return myCity;
	}

	
	/**
	 * Gets the value(s) for <b>city</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the city, town, village or other community or delivery center
     * </p> 
	 */
	public String getCity() {  
		return getCityElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>city</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the city, town, village or other community or delivery center
     * </p> 
	 */
	public AddressDt setCity(StringDt theValue) {
		myCity = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>city</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the city, town, village or other community or delivery center
     * </p> 
	 */
	public AddressDt setCity( String theString) {
		myCity = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>district</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the administrative area (county)
     * </p> 
	 */
	public StringDt getDistrictElement() {  
		if (myDistrict == null) {
			myDistrict = new StringDt();
		}
		return myDistrict;
	}

	
	/**
	 * Gets the value(s) for <b>district</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the administrative area (county)
     * </p> 
	 */
	public String getDistrict() {  
		return getDistrictElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>district</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the administrative area (county)
     * </p> 
	 */
	public AddressDt setDistrict(StringDt theValue) {
		myDistrict = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>district</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the administrative area (county)
     * </p> 
	 */
	public AddressDt setDistrict( String theString) {
		myDistrict = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>state</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes)
     * </p> 
	 */
	public StringDt getStateElement() {  
		if (myState == null) {
			myState = new StringDt();
		}
		return myState;
	}

	
	/**
	 * Gets the value(s) for <b>state</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes)
     * </p> 
	 */
	public String getState() {  
		return getStateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>state</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes)
     * </p> 
	 */
	public AddressDt setState(StringDt theValue) {
		myState = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>state</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes)
     * </p> 
	 */
	public AddressDt setState( String theString) {
		myState = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>postalCode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A postal code designating a region defined by the postal service
     * </p> 
	 */
	public StringDt getPostalCodeElement() {  
		if (myPostalCode == null) {
			myPostalCode = new StringDt();
		}
		return myPostalCode;
	}

	
	/**
	 * Gets the value(s) for <b>postalCode</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A postal code designating a region defined by the postal service
     * </p> 
	 */
	public String getPostalCode() {  
		return getPostalCodeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>postalCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A postal code designating a region defined by the postal service
     * </p> 
	 */
	public AddressDt setPostalCode(StringDt theValue) {
		myPostalCode = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>postalCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A postal code designating a region defined by the postal service
     * </p> 
	 */
	public AddressDt setPostalCode( String theString) {
		myPostalCode = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>country</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Country - a nation as commonly understood or generally accepted
     * </p> 
	 */
	public StringDt getCountryElement() {  
		if (myCountry == null) {
			myCountry = new StringDt();
		}
		return myCountry;
	}

	
	/**
	 * Gets the value(s) for <b>country</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Country - a nation as commonly understood or generally accepted
     * </p> 
	 */
	public String getCountry() {  
		return getCountryElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>country</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Country - a nation as commonly understood or generally accepted
     * </p> 
	 */
	public AddressDt setCountry(StringDt theValue) {
		myCountry = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>country</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Country - a nation as commonly understood or generally accepted
     * </p> 
	 */
	public AddressDt setCountry( String theString) {
		myCountry = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time period when address was/is in use
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
     * Time period when address was/is in use
     * </p> 
	 */
	public AddressDt setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  


}