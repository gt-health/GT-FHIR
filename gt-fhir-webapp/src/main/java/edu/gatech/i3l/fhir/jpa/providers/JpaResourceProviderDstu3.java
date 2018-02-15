package edu.gatech.i3l.fhir.jpa.providers;


import javax.servlet.http.HttpServletRequest;

import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.springframework.beans.factory.annotation.Required;

import ca.uhn.fhir.context.FhirContext;
//import ca.uhn.fhir.model.api.IResource;
//import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.annotation.ConditionalUrlParam;
import ca.uhn.fhir.rest.annotation.Create;
import ca.uhn.fhir.rest.annotation.Delete;
import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.annotation.ResourceParam;
import ca.uhn.fhir.rest.annotation.Update;
import ca.uhn.fhir.rest.annotation.Validate;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.api.ValidationModeEnum;
import ca.uhn.fhir.rest.api.EncodingEnum;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import edu.gatech.i3l.fhir.jpa.dao.IFhirResourceDao;
import edu.gatech.i3l.fhir.jpa.provider.BaseJpaProvider;

public class JpaResourceProviderDstu3<T extends IBaseResource> extends BaseJpaProvider implements IResourceProvider {

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(JpaResourceProviderDstu3.class);
	private FhirContext myContext;
	private IFhirResourceDao<T> myDao;

	public JpaResourceProviderDstu3() {}

	public JpaResourceProviderDstu3(IFhirResourceDao<T> theDao) {
		myDao = theDao;
	}

	public FhirContext getContext() {
		return myContext;
	}

	public IFhirResourceDao<T> getDao() {
		return myDao;
	}

//	@History
//	public IBundleProvider getHistoryForResourceInstance(HttpServletRequest theRequest, @IdParam IdDt theId, @Since Date theDate) {
//		startRequest(theRequest);
//		try {
//			return myDao.history(theId, theDate);
//		} finally {
//			endRequest(theRequest);
//		}
//	}
//
//	@History
//	public IBundleProvider getHistoryForResourceType(HttpServletRequest theRequest, @Since Date theDate) {
//		startRequest(theRequest);
//		try {
//			return myDao.history(theDate);
//		} finally {
//			endRequest(theRequest);
//		}
//	}

	@Override
	public Class<? extends IBaseResource> getResourceType() {
		return myDao.getResourceType();
	}

	@Read(version = true)
	public T read(HttpServletRequest theRequest, @IdParam IdType theId) {
		startRequest(theRequest);
		try {
			return myDao.read(theId);
		} finally {
			endRequest(theRequest);
		}
	}

	public void setContext(FhirContext theContext) {
		myContext = theContext;
	}

	@Required
	public void setDao(IFhirResourceDao<T> theDao) {
		myDao = theDao;
	}

	@Create
	public MethodOutcome create(HttpServletRequest theRequest, @ResourceParam T theResource, @ConditionalUrlParam String theConditional) {
		startRequest(theRequest);
		try {
			if (theConditional != null) {
				return getDao().create(theResource, theConditional);
			} else {
				return getDao().create(theResource);
			}
		} finally {
			endRequest(theRequest);
		}
	}

	@Delete
	public MethodOutcome delete(HttpServletRequest theRequest, @IdParam IdType theResource, @ConditionalUrlParam String theConditional) {
		startRequest(theRequest);
		try {
			if (theConditional != null) {
				return getDao().deleteByUrl(theConditional);
			} else {
				return getDao().delete(theResource);
			}
		} finally {
			endRequest(theRequest);
		}
	}

	@Update
	public MethodOutcome update(HttpServletRequest theRequest, @ResourceParam T theResource, @IdParam IdType theId, @ConditionalUrlParam String theConditional) {
		startRequest(theRequest);
		try {
			if (theConditional != null) {
				return getDao().update(theResource, theConditional);
			} else {
				theResource.setId(theId);
				return getDao().update(theResource);
			}
		} catch (ResourceNotFoundException e) {
			ourLog.info("Can't update resource with ID[" + theId.getValue() + "] because it doesn't exist, going to create it instead");
			theResource.setId(theId);
			return getDao().create(theResource);
		} finally {
			endRequest(theRequest);
		}
	}

	@Validate
	public MethodOutcome validate(@ResourceParam T theResource, @ResourceParam String theRawResource, @ResourceParam EncodingEnum theEncoding, @Validate.Mode ValidationModeEnum theMode,
			@Validate.Profile String theProfile) {
		return validate(theResource, null, theRawResource, theEncoding, theMode, theProfile);
	}
		
	@Validate
	public MethodOutcome validate(@ResourceParam T theResource, @IdParam IdType theId, @ResourceParam String theRawResource, @ResourceParam EncodingEnum theEncoding, @Validate.Mode ValidationModeEnum theMode,
			@Validate.Profile String theProfile) {
		return getDao().validate(theResource, theId, theRawResource, theEncoding, theMode, theProfile);
	}

}
