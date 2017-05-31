
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AccountStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum AccountStatusEnum {

	/**
	 * Display: <b>Active</b><br>
	 * Code Value: <b>active</b>
	 *
	 * This account is active and may be used.
	 */
	ACTIVE("active", "http://hl7.org/fhir/account-status"),
	
	/**
	 * Display: <b>Inactive</b><br>
	 * Code Value: <b>inactive</b>
	 *
	 * This account is inactive and should not be used to track financial information.
	 */
	INACTIVE("inactive", "http://hl7.org/fhir/account-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AccountStatus
	 */
	public static final String VALUESET_NAME = "AccountStatus";

	private static Map<String, AccountStatusEnum> CODE_TO_ENUM = new HashMap<String, AccountStatusEnum>();
	private static Map<String, Map<String, AccountStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AccountStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AccountStatusEnum next : AccountStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AccountStatusEnum>());
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
	public static AccountStatusEnum forCode(String theCode) {
		AccountStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AccountStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<AccountStatusEnum>() {
		@Override
		public String toCodeString(AccountStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AccountStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AccountStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AccountStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AccountStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AccountStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
