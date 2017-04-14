
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ServiceProvisionConditionsEnum {

	/**
	 * Display: <b>Free</b><br>
	 * Code Value: <b>free</b>
	 *
	 * This service is available for no patient cost.
	 */
	FREE("free", "http://hl7.org/fhir/service-provision-conditions"),
	
	/**
	 * Display: <b>Discounts Available</b><br>
	 * Code Value: <b>disc</b>
	 *
	 * There are discounts available on this service for qualifying patients.
	 */
	DISCOUNTS_AVAILABLE("disc", "http://hl7.org/fhir/service-provision-conditions"),
	
	/**
	 * Display: <b>Fees apply</b><br>
	 * Code Value: <b>cost</b>
	 *
	 * Fees apply for this service.
	 */
	FEES_APPLY("cost", "http://hl7.org/fhir/service-provision-conditions"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ServiceProvisionConditions
	 */
	public static final String VALUESET_NAME = "ServiceProvisionConditions";

	private static Map<String, ServiceProvisionConditionsEnum> CODE_TO_ENUM = new HashMap<String, ServiceProvisionConditionsEnum>();
	private static Map<String, Map<String, ServiceProvisionConditionsEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ServiceProvisionConditionsEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ServiceProvisionConditionsEnum next : ServiceProvisionConditionsEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ServiceProvisionConditionsEnum>());
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
	public static ServiceProvisionConditionsEnum forCode(String theCode) {
		ServiceProvisionConditionsEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ServiceProvisionConditionsEnum> VALUESET_BINDER = new IValueSetEnumBinder<ServiceProvisionConditionsEnum>() {
		@Override
		public String toCodeString(ServiceProvisionConditionsEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ServiceProvisionConditionsEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ServiceProvisionConditionsEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ServiceProvisionConditionsEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ServiceProvisionConditionsEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ServiceProvisionConditionsEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
