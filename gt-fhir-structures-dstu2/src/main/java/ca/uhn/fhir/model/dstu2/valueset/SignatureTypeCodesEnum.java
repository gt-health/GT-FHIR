
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum SignatureTypeCodesEnum {

	/**
	 * Display: <b>AuthorID</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.1</b>
	 *
	 * the signature of the primary or sole author of a health information document. There can be only one primary author of a health information document.
	 */
	AUTHORID("1.2.840.10065.1.12.1.1", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Co-AuthorID</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.2</b>
	 *
	 * the signature of a health information document coauthor. There can be multiple coauthors of a health information document.
	 */
	CO_AUTHORID("1.2.840.10065.1.12.1.2", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Co-Participated</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.3</b>
	 *
	 * the signature of an individual who is a participant in the health information document but is not an author or coauthor. (Example a surgeon who is required by institutional, regulatory, or legal rules to sign an operative report, but who was not involved in the authorship of that report.)
	 */
	CO_PARTICIPATED("1.2.840.10065.1.12.1.3", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Transcriptionist</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.4</b>
	 *
	 * the signature of an individual who has transcribed a dictated document or recorded written text into a digital machine readable format.
	 */
	TRANSCRIPTIONIST("1.2.840.10065.1.12.1.4", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Verification</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.5</b>
	 *
	 * a signature verifying the information contained in a document. (Example a physician is required to countersign a verbal order that has previously been recorded in the medical record by a registered nurse who has carried out the verbal order.)
	 */
	VERIFICATION("1.2.840.10065.1.12.1.5", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Validation</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.6</b>
	 *
	 * a signature validating a health information document for inclusion in the patient record. (Example a medical student or resident is credentialed to perform history or physical examinations and to write progress notes. The attending physician signs the history and physical examination to validate the entry for inclusion in the patient's medical record.)
	 */
	VALIDATION("1.2.840.10065.1.12.1.6", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Consent</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.7</b>
	 *
	 * the signature of an individual consenting to what is described in a health information document.
	 */
	CONSENT("1.2.840.10065.1.12.1.7", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Witness</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.8</b>
	 *
	 * the signature of a witness to any other signature.
	 */
	WITNESS("1.2.840.10065.1.12.1.8", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Event-Witness</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.9</b>
	 *
	 * the signature of a witness to an event. (Example the witness has observed a procedure and is attesting to this fact.)
	 */
	EVENT_WITNESS("1.2.840.10065.1.12.1.9", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Identity-Witness</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.10</b>
	 *
	 * the signature of an individual who has witnessed another individual who is known to them signing a document. (Example the identity witness is a notary public.)
	 */
	IDENTITY_WITNESS("1.2.840.10065.1.12.1.10", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Consent-Witness</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.11</b>
	 *
	 * the signature of an individual who has witnessed the health care provider counselling a patient.
	 */
	CONSENT_WITNESS("1.2.840.10065.1.12.1.11", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Interpreter</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.12</b>
	 *
	 * the signature of an individual who has translated health care information during an event or the obtaining of consent to a treatment.
	 */
	INTERPRETER("1.2.840.10065.1.12.1.12", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Review</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.13</b>
	 *
	 * the signature of a person, device, or algorithm that has reviewed or filtered data for inclusion into the patient record. ( Examples: (1) a medical records clerk who scans a document for inclusion in the medical record, enters header information, or catalogues and classifies the data, or a combination thereof; (2) a gateway that receives data from another computer system and interprets that data or changes its format, or both, before entering it into the patient record.)
	 */
	REVIEW("1.2.840.10065.1.12.1.13", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Source</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.14</b>
	 *
	 * the signature of an automated data source. (Examples: (1) the signature for an image that is generated by a device for inclusion in the patient record; (2) the signature for an ECG derived by an ECG system for inclusion in the patient record; (3) the data from a biomedical monitoring device or system that is for inclusion in the patient record.)
	 */
	SOURCE("1.2.840.10065.1.12.1.14", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Addendum</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.15</b>
	 *
	 * the signature on a new amended document of an individual who has corrected, edited, or amended an original health information document. An addendum signature can either be a signature type or a signature sub-type (see 8.1). Any document with an addendum signature shall have a companion document that is the original document with its original, unaltered content, and original signatures. The original document shall be referenced via an attribute in the new document, which contains, for example, the digest of the old document. Whether the original, unaltered, document is always displayed with the addended document is a local matter, but the original, unaltered, document must remain as part of the patient record and be retrievable on demand.
	 */
	ADDENDUM("1.2.840.10065.1.12.1.15", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Administrative</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.16</b>
	 *
	 * the signature on an original document of an individual who has generated a new amended document. This (original) document shall reference the new document via an additional signature purpose. This is the inverse of an addendum signature and provides a pointer from the original to the amended document.
	 */
	ADMINISTRATIVE("1.2.840.10065.1.12.1.16", "http://hl7.org/fhir/contractsignertypecodes"),
	
	/**
	 * Display: <b>Timestamp</b><br>
	 * Code Value: <b>1.2.840.10065.1.12.1.17</b>
	 *
	 * the signature of an individual who is certifying that the document is invalidated by an error(s), or is placed in the wrong chart. An administrative (error/edit) signature must include an addendum to the document and therefore shall have an addendum signature sub-type (see 8.1). This signature is reserved for the highest health information system administrative classification, since it is a statement that the entire document is invalidated by the error and that the document should no longer be used for patient care, although for legal reasons the document must remain part of the permanent patient record.
	 */
	TIMESTAMP("1.2.840.10065.1.12.1.17", "http://hl7.org/fhir/contractsignertypecodes"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * Signature Type Codes
	 */
	public static final String VALUESET_NAME = "Signature Type Codes";

	private static Map<String, SignatureTypeCodesEnum> CODE_TO_ENUM = new HashMap<String, SignatureTypeCodesEnum>();
	private static Map<String, Map<String, SignatureTypeCodesEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, SignatureTypeCodesEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (SignatureTypeCodesEnum next : SignatureTypeCodesEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, SignatureTypeCodesEnum>());
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
	public static SignatureTypeCodesEnum forCode(String theCode) {
		SignatureTypeCodesEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<SignatureTypeCodesEnum> VALUESET_BINDER = new IValueSetEnumBinder<SignatureTypeCodesEnum>() {
		@Override
		public String toCodeString(SignatureTypeCodesEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(SignatureTypeCodesEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public SignatureTypeCodesEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public SignatureTypeCodesEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, SignatureTypeCodesEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	SignatureTypeCodesEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
