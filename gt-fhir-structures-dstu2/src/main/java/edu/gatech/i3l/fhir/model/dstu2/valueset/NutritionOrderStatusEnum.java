
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.NutritionOrderStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum NutritionOrderStatusEnum {

	/**
	 * Display: <b>Proposed</b><br>
	 * Code Value: <b>proposed</b>
	 *
	 * The request has been proposed.
	 */
	PROPOSED("proposed", "http://hl7.org/fhir/nutrition-order-status"),
	
	/**
	 * Display: <b>Draft</b><br>
	 * Code Value: <b>draft</b>
	 *
	 * The request is in preliminary form prior to being sent.
	 */
	DRAFT("draft", "http://hl7.org/fhir/nutrition-order-status"),
	
	/**
	 * Display: <b>Planned</b><br>
	 * Code Value: <b>planned</b>
	 *
	 * The request has been planned.
	 */
	PLANNED("planned", "http://hl7.org/fhir/nutrition-order-status"),
	
	/**
	 * Display: <b>Requested</b><br>
	 * Code Value: <b>requested</b>
	 *
	 * The request has been placed.
	 */
	REQUESTED("requested", "http://hl7.org/fhir/nutrition-order-status"),
	
	/**
	 * Display: <b>Active</b><br>
	 * Code Value: <b>active</b>
	 *
	 * The request is 'actionable', but not all actions that are implied by it have occurred yet.
	 */
	ACTIVE("active", "http://hl7.org/fhir/nutrition-order-status"),
	
	/**
	 * Display: <b>On-Hold</b><br>
	 * Code Value: <b>on-hold</b>
	 *
	 * Actions implied by the request have been temporarily halted, but are expected to continue later. May also be called "suspended".
	 */
	ON_HOLD("on-hold", "http://hl7.org/fhir/nutrition-order-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * All actions that are implied by the order have occurred and no continuation is planned (this will rarely be made explicit).
	 */
	COMPLETED("completed", "http://hl7.org/fhir/nutrition-order-status"),
	
	/**
	 * Display: <b>Cancelled</b><br>
	 * Code Value: <b>cancelled</b>
	 *
	 * The request has been withdrawn and is no longer actionable.
	 */
	CANCELLED("cancelled", "http://hl7.org/fhir/nutrition-order-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * NutritionOrderStatus
	 */
	public static final String VALUESET_NAME = "NutritionOrderStatus";

	private static Map<String, NutritionOrderStatusEnum> CODE_TO_ENUM = new HashMap<String, NutritionOrderStatusEnum>();
	private static Map<String, Map<String, NutritionOrderStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, NutritionOrderStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (NutritionOrderStatusEnum next : NutritionOrderStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, NutritionOrderStatusEnum>());
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
	public static NutritionOrderStatusEnum forCode(String theCode) {
		NutritionOrderStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<NutritionOrderStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<NutritionOrderStatusEnum>() {
		@Override
		public String toCodeString(NutritionOrderStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(NutritionOrderStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public NutritionOrderStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public NutritionOrderStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, NutritionOrderStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	NutritionOrderStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
