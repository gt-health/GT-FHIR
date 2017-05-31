
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.SpecimenStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum SpecimenStatusEnum {

	/**
	 * Display: <b>Available</b><br>
	 * Code Value: <b>available</b>
	 *
	 * The physical specimen is present and in good condition.
	 */
	AVAILABLE("available", "http://hl7.org/fhir/specimen-status"),
	
	/**
	 * Display: <b>Unavailable</b><br>
	 * Code Value: <b>unavailable</b>
	 *
	 * There is no physical specimen because it is either lost, destroyed or consumed.
	 */
	UNAVAILABLE("unavailable", "http://hl7.org/fhir/specimen-status"),
	
	/**
	 * Display: <b>Unsatisfactory</b><br>
	 * Code Value: <b>unsatisfactory</b>
	 *
	 * The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.
	 */
	UNSATISFACTORY("unsatisfactory", "http://hl7.org/fhir/specimen-status"),
	
	/**
	 * Display: <b>Entered-in-error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The specimen was entered in error and therefore nullified.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/specimen-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * SpecimenStatus
	 */
	public static final String VALUESET_NAME = "SpecimenStatus";

	private static Map<String, SpecimenStatusEnum> CODE_TO_ENUM = new HashMap<String, SpecimenStatusEnum>();
	private static Map<String, Map<String, SpecimenStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, SpecimenStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (SpecimenStatusEnum next : SpecimenStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, SpecimenStatusEnum>());
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
	public static SpecimenStatusEnum forCode(String theCode) {
		SpecimenStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<SpecimenStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<SpecimenStatusEnum>() {
		@Override
		public String toCodeString(SpecimenStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(SpecimenStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public SpecimenStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public SpecimenStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, SpecimenStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	SpecimenStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
