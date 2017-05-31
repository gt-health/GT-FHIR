
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ParticipantTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum ParticipantTypeEnum {

	/**
	 * Display: <b>Translator</b><br>
	 * Code Value: <b>translator</b>
	 *
	 * A translator who is facilitating communication with the patient during the encounter.
	 */
	TRANSLATOR("translator", "http://hl7.org/fhir/participant-type"),
	
	/**
	 * Display: <b>Emergency</b><br>
	 * Code Value: <b>emergency</b>
	 *
	 * A person to be contacted in case of an emergency during the encounter.
	 */
	EMERGENCY("emergency", "http://hl7.org/fhir/participant-type"),
	
	/**
	 * Code Value: <b>SPRF</b>
	 */
	SPRF("SPRF", "http://hl7.org/fhir/v3/ParticipationType"),
	
	/**
	 * Code Value: <b>PPRF</b>
	 */
	PPRF("PPRF", "http://hl7.org/fhir/v3/ParticipationType"),
	
	/**
	 * Code Value: <b>PART</b>
	 */
	PART("PART", "http://hl7.org/fhir/v3/ParticipationType"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ParticipantType
	 */
	public static final String VALUESET_NAME = "ParticipantType";

	private static Map<String, ParticipantTypeEnum> CODE_TO_ENUM = new HashMap<String, ParticipantTypeEnum>();
	private static Map<String, Map<String, ParticipantTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ParticipantTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ParticipantTypeEnum next : ParticipantTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ParticipantTypeEnum>());
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
	public static ParticipantTypeEnum forCode(String theCode) {
		ParticipantTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ParticipantTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<ParticipantTypeEnum>() {
		@Override
		public String toCodeString(ParticipantTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ParticipantTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ParticipantTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ParticipantTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ParticipantTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ParticipantTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
