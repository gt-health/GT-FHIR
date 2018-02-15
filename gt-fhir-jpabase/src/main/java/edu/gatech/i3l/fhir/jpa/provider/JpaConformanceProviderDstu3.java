package edu.gatech.i3l.fhir.jpa.provider;

/*
 * #%L
 * HAPI FHIR JPA Server
 * %%
 * Copyright (C) 2014 - 2015 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.CapabilityStatement;
import org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestComponent;
import org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceComponent;
import org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent;
import org.hl7.fhir.dstu3.model.DecimalType;
import org.hl7.fhir.dstu3.model.Enumerations.SearchParamType;
import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.ResourceType;
import org.hl7.fhir.instance.conf.ServerConformanceProvider;
import org.hl7.fhir.instance.model.Conformance;
import org.hl7.fhir.instance.model.Conformance.ConformanceRestComponent;
import org.hl7.fhir.instance.model.Conformance.ConformanceRestResourceComponent;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.RuntimeResourceDefinition;
import ca.uhn.fhir.context.RuntimeSearchParam;
//import ca.uhn.fhir.model.dstu2.resource.Bundle;
//import ca.uhn.fhir.model.dstu2.resource.Conformance;
//import ca.uhn.fhir.model.dstu2.resource.Conformance.Rest;
//import ca.uhn.fhir.model.dstu2.resource.Conformance.RestResource;
//import ca.uhn.fhir.model.dstu2.resource.Conformance.RestResourceSearchParam;
//import ca.uhn.fhir.model.dstu2.valueset.ResourceTypeEnum;
//import ca.uhn.fhir.model.dstu2.valueset.SearchParamTypeEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.rest.server.RestfulServer;
//import ca.uhn.fhir.rest.server.provider.dstu2.ServerConformanceProvider;
import ca.uhn.fhir.util.ExtensionConstants;
import edu.gatech.i3l.fhir.jpa.dao.IFhirSystemDao;

public class JpaConformanceProviderDstu3 extends org.hl7.fhir.dstu3.hapi.rest.server.ServerCapabilityStatementProvider {

	private String myImplementationDescription;
	private IFhirSystemDao<Bundle> mySystemDao;
	private volatile CapabilityStatement myCachedValue;
	private RestfulServer myRestfulServer;	
	
	public JpaConformanceProviderDstu3(RestfulServer theRestfulServer, IFhirSystemDao<Bundle> theSystemDao) {
		super(theRestfulServer);
		myRestfulServer = theRestfulServer;
		mySystemDao = theSystemDao;
		super.setCache(false);
	}

	@Override
	public CapabilityStatement getServerConformance(HttpServletRequest theRequest) {
		CapabilityStatement retVal = myCachedValue;

		Map<String, Long> counts = mySystemDao.getResourceCounts();

		FhirContext ctx = myRestfulServer.getFhirContext();
		
		retVal = super.getServerConformance(theRequest);
		for (CapabilityStatementRestComponent nextRest : retVal.getRest()) {
			for (CapabilityStatementRestResourceComponent nextResource : nextRest.getResource()) {

				// Add resource counts
				Long count = counts.get(nextResource.getTypeElement().getValueAsString());
				if (count != null) {
					nextResource.addExtension(new Extension(ExtensionConstants.CONF_RESOURCE_COUNT, new DecimalType(count)));
				}
				
				// Add chained params
// TODO: Revisit.... Myung
				
//				for (CapabilityStatementRestResourceSearchParamComponent nextParam : nextResource.getSearchParam()) {
//					if (nextParam.getTypeElement().getValue() == SearchParamType.REFERENCE) {
//						List<BoundCodeDt<ResourceType>> targets = nextParam.getTarget();
//						for (BoundCodeDt<ResourceType> next : targets) {
//							RuntimeResourceDefinition def = ctx.getResourceDefinition(next.getValue());
//							for (RuntimeSearchParam nextChainedParam : def.getSearchParams()) {
////								nextParam.addChain(nextChainedParam.getName());
//								nextParam.addChain(nextChainedParam.getName());
//							}
//						}
//					}
//				}
				
			}
		}

		retVal.getImplementation().setDescription(myImplementationDescription);
		myCachedValue = retVal;
		return retVal;
	}

	public void setImplementationDescription(String theImplDesc) {
		myImplementationDescription = theImplDesc;
	}

}
