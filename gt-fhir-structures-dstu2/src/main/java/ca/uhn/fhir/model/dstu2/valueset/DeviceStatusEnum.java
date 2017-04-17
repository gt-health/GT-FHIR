
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum DeviceStatusEnum {

	/**
	 * Display: <b>Available</b><br>
	 * Code Value: <b>available</b>
	 *
	 * The Device is available for use.
	 */
	AVAILABLE("available", "http://hl7.org/fhir/devicestatus"),
	
	/**
	 * Display: <b>Not Available</b><br>
	 * Code Value: <b>not-available</b>
	 *
	 * The Device is no longer available for use (e.g. lost, expired, damaged).
	 */
	NOT_AVAILABLE("not-available", "http://hl7.org/fhir/devicestatus"),
	
	/**
	 * Display: <b>Entered in Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The Device was entered in error and voided.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/devicestatus"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DeviceStatus
	 */
	public static final String VALUESET_NAME = "DeviceStatus";

	private static Map<String, DeviceStatusEnum> CODE_TO_ENUM = new HashMap<String, DeviceStatusEnum>();
	private static Map<String, Map<String, DeviceStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DeviceStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DeviceStatusEnum next : DeviceStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DeviceStatusEnum>());
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
	public static DeviceStatusEnum forCode(String theCode) {
		DeviceStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DeviceStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<DeviceStatusEnum>() {
		@Override
		public String toCodeString(DeviceStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DeviceStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DeviceStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DeviceStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DeviceStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DeviceStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
