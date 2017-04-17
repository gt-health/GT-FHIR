
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum MedicationDispenseStatusEnum {

	/**
	 * Display: <b>In Progress</b><br>
	 * Code Value: <b>in-progress</b>
	 *
	 * The dispense has started but has not yet completed.
	 */
	IN_PROGRESS("in-progress", "http://hl7.org/fhir/medication-dispense-status"),
	
	/**
	 * Display: <b>On Hold</b><br>
	 * Code Value: <b>on-hold</b>
	 *
	 * Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called "suspended"
	 */
	ON_HOLD("on-hold", "http://hl7.org/fhir/medication-dispense-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * All actions that are implied by the dispense have occurred.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/medication-dispense-status"),
	
	/**
	 * Display: <b>Entered in-Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The dispense was entered in error and therefore nullified.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/medication-dispense-status"),
	
	/**
	 * Display: <b>Stopped</b><br>
	 * Code Value: <b>stopped</b>
	 *
	 * Actions implied by the dispense have been permanently halted, before all of them occurred.
	 */
	STOPPED("stopped", "http://hl7.org/fhir/medication-dispense-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * MedicationDispenseStatus
	 */
	public static final String VALUESET_NAME = "MedicationDispenseStatus";

	private static Map<String, MedicationDispenseStatusEnum> CODE_TO_ENUM = new HashMap<String, MedicationDispenseStatusEnum>();
	private static Map<String, Map<String, MedicationDispenseStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, MedicationDispenseStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (MedicationDispenseStatusEnum next : MedicationDispenseStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, MedicationDispenseStatusEnum>());
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
	public static MedicationDispenseStatusEnum forCode(String theCode) {
		MedicationDispenseStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<MedicationDispenseStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<MedicationDispenseStatusEnum>() {
		@Override
		public String toCodeString(MedicationDispenseStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(MedicationDispenseStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public MedicationDispenseStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public MedicationDispenseStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, MedicationDispenseStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	MedicationDispenseStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
