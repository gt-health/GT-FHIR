
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ClaimTypeEnum {

	/**
	 * Display: <b>Institutional</b><br>
	 * Code Value: <b>institutional</b>
	 *
	 * A claim for Institution based, typically in-patient, goods and services.
	 */
	INSTITUTIONAL("institutional", "http://hl7.org/fhir/claim-type-link"),
	
	/**
	 * Display: <b>Oral Health</b><br>
	 * Code Value: <b>oral</b>
	 *
	 * A claim for Oral Health (Dentist, Denturist, Hygienist) goods and services.
	 */
	ORAL_HEALTH("oral", "http://hl7.org/fhir/claim-type-link"),
	
	/**
	 * Display: <b>Pharmacy</b><br>
	 * Code Value: <b>pharmacy</b>
	 *
	 * A claim for Pharmacy based goods and services.
	 */
	PHARMACY("pharmacy", "http://hl7.org/fhir/claim-type-link"),
	
	/**
	 * Display: <b>Professional</b><br>
	 * Code Value: <b>professional</b>
	 *
	 * A claim for Professional, typically out-patient, goods and services.
	 */
	PROFESSIONAL("professional", "http://hl7.org/fhir/claim-type-link"),
	
	/**
	 * Display: <b>Vision</b><br>
	 * Code Value: <b>vision</b>
	 *
	 * A claim for Vision (Ophthamologist, Optometrist and Optician) goods and services.
	 */
	VISION("vision", "http://hl7.org/fhir/claim-type-link"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ClaimType
	 */
	public static final String VALUESET_NAME = "ClaimType";

	private static Map<String, ClaimTypeEnum> CODE_TO_ENUM = new HashMap<String, ClaimTypeEnum>();
	private static Map<String, Map<String, ClaimTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ClaimTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ClaimTypeEnum next : ClaimTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ClaimTypeEnum>());
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
	public static ClaimTypeEnum forCode(String theCode) {
		ClaimTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ClaimTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<ClaimTypeEnum>() {
		@Override
		public String toCodeString(ClaimTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ClaimTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ClaimTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ClaimTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ClaimTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ClaimTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
