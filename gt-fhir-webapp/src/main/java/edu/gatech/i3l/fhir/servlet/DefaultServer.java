package edu.gatech.i3l.fhir.servlet;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.narrative.DefaultThymeleafNarrativeGenerator;
import ca.uhn.fhir.rest.server.ETagSupportEnum;
import ca.uhn.fhir.rest.server.EncodingEnum;
import ca.uhn.fhir.rest.server.FifoMemoryPagingProvider;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.RestfulServer;
import ca.uhn.fhir.rest.server.interceptor.IServerInterceptor;
import edu.gatech.i3l.fhir.jpa.dao.IFhirSystemDao;
import edu.gatech.i3l.fhir.jpa.provider.JpaSystemProviderDstu2;
import edu.gatech.i3l.fhir.security.SMARTonFHIRConformanceStatement;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

public class DefaultServer extends RestfulServer {

	private static final long serialVersionUID = 1L;

	private WebApplicationContext myAppCtx;

	@SuppressWarnings("unchecked")
	@Override
	protected void initialize() throws ServletException {
		super.initialize();

		/*
		 * This is gonna load the concepts values present in an Omop based
		 * database
		 */
		new Thread(OmopConceptMapping.getInstance()).run();

		setFhirContext(new FhirContext(FhirVersionEnum.DSTU2));

		// Get the spring context from the web container (it's declared in
		// web.xml)
		myAppCtx = ContextLoaderListener.getCurrentWebApplicationContext();

		/*
		 * The hapi-fhir-server-resourceproviders-dev.xml file is a spring
		 * configuration file which is automatically generated as a part of
		 * hapi-fhir-jpaserver-base and contains bean definitions for a resource
		 * provider for each resource type
		 */
		String resourceProviderBeanName = "myResourceProvidersDstu2";
		List<IResourceProvider> beans = myAppCtx.getBean(resourceProviderBeanName, List.class);
		setResourceProviders(beans);

		/*
		 * The system provider implements non-resource-type methods, such as
		 * transaction, and global history.
		 */
		Object systemProvider;
		systemProvider = myAppCtx.getBean("mySystemProviderDstu2", JpaSystemProviderDstu2.class);
		setPlainProviders(systemProvider);

		/*
		 * The conformance provider exports the supported resources, search
		 * parameters, etc for this server. The JPA version adds resource counts
		 * to the exported statement, so it is a nice addition.
		 */
		IFhirSystemDao<Bundle> systemDao = myAppCtx.getBean("mySystemDaoDstu2", IFhirSystemDao.class);
		// JpaConformanceProviderDstu2 confProvider = new
		// JpaConformanceProviderDstu2(this, systemDao);
		SMARTonFHIRConformanceStatement confProvider = new SMARTonFHIRConformanceStatement(this, systemDao);
		confProvider.setImplementationDescription("FHIR JPA Server");
		confProvider.setPublisher("Georgia Tech - I3L");
		confProvider.setAuthServerUrl(getServletConfig().getInitParameter("authServerUrl"));
		setServerConformanceProvider(confProvider);

		/*
		 * Enable ETag Support (this is already the default)
		 */
		setETagSupport(ETagSupportEnum.ENABLED);

		/*
		 * This server tries to dynamically generate narratives
		 */
		FhirContext ctx = getFhirContext();
		ctx.setNarrativeGenerator(new DefaultThymeleafNarrativeGenerator());

		/*
		 * This tells the server to use "browser friendly" MIME types if it
		 * detects that the request is coming from a browser, in the hopes that
		 * the browser won't just treat the content as a binary payload and try
		 * to download it (which is what generally happens if you load a FHIR
		 * URL in a browser).
		 * 
		 * This means that the server isn't technically complying with the FHIR
		 * specification for direct browser requests, but this mode is very
		 * helpful for testing and troubleshooting since it means you can look
		 * at FHIR URLs directly in a browser.
		 */
		setUseBrowserFriendlyContentTypes(true);

		/*
		 * Default to JSON and pretty printing
		 */
		setDefaultPrettyPrint(true);
		setDefaultResponseEncoding(EncodingEnum.JSON);

		/*
		 * This is a simple paging strategy that keeps the last 10 searches in
		 * memory
		 */
		FifoMemoryPagingProvider pp = new FifoMemoryPagingProvider(10);
		pp.setDefaultPageSize(200);
		pp.setMaximumPageSize(400);
		// setPagingProvider(new FifoMemoryPagingProvider(10));
		setPagingProvider(pp);

		/*
		 * Load interceptors for the server from Spring (these are defined in
		 * hapi-fhir-server-config.xml
		 */
		List<IServerInterceptor> interceptorBeans = myAppCtx.getBean("myServerInterceptors", List.class);
		for (IServerInterceptor interceptor : interceptorBeans) {
			this.registerInterceptor(interceptor);
		}

	}

}
