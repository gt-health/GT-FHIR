
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.EventTimingEnum;

import java.util.HashMap;
import java.util.Map;

public enum EventTimingEnum {

	/**
	 * Code Value: <b>HS</b>
	 */
	HS("HS", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>WAKE</b>
	 */
	WAKE("WAKE", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>C</b>
	 */
	C("C", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>CM</b>
	 */
	CM("CM", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>CD</b>
	 */
	CD("CD", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>CV</b>
	 */
	CV("CV", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>AC</b>
	 */
	AC("AC", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>ACM</b>
	 */
	ACM("ACM", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>ACD</b>
	 */
	ACD("ACD", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>ACV</b>
	 */
	ACV("ACV", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>PC</b>
	 */
	PC("PC", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>PCM</b>
	 */
	PCM("PCM", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>PCD</b>
	 */
	PCD("PCD", "http://hl7.org/fhir/v3/TimingEvent"),
	
	/**
	 * Code Value: <b>PCV</b>
	 */
	PCV("PCV", "http://hl7.org/fhir/v3/TimingEvent"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * EventTiming
	 */
	public static final String VALUESET_NAME = "EventTiming";

	private static Map<String, EventTimingEnum> CODE_TO_ENUM = new HashMap<String, EventTimingEnum>();
	private static Map<String, Map<String, EventTimingEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, EventTimingEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (EventTimingEnum next : EventTimingEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, EventTimingEnum>());
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
	public static EventTimingEnum forCode(String theCode) {
		EventTimingEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<EventTimingEnum> VALUESET_BINDER = new IValueSetEnumBinder<EventTimingEnum>() {
		@Override
		public String toCodeString(EventTimingEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(EventTimingEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public EventTimingEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public EventTimingEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, EventTimingEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	EventTimingEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
