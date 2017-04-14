
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum SearchModifierCodeEnum {

	/**
	 * Display: <b>Missing</b><br>
	 * Code Value: <b>missing</b>
	 *
	 * The search parameter returns resources that have a value or not.
	 */
	MISSING("missing", "http://hl7.org/fhir/search-modifier-code"),
	
	/**
	 * Display: <b>Exact</b><br>
	 * Code Value: <b>exact</b>
	 *
	 * The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents).
	 */
	EXACT("exact", "http://hl7.org/fhir/search-modifier-code"),
	
	/**
	 * Display: <b>Contains</b><br>
	 * Code Value: <b>contains</b>
	 *
	 * The search parameter returns resources that include the supplied parameter value anywhere within the field being searched.
	 */
	CONTAINS("contains", "http://hl7.org/fhir/search-modifier-code"),
	
	/**
	 * Display: <b>Not</b><br>
	 * Code Value: <b>not</b>
	 *
	 * The search parameter returns resources that do not contain a match .
	 */
	NOT("not", "http://hl7.org/fhir/search-modifier-code"),
	
	/**
	 * Display: <b>Text</b><br>
	 * Code Value: <b>text</b>
	 *
	 * The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, or Identifier.type.text.
	 */
	TEXT("text", "http://hl7.org/fhir/search-modifier-code"),
	
	/**
	 * Display: <b>In</b><br>
	 * Code Value: <b>in</b>
	 *
	 * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.
	 */
	IN("in", "http://hl7.org/fhir/search-modifier-code"),
	
	/**
	 * Display: <b>Not In</b><br>
	 * Code Value: <b>not-in</b>
	 *
	 * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set.
	 */
	NOT_IN("not-in", "http://hl7.org/fhir/search-modifier-code"),
	
	/**
	 * Display: <b>Below</b><br>
	 * Code Value: <b>below</b>
	 *
	 * The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or hierarchical relationships).
	 */
	BELOW("below", "http://hl7.org/fhir/search-modifier-code"),
	
	/**
	 * Display: <b>Above</b><br>
	 * Code Value: <b>above</b>
	 *
	 * The search parameter tests whether the value in a resource subsumes the specified value (is-a, or hierarchical relationships).
	 */
	ABOVE("above", "http://hl7.org/fhir/search-modifier-code"),
	
	/**
	 * Display: <b>Type</b><br>
	 * Code Value: <b>type</b>
	 *
	 * The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc.).
	 */
	TYPE("type", "http://hl7.org/fhir/search-modifier-code"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * SearchModifierCode
	 */
	public static final String VALUESET_NAME = "SearchModifierCode";

	private static Map<String, SearchModifierCodeEnum> CODE_TO_ENUM = new HashMap<String, SearchModifierCodeEnum>();
	private static Map<String, Map<String, SearchModifierCodeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, SearchModifierCodeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (SearchModifierCodeEnum next : SearchModifierCodeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, SearchModifierCodeEnum>());
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
	public static SearchModifierCodeEnum forCode(String theCode) {
		SearchModifierCodeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<SearchModifierCodeEnum> VALUESET_BINDER = new IValueSetEnumBinder<SearchModifierCodeEnum>() {
		@Override
		public String toCodeString(SearchModifierCodeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(SearchModifierCodeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public SearchModifierCodeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public SearchModifierCodeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, SearchModifierCodeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	SearchModifierCodeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
