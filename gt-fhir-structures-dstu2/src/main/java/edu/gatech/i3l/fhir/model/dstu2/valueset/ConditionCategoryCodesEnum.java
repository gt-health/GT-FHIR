
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ConditionCategoryCodesEnum;

import java.util.HashMap;
import java.util.Map;

public enum ConditionCategoryCodesEnum {

	/**
	 * Display: <b>Complaint</b><br>
	 * Code Value: <b>complaint</b>
	 *
	 * The patient considers the condition an issue to be addressed.
	 */
	COMPLAINT("complaint", "http://hl7.org/fhir/condition-category"),
	
	/**
	 * Display: <b>Symptom</b><br>
	 * Code Value: <b>symptom</b>
	 *
	 * A symptom of a condition (as might be mentioned in a review of systems).
	 */
	SYMPTOM("symptom", "http://hl7.org/fhir/condition-category"),
	
	/**
	 * Display: <b>Finding</b><br>
	 * Code Value: <b>finding</b>
	 *
	 * An observation made by a healthcare provider.
	 */
	FINDING("finding", "http://hl7.org/fhir/condition-category"),
	
	/**
	 * Display: <b>Diagnosis</b><br>
	 * Code Value: <b>diagnosis</b>
	 *
	 * This is a judgment made by a healthcare provider that the patient has a particular disease or condition.
	 */
	DIAGNOSIS("diagnosis", "http://hl7.org/fhir/condition-category"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * Condition Category Codes
	 */
	public static final String VALUESET_NAME = "Condition Category Codes";

	private static Map<String, ConditionCategoryCodesEnum> CODE_TO_ENUM = new HashMap<String, ConditionCategoryCodesEnum>();
	private static Map<String, Map<String, ConditionCategoryCodesEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ConditionCategoryCodesEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ConditionCategoryCodesEnum next : ConditionCategoryCodesEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ConditionCategoryCodesEnum>());
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
	public static ConditionCategoryCodesEnum forCode(String theCode) {
		ConditionCategoryCodesEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ConditionCategoryCodesEnum> VALUESET_BINDER = new IValueSetEnumBinder<ConditionCategoryCodesEnum>() {
		@Override
		public String toCodeString(ConditionCategoryCodesEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ConditionCategoryCodesEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ConditionCategoryCodesEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ConditionCategoryCodesEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ConditionCategoryCodesEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ConditionCategoryCodesEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
