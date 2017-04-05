package edu.gatech.i3l.fhir.jpa.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is meant to provide information on which of the attributes, on the annotated class, are
 * going to be loaded and provided in the resource reference.
 * 
 * @author Ismael Sarmento
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface FhirAttributesProvided {

	/**
	 * @return the names of the attributes, or fields, to be loaded by default.
	 */
	String[] attributes();
}
