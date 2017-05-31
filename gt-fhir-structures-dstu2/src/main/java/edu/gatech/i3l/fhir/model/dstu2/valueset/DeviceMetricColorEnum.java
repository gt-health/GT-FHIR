
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.DeviceMetricColorEnum;

import java.util.HashMap;
import java.util.Map;

public enum DeviceMetricColorEnum {

	/**
	 * Display: <b>Color Black</b><br>
	 * Code Value: <b>black</b>
	 *
	 * Color for representation - black.
	 */
	COLOR_BLACK("black", "http://hl7.org/fhir/metric-color"),
	
	/**
	 * Display: <b>Color Red</b><br>
	 * Code Value: <b>red</b>
	 *
	 * Color for representation - red.
	 */
	COLOR_RED("red", "http://hl7.org/fhir/metric-color"),
	
	/**
	 * Display: <b>Color Green</b><br>
	 * Code Value: <b>green</b>
	 *
	 * Color for representation - green.
	 */
	COLOR_GREEN("green", "http://hl7.org/fhir/metric-color"),
	
	/**
	 * Display: <b>Color Yellow</b><br>
	 * Code Value: <b>yellow</b>
	 *
	 * Color for representation - yellow.
	 */
	COLOR_YELLOW("yellow", "http://hl7.org/fhir/metric-color"),
	
	/**
	 * Display: <b>Color Blue</b><br>
	 * Code Value: <b>blue</b>
	 *
	 * Color for representation - blue.
	 */
	COLOR_BLUE("blue", "http://hl7.org/fhir/metric-color"),
	
	/**
	 * Display: <b>Color Magenta</b><br>
	 * Code Value: <b>magenta</b>
	 *
	 * Color for representation - magenta.
	 */
	COLOR_MAGENTA("magenta", "http://hl7.org/fhir/metric-color"),
	
	/**
	 * Display: <b>Color Cyan</b><br>
	 * Code Value: <b>cyan</b>
	 *
	 * Color for representation - cyan.
	 */
	COLOR_CYAN("cyan", "http://hl7.org/fhir/metric-color"),
	
	/**
	 * Display: <b>Color White</b><br>
	 * Code Value: <b>white</b>
	 *
	 * Color for representation - white.
	 */
	COLOR_WHITE("white", "http://hl7.org/fhir/metric-color"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DeviceMetricColor
	 */
	public static final String VALUESET_NAME = "DeviceMetricColor";

	private static Map<String, DeviceMetricColorEnum> CODE_TO_ENUM = new HashMap<String, DeviceMetricColorEnum>();
	private static Map<String, Map<String, DeviceMetricColorEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DeviceMetricColorEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DeviceMetricColorEnum next : DeviceMetricColorEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DeviceMetricColorEnum>());
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
	public static DeviceMetricColorEnum forCode(String theCode) {
		DeviceMetricColorEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DeviceMetricColorEnum> VALUESET_BINDER = new IValueSetEnumBinder<DeviceMetricColorEnum>() {
		@Override
		public String toCodeString(DeviceMetricColorEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DeviceMetricColorEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DeviceMetricColorEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DeviceMetricColorEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DeviceMetricColorEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DeviceMetricColorEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
