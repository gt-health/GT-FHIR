
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AddressTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum AddressTypeEnum {

	/**
	 * Display: <b>Postal</b><br>
	 * Code Value: <b>postal</b>
	 *
	 * Mailing addresses - PO Boxes and care-of addresses.
	 */
	POSTAL("postal", "http://hl7.org/fhir/address-type"),
	
	/**
	 * Display: <b>Physical</b><br>
	 * Code Value: <b>physical</b>
	 *
	 * A physical address that can be visited.
	 */
	PHYSICAL("physical", "http://hl7.org/fhir/address-type"),
	
	/**
	 * Display: <b>Postal &amp; Physical</b><br>
	 * Code Value: <b>both</b>
	 *
	 * An address that is both physical and postal.
	 */
	POSTAL___PHYSICAL("both", "http://hl7.org/fhir/address-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AddressType
	 */
	public static final String VALUESET_NAME = "AddressType";

	private static Map<String, AddressTypeEnum> CODE_TO_ENUM = new HashMap<String, AddressTypeEnum>();
	private static Map<String, Map<String, AddressTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AddressTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AddressTypeEnum next : AddressTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AddressTypeEnum>());
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
	public static AddressTypeEnum forCode(String theCode) {
		AddressTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AddressTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<AddressTypeEnum>() {
		@Override
		public String toCodeString(AddressTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AddressTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AddressTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AddressTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AddressTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AddressTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
