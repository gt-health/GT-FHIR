
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AuditEventObjectLifecycleEnum;

import java.util.HashMap;
import java.util.Map;

public enum AuditEventObjectLifecycleEnum {

	/**
	 * Display: <b>Origination / Creation</b><br>
	 * Code Value: <b>1</b>
	 *
	 * Origination / Creation
	 */
	ORIGINATION___CREATION("1", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Import / Copy from original</b><br>
	 * Code Value: <b>2</b>
	 *
	 * Import / Copy from original
	 */
	IMPORT___COPY_FROM_ORIGINAL("2", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Amendment</b><br>
	 * Code Value: <b>3</b>
	 *
	 * Amendment
	 */
	AMENDMENT("3", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Verification</b><br>
	 * Code Value: <b>4</b>
	 *
	 * Verification
	 */
	VERIFICATION("4", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Translation</b><br>
	 * Code Value: <b>5</b>
	 *
	 * Translation
	 */
	TRANSLATION("5", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Access / Use</b><br>
	 * Code Value: <b>6</b>
	 *
	 * Access / Use
	 */
	ACCESS___USE("6", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>De-identification</b><br>
	 * Code Value: <b>7</b>
	 *
	 * De-identification
	 */
	DE_IDENTIFICATION("7", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Aggregation, summarization, derivation</b><br>
	 * Code Value: <b>8</b>
	 *
	 * Aggregation, summarization, derivation
	 */
	AGGREGATION__SUMMARIZATION__DERIVATION("8", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Report</b><br>
	 * Code Value: <b>9</b>
	 *
	 * Report
	 */
	REPORT("9", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Export / Copy to target</b><br>
	 * Code Value: <b>10</b>
	 *
	 * Export / Copy to target
	 */
	EXPORT___COPY_TO_TARGET("10", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Disclosure</b><br>
	 * Code Value: <b>11</b>
	 *
	 * Disclosure
	 */
	DISCLOSURE("11", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Receipt of disclosure</b><br>
	 * Code Value: <b>12</b>
	 *
	 * Receipt of disclosure
	 */
	RECEIPT_OF_DISCLOSURE("12", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Archiving</b><br>
	 * Code Value: <b>13</b>
	 *
	 * Archiving
	 */
	ARCHIVING("13", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Logical deletion</b><br>
	 * Code Value: <b>14</b>
	 *
	 * Logical deletion
	 */
	LOGICAL_DELETION("14", "http://hl7.org/fhir/object-lifecycle"),
	
	/**
	 * Display: <b>Permanent erasure / Physical destruction</b><br>
	 * Code Value: <b>15</b>
	 *
	 * Permanent erasure / Physical destruction
	 */
	PERMANENT_ERASURE___PHYSICAL_DESTRUCTION("15", "http://hl7.org/fhir/object-lifecycle"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AuditEventObjectLifecycle
	 */
	public static final String VALUESET_NAME = "AuditEventObjectLifecycle";

	private static Map<String, AuditEventObjectLifecycleEnum> CODE_TO_ENUM = new HashMap<String, AuditEventObjectLifecycleEnum>();
	private static Map<String, Map<String, AuditEventObjectLifecycleEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AuditEventObjectLifecycleEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AuditEventObjectLifecycleEnum next : AuditEventObjectLifecycleEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AuditEventObjectLifecycleEnum>());
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
	public static AuditEventObjectLifecycleEnum forCode(String theCode) {
		AuditEventObjectLifecycleEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AuditEventObjectLifecycleEnum> VALUESET_BINDER = new IValueSetEnumBinder<AuditEventObjectLifecycleEnum>() {
		@Override
		public String toCodeString(AuditEventObjectLifecycleEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AuditEventObjectLifecycleEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AuditEventObjectLifecycleEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AuditEventObjectLifecycleEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AuditEventObjectLifecycleEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AuditEventObjectLifecycleEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
