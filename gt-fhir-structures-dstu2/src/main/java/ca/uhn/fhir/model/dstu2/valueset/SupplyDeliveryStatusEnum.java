
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum SupplyDeliveryStatusEnum {

	/**
	 * Display: <b>In Progress</b><br>
	 * Code Value: <b>in-progress</b>
	 *
	 * Supply has been requested, but not delivered.
	 */
	IN_PROGRESS("in-progress", "http://hl7.org/fhir/supplydelivery-status"),
	
	/**
	 * Display: <b>Delivered</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * Supply has been delivered ("completed").
	 */
	DELIVERED("completed", "http://hl7.org/fhir/supplydelivery-status"),
	
	/**
	 * Display: <b>Abandoned</b><br>
	 * Code Value: <b>abandoned</b>
	 *
	 * Dispensing was not completed.
	 */
	ABANDONED("abandoned", "http://hl7.org/fhir/supplydelivery-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * SupplyDeliveryStatus
	 */
	public static final String VALUESET_NAME = "SupplyDeliveryStatus";

	private static Map<String, SupplyDeliveryStatusEnum> CODE_TO_ENUM = new HashMap<String, SupplyDeliveryStatusEnum>();
	private static Map<String, Map<String, SupplyDeliveryStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, SupplyDeliveryStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (SupplyDeliveryStatusEnum next : SupplyDeliveryStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, SupplyDeliveryStatusEnum>());
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
	public static SupplyDeliveryStatusEnum forCode(String theCode) {
		SupplyDeliveryStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<SupplyDeliveryStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<SupplyDeliveryStatusEnum>() {
		@Override
		public String toCodeString(SupplyDeliveryStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(SupplyDeliveryStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public SupplyDeliveryStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public SupplyDeliveryStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, SupplyDeliveryStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	SupplyDeliveryStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
