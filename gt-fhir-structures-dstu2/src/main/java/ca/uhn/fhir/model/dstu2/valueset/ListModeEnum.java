
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ListModeEnum {

	/**
	 * Display: <b>Working List</b><br>
	 * Code Value: <b>working</b>
	 *
	 * This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes
	 */
	WORKING_LIST("working", "http://hl7.org/fhir/list-mode"),
	
	/**
	 * Display: <b>Snapshot List</b><br>
	 * Code Value: <b>snapshot</b>
	 *
	 * This list was prepared as a snapshot. It should not be assumed to be current
	 */
	SNAPSHOT_LIST("snapshot", "http://hl7.org/fhir/list-mode"),
	
	/**
	 * Display: <b>Change List</b><br>
	 * Code Value: <b>changes</b>
	 *
	 * A list that indicates where changes have been made or recommended
	 */
	CHANGE_LIST("changes", "http://hl7.org/fhir/list-mode"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ListMode
	 */
	public static final String VALUESET_NAME = "ListMode";

	private static Map<String, ListModeEnum> CODE_TO_ENUM = new HashMap<String, ListModeEnum>();
	private static Map<String, Map<String, ListModeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ListModeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ListModeEnum next : ListModeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ListModeEnum>());
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
	public static ListModeEnum forCode(String theCode) {
		ListModeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ListModeEnum> VALUESET_BINDER = new IValueSetEnumBinder<ListModeEnum>() {
		@Override
		public String toCodeString(ListModeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ListModeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ListModeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ListModeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ListModeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ListModeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
