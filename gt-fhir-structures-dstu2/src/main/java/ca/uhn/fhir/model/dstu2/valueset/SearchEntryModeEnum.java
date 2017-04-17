
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum SearchEntryModeEnum {

	/**
	 * Display: <b>Match</b><br>
	 * Code Value: <b>match</b>
	 *
	 * This resource matched the search specification.
	 */
	MATCH("match", "http://hl7.org/fhir/search-entry-mode"),
	
	/**
	 * Display: <b>Include</b><br>
	 * Code Value: <b>include</b>
	 *
	 * This resource is returned because it is referred to from another resource in the search set.
	 */
	INCLUDE("include", "http://hl7.org/fhir/search-entry-mode"),
	
	/**
	 * Display: <b>Outcome</b><br>
	 * Code Value: <b>outcome</b>
	 *
	 * An OperationOutcome that provides additional information about the processing of a search.
	 */
	OUTCOME("outcome", "http://hl7.org/fhir/search-entry-mode"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * SearchEntryMode
	 */
	public static final String VALUESET_NAME = "SearchEntryMode";

	private static Map<String, SearchEntryModeEnum> CODE_TO_ENUM = new HashMap<String, SearchEntryModeEnum>();
	private static Map<String, Map<String, SearchEntryModeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, SearchEntryModeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (SearchEntryModeEnum next : SearchEntryModeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, SearchEntryModeEnum>());
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
	public static SearchEntryModeEnum forCode(String theCode) {
		SearchEntryModeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<SearchEntryModeEnum> VALUESET_BINDER = new IValueSetEnumBinder<SearchEntryModeEnum>() {
		@Override
		public String toCodeString(SearchEntryModeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(SearchEntryModeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public SearchEntryModeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public SearchEntryModeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, SearchEntryModeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	SearchEntryModeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
