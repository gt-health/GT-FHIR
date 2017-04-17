
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum AuditEventParticipantNetworkTypeEnum {

	/**
	 * Display: <b>Machine Name</b><br>
	 * Code Value: <b>1</b>
	 *
	 * The machine name, including DNS name.
	 */
	MACHINE_NAME("1", "http://hl7.org/fhir/network-type"),
	
	/**
	 * Display: <b>IP Address</b><br>
	 * Code Value: <b>2</b>
	 *
	 * The assigned Internet Protocol (IP) address.
	 */
	IP_ADDRESS("2", "http://hl7.org/fhir/network-type"),
	
	/**
	 * Display: <b>Telephone Number</b><br>
	 * Code Value: <b>3</b>
	 *
	 * The assigned telephone number.
	 */
	TELEPHONE_NUMBER("3", "http://hl7.org/fhir/network-type"),
	
	/**
	 * Display: <b>Email address</b><br>
	 * Code Value: <b>4</b>
	 *
	 * The assigned email address.
	 */
	EMAIL_ADDRESS("4", "http://hl7.org/fhir/network-type"),
	
	/**
	 * Display: <b>URI</b><br>
	 * Code Value: <b>5</b>
	 *
	 * URI (User directory, HTTP-PUT, ftp, etc.).
	 */
	URI("5", "http://hl7.org/fhir/network-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AuditEventParticipantNetworkType
	 */
	public static final String VALUESET_NAME = "AuditEventParticipantNetworkType";

	private static Map<String, AuditEventParticipantNetworkTypeEnum> CODE_TO_ENUM = new HashMap<String, AuditEventParticipantNetworkTypeEnum>();
	private static Map<String, Map<String, AuditEventParticipantNetworkTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AuditEventParticipantNetworkTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AuditEventParticipantNetworkTypeEnum next : AuditEventParticipantNetworkTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AuditEventParticipantNetworkTypeEnum>());
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
	public static AuditEventParticipantNetworkTypeEnum forCode(String theCode) {
		AuditEventParticipantNetworkTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AuditEventParticipantNetworkTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<AuditEventParticipantNetworkTypeEnum>() {
		@Override
		public String toCodeString(AuditEventParticipantNetworkTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AuditEventParticipantNetworkTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AuditEventParticipantNetworkTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AuditEventParticipantNetworkTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AuditEventParticipantNetworkTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AuditEventParticipantNetworkTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
