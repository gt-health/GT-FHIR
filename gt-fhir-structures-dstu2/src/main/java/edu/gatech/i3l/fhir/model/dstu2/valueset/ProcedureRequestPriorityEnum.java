
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ProcedureRequestPriorityEnum;

import java.util.HashMap;
import java.util.Map;

public enum ProcedureRequestPriorityEnum {

	/**
	 * Display: <b>Routine</b><br>
	 * Code Value: <b>routine</b>
	 *
	 * The request has a normal priority.
	 */
	ROUTINE("routine", "http://hl7.org/fhir/procedure-request-priority"),
	
	/**
	 * Display: <b>Urgent</b><br>
	 * Code Value: <b>urgent</b>
	 *
	 * The request should be done urgently.
	 */
	URGENT("urgent", "http://hl7.org/fhir/procedure-request-priority"),
	
	/**
	 * Display: <b>Stat</b><br>
	 * Code Value: <b>stat</b>
	 *
	 * The request is time-critical.
	 */
	STAT("stat", "http://hl7.org/fhir/procedure-request-priority"),
	
	/**
	 * Display: <b>ASAP</b><br>
	 * Code Value: <b>asap</b>
	 *
	 * The request should be acted on as soon as possible.
	 */
	ASAP("asap", "http://hl7.org/fhir/procedure-request-priority"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ProcedureRequestPriority
	 */
	public static final String VALUESET_NAME = "ProcedureRequestPriority";

	private static Map<String, ProcedureRequestPriorityEnum> CODE_TO_ENUM = new HashMap<String, ProcedureRequestPriorityEnum>();
	private static Map<String, Map<String, ProcedureRequestPriorityEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ProcedureRequestPriorityEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ProcedureRequestPriorityEnum next : ProcedureRequestPriorityEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ProcedureRequestPriorityEnum>());
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
	public static ProcedureRequestPriorityEnum forCode(String theCode) {
		ProcedureRequestPriorityEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ProcedureRequestPriorityEnum> VALUESET_BINDER = new IValueSetEnumBinder<ProcedureRequestPriorityEnum>() {
		@Override
		public String toCodeString(ProcedureRequestPriorityEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ProcedureRequestPriorityEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ProcedureRequestPriorityEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ProcedureRequestPriorityEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ProcedureRequestPriorityEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ProcedureRequestPriorityEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
