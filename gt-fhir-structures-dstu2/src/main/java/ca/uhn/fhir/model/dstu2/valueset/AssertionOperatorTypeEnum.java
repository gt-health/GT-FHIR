
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum AssertionOperatorTypeEnum {

	/**
	 * Display: <b>equals</b><br>
	 * Code Value: <b>equals</b>
	 *
	 * Default value. Equals comparison.
	 */
	EQUALS("equals", "http://hl7.org/fhir/assert-operator-codes"),
	
	/**
	 * Display: <b>notEquals</b><br>
	 * Code Value: <b>notEquals</b>
	 *
	 * Not equals comparison.
	 */
	NOTEQUALS("notEquals", "http://hl7.org/fhir/assert-operator-codes"),
	
	/**
	 * Display: <b>in</b><br>
	 * Code Value: <b>in</b>
	 *
	 * Compare value within a known set of values.
	 */
	IN("in", "http://hl7.org/fhir/assert-operator-codes"),
	
	/**
	 * Display: <b>notIn</b><br>
	 * Code Value: <b>notIn</b>
	 *
	 * Compare value not within a known set of values.
	 */
	NOTIN("notIn", "http://hl7.org/fhir/assert-operator-codes"),
	
	/**
	 * Display: <b>greaterThan</b><br>
	 * Code Value: <b>greaterThan</b>
	 *
	 * Compare value to be greater than a known value.
	 */
	GREATERTHAN("greaterThan", "http://hl7.org/fhir/assert-operator-codes"),
	
	/**
	 * Display: <b>lessThan</b><br>
	 * Code Value: <b>lessThan</b>
	 *
	 * Compare value to be less than a known value.
	 */
	LESSTHAN("lessThan", "http://hl7.org/fhir/assert-operator-codes"),
	
	/**
	 * Display: <b>empty</b><br>
	 * Code Value: <b>empty</b>
	 *
	 * Compare value is empty.
	 */
	EMPTY("empty", "http://hl7.org/fhir/assert-operator-codes"),
	
	/**
	 * Display: <b>notEmpty</b><br>
	 * Code Value: <b>notEmpty</b>
	 *
	 * Compare value is not empty.
	 */
	NOTEMPTY("notEmpty", "http://hl7.org/fhir/assert-operator-codes"),
	
	/**
	 * Display: <b>contains</b><br>
	 * Code Value: <b>contains</b>
	 *
	 * Compare value string contains a known value.
	 */
	CONTAINS("contains", "http://hl7.org/fhir/assert-operator-codes"),
	
	/**
	 * Display: <b>notContains</b><br>
	 * Code Value: <b>notContains</b>
	 *
	 * Compare value string does not contain a known value.
	 */
	NOTCONTAINS("notContains", "http://hl7.org/fhir/assert-operator-codes"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AssertionOperatorType
	 */
	public static final String VALUESET_NAME = "AssertionOperatorType";

	private static Map<String, AssertionOperatorTypeEnum> CODE_TO_ENUM = new HashMap<String, AssertionOperatorTypeEnum>();
	private static Map<String, Map<String, AssertionOperatorTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AssertionOperatorTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AssertionOperatorTypeEnum next : AssertionOperatorTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AssertionOperatorTypeEnum>());
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
	public static AssertionOperatorTypeEnum forCode(String theCode) {
		AssertionOperatorTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AssertionOperatorTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<AssertionOperatorTypeEnum>() {
		@Override
		public String toCodeString(AssertionOperatorTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AssertionOperatorTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AssertionOperatorTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AssertionOperatorTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AssertionOperatorTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AssertionOperatorTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
