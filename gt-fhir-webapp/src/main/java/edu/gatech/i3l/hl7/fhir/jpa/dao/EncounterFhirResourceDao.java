///**
// * 
// */
//package edu.gatech.i3l.hl7.fhir.jpa.dao;
//
//import java.util.Date;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.PersistenceContextType;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.Predicate;
//import javax.persistence.criteria.Root;
//
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
//import ca.uhn.fhir.jpa.dao.DaoMethodOutcome;
//import ca.uhn.fhir.jpa.dao.IDaoListener;
//import ca.uhn.fhir.jpa.entity.IResourceEntity;
//import ca.uhn.fhir.jpa.entity.TagTypeEnum;
//import ca.uhn.fhir.model.api.TagList;
//import ca.uhn.fhir.model.dstu2.composite.MetaDt;
//import ca.uhn.fhir.model.dstu2.resource.Encounter;
//import ca.uhn.fhir.model.primitive.IdDt;
//import ca.uhn.fhir.rest.server.IBundleProvider;
//import edu.gatech.i3l.jpa.model.omop.ext.VisitOccurrenceFhirExtTable;
//
///**
// * @author MC142
// *
// */
//@Transactional(propagation = Propagation.REQUIRED)
//public class EncounterFhirResourceDao extends BaseFhirResourceDao<Encounter> {
//	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(EncounterFhirResourceDao.class);
//
//	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
//	private EntityManager myEntityManager;
//
//	public EncounterFhirResourceDao() {
//		setResourceEntity(VisitOccurrenceFhirExtTable.class);
//	}
//	
//	@Override
//	public void registerDaoListener(IDaoListener theListener) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void addTag(IdDt arg0, TagTypeEnum arg1, String arg2, String arg3,
//			String arg4) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public DaoMethodOutcome create(Encounter arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public DaoMethodOutcome create(Encounter arg0, String arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public DaoMethodOutcome create(Encounter arg0, String arg1, boolean arg2) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public DaoMethodOutcome delete(IdDt arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public DaoMethodOutcome deleteByUrl(String arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public TagList getAllResourceTags() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public TagList getTags(IdDt arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IBundleProvider history(Date arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IBundleProvider history(IdDt arg0, Date arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IBundleProvider history(Long arg0, Date arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public MetaDt metaAddOperation(IdDt arg0, MetaDt arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public MetaDt metaDeleteOperation(IdDt arg0, MetaDt arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public MetaDt metaGetOperation() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public MetaDt metaGetOperation(IdDt arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void removeTag(IdDt arg0, TagTypeEnum arg1, String arg2, String arg3) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public DaoMethodOutcome update(Encounter arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public DaoMethodOutcome update(Encounter arg0, String arg1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public DaoMethodOutcome update(Encounter arg0, String arg1, boolean arg2) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public Predicate translatePredicateString(String theParamName,
//			String likeExpression, Root<? extends IResourceEntity> from,
//			CriteriaBuilder theBuilder) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Predicate translatePredicateDateLessThan(String theParamName,
//			Date upperBound, Root<? extends IResourceEntity> from,
//			CriteriaBuilder theBuilder, boolean inclusive) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Predicate translatePredicateDateGreaterThan(String theParamName,
//			Date lowerBound, Root<? extends IResourceEntity> from,
//			CriteriaBuilder theBuilder, boolean inclusive) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
