















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
 * HAPI/FHIR <b>ClinicalImpression</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ClinicalImpression">http://hl7.org/fhir/profiles/ClinicalImpression</a> 
 * </p>
 *
 */
@ResourceDef(name="ClinicalImpression", profile="http://hl7.org/fhir/profiles/ClinicalImpression", id="clinicalimpression")
public class ClinicalImpression extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>previous</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.previous</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="previous", path="ClinicalImpression.previous", description="", type="reference"  )
	public static final String SP_PREVIOUS = "previous";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>previous</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.previous</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PREVIOUS = new ReferenceClientParam(SP_PREVIOUS);

	/**
	 * Search parameter constant for <b>problem</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.problem</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="problem", path="ClinicalImpression.problem", description="", type="reference"  )
	public static final String SP_PROBLEM = "problem";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>problem</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.problem</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PROBLEM = new ReferenceClientParam(SP_PROBLEM);

	/**
	 * Search parameter constant for <b>trigger</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.triggerReference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="trigger", path="ClinicalImpression.triggerReference", description="", type="reference"  )
	public static final String SP_TRIGGER = "trigger";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>trigger</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.triggerReference</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam TRIGGER = new ReferenceClientParam(SP_TRIGGER);

	/**
	 * Search parameter constant for <b>trigger-code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.triggerCodeableConcept</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="trigger-code", path="ClinicalImpression.triggerCodeableConcept", description="", type="token"  )
	public static final String SP_TRIGGER_CODE = "trigger-code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>trigger-code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.triggerCodeableConcept</b><br>
	 * </p>
	 */
	public static final TokenClientParam TRIGGER_CODE = new TokenClientParam(SP_TRIGGER_CODE);

	/**
	 * Search parameter constant for <b>investigation</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.investigations.item</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="investigation", path="ClinicalImpression.investigations.item", description="", type="reference"  )
	public static final String SP_INVESTIGATION = "investigation";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>investigation</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.investigations.item</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam INVESTIGATION = new ReferenceClientParam(SP_INVESTIGATION);

	/**
	 * Search parameter constant for <b>finding</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.finding.item</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="finding", path="ClinicalImpression.finding.item", description="", type="token"  )
	public static final String SP_FINDING = "finding";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>finding</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.finding.item</b><br>
	 * </p>
	 */
	public static final TokenClientParam FINDING = new TokenClientParam(SP_FINDING);

	/**
	 * Search parameter constant for <b>resolved</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.resolved</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="resolved", path="ClinicalImpression.resolved", description="", type="token"  )
	public static final String SP_RESOLVED = "resolved";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>resolved</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.resolved</b><br>
	 * </p>
	 */
	public static final TokenClientParam RESOLVED = new TokenClientParam(SP_RESOLVED);

	/**
	 * Search parameter constant for <b>ruledout</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.ruledOut.item</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="ruledout", path="ClinicalImpression.ruledOut.item", description="", type="token"  )
	public static final String SP_RULEDOUT = "ruledout";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>ruledout</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.ruledOut.item</b><br>
	 * </p>
	 */
	public static final TokenClientParam RULEDOUT = new TokenClientParam(SP_RULEDOUT);

	/**
	 * Search parameter constant for <b>plan</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.plan</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="plan", path="ClinicalImpression.plan", description="", type="reference"  )
	public static final String SP_PLAN = "plan";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>plan</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.plan</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PLAN = new ReferenceClientParam(SP_PLAN);

	/**
	 * Search parameter constant for <b>action</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.action</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="action", path="ClinicalImpression.action", description="", type="reference"  )
	public static final String SP_ACTION = "action";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>action</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.action</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ACTION = new ReferenceClientParam(SP_ACTION);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="ClinicalImpression.patient", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>assessor</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.assessor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="assessor", path="ClinicalImpression.assessor", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ASSESSOR = "assessor";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>assessor</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ClinicalImpression.assessor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ASSESSOR = new ReferenceClientParam(SP_ASSESSOR);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ClinicalImpression.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="ClinicalImpression.date", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ClinicalImpression.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="ClinicalImpression.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClinicalImpression.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ClinicalImpression:action</b>".
	 */
	public static final Include INCLUDE_ACTION = new Include("ClinicalImpression:action");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ClinicalImpression:assessor</b>".
	 */
	public static final Include INCLUDE_ASSESSOR = new Include("ClinicalImpression:assessor");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ClinicalImpression:investigation</b>".
	 */
	public static final Include INCLUDE_INVESTIGATION = new Include("ClinicalImpression:investigation");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ClinicalImpression:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("ClinicalImpression:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ClinicalImpression:plan</b>".
	 */
	public static final Include INCLUDE_PLAN = new Include("ClinicalImpression:plan");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ClinicalImpression:previous</b>".
	 */
	public static final Include INCLUDE_PREVIOUS = new Include("ClinicalImpression:previous");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ClinicalImpression:problem</b>".
	 */
	public static final Include INCLUDE_PROBLEM = new Include("ClinicalImpression:problem");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ClinicalImpression:trigger</b>".
	 */
	public static final Include INCLUDE_TRIGGER = new Include("ClinicalImpression:trigger");


	@Child(name="patient", order=0, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The patient being assessed"
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="assessor", order=1, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The clinician performing the assessment"
	)
	private ResourceReferenceDt myAssessor;
	
	@Child(name="status", type=CodeDt.class, order=2, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the workflow status of the assessment"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/clinical-impression-status")
	private BoundCodeDt<ClinicalImpressionStatusEnum> myStatus;
	
	@Child(name="date", type=DateTimeDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The point in time at which the assessment was concluded (not when it was recorded)"
	)
	private DateTimeDt myDate;
	
	@Child(name="description", type=StringDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it"
	)
	private StringDt myDescription;
	
	@Child(name="previous", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ClinicalImpression.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes"
	)
	private ResourceReferenceDt myPrevious;
	
	@Child(name="problem", order=6, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Condition.class, 		ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="This a list of the general problems/conditions for a patient"
	)
	private java.util.List<ResourceReferenceDt> myProblem;
	
	@Child(name="trigger", order=7, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource"
	)
	private IDatatype myTrigger;
	
	@Child(name="investigations", order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes"
	)
	private java.util.List<Investigations> myInvestigations;
	
	@Child(name="protocol", type=UriDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis"
	)
	private UriDt myProtocol;
	
	@Child(name="summary", type=StringDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A text summary of the investigations and the diagnosis"
	)
	private StringDt mySummary;
	
	@Child(name="finding", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specific findings or diagnoses that was considered likely or relevant to ongoing treatment"
	)
	private java.util.List<Finding> myFinding;
	
	@Child(name="resolved", type=CodeableConceptDt.class, order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Diagnoses/conditions resolved since the last assessment"
	)
	private java.util.List<CodeableConceptDt> myResolved;
	
	@Child(name="ruledOut", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Diagnosis considered not possible"
	)
	private java.util.List<RuledOut> myRuledOut;
	
	@Child(name="prognosis", type=StringDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Estimate of likely outcome"
	)
	private StringDt myPrognosis;
	
	@Child(name="plan", order=15, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.CarePlan.class, 		ca.uhn.fhir.model.dstu2.resource.Appointment.class, 		ca.uhn.fhir.model.dstu2.resource.CommunicationRequest.class, 		ca.uhn.fhir.model.dstu2.resource.DeviceUseRequest.class, 		ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.class, 		ca.uhn.fhir.model.dstu2.resource.MedicationOrder.class, 		ca.uhn.fhir.model.dstu2.resource.NutritionOrder.class, 		ca.uhn.fhir.model.dstu2.resource.Order.class, 		ca.uhn.fhir.model.dstu2.resource.ProcedureRequest.class, 		ca.uhn.fhir.model.dstu2.resource.ProcessRequest.class, 		ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class, 		ca.uhn.fhir.model.dstu2.resource.SupplyRequest.class, 		ca.uhn.fhir.model.dstu2.resource.VisionPrescription.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Plan of action after assessment"
	)
	private java.util.List<ResourceReferenceDt> myPlan;
	
	@Child(name="action", order=16, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class, 		ca.uhn.fhir.model.dstu2.resource.ProcedureRequest.class, 		ca.uhn.fhir.model.dstu2.resource.Procedure.class, 		ca.uhn.fhir.model.dstu2.resource.MedicationOrder.class, 		ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.class, 		ca.uhn.fhir.model.dstu2.resource.NutritionOrder.class, 		ca.uhn.fhir.model.dstu2.resource.SupplyRequest.class, 		ca.uhn.fhir.model.dstu2.resource.Appointment.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Actions taken during assessment"
	)
	private java.util.List<ResourceReferenceDt> myAction;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myPatient,  myAssessor,  myStatus,  myDate,  myDescription,  myPrevious,  myProblem,  myTrigger,  myInvestigations,  myProtocol,  mySummary,  myFinding,  myResolved,  myRuledOut,  myPrognosis,  myPlan,  myAction);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myPatient, myAssessor, myStatus, myDate, myDescription, myPrevious, myProblem, myTrigger, myInvestigations, myProtocol, mySummary, myFinding, myResolved, myRuledOut, myPrognosis, myPlan, myAction);
	}

	/**
	 * Gets the value(s) for <b>patient</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient being assessed
     * </p> 
	 */
	public ResourceReferenceDt getPatient() {  
		if (myPatient == null) {
			myPatient = new ResourceReferenceDt();
		}
		return myPatient;
	}

	/**
	 * Sets the value(s) for <b>patient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The patient being assessed
     * </p> 
	 */
	public ClinicalImpression setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>assessor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The clinician performing the assessment
     * </p> 
	 */
	public ResourceReferenceDt getAssessor() {  
		if (myAssessor == null) {
			myAssessor = new ResourceReferenceDt();
		}
		return myAssessor;
	}

	/**
	 * Sets the value(s) for <b>assessor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The clinician performing the assessment
     * </p> 
	 */
	public ClinicalImpression setAssessor(ResourceReferenceDt theValue) {
		myAssessor = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the workflow status of the assessment
     * </p> 
	 */
	public BoundCodeDt<ClinicalImpressionStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ClinicalImpressionStatusEnum>(ClinicalImpressionStatusEnum.VALUESET_BINDER);
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
     * Identifies the workflow status of the assessment
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
     * Identifies the workflow status of the assessment
     * </p> 
	 */
	public ClinicalImpression setStatus(BoundCodeDt<ClinicalImpressionStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the workflow status of the assessment
     * </p> 
	 */
	public ClinicalImpression setStatus(ClinicalImpressionStatusEnum theValue) {
		setStatus(new BoundCodeDt<ClinicalImpressionStatusEnum>(ClinicalImpressionStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>date</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The point in time at which the assessment was concluded (not when it was recorded)
     * </p> 
	 */
	public DateTimeDt getDateElement() {  
		if (myDate == null) {
			myDate = new DateTimeDt();
		}
		return myDate;
	}

	
	/**
	 * Gets the value(s) for <b>date</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The point in time at which the assessment was concluded (not when it was recorded)
     * </p> 
	 */
	public Date getDate() {  
		return getDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The point in time at which the assessment was concluded (not when it was recorded)
     * </p> 
	 */
	public ClinicalImpression setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The point in time at which the assessment was concluded (not when it was recorded)
     * </p> 
	 */
	public ClinicalImpression setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The point in time at which the assessment was concluded (not when it was recorded)
     * </p> 
	 */
	public ClinicalImpression setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it
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
     * A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it
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
     * A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it
     * </p> 
	 */
	public ClinicalImpression setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it
     * </p> 
	 */
	public ClinicalImpression setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>previous</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes
     * </p> 
	 */
	public ResourceReferenceDt getPrevious() {  
		if (myPrevious == null) {
			myPrevious = new ResourceReferenceDt();
		}
		return myPrevious;
	}

	/**
	 * Sets the value(s) for <b>previous</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes
     * </p> 
	 */
	public ClinicalImpression setPrevious(ResourceReferenceDt theValue) {
		myPrevious = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>problem</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This a list of the general problems/conditions for a patient
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getProblem() {  
		if (myProblem == null) {
			myProblem = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myProblem;
	}

	/**
	 * Sets the value(s) for <b>problem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This a list of the general problems/conditions for a patient
     * </p> 
	 */
	public ClinicalImpression setProblem(java.util.List<ResourceReferenceDt> theValue) {
		myProblem = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>problem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This a list of the general problems/conditions for a patient
     * </p> 
	 */
	public ResourceReferenceDt addProblem() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getProblem().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>trigger[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource
     * </p> 
	 */
	public IDatatype getTrigger() {  
		return myTrigger;
	}

	/**
	 * Sets the value(s) for <b>trigger[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource
     * </p> 
	 */
	public ClinicalImpression setTrigger(IDatatype theValue) {
		myTrigger = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>investigations</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes
     * </p> 
	 */
	public java.util.List<Investigations> getInvestigations() {  
		if (myInvestigations == null) {
			myInvestigations = new java.util.ArrayList<Investigations>();
		}
		return myInvestigations;
	}

	/**
	 * Sets the value(s) for <b>investigations</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes
     * </p> 
	 */
	public ClinicalImpression setInvestigations(java.util.List<Investigations> theValue) {
		myInvestigations = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>investigations</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes
     * </p> 
	 */
	public Investigations addInvestigations() {
		Investigations newType = new Investigations();
		getInvestigations().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>investigations</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes
	 * </p>
	 * @param theValue The investigations to add (must not be <code>null</code>)
	 */
	public ClinicalImpression addInvestigations(Investigations theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInvestigations().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>investigations</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes
     * </p> 
	 */
	public Investigations getInvestigationsFirstRep() {
		if (getInvestigations().isEmpty()) {
			return addInvestigations();
		}
		return getInvestigations().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>protocol</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis
     * </p> 
	 */
	public UriDt getProtocolElement() {  
		if (myProtocol == null) {
			myProtocol = new UriDt();
		}
		return myProtocol;
	}

	
	/**
	 * Gets the value(s) for <b>protocol</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis
     * </p> 
	 */
	public String getProtocol() {  
		return getProtocolElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>protocol</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis
     * </p> 
	 */
	public ClinicalImpression setProtocol(UriDt theValue) {
		myProtocol = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>protocol</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis
     * </p> 
	 */
	public ClinicalImpression setProtocol( String theUri) {
		myProtocol = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>summary</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A text summary of the investigations and the diagnosis
     * </p> 
	 */
	public StringDt getSummaryElement() {  
		if (mySummary == null) {
			mySummary = new StringDt();
		}
		return mySummary;
	}

	
	/**
	 * Gets the value(s) for <b>summary</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A text summary of the investigations and the diagnosis
     * </p> 
	 */
	public String getSummary() {  
		return getSummaryElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>summary</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A text summary of the investigations and the diagnosis
     * </p> 
	 */
	public ClinicalImpression setSummary(StringDt theValue) {
		mySummary = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>summary</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A text summary of the investigations and the diagnosis
     * </p> 
	 */
	public ClinicalImpression setSummary( String theString) {
		mySummary = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>finding</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment
     * </p> 
	 */
	public java.util.List<Finding> getFinding() {  
		if (myFinding == null) {
			myFinding = new java.util.ArrayList<Finding>();
		}
		return myFinding;
	}

	/**
	 * Sets the value(s) for <b>finding</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment
     * </p> 
	 */
	public ClinicalImpression setFinding(java.util.List<Finding> theValue) {
		myFinding = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>finding</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment
     * </p> 
	 */
	public Finding addFinding() {
		Finding newType = new Finding();
		getFinding().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>finding</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment
	 * </p>
	 * @param theValue The finding to add (must not be <code>null</code>)
	 */
	public ClinicalImpression addFinding(Finding theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFinding().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>finding</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment
     * </p> 
	 */
	public Finding getFindingFirstRep() {
		if (getFinding().isEmpty()) {
			return addFinding();
		}
		return getFinding().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>resolved</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnoses/conditions resolved since the last assessment
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getResolved() {  
		if (myResolved == null) {
			myResolved = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myResolved;
	}

	/**
	 * Sets the value(s) for <b>resolved</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnoses/conditions resolved since the last assessment
     * </p> 
	 */
	public ClinicalImpression setResolved(java.util.List<CodeableConceptDt> theValue) {
		myResolved = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>resolved</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnoses/conditions resolved since the last assessment
     * </p> 
	 */
	public CodeableConceptDt addResolved() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getResolved().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>resolved</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Diagnoses/conditions resolved since the last assessment
	 * </p>
	 * @param theValue The resolved to add (must not be <code>null</code>)
	 */
	public ClinicalImpression addResolved(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getResolved().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>resolved</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnoses/conditions resolved since the last assessment
     * </p> 
	 */
	public CodeableConceptDt getResolvedFirstRep() {
		if (getResolved().isEmpty()) {
			return addResolved();
		}
		return getResolved().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>ruledOut</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis considered not possible
     * </p> 
	 */
	public java.util.List<RuledOut> getRuledOut() {  
		if (myRuledOut == null) {
			myRuledOut = new java.util.ArrayList<RuledOut>();
		}
		return myRuledOut;
	}

	/**
	 * Sets the value(s) for <b>ruledOut</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis considered not possible
     * </p> 
	 */
	public ClinicalImpression setRuledOut(java.util.List<RuledOut> theValue) {
		myRuledOut = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>ruledOut</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis considered not possible
     * </p> 
	 */
	public RuledOut addRuledOut() {
		RuledOut newType = new RuledOut();
		getRuledOut().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>ruledOut</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Diagnosis considered not possible
	 * </p>
	 * @param theValue The ruledOut to add (must not be <code>null</code>)
	 */
	public ClinicalImpression addRuledOut(RuledOut theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRuledOut().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>ruledOut</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis considered not possible
     * </p> 
	 */
	public RuledOut getRuledOutFirstRep() {
		if (getRuledOut().isEmpty()) {
			return addRuledOut();
		}
		return getRuledOut().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>prognosis</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Estimate of likely outcome
     * </p> 
	 */
	public StringDt getPrognosisElement() {  
		if (myPrognosis == null) {
			myPrognosis = new StringDt();
		}
		return myPrognosis;
	}

	
	/**
	 * Gets the value(s) for <b>prognosis</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Estimate of likely outcome
     * </p> 
	 */
	public String getPrognosis() {  
		return getPrognosisElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>prognosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Estimate of likely outcome
     * </p> 
	 */
	public ClinicalImpression setPrognosis(StringDt theValue) {
		myPrognosis = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>prognosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Estimate of likely outcome
     * </p> 
	 */
	public ClinicalImpression setPrognosis( String theString) {
		myPrognosis = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>plan</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Plan of action after assessment
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getPlan() {  
		if (myPlan == null) {
			myPlan = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myPlan;
	}

	/**
	 * Sets the value(s) for <b>plan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Plan of action after assessment
     * </p> 
	 */
	public ClinicalImpression setPlan(java.util.List<ResourceReferenceDt> theValue) {
		myPlan = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>plan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Plan of action after assessment
     * </p> 
	 */
	public ResourceReferenceDt addPlan() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getPlan().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Actions taken during assessment
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAction() {  
		if (myAction == null) {
			myAction = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAction;
	}

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Actions taken during assessment
     * </p> 
	 */
	public ClinicalImpression setAction(java.util.List<ResourceReferenceDt> theValue) {
		myAction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Actions taken during assessment
     * </p> 
	 */
	public ResourceReferenceDt addAction() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAction().add(newType);
		return newType; 
	}
  
	/**
	 * Block class for child element: <b>ClinicalImpression.investigations</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes
     * </p> 
	 */
	@Block()	
	public static class Investigations 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A name/code for the group (\"set\") of investigations. Typically, this will be something like \"signs\", \"symptoms\", \"clinical\", \"diagnostic\", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used"
	)
	private CodeableConceptDt myCode;
	
	@Child(name="item", order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Observation.class, 		ca.uhn.fhir.model.dstu2.resource.QuestionnaireResponse.class, 		ca.uhn.fhir.model.dstu2.resource.FamilyMemberHistory.class, 		ca.uhn.fhir.model.dstu2.resource.DiagnosticReport.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A record of a specific investigation that was undertaken"
	)
	private java.util.List<ResourceReferenceDt> myItem;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myItem);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myItem);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A name/code for the group (\&quot;set\&quot;) of investigations. Typically, this will be something like \&quot;signs\&quot;, \&quot;symptoms\&quot;, \&quot;clinical\&quot;, \&quot;diagnostic\&quot;, but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used
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
     * A name/code for the group (\&quot;set\&quot;) of investigations. Typically, this will be something like \&quot;signs\&quot;, \&quot;symptoms\&quot;, \&quot;clinical\&quot;, \&quot;diagnostic\&quot;, but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used
     * </p> 
	 */
	public Investigations setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>item</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A record of a specific investigation that was undertaken
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getItem() {  
		if (myItem == null) {
			myItem = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myItem;
	}

	/**
	 * Sets the value(s) for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A record of a specific investigation that was undertaken
     * </p> 
	 */
	public Investigations setItem(java.util.List<ResourceReferenceDt> theValue) {
		myItem = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A record of a specific investigation that was undertaken
     * </p> 
	 */
	public ResourceReferenceDt addItem() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getItem().add(newType);
		return newType; 
	}
  


	}


	/**
	 * Block class for child element: <b>ClinicalImpression.finding</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment
     * </p> 
	 */
	@Block()	
	public static class Finding 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="item", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specific text of code for finding or diagnosis"
	)
	private CodeableConceptDt myItem;
	
	@Child(name="cause", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Which investigations support finding or diagnosis"
	)
	private StringDt myCause;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myItem,  myCause);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myItem, myCause);
	}

	/**
	 * Gets the value(s) for <b>item</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific text of code for finding or diagnosis
     * </p> 
	 */
	public CodeableConceptDt getItem() {  
		if (myItem == null) {
			myItem = new CodeableConceptDt();
		}
		return myItem;
	}

	/**
	 * Sets the value(s) for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific text of code for finding or diagnosis
     * </p> 
	 */
	public Finding setItem(CodeableConceptDt theValue) {
		myItem = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>cause</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Which investigations support finding or diagnosis
     * </p> 
	 */
	public StringDt getCauseElement() {  
		if (myCause == null) {
			myCause = new StringDt();
		}
		return myCause;
	}

	
	/**
	 * Gets the value(s) for <b>cause</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Which investigations support finding or diagnosis
     * </p> 
	 */
	public String getCause() {  
		return getCauseElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>cause</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Which investigations support finding or diagnosis
     * </p> 
	 */
	public Finding setCause(StringDt theValue) {
		myCause = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>cause</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Which investigations support finding or diagnosis
     * </p> 
	 */
	public Finding setCause( String theString) {
		myCause = new StringDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>ClinicalImpression.ruledOut</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis considered not possible
     * </p> 
	 */
	@Block()	
	public static class RuledOut 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="item", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specific text of code for diagnosis"
	)
	private CodeableConceptDt myItem;
	
	@Child(name="reason", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Grounds for elimination"
	)
	private StringDt myReason;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myItem,  myReason);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myItem, myReason);
	}

	/**
	 * Gets the value(s) for <b>item</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific text of code for diagnosis
     * </p> 
	 */
	public CodeableConceptDt getItem() {  
		if (myItem == null) {
			myItem = new CodeableConceptDt();
		}
		return myItem;
	}

	/**
	 * Sets the value(s) for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific text of code for diagnosis
     * </p> 
	 */
	public RuledOut setItem(CodeableConceptDt theValue) {
		myItem = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Grounds for elimination
     * </p> 
	 */
	public StringDt getReasonElement() {  
		if (myReason == null) {
			myReason = new StringDt();
		}
		return myReason;
	}

	
	/**
	 * Gets the value(s) for <b>reason</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Grounds for elimination
     * </p> 
	 */
	public String getReason() {  
		return getReasonElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Grounds for elimination
     * </p> 
	 */
	public RuledOut setReason(StringDt theValue) {
		myReason = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Grounds for elimination
     * </p> 
	 */
	public RuledOut setReason( String theString) {
		myReason = new StringDt(theString); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "ClinicalImpression";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
