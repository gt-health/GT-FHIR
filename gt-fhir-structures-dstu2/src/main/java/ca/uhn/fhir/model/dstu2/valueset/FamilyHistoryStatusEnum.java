
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum FamilyHistoryStatusEnum {

	/**
	 * Display: <b>Partial</b><br>
	 * Code Value: <b>partial</b>
	 *
	 * Some health information is known and captured, but not complete - see notes for details.
	 */
	PARTIAL("partial", "http://hl7.org/fhir/history-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * All relevant health information is known and captured.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/history-status"),
	
	/**
	 * Display: <b>Entered in error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * This instance should not have been part of this patient's medical record.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/history-status"),
	
	/**
	 * Display: <b>Health unknown</b><br>
	 * Code Value: <b>health-unknown</b>
	 *
	 * Health information for this individual is unavailable/unknown.
	 */
	HEALTH_UNKNOWN("health-unknown", "http://hl7.org/fhir/history-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * FamilyHistoryStatus
	 */
	public static final String VALUESET_NAME = "FamilyHistoryStatus";

	private static Map<String, FamilyHistoryStatusEnum> CODE_TO_ENUM = new HashMap<String, FamilyHistoryStatusEnum>();
	private static Map<String, Map<String, FamilyHistoryStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, FamilyHistoryStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (FamilyHistoryStatusEnum next : FamilyHistoryStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, FamilyHistoryStatusEnum>());
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
	public static FamilyHistoryStatusEnum forCode(String theCode) {
		FamilyHistoryStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<FamilyHistoryStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<FamilyHistoryStatusEnum>() {
		@Override
		public String toCodeString(FamilyHistoryStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(FamilyHistoryStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public FamilyHistoryStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public FamilyHistoryStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, FamilyHistoryStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	FamilyHistoryStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
