















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
 * HAPI/FHIR <b>Procedure</b> Resource
 * (clinical.general)
 *
 * <p>
 * <b>Definition:</b>
 * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Procedure">http://hl7.org/fhir/profiles/Procedure</a> 
 * </p>
 *
 */
@ResourceDef(name="Procedure", profile="http://hl7.org/fhir/profiles/Procedure", id="procedure")
public class Procedure extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>A code to identify a  procedure</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Procedure.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="Procedure.code", description="A code to identify a  procedure", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>A code to identify a  procedure</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Procedure.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A unique identifier for a procedure</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Procedure.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Procedure.identifier", description="A unique identifier for a procedure", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A unique identifier for a procedure</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Procedure.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Procedure.performed[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="Procedure.performed[x]", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Procedure.performed[x]</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.performer.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="performer", path="Procedure.performer.actor", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_PERFORMER = "performer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.performer.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PERFORMER = new ReferenceClientParam(SP_PERFORMER);

	/**
	 * Search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.location</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location", path="Procedure.location", description="", type="reference"  )
	public static final String SP_LOCATION = "location";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.location</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam LOCATION = new ReferenceClientParam(SP_LOCATION);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="Procedure.encounter", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>Search by subject</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="Procedure.subject", description="Search by subject", type="reference"  )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>Search by subject</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Search by subject - a patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Procedure.subject", description="Search by subject - a patient", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
, target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Search by subject - a patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Procedure.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Procedure:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("Procedure:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Procedure:location</b>".
	 */
	public static final Include INCLUDE_LOCATION = new Include("Procedure:location");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Procedure:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Procedure:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Procedure:performer</b>".
	 */
	public static final Include INCLUDE_PERFORMER = new Include("Procedure:performer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Procedure:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("Procedure:subject");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="subject", order=1, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The person, animal or group on which the procedure was performed"
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="status", type=CodeDt.class, order=2, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="A code specifying the state of the procedure. Generally this will be in-progress or completed state."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/procedure-status")
	private BoundCodeDt<ProcedureStatusEnum> myStatus;
	
	@Child(name="category", type=CodeableConceptDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code that classifies the procedure for searching, sorting and display purposes (e.g. \"Surgical Procedure\")"
	)
	private CodeableConceptDt myCategory;
	
	@Child(name="code", type=CodeableConceptDt.class, order=4, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. \"Laparoscopic Appendectomy\")"
	)
	private CodeableConceptDt myCode;
	
	@Child(name="notPerformed", type=BooleanDt.class, order=5, min=0, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Set this to true if the record is saying that the procedure was NOT performed"
	)
	private BooleanDt myNotPerformed;
	
	@Child(name="reasonNotPerformed", type=CodeableConceptDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code indicating why the procedure was not performed."
	)
	private java.util.List<CodeableConceptDt> myReasonNotPerformed;
	
	@Child(name="bodySite", type=CodeableConceptDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion"
	)
	private java.util.List<CodeableConceptDt> myBodySite;
	
	@Child(name="reason", order=8, min=0, max=1, summary=true, modifier=false, type={
		CodeableConceptDt.class, 		Condition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text"
	)
	private IDatatype myReason;
	
	@Child(name="performer", order=9, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Limited to 'real' people rather than equipment"
	)
	private java.util.List<Performer> myPerformer;
	
	@Child(name="performed", order=10, min=0, max=1, summary=true, modifier=false, type={
		DateTimeDt.class, 		PeriodDt.class	})
	@Description(
		shortDefinition="when.done",
		formalDefinition="The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured."
	)
	private IDatatype myPerformed;
	
	@Child(name="encounter", order=11, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="The encounter during which the procedure was performed"
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="location", order=12, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="where",
		formalDefinition="The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant"
	)
	private ResourceReferenceDt myLocation;
	
	@Child(name="outcome", type=CodeableConceptDt.class, order=13, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The outcome of the procedure - did it resolve reasons for the procedure being performed?"
	)
	private CodeableConceptDt myOutcome;
	
	@Child(name="report", order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.DiagnosticReport.class	})
	@Description(
		shortDefinition="",
		formalDefinition="This could be a histology result, pathology report, surgical report, etc.."
	)
	private java.util.List<ResourceReferenceDt> myReport;
	
	@Child(name="complication", type=CodeableConceptDt.class, order=15, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues"
	)
	private java.util.List<CodeableConceptDt> myComplication;
	
	@Child(name="followUp", type=CodeableConceptDt.class, order=16, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used"
	)
	private java.util.List<CodeableConceptDt> myFollowUp;
	
	@Child(name="request", order=17, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.CarePlan.class, 		ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.class, 		ca.uhn.fhir.model.dstu2.resource.ProcedureRequest.class, 		ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A reference to a resource that contains details of the request for this procedure."
	)
	private ResourceReferenceDt myRequest;
	
	@Child(name="notes", type=AnnotationDt.class, order=18, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Any other notes about the procedure.  E.g. the operative notes"
	)
	private java.util.List<AnnotationDt> myNotes;
	
	@Child(name="focalDevice", order=19, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure."
	)
	private java.util.List<FocalDevice> myFocalDevice;
	
	@Child(name="used", order=20, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Medication.class, 		ca.uhn.fhir.model.dstu2.resource.Substance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies medications, devices and any other substance used as part of the procedure"
	)
	private java.util.List<ResourceReferenceDt> myUsed;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  mySubject,  myStatus,  myCategory,  myCode,  myNotPerformed,  myReasonNotPerformed,  myBodySite,  myReason,  myPerformer,  myPerformed,  myEncounter,  myLocation,  myOutcome,  myReport,  myComplication,  myFollowUp,  myRequest,  myNotes,  myFocalDevice,  myUsed);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, mySubject, myStatus, myCategory, myCode, myNotPerformed, myReasonNotPerformed, myBodySite, myReason, myPerformer, myPerformed, myEncounter, myLocation, myOutcome, myReport, myComplication, myFollowUp, myRequest, myNotes, myFocalDevice, myUsed);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
     * This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public Procedure setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
	 * This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Procedure addIdentifier(IdentifierDt theValue) {
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
     * This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
     * The person, animal or group on which the procedure was performed
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
     * The person, animal or group on which the procedure was performed
     * </p> 
	 */
	public Procedure setSubject(ResourceReferenceDt theValue) {
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
     * A code specifying the state of the procedure. Generally this will be in-progress or completed state.
     * </p> 
	 */
	public BoundCodeDt<ProcedureStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ProcedureStatusEnum>(ProcedureStatusEnum.VALUESET_BINDER);
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
     * A code specifying the state of the procedure. Generally this will be in-progress or completed state.
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
     * A code specifying the state of the procedure. Generally this will be in-progress or completed state.
     * </p> 
	 */
	public Procedure setStatus(BoundCodeDt<ProcedureStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the state of the procedure. Generally this will be in-progress or completed state.
     * </p> 
	 */
	public Procedure setStatus(ProcedureStatusEnum theValue) {
		setStatus(new BoundCodeDt<ProcedureStatusEnum>(ProcedureStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>category</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the procedure for searching, sorting and display purposes (e.g. \&quot;Surgical Procedure\&quot;)
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
     * A code that classifies the procedure for searching, sorting and display purposes (e.g. \&quot;Surgical Procedure\&quot;)
     * </p> 
	 */
	public Procedure setCategory(CodeableConceptDt theValue) {
		myCategory = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>code</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. \&quot;Laparoscopic Appendectomy\&quot;)
     * </p> 
	 */
	public CodeableConceptDt getCode() {  
		if (myCode == null) {
			myCode = new CodeableConceptDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. \&quot;Laparoscopic Appendectomy\&quot;)
     * </p> 
	 */
	public Procedure setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>notPerformed</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Set this to true if the record is saying that the procedure was NOT performed
     * </p> 
	 */
	public BooleanDt getNotPerformedElement() {  
		if (myNotPerformed == null) {
			myNotPerformed = new BooleanDt();
		}
		return myNotPerformed;
	}

	
	/**
	 * Gets the value(s) for <b>notPerformed</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Set this to true if the record is saying that the procedure was NOT performed
     * </p> 
	 */
	public Boolean getNotPerformed() {  
		return getNotPerformedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>notPerformed</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Set this to true if the record is saying that the procedure was NOT performed
     * </p> 
	 */
	public Procedure setNotPerformed(BooleanDt theValue) {
		myNotPerformed = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>notPerformed</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Set this to true if the record is saying that the procedure was NOT performed
     * </p> 
	 */
	public Procedure setNotPerformed( boolean theBoolean) {
		myNotPerformed = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>reasonNotPerformed</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code indicating why the procedure was not performed.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getReasonNotPerformed() {  
		if (myReasonNotPerformed == null) {
			myReasonNotPerformed = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myReasonNotPerformed;
	}

	/**
	 * Sets the value(s) for <b>reasonNotPerformed</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code indicating why the procedure was not performed.
     * </p> 
	 */
	public Procedure setReasonNotPerformed(java.util.List<CodeableConceptDt> theValue) {
		myReasonNotPerformed = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reasonNotPerformed</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code indicating why the procedure was not performed.
     * </p> 
	 */
	public CodeableConceptDt addReasonNotPerformed() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getReasonNotPerformed().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>reasonNotPerformed</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A code indicating why the procedure was not performed.
	 * </p>
	 * @param theValue The reasonNotPerformed to add (must not be <code>null</code>)
	 */
	public Procedure addReasonNotPerformed(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReasonNotPerformed().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>reasonNotPerformed</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A code indicating why the procedure was not performed.
     * </p> 
	 */
	public CodeableConceptDt getReasonNotPerformedFirstRep() {
		if (getReasonNotPerformed().isEmpty()) {
			return addReasonNotPerformed();
		}
		return getReasonNotPerformed().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>bodySite</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getBodySite() {  
		if (myBodySite == null) {
			myBodySite = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myBodySite;
	}

	/**
	 * Sets the value(s) for <b>bodySite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion
     * </p> 
	 */
	public Procedure setBodySite(java.util.List<CodeableConceptDt> theValue) {
		myBodySite = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>bodySite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion
     * </p> 
	 */
	public CodeableConceptDt addBodySite() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getBodySite().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>bodySite</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion
	 * </p>
	 * @param theValue The bodySite to add (must not be <code>null</code>)
	 */
	public Procedure addBodySite(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getBodySite().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>bodySite</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion
     * </p> 
	 */
	public CodeableConceptDt getBodySiteFirstRep() {
		if (getBodySite().isEmpty()) {
			return addBodySite();
		}
		return getBodySite().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>reason[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text
     * </p> 
	 */
	public IDatatype getReason() {  
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text
     * </p> 
	 */
	public Procedure setReason(IDatatype theValue) {
		myReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>performer</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Limited to 'real' people rather than equipment
     * </p> 
	 */
	public java.util.List<Performer> getPerformer() {  
		if (myPerformer == null) {
			myPerformer = new java.util.ArrayList<Performer>();
		}
		return myPerformer;
	}

	/**
	 * Sets the value(s) for <b>performer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Limited to 'real' people rather than equipment
     * </p> 
	 */
	public Procedure setPerformer(java.util.List<Performer> theValue) {
		myPerformer = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>performer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Limited to 'real' people rather than equipment
     * </p> 
	 */
	public Performer addPerformer() {
		Performer newType = new Performer();
		getPerformer().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>performer</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Limited to 'real' people rather than equipment
	 * </p>
	 * @param theValue The performer to add (must not be <code>null</code>)
	 */
	public Procedure addPerformer(Performer theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPerformer().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>performer</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Limited to 'real' people rather than equipment
     * </p> 
	 */
	public Performer getPerformerFirstRep() {
		if (getPerformer().isEmpty()) {
			return addPerformer();
		}
		return getPerformer().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>performed[x]</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
     * </p> 
	 */
	public IDatatype getPerformed() {  
		return myPerformed;
	}

	/**
	 * Sets the value(s) for <b>performed[x]</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
     * </p> 
	 */
	public Procedure setPerformed(IDatatype theValue) {
		myPerformed = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The encounter during which the procedure was performed
     * </p> 
	 */
	public ResourceReferenceDt getEncounter() {  
		if (myEncounter == null) {
			myEncounter = new ResourceReferenceDt();
		}
		return myEncounter;
	}

	/**
	 * Sets the value(s) for <b>encounter</b> (context)
	 *
     * <p>
     * <b>Definition:</b>
     * The encounter during which the procedure was performed
     * </p> 
	 */
	public Procedure setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>location</b> (where).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant
     * </p> 
	 */
	public ResourceReferenceDt getLocation() {  
		if (myLocation == null) {
			myLocation = new ResourceReferenceDt();
		}
		return myLocation;
	}

	/**
	 * Sets the value(s) for <b>location</b> (where)
	 *
     * <p>
     * <b>Definition:</b>
     * The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant
     * </p> 
	 */
	public Procedure setLocation(ResourceReferenceDt theValue) {
		myLocation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>outcome</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The outcome of the procedure - did it resolve reasons for the procedure being performed?
     * </p> 
	 */
	public CodeableConceptDt getOutcome() {  
		if (myOutcome == null) {
			myOutcome = new CodeableConceptDt();
		}
		return myOutcome;
	}

	/**
	 * Sets the value(s) for <b>outcome</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The outcome of the procedure - did it resolve reasons for the procedure being performed?
     * </p> 
	 */
	public Procedure setOutcome(CodeableConceptDt theValue) {
		myOutcome = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>report</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This could be a histology result, pathology report, surgical report, etc..
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getReport() {  
		if (myReport == null) {
			myReport = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myReport;
	}

	/**
	 * Sets the value(s) for <b>report</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This could be a histology result, pathology report, surgical report, etc..
     * </p> 
	 */
	public Procedure setReport(java.util.List<ResourceReferenceDt> theValue) {
		myReport = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>report</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This could be a histology result, pathology report, surgical report, etc..
     * </p> 
	 */
	public ResourceReferenceDt addReport() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getReport().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>complication</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getComplication() {  
		if (myComplication == null) {
			myComplication = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myComplication;
	}

	/**
	 * Sets the value(s) for <b>complication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues
     * </p> 
	 */
	public Procedure setComplication(java.util.List<CodeableConceptDt> theValue) {
		myComplication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>complication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues
     * </p> 
	 */
	public CodeableConceptDt addComplication() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getComplication().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>complication</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues
	 * </p>
	 * @param theValue The complication to add (must not be <code>null</code>)
	 */
	public Procedure addComplication(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getComplication().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>complication</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues
     * </p> 
	 */
	public CodeableConceptDt getComplicationFirstRep() {
		if (getComplication().isEmpty()) {
			return addComplication();
		}
		return getComplication().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>followUp</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getFollowUp() {  
		if (myFollowUp == null) {
			myFollowUp = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myFollowUp;
	}

	/**
	 * Sets the value(s) for <b>followUp</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used
     * </p> 
	 */
	public Procedure setFollowUp(java.util.List<CodeableConceptDt> theValue) {
		myFollowUp = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>followUp</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used
     * </p> 
	 */
	public CodeableConceptDt addFollowUp() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getFollowUp().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>followUp</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used
	 * </p>
	 * @param theValue The followUp to add (must not be <code>null</code>)
	 */
	public Procedure addFollowUp(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFollowUp().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>followUp</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used
     * </p> 
	 */
	public CodeableConceptDt getFollowUpFirstRep() {
		if (getFollowUp().isEmpty()) {
			return addFollowUp();
		}
		return getFollowUp().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>request</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to a resource that contains details of the request for this procedure.
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
     * A reference to a resource that contains details of the request for this procedure.
     * </p> 
	 */
	public Procedure setRequest(ResourceReferenceDt theValue) {
		myRequest = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>notes</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Any other notes about the procedure.  E.g. the operative notes
     * </p> 
	 */
	public java.util.List<AnnotationDt> getNotes() {  
		if (myNotes == null) {
			myNotes = new java.util.ArrayList<AnnotationDt>();
		}
		return myNotes;
	}

	/**
	 * Sets the value(s) for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any other notes about the procedure.  E.g. the operative notes
     * </p> 
	 */
	public Procedure setNotes(java.util.List<AnnotationDt> theValue) {
		myNotes = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any other notes about the procedure.  E.g. the operative notes
     * </p> 
	 */
	public AnnotationDt addNotes() {
		AnnotationDt newType = new AnnotationDt();
		getNotes().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>notes</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Any other notes about the procedure.  E.g. the operative notes
	 * </p>
	 * @param theValue The notes to add (must not be <code>null</code>)
	 */
	public Procedure addNotes(AnnotationDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getNotes().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>notes</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Any other notes about the procedure.  E.g. the operative notes
     * </p> 
	 */
	public AnnotationDt getNotesFirstRep() {
		if (getNotes().isEmpty()) {
			return addNotes();
		}
		return getNotes().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>focalDevice</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     * </p> 
	 */
	public java.util.List<FocalDevice> getFocalDevice() {  
		if (myFocalDevice == null) {
			myFocalDevice = new java.util.ArrayList<FocalDevice>();
		}
		return myFocalDevice;
	}

	/**
	 * Sets the value(s) for <b>focalDevice</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     * </p> 
	 */
	public Procedure setFocalDevice(java.util.List<FocalDevice> theValue) {
		myFocalDevice = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>focalDevice</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     * </p> 
	 */
	public FocalDevice addFocalDevice() {
		FocalDevice newType = new FocalDevice();
		getFocalDevice().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>focalDevice</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
	 * </p>
	 * @param theValue The focalDevice to add (must not be <code>null</code>)
	 */
	public Procedure addFocalDevice(FocalDevice theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFocalDevice().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>focalDevice</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     * </p> 
	 */
	public FocalDevice getFocalDeviceFirstRep() {
		if (getFocalDevice().isEmpty()) {
			return addFocalDevice();
		}
		return getFocalDevice().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>used</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies medications, devices and any other substance used as part of the procedure
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getUsed() {  
		if (myUsed == null) {
			myUsed = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myUsed;
	}

	/**
	 * Sets the value(s) for <b>used</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies medications, devices and any other substance used as part of the procedure
     * </p> 
	 */
	public Procedure setUsed(java.util.List<ResourceReferenceDt> theValue) {
		myUsed = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>used</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies medications, devices and any other substance used as part of the procedure
     * </p> 
	 */
	public ResourceReferenceDt addUsed() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getUsed().add(newType);
		return newType; 
	}
  
	/**
	 * Block class for child element: <b>Procedure.performer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Limited to 'real' people rather than equipment
     * </p> 
	 */
	@Block()	
	public static class Performer 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="actor", order=0, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The practitioner who was involved in the procedure"
	)
	private ResourceReferenceDt myActor;
	
	@Child(name="role", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="For example: surgeon, anaethetist, endoscopist"
	)
	private CodeableConceptDt myRole;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myActor,  myRole);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myActor, myRole);
	}

	/**
	 * Gets the value(s) for <b>actor</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner who was involved in the procedure
     * </p> 
	 */
	public ResourceReferenceDt getActor() {  
		if (myActor == null) {
			myActor = new ResourceReferenceDt();
		}
		return myActor;
	}

	/**
	 * Sets the value(s) for <b>actor</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner who was involved in the procedure
     * </p> 
	 */
	public Performer setActor(ResourceReferenceDt theValue) {
		myActor = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * For example: surgeon, anaethetist, endoscopist
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
     * For example: surgeon, anaethetist, endoscopist
     * </p> 
	 */
	public Performer setRole(CodeableConceptDt theValue) {
		myRole = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Procedure.focalDevice</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     * </p> 
	 */
	@Block()	
	public static class FocalDevice 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="action", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The kind of change that happened to the device during the procedure"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-device-action")
	private CodeableConceptDt myAction;
	
	@Child(name="manipulated", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The device that was manipulated (changed) during the procedure"
	)
	private ResourceReferenceDt myManipulated;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myAction,  myManipulated);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myAction, myManipulated);
	}

	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of change that happened to the device during the procedure
     * </p> 
	 */
	public CodeableConceptDt getAction() {  
		if (myAction == null) {
			myAction = new CodeableConceptDt();
		}
		return myAction;
	}

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of change that happened to the device during the procedure
     * </p> 
	 */
	public FocalDevice setAction(CodeableConceptDt theValue) {
		myAction = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>manipulated</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The device that was manipulated (changed) during the procedure
     * </p> 
	 */
	public ResourceReferenceDt getManipulated() {  
		if (myManipulated == null) {
			myManipulated = new ResourceReferenceDt();
		}
		return myManipulated;
	}

	/**
	 * Sets the value(s) for <b>manipulated</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The device that was manipulated (changed) during the procedure
     * </p> 
	 */
	public FocalDevice setManipulated(ResourceReferenceDt theValue) {
		myManipulated = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Procedure";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
