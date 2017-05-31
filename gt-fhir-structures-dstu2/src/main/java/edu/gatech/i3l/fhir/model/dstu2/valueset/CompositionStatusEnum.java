
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.CompositionStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum CompositionStatusEnum {

	/**
	 * Display: <b>Preliminary</b><br>
	 * Code Value: <b>preliminary</b>
	 *
	 * This is a preliminary composition or document (also known as initial or interim). The content may be incomplete or unverified.
	 */
	PRELIMINARY("preliminary", "http://hl7.org/fhir/composition-status"),
	
	/**
	 * Display: <b>Final</b><br>
	 * Code Value: <b>final</b>
	 *
	 * This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.
	 */
	FINAL("final", "http://hl7.org/fhir/composition-status"),
	
	/**
	 * Display: <b>Amended</b><br>
	 * Code Value: <b>amended</b>
	 *
	 * The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as "final" and the composition is complete and verified by an authorized person.
	 */
	AMENDED("amended", "http://hl7.org/fhir/composition-status"),
	
	/**
	 * Display: <b>Entered in Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/composition-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * CompositionStatus
	 */
	public static final String VALUESET_NAME = "CompositionStatus";

	private static Map<String, CompositionStatusEnum> CODE_TO_ENUM = new HashMap<String, CompositionStatusEnum>();
	private static Map<String, Map<String, CompositionStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, CompositionStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (CompositionStatusEnum next : CompositionStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, CompositionStatusEnum>());
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
	public static CompositionStatusEnum forCode(String theCode) {
		CompositionStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<CompositionStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<CompositionStatusEnum>() {
		@Override
		public String toCodeString(CompositionStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(CompositionStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public CompositionStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public CompositionStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, CompositionStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	CompositionStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
