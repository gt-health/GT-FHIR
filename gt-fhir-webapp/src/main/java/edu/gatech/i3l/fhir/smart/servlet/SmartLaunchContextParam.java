package edu.gatech.i3l.fhir.smart.servlet;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smart_launch_context_params database table.
 * 
 */
@Entity
@Table(name="smart_launch_context_params")
@NamedQuery(name="SmartLaunchContextParam.findAll", query="SELECT s FROM SmartLaunchContextParam s")
public class SmartLaunchContextParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="param_name")
	private String paramName;

	@Column(name="param_value")
	private String paramValue;

	//bi-directional many-to-one association to SmartLaunchContext
	@ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="launch_context_id")
	private SmartLaunchContext smartLaunchContext;

	public SmartLaunchContextParam() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParamName() {
		return this.paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamValue() {
		return this.paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public SmartLaunchContext getSmartLaunchContext() {
		return this.smartLaunchContext;
	}

	public void setSmartLaunchContext(SmartLaunchContext smartLaunchContext) {
		this.smartLaunchContext = smartLaunchContext;
	}

}