
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.OrderStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum OrderStatusEnum {

	/**
	 * Display: <b>Pending</b><br>
	 * Code Value: <b>pending</b>
	 *
	 * The order is known, but no processing has occurred at this time
	 */
	PENDING("pending", "http://hl7.org/fhir/order-status"),
	
	/**
	 * Display: <b>Review</b><br>
	 * Code Value: <b>review</b>
	 *
	 * The order is undergoing initial processing to determine whether it will be accepted (usually this involves human review)
	 */
	REVIEW("review", "http://hl7.org/fhir/order-status"),
	
	/**
	 * Display: <b>Rejected</b><br>
	 * Code Value: <b>rejected</b>
	 *
	 * The order was rejected because of a workflow/business logic reason
	 */
	REJECTED("rejected", "http://hl7.org/fhir/order-status"),
	
	/**
	 * Display: <b>Error</b><br>
	 * Code Value: <b>error</b>
	 *
	 * The order was unable to be processed because of a technical error (i.e. unexpected error)
	 */
	ERROR("error", "http://hl7.org/fhir/order-status"),
	
	/**
	 * Display: <b>Accepted</b><br>
	 * Code Value: <b>accepted</b>
	 *
	 * The order has been accepted, and work is in progress.
	 */
	ACCEPTED("accepted", "http://hl7.org/fhir/order-status"),
	
	/**
	 * Display: <b>Cancelled</b><br>
	 * Code Value: <b>cancelled</b>
	 *
	 * Processing the order was halted at the initiators request.
	 */
	CANCELLED("cancelled", "http://hl7.org/fhir/order-status"),
	
	/**
	 * Display: <b>Replaced</b><br>
	 * Code Value: <b>replaced</b>
	 *
	 * The order has been cancelled and replaced by another.
	 */
	REPLACED("replaced", "http://hl7.org/fhir/order-status"),
	
	/**
	 * Display: <b>Aborted</b><br>
	 * Code Value: <b>aborted</b>
	 *
	 * Processing the order was stopped because of some workflow/business logic reason.
	 */
	ABORTED("aborted", "http://hl7.org/fhir/order-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * The order has been completed.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/order-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * OrderStatus
	 */
	public static final String VALUESET_NAME = "OrderStatus";

	private static Map<String, OrderStatusEnum> CODE_TO_ENUM = new HashMap<String, OrderStatusEnum>();
	private static Map<String, Map<String, OrderStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, OrderStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (OrderStatusEnum next : OrderStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, OrderStatusEnum>());
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
	public static OrderStatusEnum forCode(String theCode) {
		OrderStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<OrderStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<OrderStatusEnum>() {
		@Override
		public String toCodeString(OrderStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(OrderStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public OrderStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public OrderStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, OrderStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	OrderStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
