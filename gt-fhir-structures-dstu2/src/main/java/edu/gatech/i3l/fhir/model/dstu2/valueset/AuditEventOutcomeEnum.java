
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AuditEventOutcomeEnum;

import java.util.HashMap;
import java.util.Map;

public enum AuditEventOutcomeEnum {

	/**
	 * Display: <b>Success</b><br>
	 * Code Value: <b>0</b>
	 *
	 * The operation completed successfully (whether with warnings or not).
	 */
	SUCCESS("0", "http://hl7.org/fhir/audit-event-outcome"),
	
	/**
	 * Display: <b>Minor failure</b><br>
	 * Code Value: <b>4</b>
	 *
	 * The action was not successful due to some kind of catered for error (often equivalent to an HTTP 400 response).
	 */
	MINOR_FAILURE("4", "http://hl7.org/fhir/audit-event-outcome"),
	
	/**
	 * Display: <b>Serious failure</b><br>
	 * Code Value: <b>8</b>
	 *
	 * The action was not successful due to some kind of unexpected error (often equivalent to an HTTP 500 response).
	 */
	SERIOUS_FAILURE("8", "http://hl7.org/fhir/audit-event-outcome"),
	
	/**
	 * Display: <b>Major failure</b><br>
	 * Code Value: <b>12</b>
	 *
	 * An error of such magnitude occurred that the system is no longer available for use (i.e. the system died).
	 */
	MAJOR_FAILURE("12", "http://hl7.org/fhir/audit-event-outcome"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AuditEventOutcome
	 */
	public static final String VALUESET_NAME = "AuditEventOutcome";

	private static Map<String, AuditEventOutcomeEnum> CODE_TO_ENUM = new HashMap<String, AuditEventOutcomeEnum>();
	private static Map<String, Map<String, AuditEventOutcomeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AuditEventOutcomeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AuditEventOutcomeEnum next : AuditEventOutcomeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AuditEventOutcomeEnum>());
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
	public static AuditEventOutcomeEnum forCode(String theCode) {
		AuditEventOutcomeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AuditEventOutcomeEnum> VALUESET_BINDER = new IValueSetEnumBinder<AuditEventOutcomeEnum>() {
		@Override
		public String toCodeString(AuditEventOutcomeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AuditEventOutcomeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AuditEventOutcomeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AuditEventOutcomeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AuditEventOutcomeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AuditEventOutcomeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
