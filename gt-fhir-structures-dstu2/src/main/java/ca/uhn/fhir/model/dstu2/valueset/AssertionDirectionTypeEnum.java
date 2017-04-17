
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum AssertionDirectionTypeEnum {

	/**
	 * Display: <b>response</b><br>
	 * Code Value: <b>response</b>
	 *
	 * The assertion is evaluated on the response. This is the default value.
	 */
	RESPONSE("response", "http://hl7.org/fhir/assert-direction-codes"),
	
	/**
	 * Display: <b>request</b><br>
	 * Code Value: <b>request</b>
	 *
	 * The assertion is evaluated on the request.
	 */
	REQUEST("request", "http://hl7.org/fhir/assert-direction-codes"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AssertionDirectionType
	 */
	public static final String VALUESET_NAME = "AssertionDirectionType";

	private static Map<String, AssertionDirectionTypeEnum> CODE_TO_ENUM = new HashMap<String, AssertionDirectionTypeEnum>();
	private static Map<String, Map<String, AssertionDirectionTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AssertionDirectionTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AssertionDirectionTypeEnum next : AssertionDirectionTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AssertionDirectionTypeEnum>());
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
	public static AssertionDirectionTypeEnum forCode(String theCode) {
		AssertionDirectionTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AssertionDirectionTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<AssertionDirectionTypeEnum>() {
		@Override
		public String toCodeString(AssertionDirectionTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AssertionDirectionTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AssertionDirectionTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AssertionDirectionTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AssertionDirectionTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AssertionDirectionTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
