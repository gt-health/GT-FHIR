
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ActionListEnum {

	/**
	 * Display: <b>Cancel, Reverse or Nullify</b><br>
	 * Code Value: <b>cancel</b>
	 *
	 * Cancel, reverse or nullify the target resource.
	 */
	CANCEL__REVERSE_OR_NULLIFY("cancel", "http://hl7.org/fhir/actionlist"),
	
	/**
	 * Display: <b>Poll</b><br>
	 * Code Value: <b>poll</b>
	 *
	 * Check for previously un-read/ not-retrieved resources.
	 */
	POLL("poll", "http://hl7.org/fhir/actionlist"),
	
	/**
	 * Display: <b>Re-Process</b><br>
	 * Code Value: <b>reprocess</b>
	 *
	 * Re-process the target resource.
	 */
	RE_PROCESS("reprocess", "http://hl7.org/fhir/actionlist"),
	
	/**
	 * Display: <b>Status Check</b><br>
	 * Code Value: <b>status</b>
	 *
	 * Retrieve the processing status of the target resource.
	 */
	STATUS_CHECK("status", "http://hl7.org/fhir/actionlist"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ActionList
	 */
	public static final String VALUESET_NAME = "ActionList";

	private static Map<String, ActionListEnum> CODE_TO_ENUM = new HashMap<String, ActionListEnum>();
	private static Map<String, Map<String, ActionListEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ActionListEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ActionListEnum next : ActionListEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ActionListEnum>());
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
	public static ActionListEnum forCode(String theCode) {
		ActionListEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ActionListEnum> VALUESET_BINDER = new IValueSetEnumBinder<ActionListEnum>() {
		@Override
		public String toCodeString(ActionListEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ActionListEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ActionListEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ActionListEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ActionListEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ActionListEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
