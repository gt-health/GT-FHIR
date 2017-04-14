
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum UnknownContentCodeEnum {

	/**
	 * Display: <b>Neither Elements or Extensions</b><br>
	 * Code Value: <b>no</b>
	 *
	 * The application does not accept either unknown elements or extensions.
	 */
	NEITHER_ELEMENTS_OR_EXTENSIONS("no", "http://hl7.org/fhir/unknown-content-code"),
	
	/**
	 * Display: <b>Unknown Extensions</b><br>
	 * Code Value: <b>extensions</b>
	 *
	 * The application accepts unknown extensions, but not unknown elements.
	 */
	UNKNOWN_EXTENSIONS("extensions", "http://hl7.org/fhir/unknown-content-code"),
	
	/**
	 * Display: <b>Unknown Elements</b><br>
	 * Code Value: <b>elements</b>
	 *
	 * The application accepts unknown elements, but not unknown extensions.
	 */
	UNKNOWN_ELEMENTS("elements", "http://hl7.org/fhir/unknown-content-code"),
	
	/**
	 * Display: <b>Unknown Elements and Extensions</b><br>
	 * Code Value: <b>both</b>
	 *
	 * The application accepts unknown elements and extensions.
	 */
	UNKNOWN_ELEMENTS_AND_EXTENSIONS("both", "http://hl7.org/fhir/unknown-content-code"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * UnknownContentCode
	 */
	public static final String VALUESET_NAME = "UnknownContentCode";

	private static Map<String, UnknownContentCodeEnum> CODE_TO_ENUM = new HashMap<String, UnknownContentCodeEnum>();
	private static Map<String, Map<String, UnknownContentCodeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, UnknownContentCodeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (UnknownContentCodeEnum next : UnknownContentCodeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, UnknownContentCodeEnum>());
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
	public static UnknownContentCodeEnum forCode(String theCode) {
		UnknownContentCodeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<UnknownContentCodeEnum> VALUESET_BINDER = new IValueSetEnumBinder<UnknownContentCodeEnum>() {
		@Override
		public String toCodeString(UnknownContentCodeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(UnknownContentCodeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public UnknownContentCodeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public UnknownContentCodeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, UnknownContentCodeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	UnknownContentCodeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
