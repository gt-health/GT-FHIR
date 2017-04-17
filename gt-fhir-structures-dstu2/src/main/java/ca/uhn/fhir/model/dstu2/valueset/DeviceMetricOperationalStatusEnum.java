
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum DeviceMetricOperationalStatusEnum {

	/**
	 * Display: <b>On</b><br>
	 * Code Value: <b>on</b>
	 *
	 * The DeviceMetric is operating and will generate DeviceObservations.
	 */
	ON("on", "http://hl7.org/fhir/metric-operational-status"),
	
	/**
	 * Display: <b>Off</b><br>
	 * Code Value: <b>off</b>
	 *
	 * The DeviceMetric is not operating.
	 */
	OFF("off", "http://hl7.org/fhir/metric-operational-status"),
	
	/**
	 * Display: <b>Standby</b><br>
	 * Code Value: <b>standby</b>
	 *
	 * The DeviceMetric is operating, but will not generate any DeviceObservations.
	 */
	STANDBY("standby", "http://hl7.org/fhir/metric-operational-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DeviceMetricOperationalStatus
	 */
	public static final String VALUESET_NAME = "DeviceMetricOperationalStatus";

	private static Map<String, DeviceMetricOperationalStatusEnum> CODE_TO_ENUM = new HashMap<String, DeviceMetricOperationalStatusEnum>();
	private static Map<String, Map<String, DeviceMetricOperationalStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DeviceMetricOperationalStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DeviceMetricOperationalStatusEnum next : DeviceMetricOperationalStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DeviceMetricOperationalStatusEnum>());
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
	public static DeviceMetricOperationalStatusEnum forCode(String theCode) {
		DeviceMetricOperationalStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DeviceMetricOperationalStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<DeviceMetricOperationalStatusEnum>() {
		@Override
		public String toCodeString(DeviceMetricOperationalStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DeviceMetricOperationalStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DeviceMetricOperationalStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DeviceMetricOperationalStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DeviceMetricOperationalStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DeviceMetricOperationalStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
