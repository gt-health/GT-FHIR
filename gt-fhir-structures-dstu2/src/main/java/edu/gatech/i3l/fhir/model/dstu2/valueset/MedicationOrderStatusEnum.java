
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.MedicationOrderStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum MedicationOrderStatusEnum {

	/**
	 * Display: <b>Active</b><br>
	 * Code Value: <b>active</b>
	 *
	 * The prescription is 'actionable', but not all actions that are implied by it have occurred yet.
	 */
	ACTIVE("active", "http://hl7.org/fhir/medication-order-status"),
	
	/**
	 * Display: <b>On Hold</b><br>
	 * Code Value: <b>on-hold</b>
	 *
	 * Actions implied by the prescription are to be temporarily halted, but are expected to continue later.  May also be called "suspended".
	 */
	ON_HOLD("on-hold", "http://hl7.org/fhir/medication-order-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * All actions that are implied by the prescription have occurred.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/medication-order-status"),
	
	/**
	 * Display: <b>Entered In Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The prescription was entered in error.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/medication-order-status"),
	
	/**
	 * Display: <b>Stopped</b><br>
	 * Code Value: <b>stopped</b>
	 *
	 * Actions implied by the prescription are to be permanently halted, before all of them occurred.
	 */
	STOPPED("stopped", "http://hl7.org/fhir/medication-order-status"),
	
	/**
	 * Display: <b>Draft</b><br>
	 * Code Value: <b>draft</b>
	 *
	 * The prescription is not yet 'actionable', i.e. it is a work in progress, requires sign-off or verification, and needs to be run through decision support process.
	 */
	DRAFT("draft", "http://hl7.org/fhir/medication-order-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * MedicationOrderStatus
	 */
	public static final String VALUESET_NAME = "MedicationOrderStatus";

	private static Map<String, MedicationOrderStatusEnum> CODE_TO_ENUM = new HashMap<String, MedicationOrderStatusEnum>();
	private static Map<String, Map<String, MedicationOrderStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, MedicationOrderStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (MedicationOrderStatusEnum next : MedicationOrderStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, MedicationOrderStatusEnum>());
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
	public static MedicationOrderStatusEnum forCode(String theCode) {
		MedicationOrderStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<MedicationOrderStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<MedicationOrderStatusEnum>() {
		@Override
		public String toCodeString(MedicationOrderStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(MedicationOrderStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public MedicationOrderStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public MedicationOrderStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, MedicationOrderStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	MedicationOrderStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
