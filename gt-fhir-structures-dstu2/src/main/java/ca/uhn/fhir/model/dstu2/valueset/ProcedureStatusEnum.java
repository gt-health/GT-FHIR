
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ProcedureStatusEnum {

	/**
	 * Display: <b>In Progress</b><br>
	 * Code Value: <b>in-progress</b>
	 *
	 * The procedure is still occurring.
	 */
	IN_PROGRESS("in-progress", "http://hl7.org/fhir/procedure-status"),
	
	/**
	 * Display: <b>Aboted</b><br>
	 * Code Value: <b>aborted</b>
	 *
	 * The procedure was terminated without completing successfully.
	 */
	ABOTED("aborted", "http://hl7.org/fhir/procedure-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * All actions involved in the procedure have taken place.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/procedure-status"),
	
	/**
	 * Display: <b>Entered in Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The statement was entered in error and Is not valid.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/procedure-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ProcedureStatus
	 */
	public static final String VALUESET_NAME = "ProcedureStatus";

	private static Map<String, ProcedureStatusEnum> CODE_TO_ENUM = new HashMap<String, ProcedureStatusEnum>();
	private static Map<String, Map<String, ProcedureStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ProcedureStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ProcedureStatusEnum next : ProcedureStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ProcedureStatusEnum>());
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
	public static ProcedureStatusEnum forCode(String theCode) {
		ProcedureStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ProcedureStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<ProcedureStatusEnum>() {
		@Override
		public String toCodeString(ProcedureStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ProcedureStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ProcedureStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ProcedureStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ProcedureStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ProcedureStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
