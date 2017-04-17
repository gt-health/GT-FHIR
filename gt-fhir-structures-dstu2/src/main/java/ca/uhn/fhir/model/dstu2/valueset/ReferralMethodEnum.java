
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ReferralMethodEnum {

	/**
	 * Display: <b>Fax</b><br>
	 * Code Value: <b>fax</b>
	 *
	 * Referrals may be accepted by fax.
	 */
	FAX("fax", "http://hl7.org/fhir/service-referral-method"),
	
	/**
	 * Display: <b>Phone</b><br>
	 * Code Value: <b>phone</b>
	 *
	 * Referrals may be accepted over the phone from a practitioner.
	 */
	PHONE("phone", "http://hl7.org/fhir/service-referral-method"),
	
	/**
	 * Display: <b>Secure Messaging</b><br>
	 * Code Value: <b>elec</b>
	 *
	 * Referrals may be accepted via a secure messaging system. To determine the types of secure messaging systems supported, refer to the identifiers collection. Callers will need to understand the specific identifier system used to know that they are able to transmit messages.
	 */
	SECURE_MESSAGING("elec", "http://hl7.org/fhir/service-referral-method"),
	
	/**
	 * Display: <b>Secure Email</b><br>
	 * Code Value: <b>semail</b>
	 *
	 * Referrals may be accepted via a secure email. To send please enrypt with the services public key.
	 */
	SECURE_EMAIL("semail", "http://hl7.org/fhir/service-referral-method"),
	
	/**
	 * Display: <b>Mail</b><br>
	 * Code Value: <b>mail</b>
	 *
	 * Referrals may be accepted via regular postage (or hand delivered).
	 */
	MAIL("mail", "http://hl7.org/fhir/service-referral-method"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ReferralMethod
	 */
	public static final String VALUESET_NAME = "ReferralMethod";

	private static Map<String, ReferralMethodEnum> CODE_TO_ENUM = new HashMap<String, ReferralMethodEnum>();
	private static Map<String, Map<String, ReferralMethodEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ReferralMethodEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ReferralMethodEnum next : ReferralMethodEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ReferralMethodEnum>());
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
	public static ReferralMethodEnum forCode(String theCode) {
		ReferralMethodEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ReferralMethodEnum> VALUESET_BINDER = new IValueSetEnumBinder<ReferralMethodEnum>() {
		@Override
		public String toCodeString(ReferralMethodEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ReferralMethodEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ReferralMethodEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ReferralMethodEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ReferralMethodEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ReferralMethodEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
