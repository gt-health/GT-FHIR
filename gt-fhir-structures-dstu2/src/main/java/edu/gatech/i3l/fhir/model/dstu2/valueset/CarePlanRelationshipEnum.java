
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.CarePlanRelationshipEnum;

import java.util.HashMap;
import java.util.Map;

public enum CarePlanRelationshipEnum {

	/**
	 * Display: <b>Includes</b><br>
	 * Code Value: <b>includes</b>
	 *
	 * The referenced plan is considered to be part of this plan.
	 */
	INCLUDES("includes", "http://hl7.org/fhir/care-plan-relationship"),
	
	/**
	 * Display: <b>Replaces</b><br>
	 * Code Value: <b>replaces</b>
	 *
	 * This plan takes the places of the referenced plan.
	 */
	REPLACES("replaces", "http://hl7.org/fhir/care-plan-relationship"),
	
	/**
	 * Display: <b>Fulfills</b><br>
	 * Code Value: <b>fulfills</b>
	 *
	 * This plan provides details about how to perform activities defined at a higher level by the referenced plan.
	 */
	FULFILLS("fulfills", "http://hl7.org/fhir/care-plan-relationship"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * CarePlanRelationship
	 */
	public static final String VALUESET_NAME = "CarePlanRelationship";

	private static Map<String, CarePlanRelationshipEnum> CODE_TO_ENUM = new HashMap<String, CarePlanRelationshipEnum>();
	private static Map<String, Map<String, CarePlanRelationshipEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, CarePlanRelationshipEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (CarePlanRelationshipEnum next : CarePlanRelationshipEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, CarePlanRelationshipEnum>());
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
	public static CarePlanRelationshipEnum forCode(String theCode) {
		CarePlanRelationshipEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<CarePlanRelationshipEnum> VALUESET_BINDER = new IValueSetEnumBinder<CarePlanRelationshipEnum>() {
		@Override
		public String toCodeString(CarePlanRelationshipEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(CarePlanRelationshipEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public CarePlanRelationshipEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public CarePlanRelationshipEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, CarePlanRelationshipEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	CarePlanRelationshipEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
