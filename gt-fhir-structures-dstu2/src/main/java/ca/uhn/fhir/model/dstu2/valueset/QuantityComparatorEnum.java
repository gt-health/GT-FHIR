
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum QuantityComparatorEnum {

	/**
	 * Display: <b>Less than</b><br>
	 * Code Value: <b>&lt;</b>
	 *
	 * The actual value is less than the given value.
	 */
	LESS_THAN("<", "http://hl7.org/fhir/quantity-comparator"),
	
	/**
	 * Display: <b>Less or Equal to</b><br>
	 * Code Value: <b>&lt;=</b>
	 *
	 * The actual value is less than or equal to the given value.
	 */
	LESS_OR_EQUAL_TO("<=", "http://hl7.org/fhir/quantity-comparator"),
	
	/**
	 * Display: <b>Greater or Equal to</b><br>
	 * Code Value: <b>&gt;=</b>
	 *
	 * The actual value is greater than or equal to the given value.
	 */
	GREATER_OR_EQUAL_TO(">=", "http://hl7.org/fhir/quantity-comparator"),
	
	/**
	 * Display: <b>Greater than</b><br>
	 * Code Value: <b>&gt;</b>
	 *
	 * The actual value is greater than the given value.
	 */
	GREATER_THAN(">", "http://hl7.org/fhir/quantity-comparator"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * QuantityComparator
	 */
	public static final String VALUESET_NAME = "QuantityComparator";

	private static Map<String, QuantityComparatorEnum> CODE_TO_ENUM = new HashMap<String, QuantityComparatorEnum>();
	private static Map<String, Map<String, QuantityComparatorEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, QuantityComparatorEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (QuantityComparatorEnum next : QuantityComparatorEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, QuantityComparatorEnum>());
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
	public static QuantityComparatorEnum forCode(String theCode) {
		QuantityComparatorEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<QuantityComparatorEnum> VALUESET_BINDER = new IValueSetEnumBinder<QuantityComparatorEnum>() {
		@Override
		public String toCodeString(QuantityComparatorEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(QuantityComparatorEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public QuantityComparatorEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public QuantityComparatorEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, QuantityComparatorEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	QuantityComparatorEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
