















package ca.uhn.fhir.model.dstu2.resource;

import java.math.BigDecimal;
import java.net.URI;
import java.util.*;
import ca.uhn.fhir.model.api.*;
import ca.uhn.fhir.model.api.annotation.*;
import ca.uhn.fhir.rest.gclient.*;

import ca.uhn.fhir.model.dstu2.valueset.AccountStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ActionListEnum;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.valueset.AdjudicationCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdjudicationErrorCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdjustmentReasonCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdmitSourceEnum;
import ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCategoryEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCertaintyEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCriticalityEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceSeverityEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceTypeEnum;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.valueset.AnswerFormatEnum;
import ca.uhn.fhir.model.dstu2.resource.Appointment;
import ca.uhn.fhir.model.dstu2.valueset.AppointmentStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.AssertionDirectionTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AssertionOperatorTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AssertionResponseTypesEnum;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventActionEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventObjectLifecycleEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventObjectRoleEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventObjectTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventOutcomeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventParticipantNetworkTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventSourceTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.BindingStrengthEnum;
import ca.uhn.fhir.model.dstu2.resource.BodySite;
import ca.uhn.fhir.model.dstu2.valueset.BundleTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.CarePlan;
import ca.uhn.fhir.model.dstu2.valueset.CarePlanActivityStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.CarePlanRelationshipEnum;
import ca.uhn.fhir.model.dstu2.valueset.CarePlanStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Claim;
import ca.uhn.fhir.model.dstu2.resource.ClaimResponse;
import ca.uhn.fhir.model.dstu2.valueset.ClaimTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.ClinicalImpression;
import ca.uhn.fhir.model.dstu2.valueset.ClinicalImpressionStatusEnum;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Composition;
import ca.uhn.fhir.model.dstu2.valueset.CompositionAttestationModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.CompositionStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConceptMapEquivalenceEnum;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.dstu2.valueset.ConditionCategoryCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConditionClinicalStatusCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConditionVerificationStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConditionalDeleteStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Conformance;
import ca.uhn.fhir.model.dstu2.valueset.ConformanceEventModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConformanceResourceStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConformanceStatementKindEnum;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.valueset.ContentTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.Contract;
import ca.uhn.fhir.model.dstu2.resource.Coverage;
import ca.uhn.fhir.model.dstu2.valueset.DataElementStringencyEnum;
import ca.uhn.fhir.model.dstu2.valueset.DaysOfWeekEnum;
import ca.uhn.fhir.model.dstu2.valueset.DetectedIssueSeverityEnum;
import ca.uhn.fhir.model.dstu2.resource.Device;
import ca.uhn.fhir.model.dstu2.resource.DeviceComponent;
import ca.uhn.fhir.model.dstu2.resource.DeviceMetric;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricCalibrationStateEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricCalibrationTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricCategoryEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricColorEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricOperationalStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.DeviceUseRequest;
import ca.uhn.fhir.model.dstu2.valueset.DeviceUseRequestPriorityEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceUseRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderPriorityEnum;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.DiagnosticReport;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticReportStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.DigitalMediaTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.DocumentModeEnum;
import ca.uhn.fhir.model.dstu2.resource.DocumentReference;
import ca.uhn.fhir.model.dstu2.valueset.DocumentReferenceStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.DocumentRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu2.composite.ElementDefinitionDt;
import ca.uhn.fhir.model.dstu2.resource.EligibilityRequest;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.dstu2.valueset.EncounterLocationStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.dstu2.resource.EnrollmentRequest;
import ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare;
import ca.uhn.fhir.model.dstu2.valueset.EpisodeOfCareStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ExtensionContextEnum;
import ca.uhn.fhir.model.dstu2.valueset.FamilyHistoryStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.FamilyMemberHistory;
import ca.uhn.fhir.model.dstu2.valueset.FilterOperatorEnum;
import ca.uhn.fhir.model.dstu2.valueset.FlagStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Goal;
import ca.uhn.fhir.model.dstu2.valueset.GoalPriorityEnum;
import ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Group;
import ca.uhn.fhir.model.dstu2.valueset.GroupTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.GuideDependencyTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.GuidePageKindEnum;
import ca.uhn.fhir.model.dstu2.valueset.GuideResourcePurposeEnum;
import ca.uhn.fhir.model.dstu2.valueset.HTTPVerbEnum;
import ca.uhn.fhir.model.dstu2.resource.HealthcareService;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.valueset.IdentifierTypeCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.IdentityAssuranceLevelEnum;
import ca.uhn.fhir.model.dstu2.resource.ImagingObjectSelection;
import ca.uhn.fhir.model.dstu2.resource.ImagingStudy;
import ca.uhn.fhir.model.dstu2.resource.Immunization;
import ca.uhn.fhir.model.dstu2.valueset.InstanceAvailabilityEnum;
import ca.uhn.fhir.model.dstu2.valueset.IssueSeverityEnum;
import ca.uhn.fhir.model.dstu2.valueset.IssueTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.KOStitleEnum;
import ca.uhn.fhir.model.dstu2.valueset.LinkTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ListModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ListOrderCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.ListStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.valueset.LocationModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.LocationStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.LocationTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.MaritalStatusCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.MeasmntPrincipleEnum;
import ca.uhn.fhir.model.dstu2.resource.Media;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.dstu2.valueset.MedicationAdministrationStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.MedicationDispenseStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import ca.uhn.fhir.model.dstu2.valueset.MedicationOrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.MedicationStatement;
import ca.uhn.fhir.model.dstu2.valueset.MedicationStatementStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.MessageEventEnum;
import ca.uhn.fhir.model.dstu2.valueset.MessageSignificanceCategoryEnum;
import ca.uhn.fhir.model.dstu2.valueset.MessageTransportEnum;
import ca.uhn.fhir.model.dstu2.resource.NamingSystem;
import ca.uhn.fhir.model.dstu2.valueset.NamingSystemIdentifierTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.NamingSystemTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.NoteTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.NutritionOrder;
import ca.uhn.fhir.model.dstu2.valueset.NutritionOrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Observation;
import ca.uhn.fhir.model.dstu2.valueset.ObservationRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.OperationDefinition;
import ca.uhn.fhir.model.dstu2.valueset.OperationKindEnum;
import ca.uhn.fhir.model.dstu2.resource.OperationOutcome;
import ca.uhn.fhir.model.dstu2.valueset.OperationParameterUseEnum;
import ca.uhn.fhir.model.dstu2.resource.Order;
import ca.uhn.fhir.model.dstu2.valueset.OrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.valueset.ParticipantRequiredEnum;
import ca.uhn.fhir.model.dstu2.valueset.ParticipantStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ParticipantTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ParticipationStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.PayeeTypeCodesEnum;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.Person;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.dstu2.resource.Procedure;
import ca.uhn.fhir.model.dstu2.resource.ProcedureRequest;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestPriorityEnum;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.ProcessRequest;
import ca.uhn.fhir.model.dstu2.valueset.ProvenanceEntityRoleEnum;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.resource.Questionnaire;
import ca.uhn.fhir.model.dstu2.resource.QuestionnaireResponse;
import ca.uhn.fhir.model.dstu2.valueset.QuestionnaireResponseStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.QuestionnaireStatusEnum;
import ca.uhn.fhir.model.dstu2.composite.RangeDt;
import ca.uhn.fhir.model.dstu2.composite.RatioDt;
import ca.uhn.fhir.model.dstu2.valueset.ReferralMethodEnum;
import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.RelatedPerson;
import ca.uhn.fhir.model.dstu2.valueset.RemittanceOutcomeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ResourceTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ResourceVersionPolicyEnum;
import ca.uhn.fhir.model.dstu2.valueset.ResponseTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.RestfulConformanceModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.RestfulSecurityServiceEnum;
import ca.uhn.fhir.model.dstu2.resource.RiskAssessment;
import ca.uhn.fhir.model.dstu2.valueset.RulesetCodesEnum;
import ca.uhn.fhir.model.dstu2.composite.SampledDataDt;
import ca.uhn.fhir.model.dstu2.resource.Schedule;
import ca.uhn.fhir.model.dstu2.valueset.SearchEntryModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.SearchModifierCodeEnum;
import ca.uhn.fhir.model.dstu2.valueset.SearchParamTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ServiceProvisionConditionsEnum;
import ca.uhn.fhir.model.dstu2.composite.SignatureDt;
import ca.uhn.fhir.model.dstu2.resource.Slot;
import ca.uhn.fhir.model.dstu2.valueset.SlotStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Specimen;
import ca.uhn.fhir.model.dstu2.valueset.SpecimenStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.StructureDefinition;
import ca.uhn.fhir.model.dstu2.valueset.StructureDefinitionKindEnum;
import ca.uhn.fhir.model.dstu2.valueset.SubscriptionChannelTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.SubscriptionStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Substance;
import ca.uhn.fhir.model.dstu2.valueset.SubstanceCategoryCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.SupplyDeliveryStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.SupplyRequest;
import ca.uhn.fhir.model.dstu2.valueset.SupplyRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.SystemRestfulInteractionEnum;
import ca.uhn.fhir.model.api.TemporalPrecisionEnum;
import ca.uhn.fhir.model.dstu2.composite.TimingDt;
import ca.uhn.fhir.model.dstu2.valueset.TransactionModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.TypeRestfulInteractionEnum;
import ca.uhn.fhir.model.dstu2.valueset.UnknownContentCodeEnum;
import ca.uhn.fhir.model.dstu2.valueset.UseEnum;
import ca.uhn.fhir.model.dstu2.resource.ValueSet;
import ca.uhn.fhir.model.dstu2.valueset.VisionBaseEnum;
import ca.uhn.fhir.model.dstu2.valueset.VisionEyesEnum;
import ca.uhn.fhir.model.dstu2.resource.VisionPrescription;
import ca.uhn.fhir.model.dstu2.valueset.XPathUsageTypeEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.AgeDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.composite.MoneyDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.primitive.Base64BinaryDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.IntegerDt;
import ca.uhn.fhir.model.primitive.OidDt;
import ca.uhn.fhir.model.primitive.PositiveIntDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.TimeDt;
import ca.uhn.fhir.model.primitive.UnsignedIntDt;
import ca.uhn.fhir.model.primitive.UriDt;


