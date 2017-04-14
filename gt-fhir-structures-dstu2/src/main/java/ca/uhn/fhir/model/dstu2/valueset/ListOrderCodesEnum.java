
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ListOrderCodesEnum {

	/**
	 * Display: <b>Sorted by User</b><br>
	 * Code Value: <b>user</b>
	 *
	 * The list was sorted by a user. The criteria the user used are not specified.
	 */
	SORTED_BY_USER("user", "http://hl7.org/fhir/list-order"),
	
	/**
	 * Display: <b>Sorted by System</b><br>
	 * Code Value: <b>system</b>
	 *
	 * The list was sorted by the system. The criteria the user used are not specified; define additional codes to specify a particular order (or use other defined codes).
	 */
	SORTED_BY_SYSTEM("system", "http://hl7.org/fhir/list-order"),
	
	/**
	 * Display: <b>Sorted by Event Date</b><br>
	 * Code Value: <b>event-date</b>
	 *
	 * The list is sorted by the data of the event. This can be used when the list has items which are dates with past or future events.
	 */
	SORTED_BY_EVENT_DATE("event-date", "http://hl7.org/fhir/list-order"),
	
	/**
	 * Display: <b>Sorted by Item Date</b><br>
	 * Code Value: <b>entry-date</b>
	 *
	 * The list is sorted by the date the item was added to the list. Note that the date added to the list is not explicit in the list itself.
	 */
	SORTED_BY_ITEM_DATE("entry-date", "http://hl7.org/fhir/list-order"),
	
	/**
	 * Display: <b>Sorted by Priority</b><br>
	 * Code Value: <b>priority</b>
	 *
	 * The list is sorted by priority. The exact method in which priority has been determined is not specified.
	 */
	SORTED_BY_PRIORITY("priority", "http://hl7.org/fhir/list-order"),
	
	/**
	 * Display: <b>Sorted Alphabetically</b><br>
	 * Code Value: <b>alphabetic</b>
	 *
	 * The list is sorted alphabetically by an unspecified property of the items in the list.
	 */
	SORTED_ALPHABETICALLY("alphabetic", "http://hl7.org/fhir/list-order"),
	
	/**
	 * Display: <b>Sorted by Category</b><br>
	 * Code Value: <b>category</b>
	 *
	 * The list is sorted categorically by an unspecified property of the items in the list.
	 */
	SORTED_BY_CATEGORY("category", "http://hl7.org/fhir/list-order"),
	
	/**
	 * Display: <b>Sorted by Patient</b><br>
	 * Code Value: <b>patient</b>
	 *
	 * The list is sorted by patient, with items for each patient grouped together.
	 */
	SORTED_BY_PATIENT("patient", "http://hl7.org/fhir/list-order"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * List Order Codes
	 */
	public static final String VALUESET_NAME = "List Order Codes";

	private static Map<String, ListOrderCodesEnum> CODE_TO_ENUM = new HashMap<String, ListOrderCodesEnum>();
	private static Map<String, Map<String, ListOrderCodesEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ListOrderCodesEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ListOrderCodesEnum next : ListOrderCodesEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ListOrderCodesEnum>());
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
	public static ListOrderCodesEnum forCode(String theCode) {
		ListOrderCodesEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ListOrderCodesEnum> VALUESET_BINDER = new IValueSetEnumBinder<ListOrderCodesEnum>() {
		@Override
		public String toCodeString(ListOrderCodesEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ListOrderCodesEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ListOrderCodesEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ListOrderCodesEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ListOrderCodesEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ListOrderCodesEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
