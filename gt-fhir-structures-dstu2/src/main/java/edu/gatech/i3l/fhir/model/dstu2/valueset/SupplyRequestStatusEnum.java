
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.SupplyRequestStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum SupplyRequestStatusEnum {

	/**
	 * Display: <b>Requested</b><br>
	 * Code Value: <b>requested</b>
	 *
	 * Supply has been requested, but not dispensed.
	 */
	REQUESTED("requested", "http://hl7.org/fhir/supplyrequest-status"),
	
	/**
	 * Display: <b>Received</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * Supply has been received by the requestor.
	 */
	RECEIVED("completed", "http://hl7.org/fhir/supplyrequest-status"),
	
	/**
	 * Display: <b>Failed</b><br>
	 * Code Value: <b>failed</b>
	 *
	 * The supply will not be completed because the supplier was unable or unwilling to supply the item.
	 */
	FAILED("failed", "http://hl7.org/fhir/supplyrequest-status"),
	
	/**
	 * Display: <b>Cancelled</b><br>
	 * Code Value: <b>cancelled</b>
	 *
	 * The orderer of the supply cancelled the request.
	 */
	CANCELLED("cancelled", "http://hl7.org/fhir/supplyrequest-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * SupplyRequestStatus
	 */
	public static final String VALUESET_NAME = "SupplyRequestStatus";

	private static Map<String, SupplyRequestStatusEnum> CODE_TO_ENUM = new HashMap<String, SupplyRequestStatusEnum>();
	private static Map<String, Map<String, SupplyRequestStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, SupplyRequestStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (SupplyRequestStatusEnum next : SupplyRequestStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, SupplyRequestStatusEnum>());
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
	public static SupplyRequestStatusEnum forCode(String theCode) {
		SupplyRequestStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<SupplyRequestStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<SupplyRequestStatusEnum>() {
		@Override
		public String toCodeString(SupplyRequestStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(SupplyRequestStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public SupplyRequestStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public SupplyRequestStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, SupplyRequestStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	SupplyRequestStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
