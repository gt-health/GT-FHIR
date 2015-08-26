/**
 * 
 */
package edu.gatech.i3l.fhir.smart.servlet;

import javax.persistence.EntityManager;

/**
 * @author MC142
 *
 */
public class LaunchContextService {
	protected EntityManager em;
	
	public LaunchContextService (EntityManager em) {
		this.em = em;
	}
}
