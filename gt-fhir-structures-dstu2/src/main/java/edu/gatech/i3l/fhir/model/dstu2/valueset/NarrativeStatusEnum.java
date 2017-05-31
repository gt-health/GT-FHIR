
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.NarrativeStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum NarrativeStatusEnum {

	/**
	 * Display: <b>Generated</b><br>
	 * Code Value: <b>generated</b>
	 *
	 * The contents of the narrative are entirely generated from the structured data in the content.
	 */
	GENERATED("generated", "http://hl7.org/fhir/narrative-status"),
	
	/**
	 * Display: <b>Extensions</b><br>
	 * Code Value: <b>extensions</b>
	 *
	 * The contents of the narrative are entirely generated from the structured data in the content and some of the content is generated from extensions
	 */
	EXTENSIONS("extensions", "http://hl7.org/fhir/narrative-status"),
	
	/**
	 * Display: <b>Additional</b><br>
	 * Code Value: <b>additional</b>
	 *
	 * The contents of the narrative contain additional information not found in the structured data
	 */
	ADDITIONAL("additional", "http://hl7.org/fhir/narrative-status"),
	
	/**
	 * Display: <b>Empty</b><br>
	 * Code Value: <b>empty</b>
	 *
	 * The contents of the narrative are some equivalent of "No human-readable text provided in this case"
	 */
	EMPTY("empty", "http://hl7.org/fhir/narrative-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * NarrativeStatus
	 */
	public static final String VALUESET_NAME = "NarrativeStatus";

	private static Map<String, NarrativeStatusEnum> CODE_TO_ENUM = new HashMap<String, NarrativeStatusEnum>();
	private static Map<String, Map<String, NarrativeStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, NarrativeStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (NarrativeStatusEnum next : NarrativeStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, NarrativeStatusEnum>());
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
	public static NarrativeStatusEnum forCode(String theCode) {
		NarrativeStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<NarrativeStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<NarrativeStatusEnum>() {
		@Override
		public String toCodeString(NarrativeStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(NarrativeStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public NarrativeStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public NarrativeStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, NarrativeStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	NarrativeStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
