
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum IdentifierTypeCodesEnum {

	/**
	 * Display: <b>Universal Device Identifier</b><br>
	 * Code Value: <b>UDI</b>
	 *
	 * A identifier assigned to a device using the Universal Device Identifier framework as defined by FDA (http://www.fda.gov/MedicalDevices/DeviceRegulationandGuidance/UniqueDeviceIdentification/).
	 */
	UNIVERSAL_DEVICE_IDENTIFIER("UDI", "http://hl7.org/fhir/identifier-type"),
	
	/**
	 * Display: <b>Serial Number</b><br>
	 * Code Value: <b>SNO</b>
	 *
	 * An identifier affixed to an item by the manufacturer when it is first made, where each item has a different identifier.
	 */
	SERIAL_NUMBER("SNO", "http://hl7.org/fhir/identifier-type"),
	
	/**
	 * Display: <b>Social Beneficiary Identifier</b><br>
	 * Code Value: <b>SB</b>
	 *
	 * An identifier issued by a governmental organization to an individual for the purpose of the receipt of social services and benefits.
	 */
	SOCIAL_BENEFICIARY_IDENTIFIER("SB", "http://hl7.org/fhir/identifier-type"),
	
	/**
	 * Display: <b>Placer Identifier</b><br>
	 * Code Value: <b>PLAC</b>
	 *
	 * The identifier associated with the person or service that requests or places an order.
	 */
	PLACER_IDENTIFIER("PLAC", "http://hl7.org/fhir/identifier-type"),
	
	/**
	 * Display: <b>Filler Identifier</b><br>
	 * Code Value: <b>FILL</b>
	 *
	 * The Identifier associated with the person, or service, who produces the observations or fulfills the order requested by the requestor.
	 */
	FILLER_IDENTIFIER("FILL", "http://hl7.org/fhir/identifier-type"),
	
	/**
	 * Code Value: <b>DL</b>
	 */
	DL("DL", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>PPN</b>
	 */
	PPN("PPN", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>BRN</b>
	 */
	BRN("BRN", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>MR</b>
	 */
	MR("MR", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>MCN</b>
	 */
	MCN("MCN", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>EN</b>
	 */
	EN("EN", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>TAX</b>
	 */
	TAX("TAX", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>NIIP</b>
	 */
	NIIP("NIIP", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>PRN</b>
	 */
	PRN("PRN", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>MD</b>
	 */
	MD("MD", "http://hl7.org/fhir/v2/0203"),
	
	/**
	 * Code Value: <b>DR</b>
	 */
	DR("DR", "http://hl7.org/fhir/v2/0203"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * Identifier Type Codes
	 */
	public static final String VALUESET_NAME = "Identifier Type Codes";

	private static Map<String, IdentifierTypeCodesEnum> CODE_TO_ENUM = new HashMap<String, IdentifierTypeCodesEnum>();
	private static Map<String, Map<String, IdentifierTypeCodesEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, IdentifierTypeCodesEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (IdentifierTypeCodesEnum next : IdentifierTypeCodesEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, IdentifierTypeCodesEnum>());
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
	public static IdentifierTypeCodesEnum forCode(String theCode) {
		IdentifierTypeCodesEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<IdentifierTypeCodesEnum> VALUESET_BINDER = new IValueSetEnumBinder<IdentifierTypeCodesEnum>() {
		@Override
		public String toCodeString(IdentifierTypeCodesEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(IdentifierTypeCodesEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public IdentifierTypeCodesEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public IdentifierTypeCodesEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, IdentifierTypeCodesEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	IdentifierTypeCodesEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
