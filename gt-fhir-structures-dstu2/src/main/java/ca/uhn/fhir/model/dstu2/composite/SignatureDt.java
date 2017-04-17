















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
 * HAPI/FHIR <b>SignatureDt</b> Datatype
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different Signature approaches have different utilities
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * There are a number of places where content must be signed in healthcare
 * </p> 
 */
@DatatypeDef(name="Signature") 
public class SignatureDt
        extends  BaseIdentifiableElement         implements ICompositeDatatype{

	/**
	 * Constructor
	 */
	public SignatureDt() {
		// nothing
	}


	@Child(name="type", type=CodingDt.class, order=0, min=1, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-signature-type")
	private java.util.List<CodingDt> myType;
	
	@Child(name="when", type=InstantDt.class, order=1, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="When the digital signature was signed."
	)
	private InstantDt myWhen;
	
	@Child(name="who", order=2, min=1, max=1, summary=true, modifier=false, type={
		UriDt.class, 		Practitioner.class, 		RelatedPerson.class, 		Patient.class, 		Device.class, 		Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A reference to an application-usable description of the person that signed the certificate (e.g. the signature used their private key)"
	)
	private IDatatype myWho;
	
	@Child(name="contentType", type=CodeDt.class, order=3, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/* for a graphical image of a signature"
	)
	private CodeDt myContentType;
	
	@Child(name="blob", type=Base64BinaryDt.class, order=4, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The base64 encoding of the Signature content"
	)
	private Base64BinaryDt myBlob;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myWhen,  myWho,  myContentType,  myBlob);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myWhen, myWho, myContentType, myBlob);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
     * </p> 
	 */
	public java.util.List<CodingDt> getType() {  
		if (myType == null) {
			myType = new java.util.ArrayList<CodingDt>();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
     * </p> 
	 */
	public SignatureDt setType(java.util.List<CodingDt> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
     * </p> 
	 */
	public CodingDt addType() {
		CodingDt newType = new CodingDt();
		getType().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>type</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
	 * </p>
	 * @param theValue The type to add (must not be <code>null</code>)
	 */
	public SignatureDt addType(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getType().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>type</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
     * </p> 
	 */
	public CodingDt getTypeFirstRep() {
		if (getType().isEmpty()) {
			return addType();
		}
		return getType().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>when</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the digital signature was signed.
     * </p> 
	 */
	public InstantDt getWhenElement() {  
		if (myWhen == null) {
			myWhen = new InstantDt();
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
     * When the digital signature was signed.
     * </p> 
	 */
	public Date getWhen() {  
		return getWhenElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>when</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When the digital signature was signed.
     * </p> 
	 */
	public SignatureDt setWhen(InstantDt theValue) {
		myWhen = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>when</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When the digital signature was signed.
     * </p> 
	 */
	public SignatureDt setWhenWithMillisPrecision( Date theDate) {
		myWhen = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>when</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When the digital signature was signed.
     * </p> 
	 */
	public SignatureDt setWhen( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myWhen = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>who[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to an application-usable description of the person that signed the certificate (e.g. the signature used their private key)
     * </p> 
	 */
	public IDatatype getWho() {  
		return myWho;
	}

	/**
	 * Sets the value(s) for <b>who[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to an application-usable description of the person that signed the certificate (e.g. the signature used their private key)
     * </p> 
	 */
	public SignatureDt setWho(IDatatype theValue) {
		myWho = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>contentType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/* for a graphical image of a signature
     * </p> 
	 */
	public CodeDt getContentTypeElement() {  
		if (myContentType == null) {
			myContentType = new CodeDt();
		}
		return myContentType;
	}

	
	/**
	 * Gets the value(s) for <b>contentType</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/* for a graphical image of a signature
     * </p> 
	 */
	public String getContentType() {  
		return getContentTypeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>contentType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/* for a graphical image of a signature
     * </p> 
	 */
	public SignatureDt setContentType(CodeDt theValue) {
		myContentType = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>contentType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/* for a graphical image of a signature
     * </p> 
	 */
	public SignatureDt setContentType( String theCode) {
		myContentType = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>blob</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The base64 encoding of the Signature content
     * </p> 
	 */
	public Base64BinaryDt getBlobElement() {  
		if (myBlob == null) {
			myBlob = new Base64BinaryDt();
		}
		return myBlob;
	}

	
	/**
	 * Gets the value(s) for <b>blob</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The base64 encoding of the Signature content
     * </p> 
	 */
	public byte[] getBlob() {  
		return getBlobElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>blob</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The base64 encoding of the Signature content
     * </p> 
	 */
	public SignatureDt setBlob(Base64BinaryDt theValue) {
		myBlob = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>blob</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The base64 encoding of the Signature content
     * </p> 
	 */
	public SignatureDt setBlob( byte[] theBytes) {
		myBlob = new Base64BinaryDt(theBytes); 
		return this; 
	}

 


}