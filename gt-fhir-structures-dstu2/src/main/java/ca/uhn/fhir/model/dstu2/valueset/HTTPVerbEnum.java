
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum HTTPVerbEnum {

	/**
	 * Display: <b>GET</b><br>
	 * Code Value: <b>GET</b>
	 *
	 * HTTP GET
	 */
	GET("GET", "http://hl7.org/fhir/http-verb"),
	
	/**
	 * Display: <b>POST</b><br>
	 * Code Value: <b>POST</b>
	 *
	 * HTTP POST
	 */
	POST("POST", "http://hl7.org/fhir/http-verb"),
	
	/**
	 * Display: <b>PUT</b><br>
	 * Code Value: <b>PUT</b>
	 *
	 * HTTP PUT
	 */
	PUT("PUT", "http://hl7.org/fhir/http-verb"),
	
	/**
	 * Display: <b>DELETE</b><br>
	 * Code Value: <b>DELETE</b>
	 *
	 * HTTP DELETE
	 */
	DELETE("DELETE", "http://hl7.org/fhir/http-verb"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * HTTPVerb
	 */
	public static final String VALUESET_NAME = "HTTPVerb";

	private static Map<String, HTTPVerbEnum> CODE_TO_ENUM = new HashMap<String, HTTPVerbEnum>();
	private static Map<String, Map<String, HTTPVerbEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, HTTPVerbEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (HTTPVerbEnum next : HTTPVerbEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, HTTPVerbEnum>());
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
	public static HTTPVerbEnum forCode(String theCode) {
		HTTPVerbEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<HTTPVerbEnum> VALUESET_BINDER = new IValueSetEnumBinder<HTTPVerbEnum>() {
		@Override
		public String toCodeString(HTTPVerbEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(HTTPVerbEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public HTTPVerbEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public HTTPVerbEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, HTTPVerbEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	HTTPVerbEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
