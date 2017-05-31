
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.TransactionModeEnum;

import java.util.HashMap;
import java.util.Map;

public enum TransactionModeEnum {

	/**
	 * Display: <b>None</b><br>
	 * Code Value: <b>not-supported</b>
	 *
	 * Neither batch or transaction is supported.
	 */
	NONE("not-supported", "http://hl7.org/fhir/transaction-mode"),
	
	/**
	 * Display: <b>Batches supported</b><br>
	 * Code Value: <b>batch</b>
	 *
	 * Batches are  supported.
	 */
	BATCHES_SUPPORTED("batch", "http://hl7.org/fhir/transaction-mode"),
	
	/**
	 * Display: <b>Transactions Supported</b><br>
	 * Code Value: <b>transaction</b>
	 *
	 * Transactions are supported.
	 */
	TRANSACTIONS_SUPPORTED("transaction", "http://hl7.org/fhir/transaction-mode"),
	
	/**
	 * Display: <b>Batches &amp; Transactions</b><br>
	 * Code Value: <b>both</b>
	 *
	 * Both batches and transactions are supported.
	 */
	BATCHES___TRANSACTIONS("both", "http://hl7.org/fhir/transaction-mode"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * TransactionMode
	 */
	public static final String VALUESET_NAME = "TransactionMode";

	private static Map<String, TransactionModeEnum> CODE_TO_ENUM = new HashMap<String, TransactionModeEnum>();
	private static Map<String, Map<String, TransactionModeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, TransactionModeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (TransactionModeEnum next : TransactionModeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, TransactionModeEnum>());
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
	public static TransactionModeEnum forCode(String theCode) {
		TransactionModeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<TransactionModeEnum> VALUESET_BINDER = new IValueSetEnumBinder<TransactionModeEnum>() {
		@Override
		public String toCodeString(TransactionModeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(TransactionModeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public TransactionModeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public TransactionModeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, TransactionModeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	TransactionModeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
