















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
 * HAPI/FHIR <b>RangeDt</b> Datatype
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A set of ordered Quantities defined by a low and high limit.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Need to be able to specify ranges of values
 * </p> 
 */
@DatatypeDef(name="Range") 
public class RangeDt
        extends  BaseIdentifiableElement         implements ICompositeDatatype{

	/**
	 * Constructor
	 */
	public RangeDt() {
		// nothing
	}


	@Child(name="low", type=SimpleQuantityDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The low limit. The boundary is inclusive."
	)
	private SimpleQuantityDt myLow;
	
	@Child(name="high", type=SimpleQuantityDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The high limit. The boundary is inclusive."
	)
	private SimpleQuantityDt myHigh;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLow,  myHigh);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLow, myHigh);
	}

	/**
	 * Gets the value(s) for <b>low</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The low limit. The boundary is inclusive.
     * </p> 
	 */
	public SimpleQuantityDt getLow() {  
		if (myLow == null) {
			myLow = new SimpleQuantityDt();
		}
		return myLow;
	}

	/**
	 * Sets the value(s) for <b>low</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The low limit. The boundary is inclusive.
     * </p> 
	 */
	public RangeDt setLow(SimpleQuantityDt theValue) {
		myLow = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>high</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The high limit. The boundary is inclusive.
     * </p> 
	 */
	public SimpleQuantityDt getHigh() {  
		if (myHigh == null) {
			myHigh = new SimpleQuantityDt();
		}
		return myHigh;
	}

	/**
	 * Sets the value(s) for <b>high</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The high limit. The boundary is inclusive.
     * </p> 
	 */
	public RangeDt setHigh(SimpleQuantityDt theValue) {
		myHigh = theValue;
		return this;
	}
	
	

  


}