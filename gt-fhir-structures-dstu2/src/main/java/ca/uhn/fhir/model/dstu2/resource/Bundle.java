















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
 * HAPI/FHIR <b>Bundle</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A container for a collection of resources.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Bundle">http://hl7.org/fhir/profiles/Bundle</a> 
 * </p>
 *
 */
@ResourceDef(name="Bundle", profile="http://hl7.org/fhir/profiles/Bundle", id="bundle")
public class Bundle extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     , org.hl7.fhir.instance.model.api.IBaseBundle
    {

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Bundle.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="Bundle.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Bundle.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>message</b>
	 * <p>
	 * Description: <b>The first resource in the bundle, if the bundle type is \&quot;message\&quot; - this is a message header, and this parameter provides access to search its contents</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Bundle.entry.resource(0)</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="message", path="Bundle.entry.resource(0)", description="The first resource in the bundle, if the bundle type is \"message\" - this is a message header, and this parameter provides access to search its contents", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.MessageHeader.class 	}
 )
	public static final String SP_MESSAGE = "message";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>message</b>
	 * <p>
	 * Description: <b>The first resource in the bundle, if the bundle type is \&quot;message\&quot; - this is a message header, and this parameter provides access to search its contents</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Bundle.entry.resource(0)</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam MESSAGE = new ReferenceClientParam(SP_MESSAGE);

	/**
	 * Search parameter constant for <b>composition</b>
	 * <p>
	 * Description: <b>The first resource in the bundle, if the bundle type is \&quot;document\&quot; - this is a composition, and this parameter provides access to searches its contents</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Bundle.entry.resource(0)</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="composition", path="Bundle.entry.resource(0)", description="The first resource in the bundle, if the bundle type is \"document\" - this is a composition, and this parameter provides access to searches its contents", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Composition.class 	}
 )
	public static final String SP_COMPOSITION = "composition";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>composition</b>
	 * <p>
	 * Description: <b>The first resource in the bundle, if the bundle type is \&quot;document\&quot; - this is a composition, and this parameter provides access to searches its contents</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Bundle.entry.resource(0)</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam COMPOSITION = new ReferenceClientParam(SP_COMPOSITION);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Bundle:composition</b>".
	 */
	public static final Include INCLUDE_COMPOSITION = new Include("Bundle:composition");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Bundle:message</b>".
	 */
	public static final Include INCLUDE_MESSAGE = new Include("Bundle:message");


	@Child(name="type", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the purpose of this bundle- how it was intended to be used"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/bundle-type")
	private BoundCodeDt<BundleTypeEnum> myType;
	
	@Child(name="total", type=UnsignedIntDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle)"
	)
	private UnsignedIntDt myTotal;
	
	@Child(name="link", order=2, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A series of links that provide context to this bundle"
	)
	private java.util.List<Link> myLink;
	
	@Child(name="entry", order=3, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)"
	)
	private java.util.List<Entry> myEntry;
	
	@Child(name="signature", type=SignatureDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Digital Signature - base64 encoded. XML DigSIg or a JWT"
	)
	private SignatureDt mySignature;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myTotal,  myLink,  myEntry,  mySignature);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myTotal, myLink, myEntry, mySignature);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the purpose of this bundle- how it was intended to be used
     * </p> 
	 */
	public BoundCodeDt<BundleTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<BundleTypeEnum>(BundleTypeEnum.VALUESET_BINDER);
		}
		return myType;
	}

	
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the purpose of this bundle- how it was intended to be used
     * </p> 
	 */
	public String getType() {  
		return getTypeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the purpose of this bundle- how it was intended to be used
     * </p> 
	 */
	public Bundle setType(BoundCodeDt<BundleTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the purpose of this bundle- how it was intended to be used
     * </p> 
	 */
	public Bundle setType(BundleTypeEnum theValue) {
		setType(new BoundCodeDt<BundleTypeEnum>(BundleTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>total</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle)
     * </p> 
	 */
	public UnsignedIntDt getTotalElement() {  
		if (myTotal == null) {
			myTotal = new UnsignedIntDt();
		}
		return myTotal;
	}

	
	/**
	 * Gets the value(s) for <b>total</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle)
     * </p> 
	 */
	public Integer getTotal() {  
		return getTotalElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>total</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle)
     * </p> 
	 */
	public Bundle setTotal(UnsignedIntDt theValue) {
		myTotal = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>total</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle)
     * </p> 
	 */
	public Bundle setTotal( int theInteger) {
		myTotal = new UnsignedIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>link</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A series of links that provide context to this bundle
     * </p> 
	 */
	public java.util.List<Link> getLink() {  
		if (myLink == null) {
			myLink = new java.util.ArrayList<Link>();
		}
		return myLink;
	}

	/**
	 * Sets the value(s) for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A series of links that provide context to this bundle
     * </p> 
	 */
	public Bundle setLink(java.util.List<Link> theValue) {
		myLink = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A series of links that provide context to this bundle
     * </p> 
	 */
	public Link addLink() {
		Link newType = new Link();
		getLink().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>link</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A series of links that provide context to this bundle
	 * </p>
	 * @param theValue The link to add (must not be <code>null</code>)
	 */
	public Bundle addLink(Link theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getLink().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>link</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A series of links that provide context to this bundle
     * </p> 
	 */
	public Link getLinkFirstRep() {
		if (getLink().isEmpty()) {
			return addLink();
		}
		return getLink().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>entry</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)
     * </p> 
	 */
	public java.util.List<Entry> getEntry() {  
		if (myEntry == null) {
			myEntry = new java.util.ArrayList<Entry>();
		}
		return myEntry;
	}

	/**
	 * Sets the value(s) for <b>entry</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)
     * </p> 
	 */
	public Bundle setEntry(java.util.List<Entry> theValue) {
		myEntry = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>entry</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)
     * </p> 
	 */
	public Entry addEntry() {
		Entry newType = new Entry();
		getEntry().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>entry</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)
	 * </p>
	 * @param theValue The entry to add (must not be <code>null</code>)
	 */
	public Bundle addEntry(Entry theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getEntry().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>entry</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)
     * </p> 
	 */
	public Entry getEntryFirstRep() {
		if (getEntry().isEmpty()) {
			return addEntry();
		}
		return getEntry().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>signature</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Digital Signature - base64 encoded. XML DigSIg or a JWT
     * </p> 
	 */
	public SignatureDt getSignature() {  
		if (mySignature == null) {
			mySignature = new SignatureDt();
		}
		return mySignature;
	}

	/**
	 * Sets the value(s) for <b>signature</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Digital Signature - base64 encoded. XML DigSIg or a JWT
     * </p> 
	 */
	public Bundle setSignature(SignatureDt theValue) {
		mySignature = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>Bundle.link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A series of links that provide context to this bundle
     * </p> 
	 */
	@Block()	
	public static class Link 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="relation", type=StringDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]]"
	)
	private StringDt myRelation;
	
	@Child(name="url", type=UriDt.class, order=1, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The reference details for the link"
	)
	private UriDt myUrl;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myRelation,  myUrl);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myRelation, myUrl);
	}

	/**
	 * Gets the value(s) for <b>relation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]]
     * </p> 
	 */
	public StringDt getRelationElement() {  
		if (myRelation == null) {
			myRelation = new StringDt();
		}
		return myRelation;
	}

	
	/**
	 * Gets the value(s) for <b>relation</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]]
     * </p> 
	 */
	public String getRelation() {  
		return getRelationElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>relation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]]
     * </p> 
	 */
	public Link setRelation(StringDt theValue) {
		myRelation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>relation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A name which details the functional use for this link - see [[http://www.iana.org/assignments/link-relations/link-relations.xhtml]]
     * </p> 
	 */
	public Link setRelation( String theString) {
		myRelation = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reference details for the link
     * </p> 
	 */
	public UriDt getUrlElement() {  
		if (myUrl == null) {
			myUrl = new UriDt();
		}
		return myUrl;
	}

	
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reference details for the link
     * </p> 
	 */
	public String getUrl() {  
		return getUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reference details for the link
     * </p> 
	 */
	public Link setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reference details for the link
     * </p> 
	 */
	public Link setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Bundle.entry</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)
     * </p> 
	 */
	@Block()	
	public static class Entry 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="link", type=Link.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A series of links that provide context to this entry"
	)
	private java.util.List<Link> myLink;
	
	@Child(name="fullUrl", type=UriDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource"
	)
	private UriDt myFullUrl;
	
	@Child(name="resource", type=IResource.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The Resources for the entry"
	)
	private IResource myResource;
	
	@Child(name="search", order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Information about the search process that lead to the creation of this entry"
	)
	private EntrySearch mySearch;
	
	@Child(name="request", order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional information about how this entry should be processed as part of a transaction"
	)
	private EntryRequest myRequest;
	
	@Child(name="response", order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional information about how this entry should be processed as part of a transaction"
	)
	private EntryResponse myResponse;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLink,  myFullUrl,  myResource,  mySearch,  myRequest,  myResponse);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLink, myFullUrl, myResource, mySearch, myRequest, myResponse);
	}

	/**
	 * Gets the value(s) for <b>link</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A series of links that provide context to this entry
     * </p> 
	 */
	public java.util.List<Link> getLink() {  
		if (myLink == null) {
			myLink = new java.util.ArrayList<Link>();
		}
		return myLink;
	}

	/**
	 * Sets the value(s) for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A series of links that provide context to this entry
     * </p> 
	 */
	public Entry setLink(java.util.List<Link> theValue) {
		myLink = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A series of links that provide context to this entry
     * </p> 
	 */
	public Link addLink() {
		Link newType = new Link();
		getLink().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>link</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A series of links that provide context to this entry
	 * </p>
	 * @param theValue The link to add (must not be <code>null</code>)
	 */
	public Entry addLink(Link theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getLink().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>link</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A series of links that provide context to this entry
     * </p> 
	 */
	public Link getLinkFirstRep() {
		if (getLink().isEmpty()) {
			return addLink();
		}
		return getLink().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>fullUrl</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource
     * </p> 
	 */
	public UriDt getFullUrlElement() {  
		if (myFullUrl == null) {
			myFullUrl = new UriDt();
		}
		return myFullUrl;
	}

	
	/**
	 * Gets the value(s) for <b>fullUrl</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource
     * </p> 
	 */
	public String getFullUrl() {  
		return getFullUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>fullUrl</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource
     * </p> 
	 */
	public Entry setFullUrl(UriDt theValue) {
		myFullUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>fullUrl</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Absolute URL for the resource. This must be provided for all resources. The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource
     * </p> 
	 */
	public Entry setFullUrl( String theUri) {
		myFullUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>resource</b> ().
	 *
     * <p>
     * <b>Definition:</b>
     * The Resources for the entry
     * </p> 
	 */
	public IResource getResource() {  
		return myResource;
	}


	/**
	 * Sets the value(s) for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Resources for the entry
     * </p> 
	 */
	public Entry setResource(IResource theValue) {
		myResource = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>search</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the search process that lead to the creation of this entry
     * </p> 
	 */
	public EntrySearch getSearch() {  
		if (mySearch == null) {
			mySearch = new EntrySearch();
		}
		return mySearch;
	}

	/**
	 * Sets the value(s) for <b>search</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the search process that lead to the creation of this entry
     * </p> 
	 */
	public Entry setSearch(EntrySearch theValue) {
		mySearch = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>request</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how this entry should be processed as part of a transaction
     * </p> 
	 */
	public EntryRequest getRequest() {  
		if (myRequest == null) {
			myRequest = new EntryRequest();
		}
		return myRequest;
	}

	/**
	 * Sets the value(s) for <b>request</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how this entry should be processed as part of a transaction
     * </p> 
	 */
	public Entry setRequest(EntryRequest theValue) {
		myRequest = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>response</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how this entry should be processed as part of a transaction
     * </p> 
	 */
	public EntryResponse getResponse() {  
		if (myResponse == null) {
			myResponse = new EntryResponse();
		}
		return myResponse;
	}

	/**
	 * Sets the value(s) for <b>response</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how this entry should be processed as part of a transaction
     * </p> 
	 */
	public Entry setResponse(EntryResponse theValue) {
		myResponse = theValue;
		return this;
	}
	
	

  


	}

	/**
	 * Block class for child element: <b>Bundle.entry.search</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the search process that lead to the creation of this entry
     * </p> 
	 */
	@Block()	
	public static class EntrySearch 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="mode", type=CodeDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Why this entry is in the result set - whether it's included as a match or because of an _include requirement"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/search-entry-mode")
	private BoundCodeDt<SearchEntryModeEnum> myMode;
	
	@Child(name="score", type=DecimalDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="When searching, the server's search ranking score for the entry"
	)
	private DecimalDt myScore;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myMode,  myScore);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myMode, myScore);
	}

	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Why this entry is in the result set - whether it's included as a match or because of an _include requirement
     * </p> 
	 */
	public BoundCodeDt<SearchEntryModeEnum> getModeElement() {  
		if (myMode == null) {
			myMode = new BoundCodeDt<SearchEntryModeEnum>(SearchEntryModeEnum.VALUESET_BINDER);
		}
		return myMode;
	}

	
	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Why this entry is in the result set - whether it's included as a match or because of an _include requirement
     * </p> 
	 */
	public String getMode() {  
		return getModeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Why this entry is in the result set - whether it's included as a match or because of an _include requirement
     * </p> 
	 */
	public EntrySearch setMode(BoundCodeDt<SearchEntryModeEnum> theValue) {
		myMode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Why this entry is in the result set - whether it's included as a match or because of an _include requirement
     * </p> 
	 */
	public EntrySearch setMode(SearchEntryModeEnum theValue) {
		setMode(new BoundCodeDt<SearchEntryModeEnum>(SearchEntryModeEnum.VALUESET_BINDER, theValue));
		
/*
		getModeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>score</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When searching, the server's search ranking score for the entry
     * </p> 
	 */
	public DecimalDt getScoreElement() {  
		if (myScore == null) {
			myScore = new DecimalDt();
		}
		return myScore;
	}

	
	/**
	 * Gets the value(s) for <b>score</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When searching, the server's search ranking score for the entry
     * </p> 
	 */
	public BigDecimal getScore() {  
		return getScoreElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>score</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When searching, the server's search ranking score for the entry
     * </p> 
	 */
	public EntrySearch setScore(DecimalDt theValue) {
		myScore = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>score</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When searching, the server's search ranking score for the entry
     * </p> 
	 */
	public EntrySearch setScore( long theValue) {
		myScore = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>score</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When searching, the server's search ranking score for the entry
     * </p> 
	 */
	public EntrySearch setScore( double theValue) {
		myScore = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>score</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When searching, the server's search ranking score for the entry
     * </p> 
	 */
	public EntrySearch setScore( java.math.BigDecimal theValue) {
		myScore = new DecimalDt(theValue); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Bundle.entry.request</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how this entry should be processed as part of a transaction
     * </p> 
	 */
	@Block()	
	public static class EntryRequest 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="method", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The HTTP verb for this entry in either a update history, or a transaction/ transaction response"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/http-verb")
	private BoundCodeDt<HTTPVerbEnum> myMethod;
	
	@Child(name="url", type=UriDt.class, order=1, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The URL for this entry, relative to the root (the address to which the request is posted)"
	)
	private UriDt myUrl;
	
	@Child(name="ifNoneMatch", type=StringDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If the ETag values match, return a 304 Not modified status. See the API documentation for [\"Conditional Read\"](http.html#cread)"
	)
	private StringDt myIfNoneMatch;
	
	@Child(name="ifModifiedSince", type=InstantDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Only perform the operation if the last updated date matches. See the API documentation for [\"Conditional Read\"](http.html#cread)"
	)
	private InstantDt myIfModifiedSince;
	
	@Child(name="ifMatch", type=StringDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Only perform the operation if the Etag value matches. For more information, see the API section [\"Managing Resource Contention\"](http.html#concurrency)"
	)
	private StringDt myIfMatch;
	
	@Child(name="ifNoneExist", type=StringDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\"Conditional Create\"](http.html#ccreate). This is just the query portion of the URL - what follows the \"?\" (not including the \"?\")"
	)
	private StringDt myIfNoneExist;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myMethod,  myUrl,  myIfNoneMatch,  myIfModifiedSince,  myIfMatch,  myIfNoneExist);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myMethod, myUrl, myIfNoneMatch, myIfModifiedSince, myIfMatch, myIfNoneExist);
	}

	/**
	 * Gets the value(s) for <b>method</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP verb for this entry in either a update history, or a transaction/ transaction response
     * </p> 
	 */
	public BoundCodeDt<HTTPVerbEnum> getMethodElement() {  
		if (myMethod == null) {
			myMethod = new BoundCodeDt<HTTPVerbEnum>(HTTPVerbEnum.VALUESET_BINDER);
		}
		return myMethod;
	}

	
	/**
	 * Gets the value(s) for <b>method</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP verb for this entry in either a update history, or a transaction/ transaction response
     * </p> 
	 */
	public String getMethod() {  
		return getMethodElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>method</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP verb for this entry in either a update history, or a transaction/ transaction response
     * </p> 
	 */
	public EntryRequest setMethod(BoundCodeDt<HTTPVerbEnum> theValue) {
		myMethod = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>method</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP verb for this entry in either a update history, or a transaction/ transaction response
     * </p> 
	 */
	public EntryRequest setMethod(HTTPVerbEnum theValue) {
		setMethod(new BoundCodeDt<HTTPVerbEnum>(HTTPVerbEnum.VALUESET_BINDER, theValue));
		
/*
		getMethodElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The URL for this entry, relative to the root (the address to which the request is posted)
     * </p> 
	 */
	public UriDt getUrlElement() {  
		if (myUrl == null) {
			myUrl = new UriDt();
		}
		return myUrl;
	}

	
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The URL for this entry, relative to the root (the address to which the request is posted)
     * </p> 
	 */
	public String getUrl() {  
		return getUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The URL for this entry, relative to the root (the address to which the request is posted)
     * </p> 
	 */
	public EntryRequest setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The URL for this entry, relative to the root (the address to which the request is posted)
     * </p> 
	 */
	public EntryRequest setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>ifNoneMatch</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If the ETag values match, return a 304 Not modified status. See the API documentation for [\&quot;Conditional Read\&quot;](http.html#cread)
     * </p> 
	 */
	public StringDt getIfNoneMatchElement() {  
		if (myIfNoneMatch == null) {
			myIfNoneMatch = new StringDt();
		}
		return myIfNoneMatch;
	}

	
	/**
	 * Gets the value(s) for <b>ifNoneMatch</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If the ETag values match, return a 304 Not modified status. See the API documentation for [\&quot;Conditional Read\&quot;](http.html#cread)
     * </p> 
	 */
	public String getIfNoneMatch() {  
		return getIfNoneMatchElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>ifNoneMatch</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the ETag values match, return a 304 Not modified status. See the API documentation for [\&quot;Conditional Read\&quot;](http.html#cread)
     * </p> 
	 */
	public EntryRequest setIfNoneMatch(StringDt theValue) {
		myIfNoneMatch = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>ifNoneMatch</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the ETag values match, return a 304 Not modified status. See the API documentation for [\&quot;Conditional Read\&quot;](http.html#cread)
     * </p> 
	 */
	public EntryRequest setIfNoneMatch( String theString) {
		myIfNoneMatch = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>ifModifiedSince</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Only perform the operation if the last updated date matches. See the API documentation for [\&quot;Conditional Read\&quot;](http.html#cread)
     * </p> 
	 */
	public InstantDt getIfModifiedSinceElement() {  
		if (myIfModifiedSince == null) {
			myIfModifiedSince = new InstantDt();
		}
		return myIfModifiedSince;
	}

	
	/**
	 * Gets the value(s) for <b>ifModifiedSince</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Only perform the operation if the last updated date matches. See the API documentation for [\&quot;Conditional Read\&quot;](http.html#cread)
     * </p> 
	 */
	public Date getIfModifiedSince() {  
		return getIfModifiedSinceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>ifModifiedSince</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Only perform the operation if the last updated date matches. See the API documentation for [\&quot;Conditional Read\&quot;](http.html#cread)
     * </p> 
	 */
	public EntryRequest setIfModifiedSince(InstantDt theValue) {
		myIfModifiedSince = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>ifModifiedSince</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Only perform the operation if the last updated date matches. See the API documentation for [\&quot;Conditional Read\&quot;](http.html#cread)
     * </p> 
	 */
	public EntryRequest setIfModifiedSinceWithMillisPrecision( Date theDate) {
		myIfModifiedSince = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>ifModifiedSince</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Only perform the operation if the last updated date matches. See the API documentation for [\&quot;Conditional Read\&quot;](http.html#cread)
     * </p> 
	 */
	public EntryRequest setIfModifiedSince( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myIfModifiedSince = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>ifMatch</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Only perform the operation if the Etag value matches. For more information, see the API section [\&quot;Managing Resource Contention\&quot;](http.html#concurrency)
     * </p> 
	 */
	public StringDt getIfMatchElement() {  
		if (myIfMatch == null) {
			myIfMatch = new StringDt();
		}
		return myIfMatch;
	}

	
	/**
	 * Gets the value(s) for <b>ifMatch</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Only perform the operation if the Etag value matches. For more information, see the API section [\&quot;Managing Resource Contention\&quot;](http.html#concurrency)
     * </p> 
	 */
	public String getIfMatch() {  
		return getIfMatchElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>ifMatch</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Only perform the operation if the Etag value matches. For more information, see the API section [\&quot;Managing Resource Contention\&quot;](http.html#concurrency)
     * </p> 
	 */
	public EntryRequest setIfMatch(StringDt theValue) {
		myIfMatch = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>ifMatch</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Only perform the operation if the Etag value matches. For more information, see the API section [\&quot;Managing Resource Contention\&quot;](http.html#concurrency)
     * </p> 
	 */
	public EntryRequest setIfMatch( String theString) {
		myIfMatch = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>ifNoneExist</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\&quot;Conditional Create\&quot;](http.html#ccreate). This is just the query portion of the URL - what follows the \&quot;?\&quot; (not including the \&quot;?\&quot;)
     * </p> 
	 */
	public StringDt getIfNoneExistElement() {  
		if (myIfNoneExist == null) {
			myIfNoneExist = new StringDt();
		}
		return myIfNoneExist;
	}

	
	/**
	 * Gets the value(s) for <b>ifNoneExist</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\&quot;Conditional Create\&quot;](http.html#ccreate). This is just the query portion of the URL - what follows the \&quot;?\&quot; (not including the \&quot;?\&quot;)
     * </p> 
	 */
	public String getIfNoneExist() {  
		return getIfNoneExistElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>ifNoneExist</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\&quot;Conditional Create\&quot;](http.html#ccreate). This is just the query portion of the URL - what follows the \&quot;?\&quot; (not including the \&quot;?\&quot;)
     * </p> 
	 */
	public EntryRequest setIfNoneExist(StringDt theValue) {
		myIfNoneExist = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>ifNoneExist</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\&quot;Conditional Create\&quot;](http.html#ccreate). This is just the query portion of the URL - what follows the \&quot;?\&quot; (not including the \&quot;?\&quot;)
     * </p> 
	 */
	public EntryRequest setIfNoneExist( String theString) {
		myIfNoneExist = new StringDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Bundle.entry.response</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how this entry should be processed as part of a transaction
     * </p> 
	 */
	@Block()	
	public static class EntryResponse 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="status", type=StringDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The status code returned by processing this entry"
	)
	private StringDt myStatus;
	
	@Child(name="location", type=UriDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The location header created by processing this operation"
	)
	private UriDt myLocation;
	
	@Child(name="etag", type=StringDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The etag for the resource, it the operation for the entry produced a versioned resource"
	)
	private StringDt myEtag;
	
	@Child(name="lastModified", type=InstantDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date/time that the resource was modified on the server"
	)
	private InstantDt myLastModified;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myStatus,  myLocation,  myEtag,  myLastModified);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myStatus, myLocation, myEtag, myLastModified);
	}

	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status code returned by processing this entry
     * </p> 
	 */
	public StringDt getStatusElement() {  
		if (myStatus == null) {
			myStatus = new StringDt();
		}
		return myStatus;
	}

	
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status code returned by processing this entry
     * </p> 
	 */
	public String getStatus() {  
		return getStatusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status code returned by processing this entry
     * </p> 
	 */
	public EntryResponse setStatus(StringDt theValue) {
		myStatus = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status code returned by processing this entry
     * </p> 
	 */
	public EntryResponse setStatus( String theString) {
		myStatus = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>location</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The location header created by processing this operation
     * </p> 
	 */
	public UriDt getLocationElement() {  
		if (myLocation == null) {
			myLocation = new UriDt();
		}
		return myLocation;
	}

	
	/**
	 * Gets the value(s) for <b>location</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The location header created by processing this operation
     * </p> 
	 */
	public String getLocation() {  
		return getLocationElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>location</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The location header created by processing this operation
     * </p> 
	 */
	public EntryResponse setLocation(UriDt theValue) {
		myLocation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>location</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The location header created by processing this operation
     * </p> 
	 */
	public EntryResponse setLocation( String theUri) {
		myLocation = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>etag</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The etag for the resource, it the operation for the entry produced a versioned resource
     * </p> 
	 */
	public StringDt getEtagElement() {  
		if (myEtag == null) {
			myEtag = new StringDt();
		}
		return myEtag;
	}

	
	/**
	 * Gets the value(s) for <b>etag</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The etag for the resource, it the operation for the entry produced a versioned resource
     * </p> 
	 */
	public String getEtag() {  
		return getEtagElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>etag</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The etag for the resource, it the operation for the entry produced a versioned resource
     * </p> 
	 */
	public EntryResponse setEtag(StringDt theValue) {
		myEtag = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>etag</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The etag for the resource, it the operation for the entry produced a versioned resource
     * </p> 
	 */
	public EntryResponse setEtag( String theString) {
		myEtag = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>lastModified</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time that the resource was modified on the server
     * </p> 
	 */
	public InstantDt getLastModifiedElement() {  
		if (myLastModified == null) {
			myLastModified = new InstantDt();
		}
		return myLastModified;
	}

	
	/**
	 * Gets the value(s) for <b>lastModified</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time that the resource was modified on the server
     * </p> 
	 */
	public Date getLastModified() {  
		return getLastModifiedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>lastModified</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time that the resource was modified on the server
     * </p> 
	 */
	public EntryResponse setLastModified(InstantDt theValue) {
		myLastModified = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>lastModified</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time that the resource was modified on the server
     * </p> 
	 */
	public EntryResponse setLastModifiedWithMillisPrecision( Date theDate) {
		myLastModified = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>lastModified</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time that the resource was modified on the server
     * </p> 
	 */
	public EntryResponse setLastModified( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myLastModified = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 


	}





    @Override
    public String getResourceName() {
        return "Bundle";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }

	/**
	 * Returns the {@link #getLink() link} which matches a given {@link Link#getRelation() relation}. 
	 * If no link is found which matches the given relation, returns <code>null</code>. If more than one
	 * link is found which matches the given relation, returns the first matching Link.
	 * 
	 * @param theRelation
	 *            The relation, such as "next", or "self. See the constants such as {@link IBaseBundle#LINK_SELF} and {@link IBaseBundle#LINK_NEXT}.
	 * @return Returns a matching Link, or <code>null</code>
	 * @see IBaseBundle#LINK_NEXT
	 * @see IBaseBundle#LINK_PREV
	 * @see IBaseBundle#LINK_SELF
	 */
	public Link getLink(String theRelation) {
		org.apache.commons.lang3.Validate.notBlank(theRelation, "theRelation may not be null or empty");
		for (Link next : getLink()) {
			if (theRelation.equals(next.getRelation())) {
				return next;
			}
		}
		return null;
	}

	/**
	 * Returns the {@link #getLink() link} which matches a given {@link Link#getRelation() relation}. 
	 * If no link is found which matches the given relation, creates a new Link with the
	 * given relation and adds it to this Bundle. If more than one
	 * link is found which matches the given relation, returns the first matching Link.
	 * 
	 * @param theRelation
	 *            The relation, such as "next", or "self. See the constants such as {@link IBaseBundle#LINK_SELF} and {@link IBaseBundle#LINK_NEXT}.
	 * @return Returns a matching Link, or <code>null</code>
	 * @see IBaseBundle#LINK_NEXT
	 * @see IBaseBundle#LINK_PREV
	 * @see IBaseBundle#LINK_SELF
	 */
	public Link getLinkOrCreate(String theRelation) {
		org.apache.commons.lang3.Validate.notBlank(theRelation, "theRelation may not be null or empty");
		for (Link next : getLink()) {
			if (theRelation.equals(next.getRelation())) {
				return next;
			}
		}
		Link retVal = new Link();
		retVal.setRelation(theRelation);
		getLink().add(retVal);
		return retVal;
	}

}
