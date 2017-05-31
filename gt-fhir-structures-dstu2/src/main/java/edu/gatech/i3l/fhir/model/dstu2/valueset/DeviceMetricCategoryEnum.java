
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.DeviceMetricCategoryEnum;

import java.util.HashMap;
import java.util.Map;

public enum DeviceMetricCategoryEnum {

	/**
	 * Display: <b>Measurement</b><br>
	 * Code Value: <b>measurement</b>
	 *
	 * DeviceObservations generated for this DeviceMetric are measured.
	 */
	MEASUREMENT("measurement", "http://hl7.org/fhir/metric-category"),
	
	/**
	 * Display: <b>Setting</b><br>
	 * Code Value: <b>setting</b>
	 *
	 * DeviceObservations generated for this DeviceMetric is a setting that will influence the behavior of the Device.
	 */
	SETTING("setting", "http://hl7.org/fhir/metric-category"),
	
	/**
	 * Display: <b>Calculation</b><br>
	 * Code Value: <b>calculation</b>
	 *
	 * DeviceObservations generated for this DeviceMetric are calculated.
	 */
	CALCULATION("calculation", "http://hl7.org/fhir/metric-category"),
	
	/**
	 * Display: <b>Unspecified</b><br>
	 * Code Value: <b>unspecified</b>
	 *
	 * The category of this DeviceMetric is unspecified.
	 */
	UNSPECIFIED("unspecified", "http://hl7.org/fhir/metric-category"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DeviceMetricCategory
	 */
	public static final String VALUESET_NAME = "DeviceMetricCategory";

	private static Map<String, DeviceMetricCategoryEnum> CODE_TO_ENUM = new HashMap<String, DeviceMetricCategoryEnum>();
	private static Map<String, Map<String, DeviceMetricCategoryEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DeviceMetricCategoryEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DeviceMetricCategoryEnum next : DeviceMetricCategoryEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DeviceMetricCategoryEnum>());
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
	public static DeviceMetricCategoryEnum forCode(String theCode) {
		DeviceMetricCategoryEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DeviceMetricCategoryEnum> VALUESET_BINDER = new IValueSetEnumBinder<DeviceMetricCategoryEnum>() {
		@Override
		public String toCodeString(DeviceMetricCategoryEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DeviceMetricCategoryEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DeviceMetricCategoryEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DeviceMetricCategoryEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DeviceMetricCategoryEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DeviceMetricCategoryEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
