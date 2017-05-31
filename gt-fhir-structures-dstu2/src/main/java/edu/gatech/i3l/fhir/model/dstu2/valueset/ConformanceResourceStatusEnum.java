
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ConformanceResourceStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum ConformanceResourceStatusEnum {

	/**
	 * Display: <b>Draft</b><br>
	 * Code Value: <b>draft</b>
	 *
	 * This resource is still under development.
	 */
	DRAFT("draft", "http://hl7.org/fhir/conformance-resource-status"),
	
	/**
	 * Display: <b>Active</b><br>
	 * Code Value: <b>active</b>
	 *
	 * This resource is ready for normal use.
	 */
	ACTIVE("active", "http://hl7.org/fhir/conformance-resource-status"),
	
	/**
	 * Display: <b>Retired</b><br>
	 * Code Value: <b>retired</b>
	 *
	 * This resource has been withdrawn or superseded and should no longer be used.
	 */
	RETIRED("retired", "http://hl7.org/fhir/conformance-resource-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ConformanceResourceStatus
	 */
	public static final String VALUESET_NAME = "ConformanceResourceStatus";

	private static Map<String, ConformanceResourceStatusEnum> CODE_TO_ENUM = new HashMap<String, ConformanceResourceStatusEnum>();
	private static Map<String, Map<String, ConformanceResourceStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ConformanceResourceStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ConformanceResourceStatusEnum next : ConformanceResourceStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ConformanceResourceStatusEnum>());
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
	public static ConformanceResourceStatusEnum forCode(String theCode) {
		ConformanceResourceStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ConformanceResourceStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<ConformanceResourceStatusEnum>() {
		@Override
		public String toCodeString(ConformanceResourceStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ConformanceResourceStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ConformanceResourceStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ConformanceResourceStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ConformanceResourceStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ConformanceResourceStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
