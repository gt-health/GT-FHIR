package ca.uhn.fhir.jpa.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.RuntimeResourceDefinition;
import ca.uhn.fhir.jpa.conf.HapiFhirContextHelper;
import ca.uhn.fhir.jpa.dao.GZipUtil;
import ca.uhn.fhir.jpa.entity.BaseHasResource;
import ca.uhn.fhir.jpa.entity.BaseTag;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.ResourceMetadataKeyEnum;
import ca.uhn.fhir.model.api.Tag;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.base.composite.BaseCodingDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.parser.DataFormatException;
import ca.uhn.fhir.parser.IParser;

public class ResourceTransformer {
	
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(ResourceTransformer.class);

	public static IBaseResource toResource(BaseHasResource theEntity) {
		FhirContext fhirContext = HapiFhirContextHelper.getContext(theEntity.getFhirVersion());
		RuntimeResourceDefinition type = fhirContext.getResourceDefinition(theEntity.getResourceType());
		return toResource(type.getImplementingClass(), theEntity);
	}

	public static <T extends IBaseResource> T toResource(Class<T> theResourceType, BaseHasResource theEntity) {
		FhirContext fhirContext = HapiFhirContextHelper.getContext(theEntity.getFhirVersion());
		String resourceText = null;
		switch (theEntity.getEncoding()) {
		case JSON:
			try {
				resourceText = new String(theEntity.getResource(), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new Error("Should not happen", e);
			}
			break;
		case JSONC:
			resourceText = GZipUtil.decompress(theEntity.getResource());
			break;
		}

		IParser parser = theEntity.getEncoding().newParser(fhirContext);
		T retVal;
		try {
			retVal = parser.parseResource(theResourceType, resourceText);
		} catch (Exception e) {
			StringBuilder b = new StringBuilder();
			b.append("Failed to parse database resource[");
			b.append(theResourceType);
			b.append("/");
			b.append(theEntity.getIdDt().getIdPart());
			b.append(" (pid ");
			b.append(theEntity.getId());
			b.append(", version ");
			b.append(fhirContext.getVersion().getVersion());
			b.append("): ");
			b.append(e.getMessage());
			String msg = b.toString();
			ourLog.error(msg, e);
			throw new DataFormatException(msg, e);
		}
		IResource res = (IResource) retVal;
		res.setId(theEntity.getIdDt());

		res.getResourceMetadata().put(ResourceMetadataKeyEnum.VERSION_ID, theEntity.getVersion());
		res.getResourceMetadata().put(ResourceMetadataKeyEnum.PUBLISHED, theEntity.getPublished());
		res.getResourceMetadata().put(ResourceMetadataKeyEnum.UPDATED, theEntity.getUpdated());

		if (theEntity.getTitle() != null) {
			ResourceMetadataKeyEnum.TITLE.put(res, theEntity.getTitle());
		}

		if (theEntity.getDeleted() != null) {
			ResourceMetadataKeyEnum.DELETED_AT.put(res, new InstantDt(theEntity.getDeleted()));
		}

		Collection<? extends BaseTag> tags = theEntity.getTags();
		if (theEntity.isHasTags()) {
			TagList tagList = new TagList();
			List<BaseCodingDt> securityLabels = new ArrayList<BaseCodingDt>();
			List<IdDt> profiles = new ArrayList<IdDt>();
			for (BaseTag next : tags) {
				switch (next.getTag().getTagType()) {
				case PROFILE:
					profiles.add(new IdDt(next.getTag().getCode()));
					break;
				case SECURITY_LABEL:
					BaseCodingDt secLabel = fhirContext.getVersion().newCodingDt();
					secLabel.setSystem(next.getTag().getSystem());
					secLabel.setCode(next.getTag().getCode());
					secLabel.setDisplay(next.getTag().getDisplay());
					securityLabels.add(secLabel);
					break;
				case TAG:
					tagList.add(new Tag(next.getTag().getSystem(), next.getTag().getCode(), next.getTag().getDisplay()));
					break;
				}
			}
			if (tagList.size() > 0) {
				ResourceMetadataKeyEnum.TAG_LIST.put(res, tagList);
			}
			if (securityLabels.size() > 0) {
				ResourceMetadataKeyEnum.SECURITY_LABELS.put(res, securityLabels);
			}
			if (profiles.size() > 0) {
				ResourceMetadataKeyEnum.PROFILES.put(res, profiles);
			}
		}

		return retVal;
	}
}
