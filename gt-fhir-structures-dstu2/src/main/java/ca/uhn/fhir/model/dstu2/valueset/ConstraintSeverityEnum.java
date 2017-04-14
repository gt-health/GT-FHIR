
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ConstraintSeverityEnum {

	/**
	 * Display: <b>Error</b><br>
	 * Code Value: <b>error</b>
	 *
	 * If the constraint is violated, the resource is not conformant.
	 */
	ERROR("error", "http://hl7.org/fhir/constraint-severity"),
	
	/**
	 * Display: <b>Warning</b><br>
	 * Code Value: <b>warning</b>
	 *
	 * If the constraint is violated, the resource is conformant, but it is not necessarily following best practice.
	 */
	WARNING("warning", "http://hl7.org/fhir/constraint-severity"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ConstraintSeverity
	 */
	public static final String VALUESET_NAME = "ConstraintSeverity";

	private static Map<String, ConstraintSeverityEnum> CODE_TO_ENUM = new HashMap<String, ConstraintSeverityEnum>();
	private static Map<String, Map<String, ConstraintSeverityEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ConstraintSeverityEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ConstraintSeverityEnum next : ConstraintSeverityEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ConstraintSeverityEnum>());
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
	public static ConstraintSeverityEnum forCode(String theCode) {
		ConstraintSeverityEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ConstraintSeverityEnum> VALUESET_BINDER = new IValueSetEnumBinder<ConstraintSeverityEnum>() {
		@Override
		public String toCodeString(ConstraintSeverityEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ConstraintSeverityEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ConstraintSeverityEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ConstraintSeverityEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ConstraintSeverityEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ConstraintSeverityEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
