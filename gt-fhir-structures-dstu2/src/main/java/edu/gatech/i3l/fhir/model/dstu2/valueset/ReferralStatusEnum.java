
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ReferralStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum ReferralStatusEnum {

	/**
	 * Display: <b>Draft</b><br>
	 * Code Value: <b>draft</b>
	 *
	 * A draft referral that has yet to be send.
	 */
	DRAFT("draft", "http://hl7.org/fhir/referralstatus"),
	
	/**
	 * Display: <b>Requested</b><br>
	 * Code Value: <b>requested</b>
	 *
	 * The referral has been transmitted, but not yet acknowledged by the recipient.
	 */
	REQUESTED("requested", "http://hl7.org/fhir/referralstatus"),
	
	/**
	 * Display: <b>Active</b><br>
	 * Code Value: <b>active</b>
	 *
	 * The referral has been acknowledged by the recipient, and is in the process of being actioned.
	 */
	ACTIVE("active", "http://hl7.org/fhir/referralstatus"),
	
	/**
	 * Display: <b>Cancelled</b><br>
	 * Code Value: <b>cancelled</b>
	 *
	 * The referral has been cancelled without being completed. For example it is no longer needed.
	 */
	CANCELLED("cancelled", "http://hl7.org/fhir/referralstatus"),
	
	/**
	 * Display: <b>Accepted</b><br>
	 * Code Value: <b>accepted</b>
	 *
	 * The recipient has agreed to deliver the care requested by the referral.
	 */
	ACCEPTED("accepted", "http://hl7.org/fhir/referralstatus"),
	
	/**
	 * Display: <b>Rejected</b><br>
	 * Code Value: <b>rejected</b>
	 *
	 * The recipient has declined to accept the referral.
	 */
	REJECTED("rejected", "http://hl7.org/fhir/referralstatus"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * The referral has been completely actioned.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/referralstatus"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ReferralStatus
	 */
	public static final String VALUESET_NAME = "ReferralStatus";

	private static Map<String, ReferralStatusEnum> CODE_TO_ENUM = new HashMap<String, ReferralStatusEnum>();
	private static Map<String, Map<String, ReferralStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ReferralStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ReferralStatusEnum next : ReferralStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ReferralStatusEnum>());
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
	public static ReferralStatusEnum forCode(String theCode) {
		ReferralStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ReferralStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<ReferralStatusEnum>() {
		@Override
		public String toCodeString(ReferralStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ReferralStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ReferralStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ReferralStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ReferralStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ReferralStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
