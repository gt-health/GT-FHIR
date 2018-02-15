package edu.gatech.i3l.fhir.jpa.test;

import java.util.List;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.hl7.fhir.instance.model.api.IIdType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.ResourceMetadataKeyEnum;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.DiagnosticReport;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.rest.annotation.IncludeParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.RequiredParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
//import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.param.DateRangeParam;
import ca.uhn.fhir.rest.param.TokenOrListParam;
import ca.uhn.fhir.rest.server.FifoMemoryPagingProvider;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.RestfulServer;

public class OverlayTestApp {

	private static ClassPathXmlApplicationContext ourAppCtx;

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) throws Exception {
		{
			int myPort = 8888;
			Server server = new Server(myPort);

			WebAppContext root = new WebAppContext();

			root.setContextPath("/");
			root.setDescriptor("src/main/webapp/WEB-INF/web.xml");
			root.setResourceBase("src/main/webapp");

			root.setParentLoaderPriority(true);

			server.setHandler(root);

			server.start();

		}

		if (true) {return;}

//		ourAppCtx = new ClassPathXmlApplicationContext(
//				"hapi-fhir-server-resourceproviders-dstu2.xml", 
//				"hapi-fhir-server-resourceproviders-dstu1.xml", 
//				"fhir-jpabase-spring-test-config.xml");
//		ServletContextHandler proxyHandler = new ServletContextHandler();
//		proxyHandler.setContextPath("/");
//
//		/*
//		 * DSTU2 resources
//		 */
//
//		RestfulServer restServerDev = new RestfulServer();
//		restServerDev.setPagingProvider(new FifoMemoryPagingProvider(10));
//		restServerDev.setImplementationDescription("This is a great server!!!!");
//		restServerDev.setFhirContext(ourAppCtx.getBean("myFhirContextDstu2", FhirContext.class));
//		List<IResourceProvider> rpsDev = (List<IResourceProvider>) ourAppCtx.getBean("myResourceProvidersDstu2", List.class);
//		restServerDev.setResourceProviders(rpsDev);
//
//		//JpaSystemProviderDstu2 systemProvDev = (JpaSystemProviderDstu2) ourAppCtx.getBean("mySystemProviderDstu2", JpaSystemProviderDstu2.class);
//		//restServerDev.setPlainProviders(systemProvDev);
//
//		ServletHolder servletHolder = new ServletHolder();
//		servletHolder.setServlet(restServerDev);
//		proxyHandler.addServlet(servletHolder, "/fhir/contextDstu2/*");
//
//		/*
//		 * DSTU resources
//		 */
//
//		RestfulServer restServerDstu1 = new RestfulServer();
//		restServerDstu1.setPagingProvider(new FifoMemoryPagingProvider(10));
//		restServerDstu1.setImplementationDescription("This is a great server!!!!");
//		restServerDstu1.setFhirContext(ourAppCtx.getBean("myFhirContextDstu1", FhirContext.class));
//		List<IResourceProvider> rpsDstu1 = (List<IResourceProvider>) ourAppCtx.getBean("myResourceProvidersDstu1", List.class);
//		restServerDstu1.setResourceProviders(rpsDstu1);
//
////		JpaSystemProviderDstu1 systemProvDstu1 = (JpaSystemProviderDstu1) ourAppCtx.getBean("mySystemProviderDstu1", JpaSystemProviderDstu1.class);
////		restServerDstu1.setPlainProviders(systemProvDstu1);
//
//		servletHolder = new ServletHolder();
//		servletHolder.setServlet(restServerDstu1);
//		proxyHandler.addServlet(servletHolder, "/fhir/contextDstu1/*");
//
//		int port = 8887;
//		Server server = new Server(port);
//
//		// base = "http://fhir.healthintersections.com.au/open";
//		// base = "http://spark.furore.com/fhir";
//
//		server.setHandler(proxyHandler);
//		server.start();
//
//		if (true) {
//			String base = "http://localhost:" + port + "/fhir/contextDstu1";
//			IGenericClient client = restServerDstu1.getFhirContext().newRestfulGenericClient(base);
//			client.setLogRequestAndResponse(true);
//
//			Organization o1 = new Organization();
////			o1.getName().setValue("Some Org");
//			o1.setName("Some Org");
//			MethodOutcome create = client.create(o1);
//			IIdType orgId = create.getId();
//
//			Patient p1 = new Patient();
//			p1.addIdentifier(new IdentifierDt("foo:bar", "12345"));
//			p1.addName().addFamily("Smith").addGiven("John");
//			p1.getManagingOrganization().setReference(orgId);
//
//			TagList list = new TagList();
//			list.addTag("http://hl7.org/fhir/tag", "urn:happytag", "This is a happy resource");
//			ResourceMetadataKeyEnum.TAG_LIST.put(p1, list);
//			client.create(p1);
//
//			List<IResource> resources = restServerDstu1.getFhirContext().newJsonParser().parseBundle(IOUtils.toString(OverlayTestApp.class.getResourceAsStream("/test-server-seed-bundle.json"))).toListOfResources();
//			client.transaction().withResources(resources).execute();
//
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//			client.create(p1);
//
//			client.setLogRequestAndResponse(true);
//			client.create(p1);
//
//		}

	}

	public static class ProviderWithRequiredAndOptional implements IResourceProvider {

		@Description(shortDefinition = "This is a query by date!")
		@Search
		public List<DiagnosticReport> findDiagnosticReportsByPatient(@RequiredParam(name = DiagnosticReport.SP_SUBJECT + '.' + Patient.SP_IDENTIFIER) IdentifierDt thePatientId, @OptionalParam(name = DiagnosticReport.SP_CODE) TokenOrListParam theNames,
				@OptionalParam(name = DiagnosticReport.SP_DATE) DateRangeParam theDateRange, @IncludeParam(allow = { "DiagnosticReport.result" }) Set<Include> theIncludes) throws Exception {
			return null;
		}

		@Description(shortDefinition = "This is a query by issued.. blah blah foo bar blah blah")
		@Search
		public List<DiagnosticReport> findDiagnosticReportsByPatientIssued(@RequiredParam(name = DiagnosticReport.SP_SUBJECT + '.' + Patient.SP_IDENTIFIER) IdentifierDt thePatientId, @OptionalParam(name = DiagnosticReport.SP_CODE) TokenOrListParam theNames,
				@OptionalParam(name = DiagnosticReport.SP_ISSUED) DateRangeParam theDateRange, @IncludeParam(allow = { "DiagnosticReport.result" }) Set<Include> theIncludes) throws Exception {
			return null;
		}

		@Override
		public Class<? extends IResource> getResourceType() {
			return DiagnosticReport.class;
		}

	}

}
