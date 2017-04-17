















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
 * HAPI/FHIR <b>Contract</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Contract">http://hl7.org/fhir/profiles/Contract</a> 
 * </p>
 *
 */
@ResourceDef(name="Contract", profile="http://hl7.org/fhir/profiles/Contract", id="contract")
public class Contract extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The identity of the target of the contract</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Contract.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="Contract.subject", description="The identity of the target of the contract", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The identity of the target of the contract</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Contract.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of the target of the contract (if a patient)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Contract.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Contract.subject", description="The identity of the target of the contract (if a patient)", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of the target of the contract (if a patient)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Contract.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identity of the contract</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Contract.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Contract.identifier", description="The identity of the contract", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identity of the contract</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Contract.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>actor</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Contract.actor.entity</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="actor", path="Contract.actor.entity", description="", type="reference"  )
	public static final String SP_ACTOR = "actor";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>actor</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Contract.actor.entity</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ACTOR = new ReferenceClientParam(SP_ACTOR);

	/**
	 * Search parameter constant for <b>signer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Contract.signer.party</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="signer", path="Contract.signer.party", description="", type="reference"  )
	public static final String SP_SIGNER = "signer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>signer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Contract.signer.party</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SIGNER = new ReferenceClientParam(SP_SIGNER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Contract:actor</b>".
	 */
	public static final Include INCLUDE_ACTOR = new Include("Contract:actor");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Contract:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Contract:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Contract:signer</b>".
	 */
	public static final Include INCLUDE_SIGNER = new Include("Contract:signer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Contract:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("Contract:subject");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Unique identifier for this Contract."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="issued", type=DateTimeDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="When this  Contract was issued."
	)
	private DateTimeDt myIssued;
	
	@Child(name="applies", type=PeriodDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Relevant time or time-period when this Contract is applicable"
	)
	private PeriodDt myApplies;
	
	@Child(name="subject", order=3, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services."
	)
	private java.util.List<ResourceReferenceDt> mySubject;
	
	@Child(name="authority", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies."
	)
	private java.util.List<ResourceReferenceDt> myAuthority;
	
	@Child(name="domain", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources."
	)
	private java.util.List<ResourceReferenceDt> myDomain;
	
	@Child(name="type", type=CodeableConceptDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc."
	)
	private CodeableConceptDt myType;
	
	@Child(name="subType", type=CodeableConceptDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent."
	)
	private java.util.List<CodeableConceptDt> mySubType;
	
	@Child(name="action", type=CodeableConceptDt.class, order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Action stipulated by this Contract."
	)
	private java.util.List<CodeableConceptDt> myAction;
	
	@Child(name="actionReason", type=CodeableConceptDt.class, order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Reason for action stipulated by this Contract."
	)
	private java.util.List<CodeableConceptDt> myActionReason;
	
	@Child(name="actor", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of Contract actors"
	)
	private java.util.List<Actor> myActor;
	
	@Child(name="valuedItem", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contract Valued Item List"
	)
	private java.util.List<ValuedItem> myValuedItem;
	
	@Child(name="signer", order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Party signing this Contract."
	)
	private java.util.List<Signer> mySigner;
	
	@Child(name="term", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups."
	)
	private java.util.List<Term> myTerm;
	
	@Child(name="binding", order=14, min=0, max=1, summary=false, modifier=false, type={
		AttachmentDt.class, 		Composition.class, 		DocumentReference.class, 		QuestionnaireResponse.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \"source of truth\" and which would be the basis for legal action related to enforcement of this Contract."
	)
	private IDatatype myBinding;
	
	@Child(name="friendly", order=15, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The \"patient friendly language\" versionof the Contract in whole or in parts. \"Patient friendly language\" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement."
	)
	private java.util.List<Friendly> myFriendly;
	
	@Child(name="legal", order=16, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of Legal expressions or representations of this Contract."
	)
	private java.util.List<Legal> myLegal;
	
	@Child(name="rule", order=17, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of Computable Policy Rule Language Representations of this Contract."
	)
	private java.util.List<Rule> myRule;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myIssued,  myApplies,  mySubject,  myAuthority,  myDomain,  myType,  mySubType,  myAction,  myActionReason,  myActor,  myValuedItem,  mySigner,  myTerm,  myBinding,  myFriendly,  myLegal,  myRule);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myIssued, myApplies, mySubject, myAuthority, myDomain, myType, mySubType, myAction, myActionReason, myActor, myValuedItem, mySigner, myTerm, myBinding, myFriendly, myLegal, myRule);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Unique identifier for this Contract.
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Unique identifier for this Contract.
     * </p> 
	 */
	public Contract setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>issued</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When this  Contract was issued.
     * </p> 
	 */
	public DateTimeDt getIssuedElement() {  
		if (myIssued == null) {
			myIssued = new DateTimeDt();
		}
		return myIssued;
	}

	
	/**
	 * Gets the value(s) for <b>issued</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When this  Contract was issued.
     * </p> 
	 */
	public Date getIssued() {  
		return getIssuedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>issued</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When this  Contract was issued.
     * </p> 
	 */
	public Contract setIssued(DateTimeDt theValue) {
		myIssued = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>issued</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When this  Contract was issued.
     * </p> 
	 */
	public Contract setIssued( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myIssued = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>issued</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When this  Contract was issued.
     * </p> 
	 */
	public Contract setIssuedWithSecondsPrecision( Date theDate) {
		myIssued = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>applies</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Relevant time or time-period when this Contract is applicable
     * </p> 
	 */
	public PeriodDt getApplies() {  
		if (myApplies == null) {
			myApplies = new PeriodDt();
		}
		return myApplies;
	}

	/**
	 * Sets the value(s) for <b>applies</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Relevant time or time-period when this Contract is applicable
     * </p> 
	 */
	public Contract setApplies(PeriodDt theValue) {
		myApplies = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subject</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSubject() {  
		if (mySubject == null) {
			mySubject = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySubject;
	}

	/**
	 * Sets the value(s) for <b>subject</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.
     * </p> 
	 */
	public Contract setSubject(java.util.List<ResourceReferenceDt> theValue) {
		mySubject = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>subject</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Who and/or what this Contract is about: typically a Patient, Organization, or valued items such as goods and services.
     * </p> 
	 */
	public ResourceReferenceDt addSubject() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSubject().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>authority</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAuthority() {  
		if (myAuthority == null) {
			myAuthority = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAuthority;
	}

	/**
	 * Sets the value(s) for <b>authority</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
     * </p> 
	 */
	public Contract setAuthority(java.util.List<ResourceReferenceDt> theValue) {
		myAuthority = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>authority</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
     * </p> 
	 */
	public ResourceReferenceDt addAuthority() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAuthority().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>domain</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getDomain() {  
		if (myDomain == null) {
			myDomain = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myDomain;
	}

	/**
	 * Sets the value(s) for <b>domain</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
     * </p> 
	 */
	public Contract setDomain(java.util.List<ResourceReferenceDt> theValue) {
		myDomain = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>domain</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
     * </p> 
	 */
	public ResourceReferenceDt addDomain() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getDomain().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.
     * </p> 
	 */
	public CodeableConceptDt getType() {  
		if (myType == null) {
			myType = new CodeableConceptDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.
     * </p> 
	 */
	public Contract setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getSubType() {  
		if (mySubType == null) {
			mySubType = new java.util.ArrayList<CodeableConceptDt>();
		}
		return mySubType;
	}

	/**
	 * Sets the value(s) for <b>subType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
     * </p> 
	 */
	public Contract setSubType(java.util.List<CodeableConceptDt> theValue) {
		mySubType = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>subType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
     * </p> 
	 */
	public CodeableConceptDt addSubType() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getSubType().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>subType</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
	 * </p>
	 * @param theValue The subType to add (must not be <code>null</code>)
	 */
	public Contract addSubType(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSubType().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>subType</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
     * </p> 
	 */
	public CodeableConceptDt getSubTypeFirstRep() {
		if (getSubType().isEmpty()) {
			return addSubType();
		}
		return getSubType().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Action stipulated by this Contract.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getAction() {  
		if (myAction == null) {
			myAction = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myAction;
	}

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action stipulated by this Contract.
     * </p> 
	 */
	public Contract setAction(java.util.List<CodeableConceptDt> theValue) {
		myAction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action stipulated by this Contract.
     * </p> 
	 */
	public CodeableConceptDt addAction() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getAction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>action</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Action stipulated by this Contract.
	 * </p>
	 * @param theValue The action to add (must not be <code>null</code>)
	 */
	public Contract addAction(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>action</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Action stipulated by this Contract.
     * </p> 
	 */
	public CodeableConceptDt getActionFirstRep() {
		if (getAction().isEmpty()) {
			return addAction();
		}
		return getAction().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>actionReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason for action stipulated by this Contract.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getActionReason() {  
		if (myActionReason == null) {
			myActionReason = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myActionReason;
	}

	/**
	 * Sets the value(s) for <b>actionReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reason for action stipulated by this Contract.
     * </p> 
	 */
	public Contract setActionReason(java.util.List<CodeableConceptDt> theValue) {
		myActionReason = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>actionReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reason for action stipulated by this Contract.
     * </p> 
	 */
	public CodeableConceptDt addActionReason() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getActionReason().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>actionReason</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Reason for action stipulated by this Contract.
	 * </p>
	 * @param theValue The actionReason to add (must not be <code>null</code>)
	 */
	public Contract addActionReason(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getActionReason().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>actionReason</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason for action stipulated by this Contract.
     * </p> 
	 */
	public CodeableConceptDt getActionReasonFirstRep() {
		if (getActionReason().isEmpty()) {
			return addActionReason();
		}
		return getActionReason().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>actor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of Contract actors
     * </p> 
	 */
	public java.util.List<Actor> getActor() {  
		if (myActor == null) {
			myActor = new java.util.ArrayList<Actor>();
		}
		return myActor;
	}

	/**
	 * Sets the value(s) for <b>actor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Contract actors
     * </p> 
	 */
	public Contract setActor(java.util.List<Actor> theValue) {
		myActor = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>actor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Contract actors
     * </p> 
	 */
	public Actor addActor() {
		Actor newType = new Actor();
		getActor().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>actor</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * List of Contract actors
	 * </p>
	 * @param theValue The actor to add (must not be <code>null</code>)
	 */
	public Contract addActor(Actor theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getActor().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>actor</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * List of Contract actors
     * </p> 
	 */
	public Actor getActorFirstRep() {
		if (getActor().isEmpty()) {
			return addActor();
		}
		return getActor().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>valuedItem</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Valued Item List
     * </p> 
	 */
	public java.util.List<ValuedItem> getValuedItem() {  
		if (myValuedItem == null) {
			myValuedItem = new java.util.ArrayList<ValuedItem>();
		}
		return myValuedItem;
	}

	/**
	 * Sets the value(s) for <b>valuedItem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Valued Item List
     * </p> 
	 */
	public Contract setValuedItem(java.util.List<ValuedItem> theValue) {
		myValuedItem = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>valuedItem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Valued Item List
     * </p> 
	 */
	public ValuedItem addValuedItem() {
		ValuedItem newType = new ValuedItem();
		getValuedItem().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>valuedItem</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Contract Valued Item List
	 * </p>
	 * @param theValue The valuedItem to add (must not be <code>null</code>)
	 */
	public Contract addValuedItem(ValuedItem theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getValuedItem().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>valuedItem</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Valued Item List
     * </p> 
	 */
	public ValuedItem getValuedItemFirstRep() {
		if (getValuedItem().isEmpty()) {
			return addValuedItem();
		}
		return getValuedItem().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>signer</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Party signing this Contract.
     * </p> 
	 */
	public java.util.List<Signer> getSigner() {  
		if (mySigner == null) {
			mySigner = new java.util.ArrayList<Signer>();
		}
		return mySigner;
	}

	/**
	 * Sets the value(s) for <b>signer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Party signing this Contract.
     * </p> 
	 */
	public Contract setSigner(java.util.List<Signer> theValue) {
		mySigner = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>signer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Party signing this Contract.
     * </p> 
	 */
	public Signer addSigner() {
		Signer newType = new Signer();
		getSigner().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>signer</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Party signing this Contract.
	 * </p>
	 * @param theValue The signer to add (must not be <code>null</code>)
	 */
	public Contract addSigner(Signer theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSigner().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>signer</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Party signing this Contract.
     * </p> 
	 */
	public Signer getSignerFirstRep() {
		if (getSigner().isEmpty()) {
			return addSigner();
		}
		return getSigner().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>term</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
     * </p> 
	 */
	public java.util.List<Term> getTerm() {  
		if (myTerm == null) {
			myTerm = new java.util.ArrayList<Term>();
		}
		return myTerm;
	}

	/**
	 * Sets the value(s) for <b>term</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
     * </p> 
	 */
	public Contract setTerm(java.util.List<Term> theValue) {
		myTerm = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>term</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
     * </p> 
	 */
	public Term addTerm() {
		Term newType = new Term();
		getTerm().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>term</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
	 * </p>
	 * @param theValue The term to add (must not be <code>null</code>)
	 */
	public Contract addTerm(Term theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTerm().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>term</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
     * </p> 
	 */
	public Term getTermFirstRep() {
		if (getTerm().isEmpty()) {
			return addTerm();
		}
		return getTerm().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>binding[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \&quot;source of truth\&quot; and which would be the basis for legal action related to enforcement of this Contract.
     * </p> 
	 */
	public IDatatype getBinding() {  
		return myBinding;
	}

	/**
	 * Sets the value(s) for <b>binding[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \&quot;source of truth\&quot; and which would be the basis for legal action related to enforcement of this Contract.
     * </p> 
	 */
	public Contract setBinding(IDatatype theValue) {
		myBinding = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>friendly</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The \&quot;patient friendly language\&quot; versionof the Contract in whole or in parts. \&quot;Patient friendly language\&quot; means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
     * </p> 
	 */
	public java.util.List<Friendly> getFriendly() {  
		if (myFriendly == null) {
			myFriendly = new java.util.ArrayList<Friendly>();
		}
		return myFriendly;
	}

	/**
	 * Sets the value(s) for <b>friendly</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The \&quot;patient friendly language\&quot; versionof the Contract in whole or in parts. \&quot;Patient friendly language\&quot; means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
     * </p> 
	 */
	public Contract setFriendly(java.util.List<Friendly> theValue) {
		myFriendly = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>friendly</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The \&quot;patient friendly language\&quot; versionof the Contract in whole or in parts. \&quot;Patient friendly language\&quot; means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
     * </p> 
	 */
	public Friendly addFriendly() {
		Friendly newType = new Friendly();
		getFriendly().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>friendly</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The \&quot;patient friendly language\&quot; versionof the Contract in whole or in parts. \&quot;Patient friendly language\&quot; means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
	 * </p>
	 * @param theValue The friendly to add (must not be <code>null</code>)
	 */
	public Contract addFriendly(Friendly theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFriendly().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>friendly</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The \&quot;patient friendly language\&quot; versionof the Contract in whole or in parts. \&quot;Patient friendly language\&quot; means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
     * </p> 
	 */
	public Friendly getFriendlyFirstRep() {
		if (getFriendly().isEmpty()) {
			return addFriendly();
		}
		return getFriendly().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>legal</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of Legal expressions or representations of this Contract.
     * </p> 
	 */
	public java.util.List<Legal> getLegal() {  
		if (myLegal == null) {
			myLegal = new java.util.ArrayList<Legal>();
		}
		return myLegal;
	}

	/**
	 * Sets the value(s) for <b>legal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Legal expressions or representations of this Contract.
     * </p> 
	 */
	public Contract setLegal(java.util.List<Legal> theValue) {
		myLegal = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>legal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Legal expressions or representations of this Contract.
     * </p> 
	 */
	public Legal addLegal() {
		Legal newType = new Legal();
		getLegal().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>legal</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * List of Legal expressions or representations of this Contract.
	 * </p>
	 * @param theValue The legal to add (must not be <code>null</code>)
	 */
	public Contract addLegal(Legal theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getLegal().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>legal</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * List of Legal expressions or representations of this Contract.
     * </p> 
	 */
	public Legal getLegalFirstRep() {
		if (getLegal().isEmpty()) {
			return addLegal();
		}
		return getLegal().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>rule</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of Computable Policy Rule Language Representations of this Contract.
     * </p> 
	 */
	public java.util.List<Rule> getRule() {  
		if (myRule == null) {
			myRule = new java.util.ArrayList<Rule>();
		}
		return myRule;
	}

	/**
	 * Sets the value(s) for <b>rule</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Computable Policy Rule Language Representations of this Contract.
     * </p> 
	 */
	public Contract setRule(java.util.List<Rule> theValue) {
		myRule = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>rule</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Computable Policy Rule Language Representations of this Contract.
     * </p> 
	 */
	public Rule addRule() {
		Rule newType = new Rule();
		getRule().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>rule</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * List of Computable Policy Rule Language Representations of this Contract.
	 * </p>
	 * @param theValue The rule to add (must not be <code>null</code>)
	 */
	public Contract addRule(Rule theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRule().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>rule</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * List of Computable Policy Rule Language Representations of this Contract.
     * </p> 
	 */
	public Rule getRuleFirstRep() {
		if (getRule().isEmpty()) {
			return addRule();
		}
		return getRule().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Contract.actor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Contract actors
     * </p> 
	 */
	@Block()	
	public static class Actor 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="entity", order=0, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Contract.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Location.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Substance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Who or what actors are assigned roles in this Contract."
	)
	private ResourceReferenceDt myEntity;
	
	@Child(name="role", type=CodeableConceptDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Role type of actors assigned roles in this Contract."
	)
	private java.util.List<CodeableConceptDt> myRole;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myEntity,  myRole);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myEntity, myRole);
	}

	/**
	 * Gets the value(s) for <b>entity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Who or what actors are assigned roles in this Contract.
     * </p> 
	 */
	public ResourceReferenceDt getEntity() {  
		if (myEntity == null) {
			myEntity = new ResourceReferenceDt();
		}
		return myEntity;
	}

	/**
	 * Sets the value(s) for <b>entity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Who or what actors are assigned roles in this Contract.
     * </p> 
	 */
	public Actor setEntity(ResourceReferenceDt theValue) {
		myEntity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Role type of actors assigned roles in this Contract.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getRole() {  
		if (myRole == null) {
			myRole = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myRole;
	}

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role type of actors assigned roles in this Contract.
     * </p> 
	 */
	public Actor setRole(java.util.List<CodeableConceptDt> theValue) {
		myRole = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role type of actors assigned roles in this Contract.
     * </p> 
	 */
	public CodeableConceptDt addRole() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getRole().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>role</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Role type of actors assigned roles in this Contract.
	 * </p>
	 * @param theValue The role to add (must not be <code>null</code>)
	 */
	public Actor addRole(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRole().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>role</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Role type of actors assigned roles in this Contract.
     * </p> 
	 */
	public CodeableConceptDt getRoleFirstRep() {
		if (getRole().isEmpty()) {
			return addRole();
		}
		return getRole().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>Contract.valuedItem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Valued Item List
     * </p> 
	 */
	@Block()	
	public static class ValuedItem 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="entity", order=0, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Specific type of Contract Valued Item that may be priced."
	)
	private IDatatype myEntity;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a Contract Valued Item instance."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="effectiveTime", type=DateTimeDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the time during which this Contract ValuedItem information is effective."
	)
	private DateTimeDt myEffectiveTime;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances."
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="unitPrice", type=MoneyDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A Contract Valued Item unit valuation measure."
	)
	private MoneyDt myUnitPrice;
	
	@Child(name="factor", type=DecimalDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
	)
	private DecimalDt myFactor;
	
	@Child(name="points", type=DecimalDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point."
	)
	private DecimalDt myPoints;
	
	@Child(name="net", type=MoneyDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
	)
	private MoneyDt myNet;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myEntity,  myIdentifier,  myEffectiveTime,  myQuantity,  myUnitPrice,  myFactor,  myPoints,  myNet);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myEntity, myIdentifier, myEffectiveTime, myQuantity, myUnitPrice, myFactor, myPoints, myNet);
	}

	/**
	 * Gets the value(s) for <b>entity[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific type of Contract Valued Item that may be priced.
     * </p> 
	 */
	public IDatatype getEntity() {  
		return myEntity;
	}

	/**
	 * Sets the value(s) for <b>entity[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific type of Contract Valued Item that may be priced.
     * </p> 
	 */
	public ValuedItem setEntity(IDatatype theValue) {
		myEntity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a Contract Valued Item instance.
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a Contract Valued Item instance.
     * </p> 
	 */
	public ValuedItem setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>effectiveTime</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract ValuedItem information is effective.
     * </p> 
	 */
	public DateTimeDt getEffectiveTimeElement() {  
		if (myEffectiveTime == null) {
			myEffectiveTime = new DateTimeDt();
		}
		return myEffectiveTime;
	}

	
	/**
	 * Gets the value(s) for <b>effectiveTime</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract ValuedItem information is effective.
     * </p> 
	 */
	public Date getEffectiveTime() {  
		return getEffectiveTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>effectiveTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract ValuedItem information is effective.
     * </p> 
	 */
	public ValuedItem setEffectiveTime(DateTimeDt theValue) {
		myEffectiveTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>effectiveTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract ValuedItem information is effective.
     * </p> 
	 */
	public ValuedItem setEffectiveTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myEffectiveTime = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>effectiveTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract ValuedItem information is effective.
     * </p> 
	 */
	public ValuedItem setEffectiveTimeWithSecondsPrecision( Date theDate) {
		myEffectiveTime = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances.
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
     * Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances.
     * </p> 
	 */
	public ValuedItem setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>unitPrice</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A Contract Valued Item unit valuation measure.
     * </p> 
	 */
	public MoneyDt getUnitPrice() {  
		if (myUnitPrice == null) {
			myUnitPrice = new MoneyDt();
		}
		return myUnitPrice;
	}

	/**
	 * Sets the value(s) for <b>unitPrice</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A Contract Valued Item unit valuation measure.
     * </p> 
	 */
	public ValuedItem setUnitPrice(MoneyDt theValue) {
		myUnitPrice = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public DecimalDt getFactorElement() {  
		if (myFactor == null) {
			myFactor = new DecimalDt();
		}
		return myFactor;
	}

	
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public BigDecimal getFactor() {  
		return getFactorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ValuedItem setFactor(DecimalDt theValue) {
		myFactor = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ValuedItem setFactor( long theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ValuedItem setFactor( double theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ValuedItem setFactor( java.math.BigDecimal theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public DecimalDt getPointsElement() {  
		if (myPoints == null) {
			myPoints = new DecimalDt();
		}
		return myPoints;
	}

	
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public BigDecimal getPoints() {  
		return getPointsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ValuedItem setPoints(DecimalDt theValue) {
		myPoints = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ValuedItem setPoints( long theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ValuedItem setPoints( double theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ValuedItem setPoints( java.math.BigDecimal theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>net</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public MoneyDt getNet() {  
		if (myNet == null) {
			myNet = new MoneyDt();
		}
		return myNet;
	}

	/**
	 * Sets the value(s) for <b>net</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public ValuedItem setNet(MoneyDt theValue) {
		myNet = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Contract.signer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Party signing this Contract.
     * </p> 
	 */
	@Block()	
	public static class Signer 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Role of this Contract signer, e.g. notary, grantee."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-contract-signer-type")
	private CodingDt myType;
	
	@Child(name="party", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Party which is a signator to this Contract."
	)
	private ResourceReferenceDt myParty;
	
	@Child(name="signature", type=StringDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Legally binding Contract DSIG signature contents in Base64."
	)
	private StringDt mySignature;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myParty,  mySignature);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myParty, mySignature);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of this Contract signer, e.g. notary, grantee.
     * </p> 
	 */
	public CodingDt getType() {  
		if (myType == null) {
			myType = new CodingDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of this Contract signer, e.g. notary, grantee.
     * </p> 
	 */
	public Signer setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>party</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Party which is a signator to this Contract.
     * </p> 
	 */
	public ResourceReferenceDt getParty() {  
		if (myParty == null) {
			myParty = new ResourceReferenceDt();
		}
		return myParty;
	}

	/**
	 * Sets the value(s) for <b>party</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Party which is a signator to this Contract.
     * </p> 
	 */
	public Signer setParty(ResourceReferenceDt theValue) {
		myParty = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>signature</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Legally binding Contract DSIG signature contents in Base64.
     * </p> 
	 */
	public StringDt getSignatureElement() {  
		if (mySignature == null) {
			mySignature = new StringDt();
		}
		return mySignature;
	}

	
	/**
	 * Gets the value(s) for <b>signature</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Legally binding Contract DSIG signature contents in Base64.
     * </p> 
	 */
	public String getSignature() {  
		return getSignatureElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>signature</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Legally binding Contract DSIG signature contents in Base64.
     * </p> 
	 */
	public Signer setSignature(StringDt theValue) {
		mySignature = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>signature</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Legally binding Contract DSIG signature contents in Base64.
     * </p> 
	 */
	public Signer setSignature( String theString) {
		mySignature = new StringDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Contract.term</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
     * </p> 
	 */
	@Block()	
	public static class Term 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Unique identifier for this particular Contract Provision."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="issued", type=DateTimeDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="When this Contract Provision was issued."
	)
	private DateTimeDt myIssued;
	
	@Child(name="applies", type=PeriodDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Relevant time or time-period when this Contract Provision is applicable."
	)
	private PeriodDt myApplies;
	
	@Child(name="type", type=CodeableConceptDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit."
	)
	private CodeableConceptDt myType;
	
	@Child(name="subType", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment."
	)
	private CodeableConceptDt mySubType;
	
	@Child(name="subject", order=5, min=0, max=1, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Who or what this Contract Provision is about."
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="action", type=CodeableConceptDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Action stipulated by this Contract Provision."
	)
	private java.util.List<CodeableConceptDt> myAction;
	
	@Child(name="actionReason", type=CodeableConceptDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Reason or purpose for the action stipulated by this Contract Provision."
	)
	private java.util.List<CodeableConceptDt> myActionReason;
	
	@Child(name="actor", order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of actors participating in this Contract Provision."
	)
	private java.util.List<TermActor> myActor;
	
	@Child(name="text", type=StringDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Human readable form of this Contract Provision."
	)
	private StringDt myText;
	
	@Child(name="valuedItem", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contract Provision Valued Item List"
	)
	private java.util.List<TermValuedItem> myValuedItem;
	
	@Child(name="group", type=Term.class, order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Nested group of Contract Provisions."
	)
	private java.util.List<Term> myGroup;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myIssued,  myApplies,  myType,  mySubType,  mySubject,  myAction,  myActionReason,  myActor,  myText,  myValuedItem,  myGroup);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myIssued, myApplies, myType, mySubType, mySubject, myAction, myActionReason, myActor, myText, myValuedItem, myGroup);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Unique identifier for this particular Contract Provision.
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Unique identifier for this particular Contract Provision.
     * </p> 
	 */
	public Term setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>issued</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When this Contract Provision was issued.
     * </p> 
	 */
	public DateTimeDt getIssuedElement() {  
		if (myIssued == null) {
			myIssued = new DateTimeDt();
		}
		return myIssued;
	}

	
	/**
	 * Gets the value(s) for <b>issued</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When this Contract Provision was issued.
     * </p> 
	 */
	public Date getIssued() {  
		return getIssuedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>issued</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When this Contract Provision was issued.
     * </p> 
	 */
	public Term setIssued(DateTimeDt theValue) {
		myIssued = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>issued</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When this Contract Provision was issued.
     * </p> 
	 */
	public Term setIssued( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myIssued = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>issued</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When this Contract Provision was issued.
     * </p> 
	 */
	public Term setIssuedWithSecondsPrecision( Date theDate) {
		myIssued = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>applies</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Relevant time or time-period when this Contract Provision is applicable.
     * </p> 
	 */
	public PeriodDt getApplies() {  
		if (myApplies == null) {
			myApplies = new PeriodDt();
		}
		return myApplies;
	}

	/**
	 * Sets the value(s) for <b>applies</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Relevant time or time-period when this Contract Provision is applicable.
     * </p> 
	 */
	public Term setApplies(PeriodDt theValue) {
		myApplies = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.
     * </p> 
	 */
	public CodeableConceptDt getType() {  
		if (myType == null) {
			myType = new CodeableConceptDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.
     * </p> 
	 */
	public Term setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment.
     * </p> 
	 */
	public CodeableConceptDt getSubType() {  
		if (mySubType == null) {
			mySubType = new CodeableConceptDt();
		}
		return mySubType;
	}

	/**
	 * Sets the value(s) for <b>subType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment.
     * </p> 
	 */
	public Term setSubType(CodeableConceptDt theValue) {
		mySubType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subject</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Who or what this Contract Provision is about.
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
     * Who or what this Contract Provision is about.
     * </p> 
	 */
	public Term setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Action stipulated by this Contract Provision.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getAction() {  
		if (myAction == null) {
			myAction = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myAction;
	}

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action stipulated by this Contract Provision.
     * </p> 
	 */
	public Term setAction(java.util.List<CodeableConceptDt> theValue) {
		myAction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action stipulated by this Contract Provision.
     * </p> 
	 */
	public CodeableConceptDt addAction() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getAction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>action</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Action stipulated by this Contract Provision.
	 * </p>
	 * @param theValue The action to add (must not be <code>null</code>)
	 */
	public Term addAction(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>action</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Action stipulated by this Contract Provision.
     * </p> 
	 */
	public CodeableConceptDt getActionFirstRep() {
		if (getAction().isEmpty()) {
			return addAction();
		}
		return getAction().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>actionReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason or purpose for the action stipulated by this Contract Provision.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getActionReason() {  
		if (myActionReason == null) {
			myActionReason = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myActionReason;
	}

	/**
	 * Sets the value(s) for <b>actionReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reason or purpose for the action stipulated by this Contract Provision.
     * </p> 
	 */
	public Term setActionReason(java.util.List<CodeableConceptDt> theValue) {
		myActionReason = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>actionReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reason or purpose for the action stipulated by this Contract Provision.
     * </p> 
	 */
	public CodeableConceptDt addActionReason() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getActionReason().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>actionReason</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Reason or purpose for the action stipulated by this Contract Provision.
	 * </p>
	 * @param theValue The actionReason to add (must not be <code>null</code>)
	 */
	public Term addActionReason(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getActionReason().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>actionReason</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason or purpose for the action stipulated by this Contract Provision.
     * </p> 
	 */
	public CodeableConceptDt getActionReasonFirstRep() {
		if (getActionReason().isEmpty()) {
			return addActionReason();
		}
		return getActionReason().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>actor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of actors participating in this Contract Provision.
     * </p> 
	 */
	public java.util.List<TermActor> getActor() {  
		if (myActor == null) {
			myActor = new java.util.ArrayList<TermActor>();
		}
		return myActor;
	}

	/**
	 * Sets the value(s) for <b>actor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of actors participating in this Contract Provision.
     * </p> 
	 */
	public Term setActor(java.util.List<TermActor> theValue) {
		myActor = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>actor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of actors participating in this Contract Provision.
     * </p> 
	 */
	public TermActor addActor() {
		TermActor newType = new TermActor();
		getActor().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>actor</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * List of actors participating in this Contract Provision.
	 * </p>
	 * @param theValue The actor to add (must not be <code>null</code>)
	 */
	public Term addActor(TermActor theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getActor().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>actor</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * List of actors participating in this Contract Provision.
     * </p> 
	 */
	public TermActor getActorFirstRep() {
		if (getActor().isEmpty()) {
			return addActor();
		}
		return getActor().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human readable form of this Contract Provision.
     * </p> 
	 */
	public StringDt getTextElement() {  
		if (myText == null) {
			myText = new StringDt();
		}
		return myText;
	}

	
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human readable form of this Contract Provision.
     * </p> 
	 */
	public String getText() {  
		return getTextElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human readable form of this Contract Provision.
     * </p> 
	 */
	public Term setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human readable form of this Contract Provision.
     * </p> 
	 */
	public Term setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>valuedItem</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Provision Valued Item List
     * </p> 
	 */
	public java.util.List<TermValuedItem> getValuedItem() {  
		if (myValuedItem == null) {
			myValuedItem = new java.util.ArrayList<TermValuedItem>();
		}
		return myValuedItem;
	}

	/**
	 * Sets the value(s) for <b>valuedItem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Provision Valued Item List
     * </p> 
	 */
	public Term setValuedItem(java.util.List<TermValuedItem> theValue) {
		myValuedItem = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>valuedItem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Provision Valued Item List
     * </p> 
	 */
	public TermValuedItem addValuedItem() {
		TermValuedItem newType = new TermValuedItem();
		getValuedItem().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>valuedItem</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Contract Provision Valued Item List
	 * </p>
	 * @param theValue The valuedItem to add (must not be <code>null</code>)
	 */
	public Term addValuedItem(TermValuedItem theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getValuedItem().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>valuedItem</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Provision Valued Item List
     * </p> 
	 */
	public TermValuedItem getValuedItemFirstRep() {
		if (getValuedItem().isEmpty()) {
			return addValuedItem();
		}
		return getValuedItem().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>group</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group of Contract Provisions.
     * </p> 
	 */
	public java.util.List<Term> getGroup() {  
		if (myGroup == null) {
			myGroup = new java.util.ArrayList<Term>();
		}
		return myGroup;
	}

	/**
	 * Sets the value(s) for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group of Contract Provisions.
     * </p> 
	 */
	public Term setGroup(java.util.List<Term> theValue) {
		myGroup = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group of Contract Provisions.
     * </p> 
	 */
	public Term addGroup() {
		Term newType = new Term();
		getGroup().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>group</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Nested group of Contract Provisions.
	 * </p>
	 * @param theValue The group to add (must not be <code>null</code>)
	 */
	public Term addGroup(Term theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getGroup().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>group</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group of Contract Provisions.
     * </p> 
	 */
	public Term getGroupFirstRep() {
		if (getGroup().isEmpty()) {
			return addGroup();
		}
		return getGroup().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>Contract.term.actor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of actors participating in this Contract Provision.
     * </p> 
	 */
	@Block()	
	public static class TermActor 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="entity", order=0, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Contract.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Location.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Substance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The actor assigned a role in this Contract Provision."
	)
	private ResourceReferenceDt myEntity;
	
	@Child(name="role", type=CodeableConceptDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Role played by the actor assigned this role in this Contract Provision."
	)
	private java.util.List<CodeableConceptDt> myRole;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myEntity,  myRole);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myEntity, myRole);
	}

	/**
	 * Gets the value(s) for <b>entity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actor assigned a role in this Contract Provision.
     * </p> 
	 */
	public ResourceReferenceDt getEntity() {  
		if (myEntity == null) {
			myEntity = new ResourceReferenceDt();
		}
		return myEntity;
	}

	/**
	 * Sets the value(s) for <b>entity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actor assigned a role in this Contract Provision.
     * </p> 
	 */
	public TermActor setEntity(ResourceReferenceDt theValue) {
		myEntity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Role played by the actor assigned this role in this Contract Provision.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getRole() {  
		if (myRole == null) {
			myRole = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myRole;
	}

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role played by the actor assigned this role in this Contract Provision.
     * </p> 
	 */
	public TermActor setRole(java.util.List<CodeableConceptDt> theValue) {
		myRole = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role played by the actor assigned this role in this Contract Provision.
     * </p> 
	 */
	public CodeableConceptDt addRole() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getRole().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>role</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Role played by the actor assigned this role in this Contract Provision.
	 * </p>
	 * @param theValue The role to add (must not be <code>null</code>)
	 */
	public TermActor addRole(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRole().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>role</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Role played by the actor assigned this role in this Contract Provision.
     * </p> 
	 */
	public CodeableConceptDt getRoleFirstRep() {
		if (getRole().isEmpty()) {
			return addRole();
		}
		return getRole().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>Contract.term.valuedItem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contract Provision Valued Item List
     * </p> 
	 */
	@Block()	
	public static class TermValuedItem 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="entity", order=0, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Specific type of Contract Provision Valued Item that may be priced."
	)
	private IDatatype myEntity;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a Contract Provision Valued Item instance."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="effectiveTime", type=DateTimeDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the time during which this Contract Term ValuedItem information is effective."
	)
	private DateTimeDt myEffectiveTime;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specifies the units by which the Contract Provision Valued Item is measured or counted, and quantifies the countable or measurable Contract Term Valued Item instances."
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="unitPrice", type=MoneyDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A Contract Provision Valued Item unit valuation measure."
	)
	private MoneyDt myUnitPrice;
	
	@Child(name="factor", type=DecimalDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
	)
	private DecimalDt myFactor;
	
	@Child(name="points", type=DecimalDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point."
	)
	private DecimalDt myPoints;
	
	@Child(name="net", type=MoneyDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Expresses the product of the Contract Provision Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
	)
	private MoneyDt myNet;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myEntity,  myIdentifier,  myEffectiveTime,  myQuantity,  myUnitPrice,  myFactor,  myPoints,  myNet);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myEntity, myIdentifier, myEffectiveTime, myQuantity, myUnitPrice, myFactor, myPoints, myNet);
	}

	/**
	 * Gets the value(s) for <b>entity[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific type of Contract Provision Valued Item that may be priced.
     * </p> 
	 */
	public IDatatype getEntity() {  
		return myEntity;
	}

	/**
	 * Sets the value(s) for <b>entity[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific type of Contract Provision Valued Item that may be priced.
     * </p> 
	 */
	public TermValuedItem setEntity(IDatatype theValue) {
		myEntity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a Contract Provision Valued Item instance.
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a Contract Provision Valued Item instance.
     * </p> 
	 */
	public TermValuedItem setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>effectiveTime</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract Term ValuedItem information is effective.
     * </p> 
	 */
	public DateTimeDt getEffectiveTimeElement() {  
		if (myEffectiveTime == null) {
			myEffectiveTime = new DateTimeDt();
		}
		return myEffectiveTime;
	}

	
	/**
	 * Gets the value(s) for <b>effectiveTime</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract Term ValuedItem information is effective.
     * </p> 
	 */
	public Date getEffectiveTime() {  
		return getEffectiveTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>effectiveTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract Term ValuedItem information is effective.
     * </p> 
	 */
	public TermValuedItem setEffectiveTime(DateTimeDt theValue) {
		myEffectiveTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>effectiveTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract Term ValuedItem information is effective.
     * </p> 
	 */
	public TermValuedItem setEffectiveTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myEffectiveTime = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>effectiveTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the time during which this Contract Term ValuedItem information is effective.
     * </p> 
	 */
	public TermValuedItem setEffectiveTimeWithSecondsPrecision( Date theDate) {
		myEffectiveTime = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies the units by which the Contract Provision Valued Item is measured or counted, and quantifies the countable or measurable Contract Term Valued Item instances.
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
     * Specifies the units by which the Contract Provision Valued Item is measured or counted, and quantifies the countable or measurable Contract Term Valued Item instances.
     * </p> 
	 */
	public TermValuedItem setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>unitPrice</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A Contract Provision Valued Item unit valuation measure.
     * </p> 
	 */
	public MoneyDt getUnitPrice() {  
		if (myUnitPrice == null) {
			myUnitPrice = new MoneyDt();
		}
		return myUnitPrice;
	}

	/**
	 * Sets the value(s) for <b>unitPrice</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A Contract Provision Valued Item unit valuation measure.
     * </p> 
	 */
	public TermValuedItem setUnitPrice(MoneyDt theValue) {
		myUnitPrice = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public DecimalDt getFactorElement() {  
		if (myFactor == null) {
			myFactor = new DecimalDt();
		}
		return myFactor;
	}

	
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public BigDecimal getFactor() {  
		return getFactorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public TermValuedItem setFactor(DecimalDt theValue) {
		myFactor = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public TermValuedItem setFactor( long theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public TermValuedItem setFactor( double theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public TermValuedItem setFactor( java.math.BigDecimal theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public DecimalDt getPointsElement() {  
		if (myPoints == null) {
			myPoints = new DecimalDt();
		}
		return myPoints;
	}

	
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public BigDecimal getPoints() {  
		return getPointsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public TermValuedItem setPoints(DecimalDt theValue) {
		myPoints = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public TermValuedItem setPoints( long theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public TermValuedItem setPoints( double theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public TermValuedItem setPoints( java.math.BigDecimal theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>net</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Expresses the product of the Contract Provision Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public MoneyDt getNet() {  
		if (myNet == null) {
			myNet = new MoneyDt();
		}
		return myNet;
	}

	/**
	 * Sets the value(s) for <b>net</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Expresses the product of the Contract Provision Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public TermValuedItem setNet(MoneyDt theValue) {
		myNet = theValue;
		return this;
	}
	
	

  


	}



	/**
	 * Block class for child element: <b>Contract.friendly</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The \"patient friendly language\" versionof the Contract in whole or in parts. \"Patient friendly language\" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
     * </p> 
	 */
	@Block()	
	public static class Friendly 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="content", order=0, min=1, max=1, summary=false, modifier=false, type={
		AttachmentDt.class, 		Composition.class, 		DocumentReference.class, 		QuestionnaireResponse.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability."
	)
	private IDatatype myContent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myContent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myContent);
	}

	/**
	 * Gets the value(s) for <b>content[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability.
     * </p> 
	 */
	public IDatatype getContent() {  
		return myContent;
	}

	/**
	 * Sets the value(s) for <b>content[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability.
     * </p> 
	 */
	public Friendly setContent(IDatatype theValue) {
		myContent = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Contract.legal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Legal expressions or representations of this Contract.
     * </p> 
	 */
	@Block()	
	public static class Legal 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="content", order=0, min=1, max=1, summary=false, modifier=false, type={
		AttachmentDt.class, 		Composition.class, 		DocumentReference.class, 		QuestionnaireResponse.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Contract legal text in human renderable form."
	)
	private IDatatype myContent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myContent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myContent);
	}

	/**
	 * Gets the value(s) for <b>content[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contract legal text in human renderable form.
     * </p> 
	 */
	public IDatatype getContent() {  
		return myContent;
	}

	/**
	 * Sets the value(s) for <b>content[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contract legal text in human renderable form.
     * </p> 
	 */
	public Legal setContent(IDatatype theValue) {
		myContent = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Contract.rule</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Computable Policy Rule Language Representations of this Contract.
     * </p> 
	 */
	@Block()	
	public static class Rule 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="content", order=0, min=1, max=1, summary=false, modifier=false, type={
		AttachmentDt.class, 		DocumentReference.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal)."
	)
	private IDatatype myContent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myContent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myContent);
	}

	/**
	 * Gets the value(s) for <b>content[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).
     * </p> 
	 */
	public IDatatype getContent() {  
		return myContent;
	}

	/**
	 * Sets the value(s) for <b>content[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).
     * </p> 
	 */
	public Rule setContent(IDatatype theValue) {
		myContent = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Contract";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
