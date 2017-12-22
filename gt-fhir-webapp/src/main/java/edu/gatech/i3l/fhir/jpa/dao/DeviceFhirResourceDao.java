package edu.gatech.i3l.fhir.jpa.dao;

import org.hl7.fhir.dstu3.model.Device;
import edu.gatech.i3l.fhir.dstu3.entities.DeviceExposure;
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
