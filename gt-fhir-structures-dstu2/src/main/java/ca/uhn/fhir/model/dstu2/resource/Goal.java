















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
 * HAPI/FHIR <b>Goal</b> Resource
 * (clinical.careprovision)
 *
 * <p>
 * <b>Definition:</b>
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Goal">http://hl7.org/fhir/profiles/Goal</a> 
 * </p>
 *
 */
@ResourceDef(name="Goal", profile="http://hl7.org/fhir/profiles/Goal", id="goal")
public class Goal extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Goal.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Goal.subject", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
, target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Goal.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Goal.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="Goal.subject", description="", type="reference"  )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Goal.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Goal.category</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="category", path="Goal.category", description="", type="token"  )
	public static final String SP_CATEGORY = "category";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Goal.category</b><br>
	 * </p>
	 */
	public static final TokenClientParam CATEGORY = new TokenClientParam(SP_CATEGORY);

	/**
	 * Search parameter constant for <b>targetdate</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Goal.targetDate</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="targetdate", path="Goal.targetDate", description="", type="date"  )
	public static final String SP_TARGETDATE = "targetdate";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>targetdate</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Goal.targetDate</b><br>
	 * </p>
	 */
	public static final DateClientParam TARGETDATE = new DateClientParam(SP_TARGETDATE);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Goal.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Goal.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Goal.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Goal.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Goal.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Goal.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Goal:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Goal:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Goal:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("Goal:subject");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="subject", order=1, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="Identifies the patient, group or organization for whom the goal is being established."
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="start", order=2, min=0, max=1, summary=true, modifier=false, type={
		DateDt.class, 		CodeableConceptDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The date or event after which the goal should begin being pursued"
	)
	private IDatatype myStart;
	
	@Child(name="target", order=3, min=0, max=1, summary=true, modifier=false, type={
		DateDt.class, 		DurationDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates either the date or the duration after start by which the goal should be met"
	)
	private IDatatype myTarget;
	
	@Child(name="category", type=CodeableConceptDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates a category the goal falls within"
	)
	private java.util.List<CodeableConceptDt> myCategory;
	
	@Child(name="description", type=StringDt.class, order=5, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Human-readable description of a specific desired objective of care."
	)
	private StringDt myDescription;
	
	@Child(name="status", type=CodeDt.class, order=6, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="Indicates whether the goal has been reached and is still considered relevant"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/goal-status")
	private BoundCodeDt<GoalStatusEnum> myStatus;
	
	@Child(name="statusDate", type=DateDt.class, order=7, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc."
	)
	private DateDt myStatusDate;
	
	@Child(name="statusReason", type=CodeableConceptDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Captures the reason for the current status."
	)
	private CodeableConceptDt myStatusReason;
	
	@Child(name="author", order=9, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="Indicates whose goal this is - patient goal, practitioner goal, etc."
	)
	private ResourceReferenceDt myAuthor;
	
	@Child(name="priority", type=CodeableConceptDt.class, order=10, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the mutually agreed level of importance associated with reaching/sustaining the goal"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-goal-priority")
	private BoundCodeableConceptDt<GoalPriorityEnum> myPriority;
	
	@Child(name="addresses", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Condition.class, 		ca.uhn.fhir.model.dstu2.resource.Observation.class, 		ca.uhn.fhir.model.dstu2.resource.MedicationStatement.class, 		ca.uhn.fhir.model.dstu2.resource.NutritionOrder.class, 		ca.uhn.fhir.model.dstu2.resource.ProcedureRequest.class, 		ca.uhn.fhir.model.dstu2.resource.RiskAssessment.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The identified conditions and other health record elements that are intended to be addressed by the goal"
	)
	private java.util.List<ResourceReferenceDt> myAddresses;
	
	@Child(name="note", type=AnnotationDt.class, order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Any comments related to the goal"
	)
	private java.util.List<AnnotationDt> myNote;
	
	@Child(name="outcome", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the change (or lack of change) at the point where the goal was deepmed to be cancelled or achieved."
	)
	private java.util.List<Outcome> myOutcome;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  mySubject,  myStart,  myTarget,  myCategory,  myDescription,  myStatus,  myStatusDate,  myStatusReason,  myAuthor,  myPriority,  myAddresses,  myNote,  myOutcome);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, mySubject, myStart, myTarget, myCategory, myDescription, myStatus, myStatusDate, myStatusReason, myAuthor, myPriority, myAddresses, myNote, myOutcome);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public java.util.List<IdentifierDt> getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new java.util.ArrayList<IdentifierDt>();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public Goal setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public IdentifierDt addIdentifier() {
		IdentifierDt newType = new IdentifierDt();
		getIdentifier().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>identifier</b> (id)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Goal addIdentifier(IdentifierDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getIdentifier().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>identifier</b> (id),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>subject</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the patient, group or organization for whom the goal is being established.
     * </p> 
	 */
	public ResourceReferenceDt getSubject() {  
		if (mySubject == null) {
			mySubject = new ResourceReferenceDt();
		}
		return mySubject;
	}

	/**
	 * Sets the value(s) for <b>subject</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the patient, group or organization for whom the goal is being established.
     * </p> 
	 */
	public Goal setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>start[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date or event after which the goal should begin being pursued
     * </p> 
	 */
	public IDatatype getStart() {  
		return myStart;
	}

	/**
	 * Sets the value(s) for <b>start[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date or event after which the goal should begin being pursued
     * </p> 
	 */
	public Goal setStart(IDatatype theValue) {
		myStart = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>target[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates either the date or the duration after start by which the goal should be met
     * </p> 
	 */
	public IDatatype getTarget() {  
		return myTarget;
	}

	/**
	 * Sets the value(s) for <b>target[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates either the date or the duration after start by which the goal should be met
     * </p> 
	 */
	public Goal setTarget(IDatatype theValue) {
		myTarget = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>category</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates a category the goal falls within
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getCategory() {  
		if (myCategory == null) {
			myCategory = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myCategory;
	}

	/**
	 * Sets the value(s) for <b>category</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates a category the goal falls within
     * </p> 
	 */
	public Goal setCategory(java.util.List<CodeableConceptDt> theValue) {
		myCategory = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>category</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates a category the goal falls within
     * </p> 
	 */
	public CodeableConceptDt addCategory() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getCategory().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>category</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Indicates a category the goal falls within
	 * </p>
	 * @param theValue The category to add (must not be <code>null</code>)
	 */
	public Goal addCategory(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCategory().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>category</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates a category the goal falls within
     * </p> 
	 */
	public CodeableConceptDt getCategoryFirstRep() {
		if (getCategory().isEmpty()) {
			return addCategory();
		}
		return getCategory().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of a specific desired objective of care.
     * </p> 
	 */
	public StringDt getDescriptionElement() {  
		if (myDescription == null) {
			myDescription = new StringDt();
		}
		return myDescription;
	}

	
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of a specific desired objective of care.
     * </p> 
	 */
	public String getDescription() {  
		return getDescriptionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of a specific desired objective of care.
     * </p> 
	 */
	public Goal setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of a specific desired objective of care.
     * </p> 
	 */
	public Goal setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the goal has been reached and is still considered relevant
     * </p> 
	 */
	public BoundCodeDt<GoalStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<GoalStatusEnum>(GoalStatusEnum.VALUESET_BINDER);
		}
		return myStatus;
	}

	
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the goal has been reached and is still considered relevant
     * </p> 
	 */
	public String getStatus() {  
		return getStatusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the goal has been reached and is still considered relevant
     * </p> 
	 */
	public Goal setStatus(BoundCodeDt<GoalStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the goal has been reached and is still considered relevant
     * </p> 
	 */
	public Goal setStatus(GoalStatusEnum theValue) {
		setStatus(new BoundCodeDt<GoalStatusEnum>(GoalStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>statusDate</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
     * </p> 
	 */
	public DateDt getStatusDateElement() {  
		if (myStatusDate == null) {
			myStatusDate = new DateDt();
		}
		return myStatusDate;
	}

	
	/**
	 * Gets the value(s) for <b>statusDate</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
     * </p> 
	 */
	public Date getStatusDate() {  
		return getStatusDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>statusDate</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
     * </p> 
	 */
	public Goal setStatusDate(DateDt theValue) {
		myStatusDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>statusDate</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
     * </p> 
	 */
	public Goal setStatusDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myStatusDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>statusDate</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc.
     * </p> 
	 */
	public Goal setStatusDateWithDayPrecision( Date theDate) {
		myStatusDate = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>statusReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Captures the reason for the current status.
     * </p> 
	 */
	public CodeableConceptDt getStatusReason() {  
		if (myStatusReason == null) {
			myStatusReason = new CodeableConceptDt();
		}
		return myStatusReason;
	}

	/**
	 * Sets the value(s) for <b>statusReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Captures the reason for the current status.
     * </p> 
	 */
	public Goal setStatusReason(CodeableConceptDt theValue) {
		myStatusReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>author</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whose goal this is - patient goal, practitioner goal, etc.
     * </p> 
	 */
	public ResourceReferenceDt getAuthor() {  
		if (myAuthor == null) {
			myAuthor = new ResourceReferenceDt();
		}
		return myAuthor;
	}

	/**
	 * Sets the value(s) for <b>author</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whose goal this is - patient goal, practitioner goal, etc.
     * </p> 
	 */
	public Goal setAuthor(ResourceReferenceDt theValue) {
		myAuthor = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>priority</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the mutually agreed level of importance associated with reaching/sustaining the goal
     * </p> 
	 */
	public BoundCodeableConceptDt<GoalPriorityEnum> getPriority() {  
		if (myPriority == null) {
			myPriority = new BoundCodeableConceptDt<GoalPriorityEnum>(GoalPriorityEnum.VALUESET_BINDER);
		}
		return myPriority;
	}

	/**
	 * Sets the value(s) for <b>priority</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the mutually agreed level of importance associated with reaching/sustaining the goal
     * </p> 
	 */
	public Goal setPriority(BoundCodeableConceptDt<GoalPriorityEnum> theValue) {
		myPriority = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>priority</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the mutually agreed level of importance associated with reaching/sustaining the goal
     * </p> 
	 */
	public Goal setPriority(GoalPriorityEnum theValue) {
		setPriority(new BoundCodeableConceptDt<GoalPriorityEnum>(GoalPriorityEnum.VALUESET_BINDER, theValue));
		
/*
		getPriority().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>addresses</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identified conditions and other health record elements that are intended to be addressed by the goal
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAddresses() {  
		if (myAddresses == null) {
			myAddresses = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAddresses;
	}

	/**
	 * Sets the value(s) for <b>addresses</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The identified conditions and other health record elements that are intended to be addressed by the goal
     * </p> 
	 */
	public Goal setAddresses(java.util.List<ResourceReferenceDt> theValue) {
		myAddresses = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>addresses</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The identified conditions and other health record elements that are intended to be addressed by the goal
     * </p> 
	 */
	public ResourceReferenceDt addAddresses() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAddresses().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Any comments related to the goal
     * </p> 
	 */
	public java.util.List<AnnotationDt> getNote() {  
		if (myNote == null) {
			myNote = new java.util.ArrayList<AnnotationDt>();
		}
		return myNote;
	}

	/**
	 * Sets the value(s) for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any comments related to the goal
     * </p> 
	 */
	public Goal setNote(java.util.List<AnnotationDt> theValue) {
		myNote = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any comments related to the goal
     * </p> 
	 */
	public AnnotationDt addNote() {
		AnnotationDt newType = new AnnotationDt();
		getNote().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>note</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Any comments related to the goal
	 * </p>
	 * @param theValue The note to add (must not be <code>null</code>)
	 */
	public Goal addNote(AnnotationDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getNote().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>note</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Any comments related to the goal
     * </p> 
	 */
	public AnnotationDt getNoteFirstRep() {
		if (getNote().isEmpty()) {
			return addNote();
		}
		return getNote().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>outcome</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the change (or lack of change) at the point where the goal was deepmed to be cancelled or achieved.
     * </p> 
	 */
	public java.util.List<Outcome> getOutcome() {  
		if (myOutcome == null) {
			myOutcome = new java.util.ArrayList<Outcome>();
		}
		return myOutcome;
	}

	/**
	 * Sets the value(s) for <b>outcome</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the change (or lack of change) at the point where the goal was deepmed to be cancelled or achieved.
     * </p> 
	 */
	public Goal setOutcome(java.util.List<Outcome> theValue) {
		myOutcome = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>outcome</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the change (or lack of change) at the point where the goal was deepmed to be cancelled or achieved.
     * </p> 
	 */
	public Outcome addOutcome() {
		Outcome newType = new Outcome();
		getOutcome().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>outcome</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifies the change (or lack of change) at the point where the goal was deepmed to be cancelled or achieved.
	 * </p>
	 * @param theValue The outcome to add (must not be <code>null</code>)
	 */
	public Goal addOutcome(Outcome theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getOutcome().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>outcome</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the change (or lack of change) at the point where the goal was deepmed to be cancelled or achieved.
     * </p> 
	 */
	public Outcome getOutcomeFirstRep() {
		if (getOutcome().isEmpty()) {
			return addOutcome();
		}
		return getOutcome().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Goal.outcome</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the change (or lack of change) at the point where the goal was deepmed to be cancelled or achieved.
     * </p> 
	 */
	@Block()	
	public static class Outcome 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="result", order=0, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Observation.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Details of what's changed (or not changed)"
	)
	private IDatatype myResult;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myResult);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myResult);
	}

	/**
	 * Gets the value(s) for <b>result[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details of what's changed (or not changed)
     * </p> 
	 */
	public IDatatype getResult() {  
		return myResult;
	}

	/**
	 * Sets the value(s) for <b>result[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details of what's changed (or not changed)
     * </p> 
	 */
	public Outcome setResult(IDatatype theValue) {
		myResult = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Goal";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
