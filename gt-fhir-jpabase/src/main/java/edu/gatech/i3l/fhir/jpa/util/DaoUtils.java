package edu.gatech.i3l.fhir.jpa.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.hl7.fhir.instance.model.api.IIdType;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.RuntimeResourceDefinition;
import ca.uhn.fhir.context.RuntimeSearchParam;
import ca.uhn.fhir.model.api.IQueryParameterAnd;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.rest.method.MethodUtil;
import ca.uhn.fhir.rest.method.QualifiedParamList;
import ca.uhn.fhir.rest.param.DateRangeParam;
import ca.uhn.fhir.rest.server.Constants;
import ca.uhn.fhir.rest.server.exceptions.InvalidRequestException;

import com.google.common.collect.ArrayListMultimap;

import edu.gatech.i3l.fhir.jpa.dao.IFhirResourceDao;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;

public class DaoUtils {
	
	public static boolean isValidPid(IIdType theId) {
		String idPart = theId.getIdPart();
		for (int i = 0; i < idPart.length(); i++) {
			char nextChar = idPart.charAt(i);
			if (i == 0 && idPart.length() > 1 && nextChar == '-') continue;
			if (nextChar < '0' || nextChar > '9') {
				return false;
			}
		}
		return true;
	}
	
	public static InstantDt createHistoryToTimestamp() {
		return InstantDt.withCurrentTime();
	}
	
	public static <T extends IResource> Set<Long> processMatchUrl(String theMatchUrl, Class<? extends IResource> theResourceType, FhirContext theContext, IFhirResourceDao<T> dao) {
		RuntimeResourceDefinition resourceDef = theContext.getResourceDefinition(theResourceType); 

		SearchParameterMap paramMap = translateMatchUrl(theMatchUrl, resourceDef);

		Set<Long> ids = dao.searchForIdsWithAndOr(paramMap);

		return ids;
	}
	
	public static SearchParameterMap translateMatchUrl(String theMatchUrl, RuntimeResourceDefinition resourceDef) {
		SearchParameterMap paramMap = new SearchParameterMap();
		List<NameValuePair> parameters;
		try {
			String matchUrl = theMatchUrl;
			if (matchUrl.indexOf('?') == -1) {
				throw new InvalidRequestException("Failed to parse match URL[" + theMatchUrl + "] - Error was: URL does not contain any parameters ('?' not detected)");
			}
			matchUrl = matchUrl.replace("|", "%7C");
			matchUrl = matchUrl.replace("=>=", "=%3E%3D");
			matchUrl = matchUrl.replace("=<=", "=%3C%3D");
			matchUrl = matchUrl.replace("=>", "=%3E");
			matchUrl = matchUrl.replace("=<", "=%3C");
			parameters = URLEncodedUtils.parse(new URI(matchUrl), "UTF-8");
		} catch (URISyntaxException e) {
			throw new InvalidRequestException("Failed to parse match URL[" + theMatchUrl + "] - Error was: " + e.toString());
		}

		ArrayListMultimap<String, QualifiedParamList> nameToParamLists = ArrayListMultimap.create();
		for (NameValuePair next : parameters) {
			String paramName = next.getName();
			String qualifier = null;
			for (int i = 0; i < paramMap.size(); i++) {
				switch (paramName.charAt(i)) {
				case '.':
				case ':':
					qualifier = paramName.substring(i);
					paramName = paramName.substring(0, i);
					i = Integer.MAX_VALUE;
					break;
				}
			}

			QualifiedParamList paramList = QualifiedParamList.splitQueryStringByCommasIgnoreEscape(qualifier, next.getValue());
			nameToParamLists.put(paramName, paramList);
		}

		for (String nextParamName : nameToParamLists.keySet()) {
			List<QualifiedParamList> paramList = nameToParamLists.get(nextParamName);
			if (Constants.PARAM_LASTUPDATED.equals(nextParamName)) {
				if (paramList != null && paramList.size() > 0) {
					if (paramList.size() > 2) {
						throw new InvalidRequestException("Failed to parse match URL[" + theMatchUrl + "] - Can not have more than 2 " + Constants.PARAM_LASTUPDATED + " parameter repetitions");
					} else {
						DateRangeParam p1 = new DateRangeParam();
						p1.setValuesAsQueryTokens(paramList);
						paramMap.setLastUpdated(p1);
					}
				}
				continue;
			}

			if (Constants.PARAM_COUNT.equals(nextParamName)) {
				if (paramList.size() > 0 && paramList.get(0).size() > 0) {
					String intString = paramList.get(0).get(0);
					try {
						paramMap.setCount(Integer.parseInt(intString));
					} catch (NumberFormatException e) {
						throw new InvalidRequestException("Invalid " + Constants.PARAM_COUNT + " value: " + intString);
					}
				}
				continue;
			}

			RuntimeSearchParam paramDef = resourceDef.getSearchParam(nextParamName);
			if (paramDef == null) {
				throw new InvalidRequestException("Failed to parse match URL[" + theMatchUrl + "] - Resource type " + resourceDef.getName() + " does not have a parameter with name: " + nextParamName);
			}

			IQueryParameterAnd<?> param = MethodUtil.parseQueryParams(paramDef, nextParamName, paramList);
			paramMap.add(nextParamName, param);
		}
		return paramMap;
	}
}
