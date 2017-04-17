
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum QuestionnaireResponseStatusEnum {

	/**
	 * Display: <b>In Progress</b><br>
	 * Code Value: <b>in-progress</b>
	 *
	 * This QuestionnaireResponse has been partially filled out with answers, but changes or additions are still expected to be made to it.
	 */
	IN_PROGRESS("in-progress", "http://hl7.org/fhir/questionnaire-answers-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * This QuestionnaireResponse has been filled out with answers, and the current content is regarded as definitive.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/questionnaire-answers-status"),
	
	/**
	 * Display: <b>Amended</b><br>
	 * Code Value: <b>amended</b>
	 *
	 * This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
	 */
	AMENDED("amended", "http://hl7.org/fhir/questionnaire-answers-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * QuestionnaireResponseStatus
	 */
	public static final String VALUESET_NAME = "QuestionnaireResponseStatus";

	private static Map<String, QuestionnaireResponseStatusEnum> CODE_TO_ENUM = new HashMap<String, QuestionnaireResponseStatusEnum>();
	private static Map<String, Map<String, QuestionnaireResponseStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, QuestionnaireResponseStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (QuestionnaireResponseStatusEnum next : QuestionnaireResponseStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, QuestionnaireResponseStatusEnum>());
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
	public static QuestionnaireResponseStatusEnum forCode(String theCode) {
		QuestionnaireResponseStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<QuestionnaireResponseStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<QuestionnaireResponseStatusEnum>() {
		@Override
		public String toCodeString(QuestionnaireResponseStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(QuestionnaireResponseStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public QuestionnaireResponseStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public QuestionnaireResponseStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, QuestionnaireResponseStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	QuestionnaireResponseStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
