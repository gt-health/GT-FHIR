
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum SubstanceCategoryCodesEnum {

	/**
	 * Display: <b>Allergen</b><br>
	 * Code Value: <b>allergen</b>
	 *
	 * A substance that causes an allergic reaction.
	 */
	ALLERGEN("allergen", "http://hl7.org/fhir/substance-category"),
	
	/**
	 * Display: <b>Biological Substance</b><br>
	 * Code Value: <b>biological</b>
	 *
	 * A substance that is produced by or extracted from a biological source.
	 */
	BIOLOGICAL_SUBSTANCE("biological", "http://hl7.org/fhir/substance-category"),
	
	/**
	 * Display: <b>Body Substance</b><br>
	 * Code Value: <b>body</b>
	 *
	 * A substance that comes directly from a human or an animal (e.g. blood, urine, feces, tears, etc.).
	 */
	BODY_SUBSTANCE("body", "http://hl7.org/fhir/substance-category"),
	
	/**
	 * Display: <b>Chemical</b><br>
	 * Code Value: <b>chemical</b>
	 *
	 * Any organic or inorganic substance of a particular molecular identity, including -- (i) any combination of such substances occurring in whole or in part as a result of a chemical reaction or occurring in nature and (ii) any element or uncombined radical (http://www.epa.gov/opptintr/import-export/pubs/importguide.pdf).
	 */
	CHEMICAL("chemical", "http://hl7.org/fhir/substance-category"),
	
	/**
	 * Display: <b>Dietary Substance</b><br>
	 * Code Value: <b>food</b>
	 *
	 * A food, dietary ingredient, or dietary supplement for human or animal.
	 */
	DIETARY_SUBSTANCE("food", "http://hl7.org/fhir/substance-category"),
	
	/**
	 * Display: <b>Drug or Medicament</b><br>
	 * Code Value: <b>drug</b>
	 *
	 * A substance intended for use in the diagnosis, cure, mitigation, treatment, or prevention of disease in man or other animals (Federal Food Drug and Cosmetic Act).
	 */
	DRUG_OR_MEDICAMENT("drug", "http://hl7.org/fhir/substance-category"),
	
	/**
	 * Display: <b>Material</b><br>
	 * Code Value: <b>material</b>
	 *
	 * A finished product which is not normally ingested, absorbed or injected (e.g. steel, iron, wood, plastic and paper).
	 */
	MATERIAL("material", "http://hl7.org/fhir/substance-category"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * Substance Category Codes
	 */
	public static final String VALUESET_NAME = "Substance Category Codes";

	private static Map<String, SubstanceCategoryCodesEnum> CODE_TO_ENUM = new HashMap<String, SubstanceCategoryCodesEnum>();
	private static Map<String, Map<String, SubstanceCategoryCodesEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, SubstanceCategoryCodesEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (SubstanceCategoryCodesEnum next : SubstanceCategoryCodesEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, SubstanceCategoryCodesEnum>());
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
	public static SubstanceCategoryCodesEnum forCode(String theCode) {
		SubstanceCategoryCodesEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<SubstanceCategoryCodesEnum> VALUESET_BINDER = new IValueSetEnumBinder<SubstanceCategoryCodesEnum>() {
		@Override
		public String toCodeString(SubstanceCategoryCodesEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(SubstanceCategoryCodesEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public SubstanceCategoryCodesEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public SubstanceCategoryCodesEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, SubstanceCategoryCodesEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	SubstanceCategoryCodesEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
