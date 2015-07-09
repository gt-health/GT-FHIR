package edu.gatech.i3l.jpa.model.omop.ext;

import java.util.Date;

import ca.uhn.fhir.model.dstu2.valueset.AddressUseEnum;
import edu.gatech.i3l.jpa.model.omop.Location;

public class LocationFhirExtTable extends Location{

	private AddressUseEnum addressUse;
	private Date startDate;
	private Date endDate;
	
	public LocationFhirExtTable() {
		super();
	}

	public AddressUseEnum getAddressUse() {
		return addressUse;
	}

	public void setAddressUse(AddressUseEnum addressUse) {
		this.addressUse = addressUse;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
