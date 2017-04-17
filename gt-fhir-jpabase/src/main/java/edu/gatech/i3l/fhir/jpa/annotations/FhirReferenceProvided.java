package edu.gatech.i3l.fhir.jpa.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation marks fields that are meant to be loaded as references. That is, only the id and the 
 * attributes marked with {@link FhirAttributesProvided} will be loaded for the object.
 *  
 * @author Ismael Sarmento
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value= {ElementType.FIELD})
public @interface FhirReferenceProvided {

}
