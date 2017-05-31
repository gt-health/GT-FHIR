
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.QuestionnaireStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum QuestionnaireStatusEnum {

	/**
	 * Display: <b>Draft</b><br>
	 * Code Value: <b>draft</b>
	 *
	 * This Questionnaire is not ready for official use.
	 */
	DRAFT("draft", "http://hl7.org/fhir/questionnaire-status"),
	
	/**
	 * Display: <b>Published</b><br>
	 * Code Value: <b>published</b>
	 *
	 * This Questionnaire is ready for use.
	 */
	PUBLISHED("published", "http://hl7.org/fhir/questionnaire-status"),
	
	/**
	 * Display: <b>Retired</b><br>
	 * Code Value: <b>retired</b>
	 *
	 * This Questionnaire should no longer be used to gather data.
	 */
	RETIRED("retired", "http://hl7.org/fhir/questionnaire-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * QuestionnaireStatus
	 */
	public static final String VALUESET_NAME = "QuestionnaireStatus";

	private static Map<String, QuestionnaireStatusEnum> CODE_TO_ENUM = new HashMap<String, QuestionnaireStatusEnum>();
	private static Map<String, Map<String, QuestionnaireStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, QuestionnaireStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (QuestionnaireStatusEnum next : QuestionnaireStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, QuestionnaireStatusEnum>());
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
	public static QuestionnaireStatusEnum forCode(String theCode) {
		QuestionnaireStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<QuestionnaireStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<QuestionnaireStatusEnum>() {
		@Override
		public String toCodeString(QuestionnaireStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(QuestionnaireStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public QuestionnaireStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public QuestionnaireStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, QuestionnaireStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	QuestionnaireStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
