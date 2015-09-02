/**
 * 
 */
package edu.gatech.i3l.fhir.smart.servlet;

import org.springframework.stereotype.Repository;

/**
 * @author mc142
 *
 */
@Repository
public class SmartOnFhirLaunchContext extends AbstractSmartOnFhirDao<SmartLaunchContext> {
	public SmartOnFhirLaunchContext() {
		setClazz(SmartLaunchContext.class);
	}
	
}
