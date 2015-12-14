package edu.gatech.i3l.fhir.smart.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

@Transactional("myTxManager")
public class SmartOnFhirLaunchContextProvider {

	@Autowired()
	@Qualifier("mySmartOnFhirLaunchContext")
	private ISmartFhirSystem<SmartLaunchContext> myDao;

//	@Required
//	public void setDao(SmartOnFhirLaunchContextDao theDao) {
//		myDao = theDao;
//	}
//	
//	protected SmartOnFhirLaunchContextDao getDao() {
//		return myDao;
//	}
//	
	
	@Required
	public void setDao(ISmartFhirSystem<SmartLaunchContext> theDao) {
		myDao = theDao;
	}

	protected ISmartFhirSystem<SmartLaunchContext> getDao() {
		return myDao;
	}

	public SmartLaunchContext getContext(Long id) {
		return myDao.findOneAndDelete(id);
	}
	
	public void setContext(SmartLaunchContext context) {
		myDao.saveAndDelete(context);
	}
}
