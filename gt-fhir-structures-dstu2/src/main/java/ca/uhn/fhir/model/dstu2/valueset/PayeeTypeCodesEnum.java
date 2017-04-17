
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum PayeeTypeCodesEnum {

	/**
	 * Code Value: <b>subscriber</b>
	 */
	SUBSCRIBER("subscriber", "http://hl7.org/fhir/payeetype"),
	
	/**
	 * Code Value: <b>provider</b>
	 */
	PROVIDER("provider", "http://hl7.org/fhir/payeetype"),
	
	/**
	 * Code Value: <b>other</b>
	 */
	OTHER("other", "http://hl7.org/fhir/payeetype"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * Payee Type Codes
	 */
	public static final String VALUESET_NAME = "Payee Type Codes";

	private static Map<String, PayeeTypeCodesEnum> CODE_TO_ENUM = new HashMap<String, PayeeTypeCodesEnum>();
	private static Map<String, Map<String, PayeeTypeCodesEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, PayeeTypeCodesEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (PayeeTypeCodesEnum next : PayeeTypeCodesEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, PayeeTypeCodesEnum>());
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
	public static PayeeTypeCodesEnum forCode(String theCode) {
		PayeeTypeCodesEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<PayeeTypeCodesEnum> VALUESET_BINDER = new IValueSetEnumBinder<PayeeTypeCodesEnum>() {
		@Override
		public String toCodeString(PayeeTypeCodesEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(PayeeTypeCodesEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public PayeeTypeCodesEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public PayeeTypeCodesEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, PayeeTypeCodesEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	PayeeTypeCodesEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
