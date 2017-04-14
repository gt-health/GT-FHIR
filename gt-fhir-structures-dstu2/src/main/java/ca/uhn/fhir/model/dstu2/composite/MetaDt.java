















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
 * HAPI/FHIR <b>MetaDt</b> Datatype
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 */
@DatatypeDef(name="Meta") 
public class MetaDt
        extends  BaseIdentifiableElement         implements ICompositeDatatype, org.hl7.fhir.instance.model.api.IBaseMetaType {

	/**
	 * Constructor
	 */
	public MetaDt() {
		// nothing
	}

	@Override
	public MetaDt setLastUpdated(Date theHeaderDateValue) {
		return setLastUpdated(theHeaderDateValue, TemporalPrecisionEnum.SECOND);
	}

	/**
 	 * Returns the first tag (if any) that has the given system and code, or returns
 	 * <code>null</code> if none
 	 */
 	public CodingDt getTag(String theSystem, String theCode) {
 		for (CodingDt next : getTag()) {
 			if (ca.uhn.fhir.util.ObjectUtil.equals(next.getSystem(), theSystem) && ca.uhn.fhir.util.ObjectUtil.equals(next.getCode(), theCode)) {
 				return next;
 			}
 		}
 		return null;
 	}

 	/**
 	 * Returns the first security label (if any) that has the given system and code, or returns
 	 * <code>null</code> if none
 	 */
 	public CodingDt getSecurity(String theSystem, String theCode) {
 		for (CodingDt next : getTag()) {
 			if (ca.uhn.fhir.util.ObjectUtil.equals(next.getSystem(), theSystem) && ca.uhn.fhir.util.ObjectUtil.equals(next.getCode(), theCode)) {
 				return next;
 			}
 		}
 		return null;
 	}  


	@Child(name="versionId", type=IdDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted"
	)
	private IdDt myVersionId;
	
	@Child(name="lastUpdated", type=InstantDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="When the resource last changed - e.g. when the version changed"
	)
	private InstantDt myLastUpdated;
	
	@Child(name="profile", type=UriDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]"
	)
	private java.util.List<UriDt> myProfile;
	
	@Child(name="security", type=CodingDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure"
	)
	private java.util.List<CodingDt> mySecurity;
	
	@Child(name="tag", type=CodingDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource"
	)
	private java.util.List<CodingDt> myTag;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myVersionId,  myLastUpdated,  myProfile,  mySecurity,  myTag);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myVersionId, myLastUpdated, myProfile, mySecurity, myTag);
	}

	/**
	 * Gets the value(s) for <b>versionId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted
     * </p> 
	 */
	public IdDt getVersionIdElement() {  
		if (myVersionId == null) {
			myVersionId = new IdDt();
		}
		return myVersionId;
	}

	
	/**
	 * Gets the value(s) for <b>versionId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted
     * </p> 
	 */
	public String getVersionId() {  
		return getVersionIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>versionId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted
     * </p> 
	 */
	public MetaDt setVersionId(IdDt theValue) {
		myVersionId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>versionId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted
     * </p> 
	 */
	public MetaDt setVersionId( String theId) {
		myVersionId = new IdDt(theId); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>lastUpdated</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the resource last changed - e.g. when the version changed
     * </p> 
	 */
	public InstantDt getLastUpdatedElement() {  
		if (myLastUpdated == null) {
			myLastUpdated = new InstantDt();
		}
		return myLastUpdated;
	}

	
	/**
	 * Gets the value(s) for <b>lastUpdated</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the resource last changed - e.g. when the version changed
     * </p> 
	 */
	public Date getLastUpdated() {  
		return getLastUpdatedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>lastUpdated</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When the resource last changed - e.g. when the version changed
     * </p> 
	 */
	public MetaDt setLastUpdated(InstantDt theValue) {
		myLastUpdated = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>lastUpdated</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When the resource last changed - e.g. when the version changed
     * </p> 
	 */
	public MetaDt setLastUpdatedWithMillisPrecision( Date theDate) {
		myLastUpdated = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>lastUpdated</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When the resource last changed - e.g. when the version changed
     * </p> 
	 */
	public MetaDt setLastUpdated( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myLastUpdated = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>profile</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]
     * </p> 
	 */
	public java.util.List<UriDt> getProfile() {  
		if (myProfile == null) {
			myProfile = new java.util.ArrayList<UriDt>();
		}
		return myProfile;
	}

	/**
	 * Sets the value(s) for <b>profile</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]
     * </p> 
	 */
	public MetaDt setProfile(java.util.List<UriDt> theValue) {
		myProfile = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>profile</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]
     * </p> 
	 */
	public UriDt addProfile() {
		UriDt newType = new UriDt();
		getProfile().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>profile</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]
	 * </p>
	 * @param theValue The profile to add (must not be <code>null</code>)
	 */
	public MetaDt addProfile(UriDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getProfile().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>profile</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]
     * </p> 
	 */
	public UriDt getProfileFirstRep() {
		if (getProfile().isEmpty()) {
			return addProfile();
		}
		return getProfile().get(0); 
	}
 	/**
	 * Adds a new value for <b>profile</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public MetaDt addProfile( String theUri) {
		if (myProfile == null) {
			myProfile = new java.util.ArrayList<UriDt>();
		}
		myProfile.add(new UriDt(theUri));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>security</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure
     * </p> 
	 */
	public java.util.List<CodingDt> getSecurity() {  
		if (mySecurity == null) {
			mySecurity = new java.util.ArrayList<CodingDt>();
		}
		return mySecurity;
	}

	/**
	 * Sets the value(s) for <b>security</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure
     * </p> 
	 */
	public MetaDt setSecurity(java.util.List<CodingDt> theValue) {
		mySecurity = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>security</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure
     * </p> 
	 */
	public CodingDt addSecurity() {
		CodingDt newType = new CodingDt();
		getSecurity().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>security</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure
	 * </p>
	 * @param theValue The security to add (must not be <code>null</code>)
	 */
	public MetaDt addSecurity(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSecurity().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>security</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure
     * </p> 
	 */
	public CodingDt getSecurityFirstRep() {
		if (getSecurity().isEmpty()) {
			return addSecurity();
		}
		return getSecurity().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>tag</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource
     * </p> 
	 */
	public java.util.List<CodingDt> getTag() {  
		if (myTag == null) {
			myTag = new java.util.ArrayList<CodingDt>();
		}
		return myTag;
	}

	/**
	 * Sets the value(s) for <b>tag</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource
     * </p> 
	 */
	public MetaDt setTag(java.util.List<CodingDt> theValue) {
		myTag = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>tag</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource
     * </p> 
	 */
	public CodingDt addTag() {
		CodingDt newType = new CodingDt();
		getTag().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>tag</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource
	 * </p>
	 * @param theValue The tag to add (must not be <code>null</code>)
	 */
	public MetaDt addTag(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTag().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>tag</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource
     * </p> 
	 */
	public CodingDt getTagFirstRep() {
		if (getTag().isEmpty()) {
			return addTag();
		}
		return getTag().get(0); 
	}
  


}