
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum BundleTypeEnum {

	/**
	 * Display: <b>Document</b><br>
	 * Code Value: <b>document</b>
	 *
	 * The bundle is a document. The first resource is a Composition.
	 */
	DOCUMENT("document", "http://hl7.org/fhir/bundle-type"),
	
	/**
	 * Display: <b>Message</b><br>
	 * Code Value: <b>message</b>
	 *
	 * The bundle is a message. The first resource is a MessageHeader.
	 */
	MESSAGE("message", "http://hl7.org/fhir/bundle-type"),
	
	/**
	 * Display: <b>Transaction</b><br>
	 * Code Value: <b>transaction</b>
	 *
	 * The bundle is a transaction - intended to be processed by a server as an atomic commit.
	 */
	TRANSACTION("transaction", "http://hl7.org/fhir/bundle-type"),
	
	/**
	 * Display: <b>Transaction Response</b><br>
	 * Code Value: <b>transaction-response</b>
	 *
	 * The bundle is a transaction response. Because the response is a transaction response, the transactionhas succeeded, and all responses are error free.
	 */
	TRANSACTION_RESPONSE("transaction-response", "http://hl7.org/fhir/bundle-type"),
	
	/**
	 * Display: <b>Batch</b><br>
	 * Code Value: <b>batch</b>
	 *
	 * The bundle is a transaction - intended to be processed by a server as a group of actions.
	 */
	BATCH("batch", "http://hl7.org/fhir/bundle-type"),
	
	/**
	 * Display: <b>Batch Response</b><br>
	 * Code Value: <b>batch-response</b>
	 *
	 * The bundle is a batch response. Note that as a batch, some responses may indicate failure and others success.
	 */
	BATCH_RESPONSE("batch-response", "http://hl7.org/fhir/bundle-type"),
	
	/**
	 * Display: <b>History List</b><br>
	 * Code Value: <b>history</b>
	 *
	 * The bundle is a list of resources from a history interaction on a server.
	 */
	HISTORY_LIST("history", "http://hl7.org/fhir/bundle-type"),
	
	/**
	 * Display: <b>Search Results</b><br>
	 * Code Value: <b>searchset</b>
	 *
	 * The bundle is a list of resources returned as a result of a search/query interaction, operation, or message.
	 */
	SEARCH_RESULTS("searchset", "http://hl7.org/fhir/bundle-type"),
	
	/**
	 * Display: <b>Collection</b><br>
	 * Code Value: <b>collection</b>
	 *
	 * The bundle is a set of resources collected into a single document for ease of distribution.
	 */
	COLLECTION("collection", "http://hl7.org/fhir/bundle-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * BundleType
	 */
	public static final String VALUESET_NAME = "BundleType";

	private static Map<String, BundleTypeEnum> CODE_TO_ENUM = new HashMap<String, BundleTypeEnum>();
	private static Map<String, Map<String, BundleTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, BundleTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (BundleTypeEnum next : BundleTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, BundleTypeEnum>());
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
	public static BundleTypeEnum forCode(String theCode) {
		BundleTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<BundleTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<BundleTypeEnum>() {
		@Override
		public String toCodeString(BundleTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(BundleTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public BundleTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public BundleTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, BundleTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	BundleTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
