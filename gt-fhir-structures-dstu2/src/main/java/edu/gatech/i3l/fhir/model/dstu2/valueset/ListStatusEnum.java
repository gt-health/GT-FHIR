
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ListStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum ListStatusEnum {

	/**
	 * Display: <b>Current</b><br>
	 * Code Value: <b>current</b>
	 *
	 * The list is considered to be an active part of the patient's record.
	 */
	CURRENT("current", "http://hl7.org/fhir/list-status"),
	
	/**
	 * Display: <b>Retired</b><br>
	 * Code Value: <b>retired</b>
	 *
	 * The list is "old" and should no longer be considered accurate or relevant.
	 */
	RETIRED("retired", "http://hl7.org/fhir/list-status"),
	
	/**
	 * Display: <b>Entered In Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The list was never accurate.  It is retained for medico-legal purposes only.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/list-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ListStatus
	 */
	public static final String VALUESET_NAME = "ListStatus";

	private static Map<String, ListStatusEnum> CODE_TO_ENUM = new HashMap<String, ListStatusEnum>();
	private static Map<String, Map<String, ListStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ListStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ListStatusEnum next : ListStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ListStatusEnum>());
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
	public static ListStatusEnum forCode(String theCode) {
		ListStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ListStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<ListStatusEnum>() {
		@Override
		public String toCodeString(ListStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ListStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ListStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ListStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ListStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ListStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
