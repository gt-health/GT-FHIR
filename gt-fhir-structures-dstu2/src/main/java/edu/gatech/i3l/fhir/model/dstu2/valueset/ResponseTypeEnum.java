
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ResponseTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum ResponseTypeEnum {

	/**
	 * Display: <b>OK</b><br>
	 * Code Value: <b>ok</b>
	 *
	 * The message was accepted and processed without error.
	 */
	OK("ok", "http://hl7.org/fhir/response-code"),
	
	/**
	 * Display: <b>Transient Error</b><br>
	 * Code Value: <b>transient-error</b>
	 *
	 * Some internal unexpected error occurred - wait and try again. Note - this is usually used for things like database unavailable, which may be expected to resolve, though human intervention may be required.
	 */
	TRANSIENT_ERROR("transient-error", "http://hl7.org/fhir/response-code"),
	
	/**
	 * Display: <b>Fatal Error</b><br>
	 * Code Value: <b>fatal-error</b>
	 *
	 * The message was rejected because of some content in it. There is no point in re-sending without change. The response narrative SHALL describe the issue.
	 */
	FATAL_ERROR("fatal-error", "http://hl7.org/fhir/response-code"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ResponseType
	 */
	public static final String VALUESET_NAME = "ResponseType";

	private static Map<String, ResponseTypeEnum> CODE_TO_ENUM = new HashMap<String, ResponseTypeEnum>();
	private static Map<String, Map<String, ResponseTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ResponseTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ResponseTypeEnum next : ResponseTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ResponseTypeEnum>());
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
	public static ResponseTypeEnum forCode(String theCode) {
		ResponseTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ResponseTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<ResponseTypeEnum>() {
		@Override
		public String toCodeString(ResponseTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ResponseTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ResponseTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ResponseTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ResponseTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ResponseTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