/**
 * HAPI/FHIR <b>Test</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * [Template] Master Definition
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Test">http://hl7.org/fhir/profiles/Test</a> 
 * </p>
 *
 */
@ResourceDef(name="Test", profile="http://hl7.org/fhir/profiles/Test", id="test")
public class Test extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {



	@Child(name="stringErr", type=StringDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<StringDt> myStringErr;
	
	@Child(name="stringCorr", type=StringDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<StringDt> myStringCorr;
	
	@Child(name="booleanErr", type=BooleanDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<BooleanDt> myBooleanErr;
	
	@Child(name="booleanCorr", type=BooleanDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<BooleanDt> myBooleanCorr;
	
	@Child(name="integerErr", type=IntegerDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<IntegerDt> myIntegerErr;
	
	@Child(name="integerCorr", type=IntegerDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<IntegerDt> myIntegerCorr;
	
	@Child(name="decimalErr", type=DecimalDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<DecimalDt> myDecimalErr;
	
	@Child(name="decimalCorr", type=DecimalDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<DecimalDt> myDecimalCorr;
	
	@Child(name="b64Err", type=Base64BinaryDt.class, order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<Base64BinaryDt> myB64Err;
	
	@Child(name="b64Corr", type=Base64BinaryDt.class, order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<Base64BinaryDt> myB64Corr;
	
	@Child(name="instantErr", type=InstantDt.class, order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<InstantDt> myInstantErr;
	
	@Child(name="instantCorr", type=InstantDt.class, order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<InstantDt> myInstantCorr;
	
	@Child(name="uriErr", type=UriDt.class, order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<UriDt> myUriErr;
	
	@Child(name="uriCorr", type=UriDt.class, order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<UriDt> myUriCorr;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myStringErr,  myStringCorr,  myBooleanErr,  myBooleanCorr,  myIntegerErr,  myIntegerCorr,  myDecimalErr,  myDecimalCorr,  myB64Err,  myB64Corr,  myInstantErr,  myInstantCorr,  myUriErr,  myUriCorr);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myStringErr, myStringCorr, myBooleanErr, myBooleanCorr, myIntegerErr, myIntegerCorr, myDecimalErr, myDecimalCorr, myB64Err, myB64Corr, myInstantErr, myInstantCorr, myUriErr, myUriCorr);
	}

	/**
	 * Gets the value(s) for <b>stringErr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<StringDt> getStringErr() {  
		if (myStringErr == null) {
			myStringErr = new java.util.ArrayList<StringDt>();
		}
		return myStringErr;
	}

	/**
	 * Sets the value(s) for <b>stringErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setStringErr(java.util.List<StringDt> theValue) {
		myStringErr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>stringErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StringDt addStringErr() {
		StringDt newType = new StringDt();
		getStringErr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>stringErr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The stringErr to add (must not be <code>null</code>)
	 */
	public Test addStringErr(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getStringErr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>stringErr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StringDt getStringErrFirstRep() {
		if (getStringErr().isEmpty()) {
			return addStringErr();
		}
		return getStringErr().get(0); 
	}
 	/**
	 * Adds a new value for <b>stringErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addStringErr( String theString) {
		if (myStringErr == null) {
			myStringErr = new java.util.ArrayList<StringDt>();
		}
		myStringErr.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>stringCorr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<StringDt> getStringCorr() {  
		if (myStringCorr == null) {
			myStringCorr = new java.util.ArrayList<StringDt>();
		}
		return myStringCorr;
	}

	/**
	 * Sets the value(s) for <b>stringCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setStringCorr(java.util.List<StringDt> theValue) {
		myStringCorr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>stringCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StringDt addStringCorr() {
		StringDt newType = new StringDt();
		getStringCorr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>stringCorr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The stringCorr to add (must not be <code>null</code>)
	 */
	public Test addStringCorr(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getStringCorr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>stringCorr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StringDt getStringCorrFirstRep() {
		if (getStringCorr().isEmpty()) {
			return addStringCorr();
		}
		return getStringCorr().get(0); 
	}
 	/**
	 * Adds a new value for <b>stringCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addStringCorr( String theString) {
		if (myStringCorr == null) {
			myStringCorr = new java.util.ArrayList<StringDt>();
		}
		myStringCorr.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>booleanErr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<BooleanDt> getBooleanErr() {  
		if (myBooleanErr == null) {
			myBooleanErr = new java.util.ArrayList<BooleanDt>();
		}
		return myBooleanErr;
	}

	/**
	 * Sets the value(s) for <b>booleanErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setBooleanErr(java.util.List<BooleanDt> theValue) {
		myBooleanErr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>booleanErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BooleanDt addBooleanErr() {
		BooleanDt newType = new BooleanDt();
		getBooleanErr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>booleanErr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The booleanErr to add (must not be <code>null</code>)
	 */
	public Test addBooleanErr(BooleanDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getBooleanErr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>booleanErr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BooleanDt getBooleanErrFirstRep() {
		if (getBooleanErr().isEmpty()) {
			return addBooleanErr();
		}
		return getBooleanErr().get(0); 
	}
 	/**
	 * Adds a new value for <b>booleanErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addBooleanErr( boolean theBoolean) {
		if (myBooleanErr == null) {
			myBooleanErr = new java.util.ArrayList<BooleanDt>();
		}
		myBooleanErr.add(new BooleanDt(theBoolean));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>booleanCorr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<BooleanDt> getBooleanCorr() {  
		if (myBooleanCorr == null) {
			myBooleanCorr = new java.util.ArrayList<BooleanDt>();
		}
		return myBooleanCorr;
	}

	/**
	 * Sets the value(s) for <b>booleanCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setBooleanCorr(java.util.List<BooleanDt> theValue) {
		myBooleanCorr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>booleanCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BooleanDt addBooleanCorr() {
		BooleanDt newType = new BooleanDt();
		getBooleanCorr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>booleanCorr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The booleanCorr to add (must not be <code>null</code>)
	 */
	public Test addBooleanCorr(BooleanDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getBooleanCorr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>booleanCorr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BooleanDt getBooleanCorrFirstRep() {
		if (getBooleanCorr().isEmpty()) {
			return addBooleanCorr();
		}
		return getBooleanCorr().get(0); 
	}
 	/**
	 * Adds a new value for <b>booleanCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addBooleanCorr( boolean theBoolean) {
		if (myBooleanCorr == null) {
			myBooleanCorr = new java.util.ArrayList<BooleanDt>();
		}
		myBooleanCorr.add(new BooleanDt(theBoolean));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>integerErr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<IntegerDt> getIntegerErr() {  
		if (myIntegerErr == null) {
			myIntegerErr = new java.util.ArrayList<IntegerDt>();
		}
		return myIntegerErr;
	}

	/**
	 * Sets the value(s) for <b>integerErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setIntegerErr(java.util.List<IntegerDt> theValue) {
		myIntegerErr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>integerErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public IntegerDt addIntegerErr() {
		IntegerDt newType = new IntegerDt();
		getIntegerErr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>integerErr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The integerErr to add (must not be <code>null</code>)
	 */
	public Test addIntegerErr(IntegerDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getIntegerErr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>integerErr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public IntegerDt getIntegerErrFirstRep() {
		if (getIntegerErr().isEmpty()) {
			return addIntegerErr();
		}
		return getIntegerErr().get(0); 
	}
 	/**
	 * Adds a new value for <b>integerErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addIntegerErr( int theInteger) {
		if (myIntegerErr == null) {
			myIntegerErr = new java.util.ArrayList<IntegerDt>();
		}
		myIntegerErr.add(new IntegerDt(theInteger));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>integerCorr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<IntegerDt> getIntegerCorr() {  
		if (myIntegerCorr == null) {
			myIntegerCorr = new java.util.ArrayList<IntegerDt>();
		}
		return myIntegerCorr;
	}

	/**
	 * Sets the value(s) for <b>integerCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setIntegerCorr(java.util.List<IntegerDt> theValue) {
		myIntegerCorr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>integerCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public IntegerDt addIntegerCorr() {
		IntegerDt newType = new IntegerDt();
		getIntegerCorr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>integerCorr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The integerCorr to add (must not be <code>null</code>)
	 */
	public Test addIntegerCorr(IntegerDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getIntegerCorr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>integerCorr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public IntegerDt getIntegerCorrFirstRep() {
		if (getIntegerCorr().isEmpty()) {
			return addIntegerCorr();
		}
		return getIntegerCorr().get(0); 
	}
 	/**
	 * Adds a new value for <b>integerCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addIntegerCorr( int theInteger) {
		if (myIntegerCorr == null) {
			myIntegerCorr = new java.util.ArrayList<IntegerDt>();
		}
		myIntegerCorr.add(new IntegerDt(theInteger));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>decimalErr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<DecimalDt> getDecimalErr() {  
		if (myDecimalErr == null) {
			myDecimalErr = new java.util.ArrayList<DecimalDt>();
		}
		return myDecimalErr;
	}

	/**
	 * Sets the value(s) for <b>decimalErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setDecimalErr(java.util.List<DecimalDt> theValue) {
		myDecimalErr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>decimalErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public DecimalDt addDecimalErr() {
		DecimalDt newType = new DecimalDt();
		getDecimalErr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>decimalErr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The decimalErr to add (must not be <code>null</code>)
	 */
	public Test addDecimalErr(DecimalDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDecimalErr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>decimalErr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public DecimalDt getDecimalErrFirstRep() {
		if (getDecimalErr().isEmpty()) {
			return addDecimalErr();
		}
		return getDecimalErr().get(0); 
	}
 	/**
	 * Adds a new value for <b>decimalErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addDecimalErr( long theValue) {
		if (myDecimalErr == null) {
			myDecimalErr = new java.util.ArrayList<DecimalDt>();
		}
		myDecimalErr.add(new DecimalDt(theValue));
		return this; 
	}

	/**
	 * Adds a new value for <b>decimalErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addDecimalErr( double theValue) {
		if (myDecimalErr == null) {
			myDecimalErr = new java.util.ArrayList<DecimalDt>();
		}
		myDecimalErr.add(new DecimalDt(theValue));
		return this; 
	}

	/**
	 * Adds a new value for <b>decimalErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addDecimalErr( java.math.BigDecimal theValue) {
		if (myDecimalErr == null) {
			myDecimalErr = new java.util.ArrayList<DecimalDt>();
		}
		myDecimalErr.add(new DecimalDt(theValue));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>decimalCorr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<DecimalDt> getDecimalCorr() {  
		if (myDecimalCorr == null) {
			myDecimalCorr = new java.util.ArrayList<DecimalDt>();
		}
		return myDecimalCorr;
	}

	/**
	 * Sets the value(s) for <b>decimalCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setDecimalCorr(java.util.List<DecimalDt> theValue) {
		myDecimalCorr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>decimalCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public DecimalDt addDecimalCorr() {
		DecimalDt newType = new DecimalDt();
		getDecimalCorr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>decimalCorr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The decimalCorr to add (must not be <code>null</code>)
	 */
	public Test addDecimalCorr(DecimalDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDecimalCorr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>decimalCorr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public DecimalDt getDecimalCorrFirstRep() {
		if (getDecimalCorr().isEmpty()) {
			return addDecimalCorr();
		}
		return getDecimalCorr().get(0); 
	}
 	/**
	 * Adds a new value for <b>decimalCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addDecimalCorr( long theValue) {
		if (myDecimalCorr == null) {
			myDecimalCorr = new java.util.ArrayList<DecimalDt>();
		}
		myDecimalCorr.add(new DecimalDt(theValue));
		return this; 
	}

	/**
	 * Adds a new value for <b>decimalCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addDecimalCorr( double theValue) {
		if (myDecimalCorr == null) {
			myDecimalCorr = new java.util.ArrayList<DecimalDt>();
		}
		myDecimalCorr.add(new DecimalDt(theValue));
		return this; 
	}

	/**
	 * Adds a new value for <b>decimalCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addDecimalCorr( java.math.BigDecimal theValue) {
		if (myDecimalCorr == null) {
			myDecimalCorr = new java.util.ArrayList<DecimalDt>();
		}
		myDecimalCorr.add(new DecimalDt(theValue));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>b64Err</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<Base64BinaryDt> getB64Err() {  
		if (myB64Err == null) {
			myB64Err = new java.util.ArrayList<Base64BinaryDt>();
		}
		return myB64Err;
	}

	/**
	 * Sets the value(s) for <b>b64Err</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setB64Err(java.util.List<Base64BinaryDt> theValue) {
		myB64Err = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>b64Err</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Base64BinaryDt addB64Err() {
		Base64BinaryDt newType = new Base64BinaryDt();
		getB64Err().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>b64Err</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The b64Err to add (must not be <code>null</code>)
	 */
	public Test addB64Err(Base64BinaryDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getB64Err().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>b64Err</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Base64BinaryDt getB64ErrFirstRep() {
		if (getB64Err().isEmpty()) {
			return addB64Err();
		}
		return getB64Err().get(0); 
	}
 	/**
	 * Adds a new value for <b>b64Err</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addB64Err( byte[] theBytes) {
		if (myB64Err == null) {
			myB64Err = new java.util.ArrayList<Base64BinaryDt>();
		}
		myB64Err.add(new Base64BinaryDt(theBytes));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>b64Corr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<Base64BinaryDt> getB64Corr() {  
		if (myB64Corr == null) {
			myB64Corr = new java.util.ArrayList<Base64BinaryDt>();
		}
		return myB64Corr;
	}

	/**
	 * Sets the value(s) for <b>b64Corr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setB64Corr(java.util.List<Base64BinaryDt> theValue) {
		myB64Corr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>b64Corr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Base64BinaryDt addB64Corr() {
		Base64BinaryDt newType = new Base64BinaryDt();
		getB64Corr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>b64Corr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The b64Corr to add (must not be <code>null</code>)
	 */
	public Test addB64Corr(Base64BinaryDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getB64Corr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>b64Corr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Base64BinaryDt getB64CorrFirstRep() {
		if (getB64Corr().isEmpty()) {
			return addB64Corr();
		}
		return getB64Corr().get(0); 
	}
 	/**
	 * Adds a new value for <b>b64Corr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addB64Corr( byte[] theBytes) {
		if (myB64Corr == null) {
			myB64Corr = new java.util.ArrayList<Base64BinaryDt>();
		}
		myB64Corr.add(new Base64BinaryDt(theBytes));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>instantErr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<InstantDt> getInstantErr() {  
		if (myInstantErr == null) {
			myInstantErr = new java.util.ArrayList<InstantDt>();
		}
		return myInstantErr;
	}

	/**
	 * Sets the value(s) for <b>instantErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setInstantErr(java.util.List<InstantDt> theValue) {
		myInstantErr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>instantErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public InstantDt addInstantErr() {
		InstantDt newType = new InstantDt();
		getInstantErr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>instantErr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The instantErr to add (must not be <code>null</code>)
	 */
	public Test addInstantErr(InstantDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInstantErr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>instantErr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public InstantDt getInstantErrFirstRep() {
		if (getInstantErr().isEmpty()) {
			return addInstantErr();
		}
		return getInstantErr().get(0); 
	}
 	/**
	 * Adds a new value for <b>instantErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addInstantErr( Date theDate) {
		if (myInstantErr == null) {
			myInstantErr = new java.util.ArrayList<InstantDt>();
		}
		myInstantErr.add(new InstantDt(theDate));
		return this; 
	}

	/**
	 * Adds a new value for <b>instantErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addInstantErr( Date theDate,  TemporalPrecisionEnum thePrecision) {
		if (myInstantErr == null) {
			myInstantErr = new java.util.ArrayList<InstantDt>();
		}
		myInstantErr.add(new InstantDt(theDate, thePrecision));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>instantCorr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<InstantDt> getInstantCorr() {  
		if (myInstantCorr == null) {
			myInstantCorr = new java.util.ArrayList<InstantDt>();
		}
		return myInstantCorr;
	}

	/**
	 * Sets the value(s) for <b>instantCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setInstantCorr(java.util.List<InstantDt> theValue) {
		myInstantCorr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>instantCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public InstantDt addInstantCorr() {
		InstantDt newType = new InstantDt();
		getInstantCorr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>instantCorr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The instantCorr to add (must not be <code>null</code>)
	 */
	public Test addInstantCorr(InstantDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInstantCorr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>instantCorr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public InstantDt getInstantCorrFirstRep() {
		if (getInstantCorr().isEmpty()) {
			return addInstantCorr();
		}
		return getInstantCorr().get(0); 
	}
 	/**
	 * Adds a new value for <b>instantCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addInstantCorr( Date theDate) {
		if (myInstantCorr == null) {
			myInstantCorr = new java.util.ArrayList<InstantDt>();
		}
		myInstantCorr.add(new InstantDt(theDate));
		return this; 
	}

	/**
	 * Adds a new value for <b>instantCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addInstantCorr( Date theDate,  TemporalPrecisionEnum thePrecision) {
		if (myInstantCorr == null) {
			myInstantCorr = new java.util.ArrayList<InstantDt>();
		}
		myInstantCorr.add(new InstantDt(theDate, thePrecision));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>uriErr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<UriDt> getUriErr() {  
		if (myUriErr == null) {
			myUriErr = new java.util.ArrayList<UriDt>();
		}
		return myUriErr;
	}

	/**
	 * Sets the value(s) for <b>uriErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setUriErr(java.util.List<UriDt> theValue) {
		myUriErr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>uriErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt addUriErr() {
		UriDt newType = new UriDt();
		getUriErr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>uriErr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The uriErr to add (must not be <code>null</code>)
	 */
	public Test addUriErr(UriDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getUriErr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>uriErr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt getUriErrFirstRep() {
		if (getUriErr().isEmpty()) {
			return addUriErr();
		}
		return getUriErr().get(0); 
	}
 	/**
	 * Adds a new value for <b>uriErr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addUriErr( String theUri) {
		if (myUriErr == null) {
			myUriErr = new java.util.ArrayList<UriDt>();
		}
		myUriErr.add(new UriDt(theUri));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>uriCorr</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<UriDt> getUriCorr() {  
		if (myUriCorr == null) {
			myUriCorr = new java.util.ArrayList<UriDt>();
		}
		return myUriCorr;
	}

	/**
	 * Sets the value(s) for <b>uriCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Test setUriCorr(java.util.List<UriDt> theValue) {
		myUriCorr = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>uriCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt addUriCorr() {
		UriDt newType = new UriDt();
		getUriCorr().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>uriCorr</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The uriCorr to add (must not be <code>null</code>)
	 */
	public Test addUriCorr(UriDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getUriCorr().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>uriCorr</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public UriDt getUriCorrFirstRep() {
		if (getUriCorr().isEmpty()) {
			return addUriCorr();
		}
		return getUriCorr().get(0); 
	}
 	/**
	 * Adds a new value for <b>uriCorr</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Test addUriCorr( String theUri) {
		if (myUriCorr == null) {
			myUriCorr = new java.util.ArrayList<UriDt>();
		}
		myUriCorr.add(new UriDt(theUri));
		return this; 
	}

 


    @Override
    public String getResourceName() {
        return "Test";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
