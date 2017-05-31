
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AllergyIntoleranceTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum AllergyIntoleranceTypeEnum {

	/**
	 * Display: <b>Allergy</b><br>
	 * Code Value: <b>allergy</b>
	 *
	 * A propensity for hypersensitivity reaction(s) to a substance.  These reactions are most typically type I hypersensitivity, plus other "allergy-like" reactions, including pseudoallergy.
	 */
	ALLERGY("allergy", "http://hl7.org/fhir/allergy-intolerance-type"),
	
	/**
	 * Display: <b>Intolerance</b><br>
	 * Code Value: <b>intolerance</b>
	 *
	 * A propensity for adverse reactions to a substance that is not judged to be allergic or "allergy-like".  These reactions are typically (but not necessarily) non-immune.  They are to some degree idiosyncratic and/or individually specific (i.e. are not a reaction that is expected to occur with most or all patients given similar circumstances).
	 */
	INTOLERANCE("intolerance", "http://hl7.org/fhir/allergy-intolerance-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AllergyIntoleranceType
	 */
	public static final String VALUESET_NAME = "AllergyIntoleranceType";

	private static Map<String, AllergyIntoleranceTypeEnum> CODE_TO_ENUM = new HashMap<String, AllergyIntoleranceTypeEnum>();
	private static Map<String, Map<String, AllergyIntoleranceTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AllergyIntoleranceTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AllergyIntoleranceTypeEnum next : AllergyIntoleranceTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AllergyIntoleranceTypeEnum>());
			}
			SYSTEM_TO_CODE_TO_ENUM.get(next.getSystem()).put(next.getCode(), next);			
		}
	}
	
	/**
	 * Returns the code associated with this enumerated value
	 */
	public String getCode() {
		return myCode;
	}
	
	/**
	 * Returns the code system associated with this enumerated value
	 */
	public String getSystem() {
		return mySystem;
	}
	
	/**
	 * Returns the enumerated value associated with this code
	 */
	public static AllergyIntoleranceTypeEnum forCode(String theCode) {
		AllergyIntoleranceTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AllergyIntoleranceTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<AllergyIntoleranceTypeEnum>() {
		@Override
		public String toCodeString(AllergyIntoleranceTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AllergyIntoleranceTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AllergyIntoleranceTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AllergyIntoleranceTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AllergyIntoleranceTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AllergyIntoleranceTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
