
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum FilterOperatorEnum {

	/**
	 * Display: <b>Equals</b><br>
	 * Code Value: <b>=</b>
	 *
	 * The specified property of the code equals the provided value.
	 */
	EQUALS("=", "http://hl7.org/fhir/filter-operator"),
	
	/**
	 * Display: <b>Is A (by subsumption)</b><br>
	 * Code Value: <b>is-a</b>
	 *
	 * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself.
	 */
	IS_A_BY_SUBSUMPTION("is-a", "http://hl7.org/fhir/filter-operator"),
	
	/**
	 * Display: <b>Not (Is A) (by subsumption)</b><br>
	 * Code Value: <b>is-not-a</b>
	 *
	 * The specified property of the code does not have an is-a relationship with the provided value.
	 */
	NOT_IS_A_BY_SUBSUMPTION("is-not-a", "http://hl7.org/fhir/filter-operator"),
	
	/**
	 * Display: <b>Regular Expression</b><br>
	 * Code Value: <b>regex</b>
	 *
	 * The specified property of the code  matches the regex specified in the provided value.
	 */
	REGULAR_EXPRESSION("regex", "http://hl7.org/fhir/filter-operator"),
	
	/**
	 * Display: <b>In Set</b><br>
	 * Code Value: <b>in</b>
	 *
	 * The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).
	 */
	IN_SET("in", "http://hl7.org/fhir/filter-operator"),
	
	/**
	 * Display: <b>Not in Set</b><br>
	 * Code Value: <b>not-in</b>
	 *
	 * The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).
	 */
	NOT_IN_SET("not-in", "http://hl7.org/fhir/filter-operator"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * FilterOperator
	 */
	public static final String VALUESET_NAME = "FilterOperator";

	private static Map<String, FilterOperatorEnum> CODE_TO_ENUM = new HashMap<String, FilterOperatorEnum>();
	private static Map<String, Map<String, FilterOperatorEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, FilterOperatorEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (FilterOperatorEnum next : FilterOperatorEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, FilterOperatorEnum>());
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
	public static FilterOperatorEnum forCode(String theCode) {
		FilterOperatorEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<FilterOperatorEnum> VALUESET_BINDER = new IValueSetEnumBinder<FilterOperatorEnum>() {
		@Override
		public String toCodeString(FilterOperatorEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(FilterOperatorEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public FilterOperatorEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public FilterOperatorEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, FilterOperatorEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	FilterOperatorEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
