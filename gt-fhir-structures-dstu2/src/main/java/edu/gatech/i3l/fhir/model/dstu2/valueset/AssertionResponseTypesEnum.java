
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AssertionResponseTypesEnum;

import java.util.HashMap;
import java.util.Map;

public enum AssertionResponseTypesEnum {

	/**
	 * Display: <b>okay</b><br>
	 * Code Value: <b>okay</b>
	 *
	 * Response code is 200.
	 */
	OKAY("okay", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>created</b><br>
	 * Code Value: <b>created</b>
	 *
	 * Response code is 201.
	 */
	CREATED("created", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>noContent</b><br>
	 * Code Value: <b>noContent</b>
	 *
	 * Response code is 204.
	 */
	NOCONTENT("noContent", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>notModified</b><br>
	 * Code Value: <b>notModified</b>
	 *
	 * Response code is 304.
	 */
	NOTMODIFIED("notModified", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>bad</b><br>
	 * Code Value: <b>bad</b>
	 *
	 * Response code is 400.
	 */
	BAD("bad", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>forbidden</b><br>
	 * Code Value: <b>forbidden</b>
	 *
	 * Response code is 403.
	 */
	FORBIDDEN("forbidden", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>notFound</b><br>
	 * Code Value: <b>notFound</b>
	 *
	 * Response code is 404.
	 */
	NOTFOUND("notFound", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>methodNotAllowed</b><br>
	 * Code Value: <b>methodNotAllowed</b>
	 *
	 * Response code is 405.
	 */
	METHODNOTALLOWED("methodNotAllowed", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>conflict</b><br>
	 * Code Value: <b>conflict</b>
	 *
	 * Response code is 409.
	 */
	CONFLICT("conflict", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>gone</b><br>
	 * Code Value: <b>gone</b>
	 *
	 * Response code is 410.
	 */
	GONE("gone", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>preconditionFailed</b><br>
	 * Code Value: <b>preconditionFailed</b>
	 *
	 * Response code is 412.
	 */
	PRECONDITIONFAILED("preconditionFailed", "http://hl7.org/fhir/assert-response-code-types"),
	
	/**
	 * Display: <b>unprocessable</b><br>
	 * Code Value: <b>unprocessable</b>
	 *
	 * Response code is 422.
	 */
	UNPROCESSABLE("unprocessable", "http://hl7.org/fhir/assert-response-code-types"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AssertionResponseTypes
	 */
	public static final String VALUESET_NAME = "AssertionResponseTypes";

	private static Map<String, AssertionResponseTypesEnum> CODE_TO_ENUM = new HashMap<String, AssertionResponseTypesEnum>();
	private static Map<String, Map<String, AssertionResponseTypesEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AssertionResponseTypesEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AssertionResponseTypesEnum next : AssertionResponseTypesEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AssertionResponseTypesEnum>());
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
	public static AssertionResponseTypesEnum forCode(String theCode) {
		AssertionResponseTypesEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AssertionResponseTypesEnum> VALUESET_BINDER = new IValueSetEnumBinder<AssertionResponseTypesEnum>() {
		@Override
		public String toCodeString(AssertionResponseTypesEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AssertionResponseTypesEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AssertionResponseTypesEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AssertionResponseTypesEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AssertionResponseTypesEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AssertionResponseTypesEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
