
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ProvenanceEntityRoleEnum;

import java.util.HashMap;
import java.util.Map;

public enum ProvenanceEntityRoleEnum {

	/**
	 * Display: <b>Derivation</b><br>
	 * Code Value: <b>derivation</b>
	 *
	 * A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a preexisting entity.
	 */
	DERIVATION("derivation", "http://hl7.org/fhir/provenance-entity-role"),
	
	/**
	 * Display: <b>Revision</b><br>
	 * Code Value: <b>revision</b>
	 *
	 * A derivation for which the resulting entity is a revised version of some original.
	 */
	REVISION("revision", "http://hl7.org/fhir/provenance-entity-role"),
	
	/**
	 * Display: <b>Quotation</b><br>
	 * Code Value: <b>quotation</b>
	 *
	 * The repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author.
	 */
	QUOTATION("quotation", "http://hl7.org/fhir/provenance-entity-role"),
	
	/**
	 * Display: <b>Source</b><br>
	 * Code Value: <b>source</b>
	 *
	 * A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.
	 */
	SOURCE("source", "http://hl7.org/fhir/provenance-entity-role"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ProvenanceEntityRole
	 */
	public static final String VALUESET_NAME = "ProvenanceEntityRole";

	private static Map<String, ProvenanceEntityRoleEnum> CODE_TO_ENUM = new HashMap<String, ProvenanceEntityRoleEnum>();
	private static Map<String, Map<String, ProvenanceEntityRoleEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ProvenanceEntityRoleEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ProvenanceEntityRoleEnum next : ProvenanceEntityRoleEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ProvenanceEntityRoleEnum>());
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
	public static ProvenanceEntityRoleEnum forCode(String theCode) {
		ProvenanceEntityRoleEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ProvenanceEntityRoleEnum> VALUESET_BINDER = new IValueSetEnumBinder<ProvenanceEntityRoleEnum>() {
		@Override
		public String toCodeString(ProvenanceEntityRoleEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ProvenanceEntityRoleEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ProvenanceEntityRoleEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ProvenanceEntityRoleEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ProvenanceEntityRoleEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ProvenanceEntityRoleEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
