package edu.gatech.i3l.omop.mapping;

/**
 * This enumeration lists the concept-classes according to the elements in the vocabulary domanin RxNorm
 * @see http://omop.org/Domains
 * @author Ismael Sarmento
 */
public enum DrugConceptClass {

	INGREDIENT("Ingredient"),
	CLINICAL_DRUG("Clinical Drug"),
	BRANDED_DRUG("Branded Drug"),
	BRAND_NAME_PACK("Brand Name PacK"),
	GENERIC_PACK("Generic Pack"),
	BRAND_NAME("Brand Name"),
	DOSE_FORM("Dose Form"),
	CLINICAL_DRUG_COMPONENT("Clinical Drug Component"),
	BRANDED_DRUG_COMPONENT("Branded Drug Component"),
	CLINICAL_DRUG_FORM("Clinical Drug Form"),
	BRANDED_DRUG_FORM("Branded Drug Form"),
	BRANDED_PACK("Branded Pack");
	
	String value;
	
	DrugConceptClass(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
