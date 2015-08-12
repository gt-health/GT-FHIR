package ca.uhn.fhir.jpa.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.springframework.beans.factory.annotation.Autowired;

import ca.uhn.fhir.context.FhirContext;

public abstract class AbstractBaseFhirDao implements IFhirDao {

	private Map<Class<? extends IBaseResource>, IFhirResourceDao<?>> myResourceTypeToDao;
	
	private List<IDaoListener> myListeners = new ArrayList<IDaoListener>();
	
	@Autowired(required = true)
	private DaoConfig myConfig;

	private FhirContext myContext;

	@Autowired
	protected List<IFhirResourceDao<?>> myResourceDaos;

	public FhirContext getContext() {
		return myContext;
	}
	
	public void setContext(FhirContext theContext) {
		myContext = theContext;
	}
	
	public Map<Class<? extends IBaseResource>, IFhirResourceDao<?>> getMyResourceTypeToDao() {
		return myResourceTypeToDao;
	}

	public void setMyResourceTypeToDao(Map<Class<? extends IBaseResource>, IFhirResourceDao<?>> myResourceTypeToDao) {
		this.myResourceTypeToDao = myResourceTypeToDao;
	}

	public List<IFhirResourceDao<?>> getMyResourceDaos() {
		return myResourceDaos;
	}

	public void setMyResourceDaos(List<IFhirResourceDao<?>> myResourceDaos) {
		this.myResourceDaos = myResourceDaos;
	}
	
	@Override
	public DaoConfig getConfig() {
		return myConfig;
	}
	
	@Override
	public void notifyWriteCompleted() {
		for (IDaoListener next : myListeners) {
			next.writeCompleted();
		}
	}

	@Override
	public void registerDaoListener(IDaoListener theListener) {
		Validate.notNull(theListener, "theListener");
		myListeners.add(theListener);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends IBaseResource> IFhirResourceDao<T> getDao(Class<T> theType) {
		if (myResourceTypeToDao == null) {
			myResourceTypeToDao = new HashMap<Class<? extends IBaseResource>, IFhirResourceDao<?>>();
			for (IFhirResourceDao<?> next : myResourceDaos) {
				myResourceTypeToDao.put(next.getResourceType(), next);
			}

			if (this instanceof IFhirResourceDao<?>) {
				IFhirResourceDao<?> thiz = (IFhirResourceDao<?>) this;
				myResourceTypeToDao.put(thiz.getResourceType(), thiz);
			}

		}

		return (IFhirResourceDao<T>) myResourceTypeToDao.get(theType);
	}
}
