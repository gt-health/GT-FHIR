
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.DocumentModeEnum;

import java.util.HashMap;
import java.util.Map;

public enum DocumentModeEnum {

	/**
	 * Display: <b>Producer</b><br>
	 * Code Value: <b>producer</b>
	 *
	 * The application produces documents of the specified type.
	 */
	PRODUCER("producer", "http://hl7.org/fhir/document-mode"),
	
	/**
	 * Display: <b>Consumer</b><br>
	 * Code Value: <b>consumer</b>
	 *
	 * The application consumes documents of the specified type.
	 */
	CONSUMER("consumer", "http://hl7.org/fhir/document-mode"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DocumentMode
	 */
	public static final String VALUESET_NAME = "DocumentMode";

	private static Map<String, DocumentModeEnum> CODE_TO_ENUM = new HashMap<String, DocumentModeEnum>();
	private static Map<String, Map<String, DocumentModeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DocumentModeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DocumentModeEnum next : DocumentModeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DocumentModeEnum>());
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
	public static DocumentModeEnum forCode(String theCode) {
		DocumentModeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DocumentModeEnum> VALUESET_BINDER = new IValueSetEnumBinder<DocumentModeEnum>() {
		@Override
		public String toCodeString(DocumentModeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DocumentModeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DocumentModeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DocumentModeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DocumentModeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DocumentModeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
