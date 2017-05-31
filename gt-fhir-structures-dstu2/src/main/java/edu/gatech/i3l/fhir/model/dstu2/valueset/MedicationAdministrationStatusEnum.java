
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.MedicationAdministrationStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum MedicationAdministrationStatusEnum {

	/**
	 * Display: <b>In Progress</b><br>
	 * Code Value: <b>in-progress</b>
	 *
	 * The administration has started but has not yet completed.
	 */
	IN_PROGRESS("in-progress", "http://hl7.org/fhir/medication-admin-status"),
	
	/**
	 * Display: <b>On Hold</b><br>
	 * Code Value: <b>on-hold</b>
	 *
	 * Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called "suspended".
	 */
	ON_HOLD("on-hold", "http://hl7.org/fhir/medication-admin-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * All actions that are implied by the administration have occurred.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/medication-admin-status"),
	
	/**
	 * Display: <b>Entered in Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The administration was entered in error and therefore nullified.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/medication-admin-status"),
	
	/**
	 * Display: <b>Stopped</b><br>
	 * Code Value: <b>stopped</b>
	 *
	 * Actions implied by the administration have been permanently halted, before all of them occurred.
	 */
	STOPPED("stopped", "http://hl7.org/fhir/medication-admin-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * MedicationAdministrationStatus
	 */
	public static final String VALUESET_NAME = "MedicationAdministrationStatus";

	private static Map<String, MedicationAdministrationStatusEnum> CODE_TO_ENUM = new HashMap<String, MedicationAdministrationStatusEnum>();
	private static Map<String, Map<String, MedicationAdministrationStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, MedicationAdministrationStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (MedicationAdministrationStatusEnum next : MedicationAdministrationStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, MedicationAdministrationStatusEnum>());
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
	public static MedicationAdministrationStatusEnum forCode(String theCode) {
		MedicationAdministrationStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<MedicationAdministrationStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<MedicationAdministrationStatusEnum>() {
		@Override
		public String toCodeString(MedicationAdministrationStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(MedicationAdministrationStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public MedicationAdministrationStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public MedicationAdministrationStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, MedicationAdministrationStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	MedicationAdministrationStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
