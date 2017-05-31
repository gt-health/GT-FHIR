
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ParticipantRequiredEnum;

import java.util.HashMap;
import java.util.Map;

public enum ParticipantRequiredEnum {

	/**
	 * Display: <b>Required</b><br>
	 * Code Value: <b>required</b>
	 *
	 * The participant is required to attend the appointment.
	 */
	REQUIRED("required", "http://hl7.org/fhir/participantrequired"),
	
	/**
	 * Display: <b>Optional</b><br>
	 * Code Value: <b>optional</b>
	 *
	 * The participant may optionally attend the appointment.
	 */
	OPTIONAL("optional", "http://hl7.org/fhir/participantrequired"),
	
	/**
	 * Display: <b>Information Only</b><br>
	 * Code Value: <b>information-only</b>
	 *
	 * The participant is excluded from the appointment, and may not be informed of the appointment taking place. (Appointment is about them, not for them - such as 2 doctors discussing results about a patient's test).
	 */
	INFORMATION_ONLY("information-only", "http://hl7.org/fhir/participantrequired"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ParticipantRequired
	 */
	public static final String VALUESET_NAME = "ParticipantRequired";

	private static Map<String, ParticipantRequiredEnum> CODE_TO_ENUM = new HashMap<String, ParticipantRequiredEnum>();
	private static Map<String, Map<String, ParticipantRequiredEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ParticipantRequiredEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ParticipantRequiredEnum next : ParticipantRequiredEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ParticipantRequiredEnum>());
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
	public static ParticipantRequiredEnum forCode(String theCode) {
		ParticipantRequiredEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ParticipantRequiredEnum> VALUESET_BINDER = new IValueSetEnumBinder<ParticipantRequiredEnum>() {
		@Override
		public String toCodeString(ParticipantRequiredEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ParticipantRequiredEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ParticipantRequiredEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ParticipantRequiredEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ParticipantRequiredEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ParticipantRequiredEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
