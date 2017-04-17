















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
 * HAPI/FHIR <b>ProcessRequest</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ProcessRequest">http://hl7.org/fhir/profiles/ProcessRequest</a> 
 * </p>
 *
 */
@ResourceDef(name="ProcessRequest", profile="http://hl7.org/fhir/profiles/ProcessRequest", id="processrequest")
public class ProcessRequest extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The business identifier of the ProcessRequest</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ProcessRequest.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="ProcessRequest.identifier", description="The business identifier of the ProcessRequest", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The business identifier of the ProcessRequest</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ProcessRequest.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The organization who generated this request</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ProcessRequest.organization</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="organization", path="ProcessRequest.organization", description="The organization who generated this request", type="reference"  )
	public static final String SP_ORGANIZATION = "organization";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The organization who generated this request</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ProcessRequest.organization</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ORGANIZATION = new ReferenceClientParam(SP_ORGANIZATION);

	/**
	 * Search parameter constant for <b>provider</b>
	 * <p>
	 * Description: <b>The provider who regenerated this request</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ProcessRequest.provider</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="provider", path="ProcessRequest.provider", description="The provider who regenerated this request", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PROVIDER = "provider";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>provider</b>
	 * <p>
	 * Description: <b>The provider who regenerated this request</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ProcessRequest.provider</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PROVIDER = new ReferenceClientParam(SP_PROVIDER);

	/**
	 * Search parameter constant for <b>action</b>
	 * <p>
	 * Description: <b>The action requested by this resource</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ProcessRequest.action</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="action", path="ProcessRequest.action", description="The action requested by this resource", type="token"  )
	public static final String SP_ACTION = "action";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>action</b>
	 * <p>
	 * Description: <b>The action requested by this resource</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ProcessRequest.action</b><br>
	 * </p>
	 */
	public static final TokenClientParam ACTION = new TokenClientParam(SP_ACTION);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ProcessRequest:organization</b>".
	 */
	public static final Include INCLUDE_ORGANIZATION = new Include("ProcessRequest:organization");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ProcessRequest:provider</b>".
	 */
	public static final Include INCLUDE_PROVIDER = new Include("ProcessRequest:provider");


	@Child(name="action", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/actionlist")
	private BoundCodeDt<ActionListEnum> myAction;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The ProcessRequest business identifier"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="ruleset", type=CodingDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources."
	)
	private CodingDt myRuleset;
	
	@Child(name="originalRuleset", type=CodingDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The style (standard) and version of the original material which was converted into this resource."
	)
	private CodingDt myOriginalRuleset;
	
	@Child(name="created", type=DateTimeDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date when this resource was created."
	)
	private DateTimeDt myCreated;
	
	@Child(name="target", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The organization which is the target of the request."
	)
	private ResourceReferenceDt myTarget;
	
	@Child(name="provider", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The practitioner who is responsible for the action specified in thise request."
	)
	private ResourceReferenceDt myProvider;
	
	@Child(name="organization", order=7, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The organization which is responsible for the action speccified in thise request."
	)
	private ResourceReferenceDt myOrganization;
	
	@Child(name="request", order=8, min=0, max=1, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference of resource which is the target or subject of this action."
	)
	private ResourceReferenceDt myRequest;
	
	@Child(name="response", order=9, min=0, max=1, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference of a prior response to resource which is the target or subject of this action."
	)
	private ResourceReferenceDt myResponse;
	
	@Child(name="nullify", type=BooleanDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If true remove all history excluding audit."
	)
	private BooleanDt myNullify;
	
	@Child(name="reference", type=StringDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A reference to supply which authenticates the process."
	)
	private StringDt myReference;
	
	@Child(name="item", order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated."
	)
	private java.util.List<Item> myItem;
	
	@Child(name="include", type=StringDt.class, order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Names of resource types to include"
	)
	private java.util.List<StringDt> myInclude;
	
	@Child(name="exclude", type=StringDt.class, order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Names of resource types to exclude"
	)
	private java.util.List<StringDt> myExclude;
	
	@Child(name="period", type=PeriodDt.class, order=15, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A period of time during which the fulfilling resources would have been created."
	)
	private PeriodDt myPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myAction,  myIdentifier,  myRuleset,  myOriginalRuleset,  myCreated,  myTarget,  myProvider,  myOrganization,  myRequest,  myResponse,  myNullify,  myReference,  myItem,  myInclude,  myExclude,  myPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myAction, myIdentifier, myRuleset, myOriginalRuleset, myCreated, myTarget, myProvider, myOrganization, myRequest, myResponse, myNullify, myReference, myItem, myInclude, myExclude, myPeriod);
	}

	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest
     * </p> 
	 */
	public BoundCodeDt<ActionListEnum> getActionElement() {  
		if (myAction == null) {
			myAction = new BoundCodeDt<ActionListEnum>(ActionListEnum.VALUESET_BINDER);
		}
		return myAction;
	}

	
	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest
     * </p> 
	 */
	public String getAction() {  
		return getActionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest
     * </p> 
	 */
	public ProcessRequest setAction(BoundCodeDt<ActionListEnum> theValue) {
		myAction = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest
     * </p> 
	 */
	public ProcessRequest setAction(ActionListEnum theValue) {
		setAction(new BoundCodeDt<ActionListEnum>(ActionListEnum.VALUESET_BINDER, theValue));
		
/*
		getActionElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The ProcessRequest business identifier
     * </p> 
	 */
	public java.util.List<IdentifierDt> getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new java.util.ArrayList<IdentifierDt>();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The ProcessRequest business identifier
     * </p> 
	 */
	public ProcessRequest setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The ProcessRequest business identifier
     * </p> 
	 */
	public IdentifierDt addIdentifier() {
		IdentifierDt newType = new IdentifierDt();
		getIdentifier().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>identifier</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The ProcessRequest business identifier
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public ProcessRequest addIdentifier(IdentifierDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getIdentifier().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>identifier</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The ProcessRequest business identifier
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>ruleset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     * </p> 
	 */
	public CodingDt getRuleset() {  
		if (myRuleset == null) {
			myRuleset = new CodingDt();
		}
		return myRuleset;
	}

	/**
	 * Sets the value(s) for <b>ruleset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     * </p> 
	 */
	public ProcessRequest setRuleset(CodingDt theValue) {
		myRuleset = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>originalRuleset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The style (standard) and version of the original material which was converted into this resource.
     * </p> 
	 */
	public CodingDt getOriginalRuleset() {  
		if (myOriginalRuleset == null) {
			myOriginalRuleset = new CodingDt();
		}
		return myOriginalRuleset;
	}

	/**
	 * Sets the value(s) for <b>originalRuleset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The style (standard) and version of the original material which was converted into this resource.
     * </p> 
	 */
	public ProcessRequest setOriginalRuleset(CodingDt theValue) {
		myOriginalRuleset = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>created</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when this resource was created.
     * </p> 
	 */
	public DateTimeDt getCreatedElement() {  
		if (myCreated == null) {
			myCreated = new DateTimeDt();
		}
		return myCreated;
	}

	
	/**
	 * Gets the value(s) for <b>created</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when this resource was created.
     * </p> 
	 */
	public Date getCreated() {  
		return getCreatedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>created</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when this resource was created.
     * </p> 
	 */
	public ProcessRequest setCreated(DateTimeDt theValue) {
		myCreated = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>created</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when this resource was created.
     * </p> 
	 */
	public ProcessRequest setCreated( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myCreated = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>created</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when this resource was created.
     * </p> 
	 */
	public ProcessRequest setCreatedWithSecondsPrecision( Date theDate) {
		myCreated = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>target</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The organization which is the target of the request.
     * </p> 
	 */
	public ResourceReferenceDt getTarget() {  
		if (myTarget == null) {
			myTarget = new ResourceReferenceDt();
		}
		return myTarget;
	}

	/**
	 * Sets the value(s) for <b>target</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The organization which is the target of the request.
     * </p> 
	 */
	public ProcessRequest setTarget(ResourceReferenceDt theValue) {
		myTarget = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>provider</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner who is responsible for the action specified in thise request.
     * </p> 
	 */
	public ResourceReferenceDt getProvider() {  
		if (myProvider == null) {
			myProvider = new ResourceReferenceDt();
		}
		return myProvider;
	}

	/**
	 * Sets the value(s) for <b>provider</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner who is responsible for the action specified in thise request.
     * </p> 
	 */
	public ProcessRequest setProvider(ResourceReferenceDt theValue) {
		myProvider = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>organization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The organization which is responsible for the action speccified in thise request.
     * </p> 
	 */
	public ResourceReferenceDt getOrganization() {  
		if (myOrganization == null) {
			myOrganization = new ResourceReferenceDt();
		}
		return myOrganization;
	}

	/**
	 * Sets the value(s) for <b>organization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The organization which is responsible for the action speccified in thise request.
     * </p> 
	 */
	public ProcessRequest setOrganization(ResourceReferenceDt theValue) {
		myOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>request</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference of resource which is the target or subject of this action.
     * </p> 
	 */
	public ResourceReferenceDt getRequest() {  
		if (myRequest == null) {
			myRequest = new ResourceReferenceDt();
		}
		return myRequest;
	}

	/**
	 * Sets the value(s) for <b>request</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference of resource which is the target or subject of this action.
     * </p> 
	 */
	public ProcessRequest setRequest(ResourceReferenceDt theValue) {
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
     * Reference of a prior response to resource which is the target or subject of this action.
     * </p> 
	 */
	public ResourceReferenceDt getResponse() {  
		if (myResponse == null) {
			myResponse = new ResourceReferenceDt();
		}
		return myResponse;
	}

	/**
	 * Sets the value(s) for <b>response</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference of a prior response to resource which is the target or subject of this action.
     * </p> 
	 */
	public ProcessRequest setResponse(ResourceReferenceDt theValue) {
		myResponse = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>nullify</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true remove all history excluding audit.
     * </p> 
	 */
	public BooleanDt getNullifyElement() {  
		if (myNullify == null) {
			myNullify = new BooleanDt();
		}
		return myNullify;
	}

	
	/**
	 * Gets the value(s) for <b>nullify</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true remove all history excluding audit.
     * </p> 
	 */
	public Boolean getNullify() {  
		return getNullifyElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>nullify</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true remove all history excluding audit.
     * </p> 
	 */
	public ProcessRequest setNullify(BooleanDt theValue) {
		myNullify = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>nullify</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true remove all history excluding audit.
     * </p> 
	 */
	public ProcessRequest setNullify( boolean theBoolean) {
		myNullify = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>reference</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to supply which authenticates the process.
     * </p> 
	 */
	public StringDt getReferenceElement() {  
		if (myReference == null) {
			myReference = new StringDt();
		}
		return myReference;
	}

	
	/**
	 * Gets the value(s) for <b>reference</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to supply which authenticates the process.
     * </p> 
	 */
	public String getReference() {  
		return getReferenceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>reference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to supply which authenticates the process.
     * </p> 
	 */
	public ProcessRequest setReference(StringDt theValue) {
		myReference = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>reference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to supply which authenticates the process.
     * </p> 
	 */
	public ProcessRequest setReference( String theString) {
		myReference = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>item</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
     * </p> 
	 */
	public java.util.List<Item> getItem() {  
		if (myItem == null) {
			myItem = new java.util.ArrayList<Item>();
		}
		return myItem;
	}

	/**
	 * Sets the value(s) for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
     * </p> 
	 */
	public ProcessRequest setItem(java.util.List<Item> theValue) {
		myItem = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
     * </p> 
	 */
	public Item addItem() {
		Item newType = new Item();
		getItem().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>item</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
	 * </p>
	 * @param theValue The item to add (must not be <code>null</code>)
	 */
	public ProcessRequest addItem(Item theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getItem().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>item</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
     * </p> 
	 */
	public Item getItemFirstRep() {
		if (getItem().isEmpty()) {
			return addItem();
		}
		return getItem().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>include</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to include
     * </p> 
	 */
	public java.util.List<StringDt> getInclude() {  
		if (myInclude == null) {
			myInclude = new java.util.ArrayList<StringDt>();
		}
		return myInclude;
	}

	/**
	 * Sets the value(s) for <b>include</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to include
     * </p> 
	 */
	public ProcessRequest setInclude(java.util.List<StringDt> theValue) {
		myInclude = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>include</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to include
     * </p> 
	 */
	public StringDt addInclude() {
		StringDt newType = new StringDt();
		getInclude().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>include</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Names of resource types to include
	 * </p>
	 * @param theValue The include to add (must not be <code>null</code>)
	 */
	public ProcessRequest addInclude(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInclude().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>include</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to include
     * </p> 
	 */
	public StringDt getIncludeFirstRep() {
		if (getInclude().isEmpty()) {
			return addInclude();
		}
		return getInclude().get(0); 
	}
 	/**
	 * Adds a new value for <b>include</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to include
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public ProcessRequest addInclude( String theString) {
		if (myInclude == null) {
			myInclude = new java.util.ArrayList<StringDt>();
		}
		myInclude.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>exclude</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to exclude
     * </p> 
	 */
	public java.util.List<StringDt> getExclude() {  
		if (myExclude == null) {
			myExclude = new java.util.ArrayList<StringDt>();
		}
		return myExclude;
	}

	/**
	 * Sets the value(s) for <b>exclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to exclude
     * </p> 
	 */
	public ProcessRequest setExclude(java.util.List<StringDt> theValue) {
		myExclude = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>exclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to exclude
     * </p> 
	 */
	public StringDt addExclude() {
		StringDt newType = new StringDt();
		getExclude().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>exclude</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Names of resource types to exclude
	 * </p>
	 * @param theValue The exclude to add (must not be <code>null</code>)
	 */
	public ProcessRequest addExclude(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getExclude().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>exclude</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to exclude
     * </p> 
	 */
	public StringDt getExcludeFirstRep() {
		if (getExclude().isEmpty()) {
			return addExclude();
		}
		return getExclude().get(0); 
	}
 	/**
	 * Adds a new value for <b>exclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Names of resource types to exclude
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public ProcessRequest addExclude( String theString) {
		if (myExclude == null) {
			myExclude = new java.util.ArrayList<StringDt>();
		}
		myExclude.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A period of time during which the fulfilling resources would have been created.
     * </p> 
	 */
	public PeriodDt getPeriod() {  
		if (myPeriod == null) {
			myPeriod = new PeriodDt();
		}
		return myPeriod;
	}

	/**
	 * Sets the value(s) for <b>period</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A period of time during which the fulfilling resources would have been created.
     * </p> 
	 */
	public ProcessRequest setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>ProcessRequest.item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
     * </p> 
	 */
	@Block()	
	public static class Item 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequenceLinkId", type=IntegerDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A service line number."
	)
	private IntegerDt mySequenceLinkId;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequenceLinkId);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequenceLinkId);
	}

	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public IntegerDt getSequenceLinkIdElement() {  
		if (mySequenceLinkId == null) {
			mySequenceLinkId = new IntegerDt();
		}
		return mySequenceLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public Integer getSequenceLinkId() {  
		return getSequenceLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public Item setSequenceLinkId(IntegerDt theValue) {
		mySequenceLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public Item setSequenceLinkId( int theInteger) {
		mySequenceLinkId = new IntegerDt(theInteger); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "ProcessRequest";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
