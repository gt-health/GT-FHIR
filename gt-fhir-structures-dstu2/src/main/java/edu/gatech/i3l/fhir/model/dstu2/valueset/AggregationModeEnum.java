
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AggregationModeEnum;

import java.util.HashMap;
import java.util.Map;

public enum AggregationModeEnum {

	/**
	 * Display: <b>Contained</b><br>
	 * Code Value: <b>contained</b>
	 *
	 * The reference is a local reference to a contained resource.
	 */
	CONTAINED("contained", "http://hl7.org/fhir/resource-aggregation-mode"),
	
	/**
	 * Display: <b>Referenced</b><br>
	 * Code Value: <b>referenced</b>
	 *
	 * The reference to a resource that has to be resolved externally to the resource that includes the reference.
	 */
	REFERENCED("referenced", "http://hl7.org/fhir/resource-aggregation-mode"),
	
	/**
	 * Display: <b>Bundled</b><br>
	 * Code Value: <b>bundled</b>
	 *
	 * The resource the reference points to will be found in the same bundle as the resource that includes the reference.
	 */
	BUNDLED("bundled", "http://hl7.org/fhir/resource-aggregation-mode"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AggregationMode
	 */
	public static final String VALUESET_NAME = "AggregationMode";

	private static Map<String, AggregationModeEnum> CODE_TO_ENUM = new HashMap<String, AggregationModeEnum>();
	private static Map<String, Map<String, AggregationModeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AggregationModeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AggregationModeEnum next : AggregationModeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AggregationModeEnum>());
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
	public static AggregationModeEnum forCode(String theCode) {
		AggregationModeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AggregationModeEnum> VALUESET_BINDER = new IValueSetEnumBinder<AggregationModeEnum>() {
		@Override
		public String toCodeString(AggregationModeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AggregationModeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AggregationModeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AggregationModeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AggregationModeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AggregationModeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
