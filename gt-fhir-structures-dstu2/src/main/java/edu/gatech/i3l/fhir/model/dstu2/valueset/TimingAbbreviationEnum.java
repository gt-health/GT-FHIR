
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.TimingAbbreviationEnum;

import java.util.HashMap;
import java.util.Map;

public enum TimingAbbreviationEnum {

	/**
	 * Display: <b>QD</b><br>
	 * Code Value: <b>QD</b>
	 *
	 * Every Day at institution specified times
	 */
	QD("QD", "http://hl7.org/fhir/timing-abbreviation"),
	
	/**
	 * Display: <b>QOD</b><br>
	 * Code Value: <b>QOD</b>
	 *
	 * Every Other Day at institution specified times
	 */
	QOD("QOD", "http://hl7.org/fhir/timing-abbreviation"),
	
	/**
	 * Display: <b>Q4H</b><br>
	 * Code Value: <b>Q4H</b>
	 *
	 * Every 4 hours at institution specified times
	 */
	Q4H("Q4H", "http://hl7.org/fhir/timing-abbreviation"),
	
	/**
	 * Display: <b>Q6H</b><br>
	 * Code Value: <b>Q6H</b>
	 *
	 * Every 6 Hours  at institution specified times
	 */
	Q6H("Q6H", "http://hl7.org/fhir/timing-abbreviation"),
	
	/**
	 * Code Value: <b>BID</b>
	 */
	BID("BID", "http://hl7.org/fhir/v3/GTSAbbreviation"),
	
	/**
	 * Code Value: <b>TID</b>
	 */
	TID("TID", "http://hl7.org/fhir/v3/GTSAbbreviation"),
	
	/**
	 * Code Value: <b>QID</b>
	 */
	QID("QID", "http://hl7.org/fhir/v3/GTSAbbreviation"),
	
	/**
	 * Code Value: <b>AM</b>
	 */
	AM("AM", "http://hl7.org/fhir/v3/GTSAbbreviation"),
	
	/**
	 * Code Value: <b>PM</b>
	 */
	PM("PM", "http://hl7.org/fhir/v3/GTSAbbreviation"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * TimingAbbreviation
	 */
	public static final String VALUESET_NAME = "TimingAbbreviation";

	private static Map<String, TimingAbbreviationEnum> CODE_TO_ENUM = new HashMap<String, TimingAbbreviationEnum>();
	private static Map<String, Map<String, TimingAbbreviationEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, TimingAbbreviationEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (TimingAbbreviationEnum next : TimingAbbreviationEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, TimingAbbreviationEnum>());
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
	public static TimingAbbreviationEnum forCode(String theCode) {
		TimingAbbreviationEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<TimingAbbreviationEnum> VALUESET_BINDER = new IValueSetEnumBinder<TimingAbbreviationEnum>() {
		@Override
		public String toCodeString(TimingAbbreviationEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(TimingAbbreviationEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public TimingAbbreviationEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public TimingAbbreviationEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, TimingAbbreviationEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	TimingAbbreviationEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
