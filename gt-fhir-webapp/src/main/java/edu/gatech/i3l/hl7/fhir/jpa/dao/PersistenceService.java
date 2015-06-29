package edu.gatech.i3l.hl7.fhir.jpa.dao;

import javax.persistence.EntityManager;

public class PersistenceService {

	private static EntityManager entityManager;
	
	public static EntityManager getEntityManager() {
		return entityManager;
	}
	
}
