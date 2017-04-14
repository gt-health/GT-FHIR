















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
 * HAPI/FHIR <b>CarePlan</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/CarePlan">http://hl7.org/fhir/profiles/CarePlan</a> 
 * </p>
 *
 */
@ResourceDef(name="CarePlan", profile="http://hl7.org/fhir/profiles/CarePlan", id="careplan")
public class CarePlan extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="CarePlan.subject", description="", type="reference" , providesMembershipIn={
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
	 * Path: <b>CarePlan.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="CarePlan.subject", description="", type="reference"  )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>condition</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.addresses</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="condition", path="CarePlan.addresses", description="", type="reference"  )
	public static final String SP_CONDITION = "condition";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>condition</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.addresses</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam CONDITION = new ReferenceClientParam(SP_CONDITION);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>CarePlan.period</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="CarePlan.period", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>CarePlan.period</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>participant</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.participant.member</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="participant", path="CarePlan.participant.member", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_PARTICIPANT = "participant";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>participant</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.participant.member</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PARTICIPANT = new ReferenceClientParam(SP_PARTICIPANT);

	/**
	 * Search parameter constant for <b>activitycode</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>CarePlan.activity.detail.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="activitycode", path="CarePlan.activity.detail.code", description="", type="token"  )
	public static final String SP_ACTIVITYCODE = "activitycode";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>activitycode</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>CarePlan.activity.detail.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam ACTIVITYCODE = new TokenClientParam(SP_ACTIVITYCODE);

	/**
	 * Search parameter constant for <b>activitydate</b>
	 * <p>
	 * Description: <b>Specified date occurs within period specified by CarePlan.activity.timingSchedule</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>CarePlan.activity.detail.scheduled[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="activitydate", path="CarePlan.activity.detail.scheduled[x]", description="Specified date occurs within period specified by CarePlan.activity.timingSchedule", type="date"  )
	public static final String SP_ACTIVITYDATE = "activitydate";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>activitydate</b>
	 * <p>
	 * Description: <b>Specified date occurs within period specified by CarePlan.activity.timingSchedule</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>CarePlan.activity.detail.scheduled[x]</b><br>
	 * </p>
	 */
	public static final DateClientParam ACTIVITYDATE = new DateClientParam(SP_ACTIVITYDATE);

	/**
	 * Search parameter constant for <b>activityreference</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.activity.reference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="activityreference", path="CarePlan.activity.reference", description="", type="reference"  )
	public static final String SP_ACTIVITYREFERENCE = "activityreference";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>activityreference</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.activity.reference</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ACTIVITYREFERENCE = new ReferenceClientParam(SP_ACTIVITYREFERENCE);

	/**
	 * Search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b>Matches if the practitioner is listed as a performer in any of the \&quot;simple\&quot; activities.  (For performers of the detailed activities, chain through the activitydetail search parameter.)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.activity.detail.performer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="performer", path="CarePlan.activity.detail.performer", description="Matches if the practitioner is listed as a performer in any of the \"simple\" activities.  (For performers of the detailed activities, chain through the activitydetail search parameter.)", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_PERFORMER = "performer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b>Matches if the practitioner is listed as a performer in any of the \&quot;simple\&quot; activities.  (For performers of the detailed activities, chain through the activitydetail search parameter.)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.activity.detail.performer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PERFORMER = new ReferenceClientParam(SP_PERFORMER);

	/**
	 * Search parameter constant for <b>goal</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.goal</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="goal", path="CarePlan.goal", description="", type="reference"  )
	public static final String SP_GOAL = "goal";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>goal</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.goal</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam GOAL = new ReferenceClientParam(SP_GOAL);

	/**
	 * Search parameter constant for <b>relatedcode</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>CarePlan.relatedPlan.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="relatedcode", path="CarePlan.relatedPlan.code", description="", type="token"  )
	public static final String SP_RELATEDCODE = "relatedcode";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>relatedcode</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>CarePlan.relatedPlan.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam RELATEDCODE = new TokenClientParam(SP_RELATEDCODE);

	/**
	 * Search parameter constant for <b>relatedplan</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.relatedPlan.plan</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="relatedplan", path="CarePlan.relatedPlan.plan", description="", type="reference"  )
	public static final String SP_RELATEDPLAN = "relatedplan";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>relatedplan</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>CarePlan.relatedPlan.plan</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RELATEDPLAN = new ReferenceClientParam(SP_RELATEDPLAN);

	/**
	 * Search parameter constant for <b>relatedcode-relatedplan</b>
	 * <p>
	 * Description: <b>A combination of the type of relationship and the related plan</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>relatedcode &amp; relatedplan</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="relatedcode-relatedplan", path="relatedcode & relatedplan", description="A combination of the type of relationship and the related plan", type="composite"  , compositeOf={  "relatedcode",  "relatedplan" }  )
	public static final String SP_RELATEDCODE_RELATEDPLAN = "relatedcode-relatedplan";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>relatedcode-relatedplan</b>
	 * <p>
	 * Description: <b>A combination of the type of relationship and the related plan</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>relatedcode &amp; relatedplan</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, ReferenceClientParam> RELATEDCODE_RELATEDPLAN = new CompositeClientParam<TokenClientParam, ReferenceClientParam>(SP_RELATEDCODE_RELATEDPLAN);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>CarePlan:activityreference</b>".
	 */
	public static final Include INCLUDE_ACTIVITYREFERENCE = new Include("CarePlan:activityreference");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>CarePlan:condition</b>".
	 */
	public static final Include INCLUDE_CONDITION = new Include("CarePlan:condition");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>CarePlan:goal</b>".
	 */
	public static final Include INCLUDE_GOAL = new Include("CarePlan:goal");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>CarePlan:participant</b>".
	 */
	public static final Include INCLUDE_PARTICIPANT = new Include("CarePlan:participant");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>CarePlan:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("CarePlan:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>CarePlan:performer</b>".
	 */
	public static final Include INCLUDE_PERFORMER = new Include("CarePlan:performer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>CarePlan:relatedplan</b>".
	 */
	public static final Include INCLUDE_RELATEDPLAN = new Include("CarePlan:relatedplan");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>CarePlan:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("CarePlan:subject");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="subject", order=1, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the patient or group whose intended care is described by the plan."
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="status", type=CodeDt.class, order=2, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-status")
	private BoundCodeDt<CarePlanStatusEnum> myStatus;
	
	@Child(name="context", order=3, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class, 		ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the context in which this particular CarePlan is defined."
	)
	private ResourceReferenceDt myContext;
	
	@Child(name="period", type=PeriodDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates when the plan did (or is intended to) come into effect and end."
	)
	private PeriodDt myPeriod;
	
	@Child(name="author", order=5, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the individual(s) or ogranization who is responsible for the content of the care plan."
	)
	private java.util.List<ResourceReferenceDt> myAuthor;
	
	@Child(name="modified", type=DateTimeDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the most recent date on which the plan has been revised."
	)
	private DateTimeDt myModified;
	
	@Child(name="category", type=CodeableConceptDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies what \"kind\" of plan this is to support differentiation between multiple co-existing plans; e.g. \"Home health\", \"psychiatric\", \"asthma\", \"disease management\", \"wellness plan\", etc."
	)
	private java.util.List<CodeableConceptDt> myCategory;
	
	@Child(name="description", type=StringDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of the scope and nature of the plan"
	)
	private StringDt myDescription;
	
	@Child(name="addresses", order=9, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Condition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan."
	)
	private java.util.List<ResourceReferenceDt> myAddresses;
	
	@Child(name="support", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc."
	)
	private java.util.List<ResourceReferenceDt> mySupport;
	
	@Child(name="relatedPlan", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies CarePlans with some sort of formal relationship to the current plan."
	)
	private java.util.List<RelatedPlan> myRelatedPlan;
	
	@Child(name="participant", order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies all people and organizations who are expected to be involved in the care envisioned by this plan."
	)
	private java.util.List<Participant> myParticipant;
	
	@Child(name="goal", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Goal.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Describes the intended objective(s) of carrying out the care plan."
	)
	private java.util.List<ResourceReferenceDt> myGoal;
	
	@Child(name="activity", order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc."
	)
	private java.util.List<Activity> myActivity;
	
	@Child(name="note", type=AnnotationDt.class, order=15, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="General notes about the care plan not covered elsewhere"
	)
	private AnnotationDt myNote;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  mySubject,  myStatus,  myContext,  myPeriod,  myAuthor,  myModified,  myCategory,  myDescription,  myAddresses,  mySupport,  myRelatedPlan,  myParticipant,  myGoal,  myActivity,  myNote);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, mySubject, myStatus, myContext, myPeriod, myAuthor, myModified, myCategory, myDescription, myAddresses, mySupport, myRelatedPlan, myParticipant, myGoal, myActivity, myNote);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
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
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public CarePlan setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
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
	 * Adds a given new value for <b>identifier</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public CarePlan addIdentifier(IdentifierDt theValue) {
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
	 * Gets the value(s) for <b>subject</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the patient or group whose intended care is described by the plan.
     * </p> 
	 */
	public ResourceReferenceDt getSubject() {  
		if (mySubject == null) {
			mySubject = new ResourceReferenceDt();
		}
		return mySubject;
	}

	/**
	 * Sets the value(s) for <b>subject</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the patient or group whose intended care is described by the plan.
     * </p> 
	 */
	public CarePlan setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
     * </p> 
	 */
	public BoundCodeDt<CarePlanStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<CarePlanStatusEnum>(CarePlanStatusEnum.VALUESET_BINDER);
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
     * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
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
     * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
     * </p> 
	 */
	public CarePlan setStatus(BoundCodeDt<CarePlanStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
     * </p> 
	 */
	public CarePlan setStatus(CarePlanStatusEnum theValue) {
		setStatus(new BoundCodeDt<CarePlanStatusEnum>(CarePlanStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>context</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the context in which this particular CarePlan is defined.
     * </p> 
	 */
	public ResourceReferenceDt getContext() {  
		if (myContext == null) {
			myContext = new ResourceReferenceDt();
		}
		return myContext;
	}

	/**
	 * Sets the value(s) for <b>context</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the context in which this particular CarePlan is defined.
     * </p> 
	 */
	public CarePlan setContext(ResourceReferenceDt theValue) {
		myContext = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates when the plan did (or is intended to) come into effect and end.
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
     * Indicates when the plan did (or is intended to) come into effect and end.
     * </p> 
	 */
	public CarePlan setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>author</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the individual(s) or ogranization who is responsible for the content of the care plan.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAuthor() {  
		if (myAuthor == null) {
			myAuthor = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAuthor;
	}

	/**
	 * Sets the value(s) for <b>author</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the individual(s) or ogranization who is responsible for the content of the care plan.
     * </p> 
	 */
	public CarePlan setAuthor(java.util.List<ResourceReferenceDt> theValue) {
		myAuthor = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>author</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the individual(s) or ogranization who is responsible for the content of the care plan.
     * </p> 
	 */
	public ResourceReferenceDt addAuthor() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAuthor().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>modified</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the most recent date on which the plan has been revised.
     * </p> 
	 */
	public DateTimeDt getModifiedElement() {  
		if (myModified == null) {
			myModified = new DateTimeDt();
		}
		return myModified;
	}

	
	/**
	 * Gets the value(s) for <b>modified</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the most recent date on which the plan has been revised.
     * </p> 
	 */
	public Date getModified() {  
		return getModifiedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>modified</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the most recent date on which the plan has been revised.
     * </p> 
	 */
	public CarePlan setModified(DateTimeDt theValue) {
		myModified = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>modified</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the most recent date on which the plan has been revised.
     * </p> 
	 */
	public CarePlan setModified( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myModified = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>modified</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the most recent date on which the plan has been revised.
     * </p> 
	 */
	public CarePlan setModifiedWithSecondsPrecision( Date theDate) {
		myModified = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>category</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies what \&quot;kind\&quot; of plan this is to support differentiation between multiple co-existing plans; e.g. \&quot;Home health\&quot;, \&quot;psychiatric\&quot;, \&quot;asthma\&quot;, \&quot;disease management\&quot;, \&quot;wellness plan\&quot;, etc.
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
     * Identifies what \&quot;kind\&quot; of plan this is to support differentiation between multiple co-existing plans; e.g. \&quot;Home health\&quot;, \&quot;psychiatric\&quot;, \&quot;asthma\&quot;, \&quot;disease management\&quot;, \&quot;wellness plan\&quot;, etc.
     * </p> 
	 */
	public CarePlan setCategory(java.util.List<CodeableConceptDt> theValue) {
		myCategory = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>category</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies what \&quot;kind\&quot; of plan this is to support differentiation between multiple co-existing plans; e.g. \&quot;Home health\&quot;, \&quot;psychiatric\&quot;, \&quot;asthma\&quot;, \&quot;disease management\&quot;, \&quot;wellness plan\&quot;, etc.
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
	 * Identifies what \&quot;kind\&quot; of plan this is to support differentiation between multiple co-existing plans; e.g. \&quot;Home health\&quot;, \&quot;psychiatric\&quot;, \&quot;asthma\&quot;, \&quot;disease management\&quot;, \&quot;wellness plan\&quot;, etc.
	 * </p>
	 * @param theValue The category to add (must not be <code>null</code>)
	 */
	public CarePlan addCategory(CodeableConceptDt theValue) {
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
     * Identifies what \&quot;kind\&quot; of plan this is to support differentiation between multiple co-existing plans; e.g. \&quot;Home health\&quot;, \&quot;psychiatric\&quot;, \&quot;asthma\&quot;, \&quot;disease management\&quot;, \&quot;wellness plan\&quot;, etc.
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
     * A description of the scope and nature of the plan
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
     * A description of the scope and nature of the plan
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
     * A description of the scope and nature of the plan
     * </p> 
	 */
	public CarePlan setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the scope and nature of the plan
     * </p> 
	 */
	public CarePlan setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>addresses</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
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
     * Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
     * </p> 
	 */
	public CarePlan setAddresses(java.util.List<ResourceReferenceDt> theValue) {
		myAddresses = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>addresses</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
     * </p> 
	 */
	public ResourceReferenceDt addAddresses() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAddresses().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>support</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSupport() {  
		if (mySupport == null) {
			mySupport = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySupport;
	}

	/**
	 * Sets the value(s) for <b>support</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.
     * </p> 
	 */
	public CarePlan setSupport(java.util.List<ResourceReferenceDt> theValue) {
		mySupport = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>support</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.
     * </p> 
	 */
	public ResourceReferenceDt addSupport() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSupport().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>relatedPlan</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies CarePlans with some sort of formal relationship to the current plan.
     * </p> 
	 */
	public java.util.List<RelatedPlan> getRelatedPlan() {  
		if (myRelatedPlan == null) {
			myRelatedPlan = new java.util.ArrayList<RelatedPlan>();
		}
		return myRelatedPlan;
	}

	/**
	 * Sets the value(s) for <b>relatedPlan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies CarePlans with some sort of formal relationship to the current plan.
     * </p> 
	 */
	public CarePlan setRelatedPlan(java.util.List<RelatedPlan> theValue) {
		myRelatedPlan = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>relatedPlan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies CarePlans with some sort of formal relationship to the current plan.
     * </p> 
	 */
	public RelatedPlan addRelatedPlan() {
		RelatedPlan newType = new RelatedPlan();
		getRelatedPlan().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>relatedPlan</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifies CarePlans with some sort of formal relationship to the current plan.
	 * </p>
	 * @param theValue The relatedPlan to add (must not be <code>null</code>)
	 */
	public CarePlan addRelatedPlan(RelatedPlan theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRelatedPlan().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>relatedPlan</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies CarePlans with some sort of formal relationship to the current plan.
     * </p> 
	 */
	public RelatedPlan getRelatedPlanFirstRep() {
		if (getRelatedPlan().isEmpty()) {
			return addRelatedPlan();
		}
		return getRelatedPlan().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>participant</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
     * </p> 
	 */
	public java.util.List<Participant> getParticipant() {  
		if (myParticipant == null) {
			myParticipant = new java.util.ArrayList<Participant>();
		}
		return myParticipant;
	}

	/**
	 * Sets the value(s) for <b>participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
     * </p> 
	 */
	public CarePlan setParticipant(java.util.List<Participant> theValue) {
		myParticipant = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
     * </p> 
	 */
	public Participant addParticipant() {
		Participant newType = new Participant();
		getParticipant().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>participant</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
	 * </p>
	 * @param theValue The participant to add (must not be <code>null</code>)
	 */
	public CarePlan addParticipant(Participant theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getParticipant().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>participant</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
     * </p> 
	 */
	public Participant getParticipantFirstRep() {
		if (getParticipant().isEmpty()) {
			return addParticipant();
		}
		return getParticipant().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>goal</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the intended objective(s) of carrying out the care plan.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getGoal() {  
		if (myGoal == null) {
			myGoal = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myGoal;
	}

	/**
	 * Sets the value(s) for <b>goal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the intended objective(s) of carrying out the care plan.
     * </p> 
	 */
	public CarePlan setGoal(java.util.List<ResourceReferenceDt> theValue) {
		myGoal = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>goal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the intended objective(s) of carrying out the care plan.
     * </p> 
	 */
	public ResourceReferenceDt addGoal() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getGoal().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>activity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
     * </p> 
	 */
	public java.util.List<Activity> getActivity() {  
		if (myActivity == null) {
			myActivity = new java.util.ArrayList<Activity>();
		}
		return myActivity;
	}

	/**
	 * Sets the value(s) for <b>activity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
     * </p> 
	 */
	public CarePlan setActivity(java.util.List<Activity> theValue) {
		myActivity = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>activity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
     * </p> 
	 */
	public Activity addActivity() {
		Activity newType = new Activity();
		getActivity().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>activity</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
	 * </p>
	 * @param theValue The activity to add (must not be <code>null</code>)
	 */
	public CarePlan addActivity(Activity theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getActivity().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>activity</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
     * </p> 
	 */
	public Activity getActivityFirstRep() {
		if (getActivity().isEmpty()) {
			return addActivity();
		}
		return getActivity().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * General notes about the care plan not covered elsewhere
     * </p> 
	 */
	public AnnotationDt getNote() {  
		if (myNote == null) {
			myNote = new AnnotationDt();
		}
		return myNote;
	}

	/**
	 * Sets the value(s) for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * General notes about the care plan not covered elsewhere
     * </p> 
	 */
	public CarePlan setNote(AnnotationDt theValue) {
		myNote = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>CarePlan.relatedPlan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies CarePlans with some sort of formal relationship to the current plan.
     * </p> 
	 */
	@Block()	
	public static class RelatedPlan 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the type of relationship this plan has to the target plan."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-relationship")
	private BoundCodeDt<CarePlanRelationshipEnum> myCode;
	
	@Child(name="plan", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.CarePlan.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A reference to the plan to which a relationship is asserted."
	)
	private ResourceReferenceDt myPlan;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myPlan);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myPlan);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the type of relationship this plan has to the target plan.
     * </p> 
	 */
	public BoundCodeDt<CarePlanRelationshipEnum> getCodeElement() {  
		if (myCode == null) {
			myCode = new BoundCodeDt<CarePlanRelationshipEnum>(CarePlanRelationshipEnum.VALUESET_BINDER);
		}
		return myCode;
	}

	
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the type of relationship this plan has to the target plan.
     * </p> 
	 */
	public String getCode() {  
		return getCodeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the type of relationship this plan has to the target plan.
     * </p> 
	 */
	public RelatedPlan setCode(BoundCodeDt<CarePlanRelationshipEnum> theValue) {
		myCode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the type of relationship this plan has to the target plan.
     * </p> 
	 */
	public RelatedPlan setCode(CarePlanRelationshipEnum theValue) {
		setCode(new BoundCodeDt<CarePlanRelationshipEnum>(CarePlanRelationshipEnum.VALUESET_BINDER, theValue));
		
/*
		getCodeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>plan</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the plan to which a relationship is asserted.
     * </p> 
	 */
	public ResourceReferenceDt getPlan() {  
		if (myPlan == null) {
			myPlan = new ResourceReferenceDt();
		}
		return myPlan;
	}

	/**
	 * Sets the value(s) for <b>plan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the plan to which a relationship is asserted.
     * </p> 
	 */
	public RelatedPlan setPlan(ResourceReferenceDt theValue) {
		myPlan = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>CarePlan.participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
     * </p> 
	 */
	@Block()	
	public static class Participant 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="role", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates specific responsibility of an individual within the care plan; e.g. \"Primary physician\", \"Team coordinator\", \"Caregiver\", etc."
	)
	private CodeableConceptDt myRole;
	
	@Child(name="member", order=1, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The specific person or organization who is participating/expected to participate in the care plan."
	)
	private ResourceReferenceDt myMember;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myRole,  myMember);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myRole, myMember);
	}

	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates specific responsibility of an individual within the care plan; e.g. \&quot;Primary physician\&quot;, \&quot;Team coordinator\&quot;, \&quot;Caregiver\&quot;, etc.
     * </p> 
	 */
	public CodeableConceptDt getRole() {  
		if (myRole == null) {
			myRole = new CodeableConceptDt();
		}
		return myRole;
	}

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates specific responsibility of an individual within the care plan; e.g. \&quot;Primary physician\&quot;, \&quot;Team coordinator\&quot;, \&quot;Caregiver\&quot;, etc.
     * </p> 
	 */
	public Participant setRole(CodeableConceptDt theValue) {
		myRole = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>member</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The specific person or organization who is participating/expected to participate in the care plan.
     * </p> 
	 */
	public ResourceReferenceDt getMember() {  
		if (myMember == null) {
			myMember = new ResourceReferenceDt();
		}
		return myMember;
	}

	/**
	 * Sets the value(s) for <b>member</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The specific person or organization who is participating/expected to participate in the care plan.
     * </p> 
	 */
	public Participant setMember(ResourceReferenceDt theValue) {
		myMember = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>CarePlan.activity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
     * </p> 
	 */
	@Block()	
	public static class Activity 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="actionResulting", order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc."
	)
	private java.util.List<ResourceReferenceDt> myActionResulting;
	
	@Child(name="progress", type=AnnotationDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Notes about the adherence/status/progress of the activity"
	)
	private java.util.List<AnnotationDt> myProgress;
	
	@Child(name="reference", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Appointment.class, 		ca.uhn.fhir.model.dstu2.resource.CommunicationRequest.class, 		ca.uhn.fhir.model.dstu2.resource.DeviceUseRequest.class, 		ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.class, 		ca.uhn.fhir.model.dstu2.resource.MedicationOrder.class, 		ca.uhn.fhir.model.dstu2.resource.NutritionOrder.class, 		ca.uhn.fhir.model.dstu2.resource.Order.class, 		ca.uhn.fhir.model.dstu2.resource.ProcedureRequest.class, 		ca.uhn.fhir.model.dstu2.resource.ProcessRequest.class, 		ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class, 		ca.uhn.fhir.model.dstu2.resource.SupplyRequest.class, 		ca.uhn.fhir.model.dstu2.resource.VisionPrescription.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The details of the proposed activity represented in a specific resource"
	)
	private ResourceReferenceDt myReference;
	
	@Child(name="detail", order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc."
	)
	private ActivityDetail myDetail;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myActionResulting,  myProgress,  myReference,  myDetail);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myActionResulting, myProgress, myReference, myDetail);
	}

	/**
	 * Gets the value(s) for <b>actionResulting</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getActionResulting() {  
		if (myActionResulting == null) {
			myActionResulting = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myActionResulting;
	}

	/**
	 * Sets the value(s) for <b>actionResulting</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc.
     * </p> 
	 */
	public Activity setActionResulting(java.util.List<ResourceReferenceDt> theValue) {
		myActionResulting = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>actionResulting</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Resources that describe follow-on actions resulting from the plan, such as drug prescriptions, encounter records, appointments, etc.
     * </p> 
	 */
	public ResourceReferenceDt addActionResulting() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getActionResulting().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>progress</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Notes about the adherence/status/progress of the activity
     * </p> 
	 */
	public java.util.List<AnnotationDt> getProgress() {  
		if (myProgress == null) {
			myProgress = new java.util.ArrayList<AnnotationDt>();
		}
		return myProgress;
	}

	/**
	 * Sets the value(s) for <b>progress</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Notes about the adherence/status/progress of the activity
     * </p> 
	 */
	public Activity setProgress(java.util.List<AnnotationDt> theValue) {
		myProgress = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>progress</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Notes about the adherence/status/progress of the activity
     * </p> 
	 */
	public AnnotationDt addProgress() {
		AnnotationDt newType = new AnnotationDt();
		getProgress().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>progress</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Notes about the adherence/status/progress of the activity
	 * </p>
	 * @param theValue The progress to add (must not be <code>null</code>)
	 */
	public Activity addProgress(AnnotationDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getProgress().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>progress</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Notes about the adherence/status/progress of the activity
     * </p> 
	 */
	public AnnotationDt getProgressFirstRep() {
		if (getProgress().isEmpty()) {
			return addProgress();
		}
		return getProgress().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>reference</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The details of the proposed activity represented in a specific resource
     * </p> 
	 */
	public ResourceReferenceDt getReference() {  
		if (myReference == null) {
			myReference = new ResourceReferenceDt();
		}
		return myReference;
	}

	/**
	 * Sets the value(s) for <b>reference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The details of the proposed activity represented in a specific resource
     * </p> 
	 */
	public Activity setReference(ResourceReferenceDt theValue) {
		myReference = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>detail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
     * </p> 
	 */
	public ActivityDetail getDetail() {  
		if (myDetail == null) {
			myDetail = new ActivityDetail();
		}
		return myDetail;
	}

	/**
	 * Sets the value(s) for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
     * </p> 
	 */
	public Activity setDetail(ActivityDetail theValue) {
		myDetail = theValue;
		return this;
	}
	
	

  


	}

	/**
	 * Block class for child element: <b>CarePlan.activity.detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
     * </p> 
	 */
	@Block()	
	public static class ActivityDetail 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="category", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="High-level categorization of the type of activity in a care plan."
	)
	private CodeableConceptDt myCategory;
	
	@Child(name="code", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter."
	)
	private CodeableConceptDt myCode;
	
	@Child(name="reasonCode", type=CodeableConceptDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Provides the rationale that drove the inclusion of this particular activity as part of the plan."
	)
	private java.util.List<CodeableConceptDt> myReasonCode;
	
	@Child(name="reasonReference", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Condition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan."
	)
	private java.util.List<ResourceReferenceDt> myReasonReference;
	
	@Child(name="goal", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Goal.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Internal reference that identifies the goals that this activity is intended to contribute towards meeting"
	)
	private java.util.List<ResourceReferenceDt> myGoal;
	
	@Child(name="status", type=CodeDt.class, order=5, min=0, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies what progress is being made for the specific activity."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-activity-status")
	private BoundCodeDt<CarePlanActivityStatusEnum> myStatus;
	
	@Child(name="statusReason", type=CodeableConceptDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Provides reason why the activity isn't yet started, is on hold, was cancelled, etc."
	)
	private CodeableConceptDt myStatusReason;
	
	@Child(name="prohibited", type=BooleanDt.class, order=7, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="If true, indicates that the described activity is one that must NOT be engaged in when following the plan."
	)
	private BooleanDt myProhibited;
	
	@Child(name="scheduled", order=8, min=0, max=1, summary=false, modifier=false, type={
		TimingDt.class, 		PeriodDt.class, 		StringDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The period, timing or frequency upon which the described activity is to occur."
	)
	private IDatatype myScheduled;
	
	@Child(name="location", order=9, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc."
	)
	private ResourceReferenceDt myLocation;
	
	@Child(name="performer", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies who's expected to be involved in the activity."
	)
	private java.util.List<ResourceReferenceDt> myPerformer;
	
	@Child(name="product", order=11, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Medication.class, 		Substance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the food, drug or other product to be consumed or supplied in the activity."
	)
	private IDatatype myProduct;
	
	@Child(name="dailyAmount", type=SimpleQuantityDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the quantity expected to be consumed in a given day."
	)
	private SimpleQuantityDt myDailyAmount;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the quantity expected to be supplied, administered or consumed by the subject"
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="description", type=StringDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc."
	)
	private StringDt myDescription;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCategory,  myCode,  myReasonCode,  myReasonReference,  myGoal,  myStatus,  myStatusReason,  myProhibited,  myScheduled,  myLocation,  myPerformer,  myProduct,  myDailyAmount,  myQuantity,  myDescription);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCategory, myCode, myReasonCode, myReasonReference, myGoal, myStatus, myStatusReason, myProhibited, myScheduled, myLocation, myPerformer, myProduct, myDailyAmount, myQuantity, myDescription);
	}

	/**
	 * Gets the value(s) for <b>category</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * High-level categorization of the type of activity in a care plan.
     * </p> 
	 */
	public CodeableConceptDt getCategory() {  
		if (myCategory == null) {
			myCategory = new CodeableConceptDt();
		}
		return myCategory;
	}

	/**
	 * Sets the value(s) for <b>category</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * High-level categorization of the type of activity in a care plan.
     * </p> 
	 */
	public ActivityDetail setCategory(CodeableConceptDt theValue) {
		myCategory = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter.
     * </p> 
	 */
	public CodeableConceptDt getCode() {  
		if (myCode == null) {
			myCode = new CodeableConceptDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter.
     * </p> 
	 */
	public ActivityDetail setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reasonCode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getReasonCode() {  
		if (myReasonCode == null) {
			myReasonCode = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myReasonCode;
	}

	/**
	 * Sets the value(s) for <b>reasonCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan.
     * </p> 
	 */
	public ActivityDetail setReasonCode(java.util.List<CodeableConceptDt> theValue) {
		myReasonCode = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reasonCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan.
     * </p> 
	 */
	public CodeableConceptDt addReasonCode() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getReasonCode().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>reasonCode</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Provides the rationale that drove the inclusion of this particular activity as part of the plan.
	 * </p>
	 * @param theValue The reasonCode to add (must not be <code>null</code>)
	 */
	public ActivityDetail addReasonCode(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReasonCode().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>reasonCode</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan.
     * </p> 
	 */
	public CodeableConceptDt getReasonCodeFirstRep() {
		if (getReasonCode().isEmpty()) {
			return addReasonCode();
		}
		return getReasonCode().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>reasonReference</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getReasonReference() {  
		if (myReasonReference == null) {
			myReasonReference = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myReasonReference;
	}

	/**
	 * Sets the value(s) for <b>reasonReference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.
     * </p> 
	 */
	public ActivityDetail setReasonReference(java.util.List<ResourceReferenceDt> theValue) {
		myReasonReference = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reasonReference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.
     * </p> 
	 */
	public ResourceReferenceDt addReasonReference() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getReasonReference().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>goal</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Internal reference that identifies the goals that this activity is intended to contribute towards meeting
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getGoal() {  
		if (myGoal == null) {
			myGoal = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myGoal;
	}

	/**
	 * Sets the value(s) for <b>goal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Internal reference that identifies the goals that this activity is intended to contribute towards meeting
     * </p> 
	 */
	public ActivityDetail setGoal(java.util.List<ResourceReferenceDt> theValue) {
		myGoal = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>goal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Internal reference that identifies the goals that this activity is intended to contribute towards meeting
     * </p> 
	 */
	public ResourceReferenceDt addGoal() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getGoal().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies what progress is being made for the specific activity.
     * </p> 
	 */
	public BoundCodeDt<CarePlanActivityStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<CarePlanActivityStatusEnum>(CarePlanActivityStatusEnum.VALUESET_BINDER);
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
     * Identifies what progress is being made for the specific activity.
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
     * Identifies what progress is being made for the specific activity.
     * </p> 
	 */
	public ActivityDetail setStatus(BoundCodeDt<CarePlanActivityStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies what progress is being made for the specific activity.
     * </p> 
	 */
	public ActivityDetail setStatus(CarePlanActivityStatusEnum theValue) {
		setStatus(new BoundCodeDt<CarePlanActivityStatusEnum>(CarePlanActivityStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>statusReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.
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
     * Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.
     * </p> 
	 */
	public ActivityDetail setStatusReason(CodeableConceptDt theValue) {
		myStatusReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>prohibited</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the described activity is one that must NOT be engaged in when following the plan.
     * </p> 
	 */
	public BooleanDt getProhibitedElement() {  
		if (myProhibited == null) {
			myProhibited = new BooleanDt();
		}
		return myProhibited;
	}

	
	/**
	 * Gets the value(s) for <b>prohibited</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the described activity is one that must NOT be engaged in when following the plan.
     * </p> 
	 */
	public Boolean getProhibited() {  
		return getProhibitedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>prohibited</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the described activity is one that must NOT be engaged in when following the plan.
     * </p> 
	 */
	public ActivityDetail setProhibited(BooleanDt theValue) {
		myProhibited = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>prohibited</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the described activity is one that must NOT be engaged in when following the plan.
     * </p> 
	 */
	public ActivityDetail setProhibited( boolean theBoolean) {
		myProhibited = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>scheduled[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period, timing or frequency upon which the described activity is to occur.
     * </p> 
	 */
	public IDatatype getScheduled() {  
		return myScheduled;
	}

	/**
	 * Sets the value(s) for <b>scheduled[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The period, timing or frequency upon which the described activity is to occur.
     * </p> 
	 */
	public ActivityDetail setScheduled(IDatatype theValue) {
		myScheduled = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>location</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
     * </p> 
	 */
	public ResourceReferenceDt getLocation() {  
		if (myLocation == null) {
			myLocation = new ResourceReferenceDt();
		}
		return myLocation;
	}

	/**
	 * Sets the value(s) for <b>location</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
     * </p> 
	 */
	public ActivityDetail setLocation(ResourceReferenceDt theValue) {
		myLocation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>performer</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who's expected to be involved in the activity.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getPerformer() {  
		if (myPerformer == null) {
			myPerformer = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myPerformer;
	}

	/**
	 * Sets the value(s) for <b>performer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who's expected to be involved in the activity.
     * </p> 
	 */
	public ActivityDetail setPerformer(java.util.List<ResourceReferenceDt> theValue) {
		myPerformer = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>performer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who's expected to be involved in the activity.
     * </p> 
	 */
	public ResourceReferenceDt addPerformer() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getPerformer().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>product[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the food, drug or other product to be consumed or supplied in the activity.
     * </p> 
	 */
	public IDatatype getProduct() {  
		return myProduct;
	}

	/**
	 * Sets the value(s) for <b>product[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the food, drug or other product to be consumed or supplied in the activity.
     * </p> 
	 */
	public ActivityDetail setProduct(IDatatype theValue) {
		myProduct = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dailyAmount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the quantity expected to be consumed in a given day.
     * </p> 
	 */
	public SimpleQuantityDt getDailyAmount() {  
		if (myDailyAmount == null) {
			myDailyAmount = new SimpleQuantityDt();
		}
		return myDailyAmount;
	}

	/**
	 * Sets the value(s) for <b>dailyAmount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the quantity expected to be consumed in a given day.
     * </p> 
	 */
	public ActivityDetail setDailyAmount(SimpleQuantityDt theValue) {
		myDailyAmount = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the quantity expected to be supplied, administered or consumed by the subject
     * </p> 
	 */
	public SimpleQuantityDt getQuantity() {  
		if (myQuantity == null) {
			myQuantity = new SimpleQuantityDt();
		}
		return myQuantity;
	}

	/**
	 * Sets the value(s) for <b>quantity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the quantity expected to be supplied, administered or consumed by the subject
     * </p> 
	 */
	public ActivityDetail setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
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
     * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
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
     * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
     * </p> 
	 */
	public ActivityDetail setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
     * </p> 
	 */
	public ActivityDetail setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 


	}





    @Override
    public String getResourceName() {
        return "CarePlan";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
