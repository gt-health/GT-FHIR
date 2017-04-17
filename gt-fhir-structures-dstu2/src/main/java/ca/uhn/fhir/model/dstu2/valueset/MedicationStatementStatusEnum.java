
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum MedicationStatementStatusEnum {

	/**
	 * Display: <b>Active</b><br>
	 * Code Value: <b>active</b>
	 *
	 * The medication is still being taken.
	 */
	ACTIVE("active", "http://hl7.org/fhir/medication-statement-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * The medication is no longer being taken.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/medication-statement-status"),
	
	/**
	 * Display: <b>Entered in Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The statement was entered in error.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/medication-statement-status"),
	
	/**
	 * Display: <b>Intended</b><br>
	 * Code Value: <b>intended</b>
	 *
	 * The medication may be taken at some time in the future.
	 */
	INTENDED("intended", "http://hl7.org/fhir/medication-statement-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * MedicationStatementStatus
	 */
	public static final String VALUESET_NAME = "MedicationStatementStatus";

	private static Map<String, MedicationStatementStatusEnum> CODE_TO_ENUM = new HashMap<String, MedicationStatementStatusEnum>();
	private static Map<String, Map<String, MedicationStatementStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, MedicationStatementStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (MedicationStatementStatusEnum next : MedicationStatementStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, MedicationStatementStatusEnum>());
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
	public static MedicationStatementStatusEnum forCode(String theCode) {
		MedicationStatementStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<MedicationStatementStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<MedicationStatementStatusEnum>() {
		@Override
		public String toCodeString(MedicationStatementStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(MedicationStatementStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public MedicationStatementStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public MedicationStatementStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, MedicationStatementStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	MedicationStatementStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
