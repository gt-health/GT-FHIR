
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.RestfulConformanceModeEnum;

import java.util.HashMap;
import java.util.Map;

public enum RestfulConformanceModeEnum {

	/**
	 * Display: <b>Client</b><br>
	 * Code Value: <b>client</b>
	 *
	 * The application acts as a client for this resource.
	 */
	CLIENT("client", "http://hl7.org/fhir/restful-conformance-mode"),
	
	/**
	 * Display: <b>Server</b><br>
	 * Code Value: <b>server</b>
	 *
	 * The application acts as a server for this resource.
	 */
	SERVER("server", "http://hl7.org/fhir/restful-conformance-mode"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * RestfulConformanceMode
	 */
	public static final String VALUESET_NAME = "RestfulConformanceMode";

	private static Map<String, RestfulConformanceModeEnum> CODE_TO_ENUM = new HashMap<String, RestfulConformanceModeEnum>();
	private static Map<String, Map<String, RestfulConformanceModeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, RestfulConformanceModeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (RestfulConformanceModeEnum next : RestfulConformanceModeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, RestfulConformanceModeEnum>());
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
	public static RestfulConformanceModeEnum forCode(String theCode) {
		RestfulConformanceModeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<RestfulConformanceModeEnum> VALUESET_BINDER = new IValueSetEnumBinder<RestfulConformanceModeEnum>() {
		@Override
		public String toCodeString(RestfulConformanceModeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(RestfulConformanceModeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public RestfulConformanceModeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public RestfulConformanceModeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, RestfulConformanceModeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	RestfulConformanceModeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
