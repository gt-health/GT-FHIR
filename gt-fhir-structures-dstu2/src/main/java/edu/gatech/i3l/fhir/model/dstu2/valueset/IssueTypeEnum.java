
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.IssueTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum IssueTypeEnum {

	/**
	 * Display: <b>Invalid Content</b><br>
	 * Code Value: <b>invalid</b>
	 *
	 * Content invalid against the specification or a profile.
	 */
	INVALID_CONTENT("invalid", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Structural Issue</b><br>
	 * Code Value: <b>structure</b>
	 *
	 * A structural issue in the content such as wrong namespace, or unable to parse the content completely, or invalid json syntax.
	 */
	STRUCTURAL_ISSUE("structure", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Required element missing</b><br>
	 * Code Value: <b>required</b>
	 *
	 * A required element is missing.
	 */
	REQUIRED_ELEMENT_MISSING("required", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Element value invalid</b><br>
	 * Code Value: <b>value</b>
	 *
	 * An element value is invalid.
	 */
	ELEMENT_VALUE_INVALID("value", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Validation rule failed</b><br>
	 * Code Value: <b>invariant</b>
	 *
	 * A content validation rule failed - e.g. a schematron rule.
	 */
	VALIDATION_RULE_FAILED("invariant", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Security Problem</b><br>
	 * Code Value: <b>security</b>
	 *
	 * An authentication/authorization/permissions issue of some kind.
	 */
	SECURITY_PROBLEM("security", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Login Required</b><br>
	 * Code Value: <b>login</b>
	 *
	 * The client needs to initiate an authentication process.
	 */
	LOGIN_REQUIRED("login", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Unknown User</b><br>
	 * Code Value: <b>unknown</b>
	 *
	 * The user or system was not able to be authenticated (either there is no process, or the proferred token is unacceptable).
	 */
	UNKNOWN_USER("unknown", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Session Expired</b><br>
	 * Code Value: <b>expired</b>
	 *
	 * User session expired; a login may be required.
	 */
	SESSION_EXPIRED("expired", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Forbidden</b><br>
	 * Code Value: <b>forbidden</b>
	 *
	 * The user does not have the rights to perform this action.
	 */
	FORBIDDEN("forbidden", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Information  Suppressed</b><br>
	 * Code Value: <b>suppressed</b>
	 *
	 * Some information was not or may not have been returned due to business rules, consent or privacy rules, or access permission constraints.  This information may be accessible through alternate processes.
	 */
	INFORMATION__SUPPRESSED("suppressed", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Processing Failure</b><br>
	 * Code Value: <b>processing</b>
	 *
	 * Processing issues. These are expected to be final e.g. there is no point resubmitting the same content unchanged.
	 */
	PROCESSING_FAILURE("processing", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Content not supported</b><br>
	 * Code Value: <b>not-supported</b>
	 *
	 * The resource or profile is not supported.
	 */
	CONTENT_NOT_SUPPORTED("not-supported", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Duplicate</b><br>
	 * Code Value: <b>duplicate</b>
	 *
	 * An attempt was made to create a duplicate record.
	 */
	DUPLICATE("duplicate", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Not Found</b><br>
	 * Code Value: <b>not-found</b>
	 *
	 * The reference provided was not found. In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the content is not found further into the application architecture.
	 */
	NOT_FOUND("not-found", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Content Too Long</b><br>
	 * Code Value: <b>too-long</b>
	 *
	 * Provided content is too long (typically, this is a denial of service protection type of error).
	 */
	CONTENT_TOO_LONG("too-long", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Invalid Code</b><br>
	 * Code Value: <b>code-invalid</b>
	 *
	 * The code or system could not be understood, or it was not valid in the context of a particular ValueSet.code.
	 */
	INVALID_CODE("code-invalid", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Unacceptable Extension</b><br>
	 * Code Value: <b>extension</b>
	 *
	 * An extension was found that was not acceptable, could not be resolved, or a modifierExtension was not recognized.
	 */
	UNACCEPTABLE_EXTENSION("extension", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Operation Too Costly</b><br>
	 * Code Value: <b>too-costly</b>
	 *
	 * The operation was stopped to protect server resources; e.g. a request for a value set expansion on all of SNOMED CT.
	 */
	OPERATION_TOO_COSTLY("too-costly", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Business Rule Violation</b><br>
	 * Code Value: <b>business-rule</b>
	 *
	 * The content/operation failed to pass some business rule, and so could not proceed.
	 */
	BUSINESS_RULE_VIOLATION("business-rule", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Edit Version Conflict</b><br>
	 * Code Value: <b>conflict</b>
	 *
	 * Content could not be accepted because of an edit conflict (i.e. version aware updates) (In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the conflict is discovered further into the application architecture.)
	 */
	EDIT_VERSION_CONFLICT("conflict", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Incomplete Results</b><br>
	 * Code Value: <b>incomplete</b>
	 *
	 * Not all data sources typically accessed could be reached, or responded in time, so the returned information may not be complete.
	 */
	INCOMPLETE_RESULTS("incomplete", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Transient Issue</b><br>
	 * Code Value: <b>transient</b>
	 *
	 * Transient processing issues. The system receiving the error may be able to resubmit the same content once an underlying issue is resolved.
	 */
	TRANSIENT_ISSUE("transient", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Lock Error</b><br>
	 * Code Value: <b>lock-error</b>
	 *
	 * A resource/record locking failure (usually in an underlying database).
	 */
	LOCK_ERROR("lock-error", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>No Store Available</b><br>
	 * Code Value: <b>no-store</b>
	 *
	 * The persistent store is unavailable; e.g. the database is down for maintenance or similar action.
	 */
	NO_STORE_AVAILABLE("no-store", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Exception</b><br>
	 * Code Value: <b>exception</b>
	 *
	 * An unexpected internal error has occurred.
	 */
	EXCEPTION("exception", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Timeout</b><br>
	 * Code Value: <b>timeout</b>
	 *
	 * An internal timeout has occurred.
	 */
	TIMEOUT("timeout", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Throttled</b><br>
	 * Code Value: <b>throttled</b>
	 *
	 * The system is not prepared to handle this request due to load management.
	 */
	THROTTLED("throttled", "http://hl7.org/fhir/issue-type"),
	
	/**
	 * Display: <b>Informational Note</b><br>
	 * Code Value: <b>informational</b>
	 *
	 * A message unrelated to the processing success of the completed operation (examples of the latter include things like reminders of password expiry, system maintenance times, etc.).
	 */
	INFORMATIONAL_NOTE("informational", "http://hl7.org/fhir/issue-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * IssueType
	 */
	public static final String VALUESET_NAME = "IssueType";

	private static Map<String, IssueTypeEnum> CODE_TO_ENUM = new HashMap<String, IssueTypeEnum>();
	private static Map<String, Map<String, IssueTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, IssueTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (IssueTypeEnum next : IssueTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, IssueTypeEnum>());
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
	public static IssueTypeEnum forCode(String theCode) {
		IssueTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<IssueTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<IssueTypeEnum>() {
		@Override
		public String toCodeString(IssueTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(IssueTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public IssueTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public IssueTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, IssueTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	IssueTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
