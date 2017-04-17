
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ConditionClinicalStatusCodesEnum {

	/**
	 * Display: <b>Active</b><br>
	 * Code Value: <b>active</b>
	 *
	 * The subject is currently experiencing the symptoms of the condition.
	 */
	ACTIVE("active", "http://hl7.org/fhir/condition-clinical"),
	
	/**
	 * Display: <b>Relapse</b><br>
	 * Code Value: <b>relapse</b>
	 *
	 * The subject is re-experiencing the symptoms of the condition after a period of remission or presumed resolution.
	 */
	RELAPSE("relapse", "http://hl7.org/fhir/condition-clinical"),
	
	/**
	 * Display: <b>Remission</b><br>
	 * Code Value: <b>remission</b>
	 *
	 * The subject is no longer experiencing the symptoms of the condition, but there is a risk of the symptoms returning.
	 */
	REMISSION("remission", "http://hl7.org/fhir/condition-clinical"),
	
	/**
	 * Display: <b>Resolved</b><br>
	 * Code Value: <b>resolved</b>
	 *
	 * The subject is no longer experiencing the symptoms of the condition and there is no perceived risk of the symptoms returning.
	 */
	RESOLVED("resolved", "http://hl7.org/fhir/condition-clinical"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * Condition Clinical Status Codes
	 */
	public static final String VALUESET_NAME = "Condition Clinical Status Codes";

	private static Map<String, ConditionClinicalStatusCodesEnum> CODE_TO_ENUM = new HashMap<String, ConditionClinicalStatusCodesEnum>();
	private static Map<String, Map<String, ConditionClinicalStatusCodesEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ConditionClinicalStatusCodesEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ConditionClinicalStatusCodesEnum next : ConditionClinicalStatusCodesEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ConditionClinicalStatusCodesEnum>());
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
	public static ConditionClinicalStatusCodesEnum forCode(String theCode) {
		ConditionClinicalStatusCodesEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ConditionClinicalStatusCodesEnum> VALUESET_BINDER = new IValueSetEnumBinder<ConditionClinicalStatusCodesEnum>() {
		@Override
		public String toCodeString(ConditionClinicalStatusCodesEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ConditionClinicalStatusCodesEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ConditionClinicalStatusCodesEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ConditionClinicalStatusCodesEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ConditionClinicalStatusCodesEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ConditionClinicalStatusCodesEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
