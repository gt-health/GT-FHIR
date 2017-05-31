
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum DiagnosticOrderStatusEnum {

	/**
	 * Display: <b>Proposed</b><br>
	 * Code Value: <b>proposed</b>
	 *
	 * The request has been proposed.
	 */
	PROPOSED("proposed", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Draft</b><br>
	 * Code Value: <b>draft</b>
	 *
	 * The request is in preliminary form prior to being sent.
	 */
	DRAFT("draft", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Planned</b><br>
	 * Code Value: <b>planned</b>
	 *
	 * The request has been planned.
	 */
	PLANNED("planned", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Requested</b><br>
	 * Code Value: <b>requested</b>
	 *
	 * The request has been placed.
	 */
	REQUESTED("requested", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Received</b><br>
	 * Code Value: <b>received</b>
	 *
	 * The receiving system has received the order, but not yet decided whether it will be performed.
	 */
	RECEIVED("received", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Accepted</b><br>
	 * Code Value: <b>accepted</b>
	 *
	 * The receiving system has accepted the order, but work has not yet commenced.
	 */
	ACCEPTED("accepted", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>In-Progress</b><br>
	 * Code Value: <b>in-progress</b>
	 *
	 * The work to fulfill the order is happening.
	 */
	IN_PROGRESS("in-progress", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Review</b><br>
	 * Code Value: <b>review</b>
	 *
	 * The work is complete, and the outcomes are being reviewed for approval.
	 */
	REVIEW("review", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * The work has been completed, the report(s) released, and no further work is planned.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Cancelled</b><br>
	 * Code Value: <b>cancelled</b>
	 *
	 * The request has been withdrawn.
	 */
	CANCELLED("cancelled", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Suspended</b><br>
	 * Code Value: <b>suspended</b>
	 *
	 * The request has been held by originating system/user request.
	 */
	SUSPENDED("suspended", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Rejected</b><br>
	 * Code Value: <b>rejected</b>
	 *
	 * The receiving system has declined to fulfill the request.
	 */
	REJECTED("rejected", "http://hl7.org/fhir/diagnostic-order-status"),
	
	/**
	 * Display: <b>Failed</b><br>
	 * Code Value: <b>failed</b>
	 *
	 * The diagnostic investigation was attempted, but due to some procedural error, it could not be completed.
	 */
	FAILED("failed", "http://hl7.org/fhir/diagnostic-order-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DiagnosticOrderStatus
	 */
	public static final String VALUESET_NAME = "DiagnosticOrderStatus";

	private static Map<String, DiagnosticOrderStatusEnum> CODE_TO_ENUM = new HashMap<String, DiagnosticOrderStatusEnum>();
	private static Map<String, Map<String, DiagnosticOrderStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DiagnosticOrderStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DiagnosticOrderStatusEnum next : DiagnosticOrderStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DiagnosticOrderStatusEnum>());
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
	public static DiagnosticOrderStatusEnum forCode(String theCode) {
		DiagnosticOrderStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DiagnosticOrderStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<DiagnosticOrderStatusEnum>() {
		@Override
		public String toCodeString(DiagnosticOrderStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DiagnosticOrderStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DiagnosticOrderStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DiagnosticOrderStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DiagnosticOrderStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DiagnosticOrderStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
