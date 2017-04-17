package edu.gatech.i3l.fhir.servlet;

import java.util.LinkedHashMap;
import java.util.UUID;

import org.apache.commons.lang3.Validate;

import ca.uhn.fhir.rest.server.IBundleProvider;
import ca.uhn.fhir.rest.server.IPagingProvider;

public class FifoMemoryPagingProvider implements IPagingProvider {

	private LinkedHashMap<String, IBundleProvider> myBundleProviders;
	private int myDefaultPageSize=10;
	private int myMaximumPageSize=50;
	private int mySize;

	public FifoMemoryPagingProvider(int theSize) {
		Validate.isTrue(theSize > 0, "theSize must be greater than 0");

		mySize = theSize;
		myBundleProviders = new LinkedHashMap<String, IBundleProvider>(mySize);
	}

	@Override
	public int getDefaultPageSize() {
		return myDefaultPageSize;
	}

	@Override
	public int getMaximumPageSize() {
		return myMaximumPageSize;
	}

	@Override
	public synchronized IBundleProvider retrieveResultList(String theId) {
		return myBundleProviders.get(theId);
	}

	public FifoMemoryPagingProvider setDefaultPageSize(int theDefaultPageSize) {
		Validate.isTrue(theDefaultPageSize > 0, "size must be greater than 0");
		myDefaultPageSize = theDefaultPageSize;
		return this;
	}

	public FifoMemoryPagingProvider setMaximumPageSize(int theMaximumPageSize) {
		Validate.isTrue(theMaximumPageSize > 0, "size must be greater than 0");
		myMaximumPageSize = theMaximumPageSize;
		return this;
	}

	@Override
	public synchronized String storeResultList(IBundleProvider theList) {
		while (myBundleProviders.size() > mySize) {
			myBundleProviders.remove(myBundleProviders.keySet().iterator().next());
		}

		String key = UUID.randomUUID().toString();
		myBundleProviders.put(key, theList);
		return key;
	}

}
