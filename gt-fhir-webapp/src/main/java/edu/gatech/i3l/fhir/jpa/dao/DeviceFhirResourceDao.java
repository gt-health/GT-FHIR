package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Device;
import edu.gatech.i3l.fhir.dstu2.entities.DeviceExposure;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

public class DeviceFhirResourceDao extends BaseFhirResourceDao<Device> {

	public DeviceFhirResourceDao() {
		super();
		setResourceEntity(DeviceExposure.class);
		setValidateBean(true);
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {			
		};
	}

}
