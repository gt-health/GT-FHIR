package edu.gatech.i3l.fhir.jpa.entity;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import ca.uhn.fhir.model.primitive.IdDt;

@MappedSuperclass
public abstract class BaseResourceEntity implements IResourceEntity{

	@Transient
	private Long version = 0L;
	
	@Override
	public IdDt getIdDt() {
		if(version != 0L)
			return new IdDt(this.getResourceType(), String.valueOf(this.getId()), String.valueOf(this.getVersion()));
		return new IdDt(getResourceType(), this.getId().toString());
	}
	
	/**
	 * While version is Null, the system treats the entity as being the current version.
	 * @see //TODO document here
	 */
	@Override
	public Long getVersion() {
		return version;
	}
	
	public void setVersion(Long version) {
		this.version = version;
	}
}
