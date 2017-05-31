
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.DiagnosticReportStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum DiagnosticReportStatusEnum {

	/**
	 * Display: <b>Registered</b><br>
	 * Code Value: <b>registered</b>
	 *
	 * The existence of the report is registered, but there is nothing yet available.
	 */
	REGISTERED("registered", "http://hl7.org/fhir/diagnostic-report-status"),
	
	/**
	 * Display: <b>Partial</b><br>
	 * Code Value: <b>partial</b>
	 *
	 * This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.
	 */
	PARTIAL("partial", "http://hl7.org/fhir/diagnostic-report-status"),
	
	/**
	 * Display: <b>Final</b><br>
	 * Code Value: <b>final</b>
	 *
	 * The report is complete and verified by an authorized person.
	 */
	FINAL("final", "http://hl7.org/fhir/diagnostic-report-status"),
	
	/**
	 * Display: <b>Corrected</b><br>
	 * Code Value: <b>corrected</b>
	 *
	 * The report has been modified subsequent to being Final, and is complete and verified by an authorized person. New content has been added, but existing content hasn't changed
	 */
	CORRECTED("corrected", "http://hl7.org/fhir/diagnostic-report-status"),
	
	/**
	 * Display: <b>Appended</b><br>
	 * Code Value: <b>appended</b>
	 *
	 * The report has been modified subsequent to being Final, and is complete and verified by an authorized person. New content has been added, but existing content hasn't changed.
	 */
	APPENDED("appended", "http://hl7.org/fhir/diagnostic-report-status"),
	
	/**
	 * Display: <b>Cancelled</b><br>
	 * Code Value: <b>cancelled</b>
	 *
	 * The report is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
	 */
	CANCELLED("cancelled", "http://hl7.org/fhir/diagnostic-report-status"),
	
	/**
	 * Display: <b>Entered in Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The report has been withdrawn following a previous final release.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/diagnostic-report-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DiagnosticReportStatus
	 */
	public static final String VALUESET_NAME = "DiagnosticReportStatus";

	private static Map<String, DiagnosticReportStatusEnum> CODE_TO_ENUM = new HashMap<String, DiagnosticReportStatusEnum>();
	private static Map<String, Map<String, DiagnosticReportStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DiagnosticReportStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DiagnosticReportStatusEnum next : DiagnosticReportStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DiagnosticReportStatusEnum>());
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
	public static DiagnosticReportStatusEnum forCode(String theCode) {
		DiagnosticReportStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DiagnosticReportStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<DiagnosticReportStatusEnum>() {
		@Override
		public String toCodeString(DiagnosticReportStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DiagnosticReportStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DiagnosticReportStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DiagnosticReportStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DiagnosticReportStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DiagnosticReportStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
