
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum DaysOfWeekEnum {

	/**
	 * Display: <b>Monday</b><br>
	 * Code Value: <b>mon</b>
	 *
	 * Monday
	 */
	MONDAY("mon", "http://hl7.org/fhir/days-of-week"),
	
	/**
	 * Display: <b>Tuesday</b><br>
	 * Code Value: <b>tue</b>
	 *
	 * Tuesday
	 */
	TUESDAY("tue", "http://hl7.org/fhir/days-of-week"),
	
	/**
	 * Display: <b>Wednesday</b><br>
	 * Code Value: <b>wed</b>
	 *
	 * Wednesday
	 */
	WEDNESDAY("wed", "http://hl7.org/fhir/days-of-week"),
	
	/**
	 * Display: <b>Thursday</b><br>
	 * Code Value: <b>thu</b>
	 *
	 * Thursday
	 */
	THURSDAY("thu", "http://hl7.org/fhir/days-of-week"),
	
	/**
	 * Display: <b>Friday</b><br>
	 * Code Value: <b>fri</b>
	 *
	 * Friday
	 */
	FRIDAY("fri", "http://hl7.org/fhir/days-of-week"),
	
	/**
	 * Display: <b>Saturday</b><br>
	 * Code Value: <b>sat</b>
	 *
	 * Saturday
	 */
	SATURDAY("sat", "http://hl7.org/fhir/days-of-week"),
	
	/**
	 * Display: <b>Sunday</b><br>
	 * Code Value: <b>sun</b>
	 *
	 * Sunday
	 */
	SUNDAY("sun", "http://hl7.org/fhir/days-of-week"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DaysOfWeek
	 */
	public static final String VALUESET_NAME = "DaysOfWeek";

	private static Map<String, DaysOfWeekEnum> CODE_TO_ENUM = new HashMap<String, DaysOfWeekEnum>();
	private static Map<String, Map<String, DaysOfWeekEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DaysOfWeekEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DaysOfWeekEnum next : DaysOfWeekEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DaysOfWeekEnum>());
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
	public static DaysOfWeekEnum forCode(String theCode) {
		DaysOfWeekEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DaysOfWeekEnum> VALUESET_BINDER = new IValueSetEnumBinder<DaysOfWeekEnum>() {
		@Override
		public String toCodeString(DaysOfWeekEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DaysOfWeekEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DaysOfWeekEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DaysOfWeekEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DaysOfWeekEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DaysOfWeekEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
