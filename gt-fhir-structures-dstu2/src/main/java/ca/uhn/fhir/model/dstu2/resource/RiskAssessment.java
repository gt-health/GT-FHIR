















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
 * HAPI/FHIR <b>RiskAssessment</b> Resource
 * (clinical.general)
 *
 * <p>
 * <b>Definition:</b>
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/RiskAssessment">http://hl7.org/fhir/profiles/RiskAssessment</a> 
 * </p>
 *
 */
@ResourceDef(name="RiskAssessment", profile="http://hl7.org/fhir/profiles/RiskAssessment", id="riskassessment")
public class RiskAssessment extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RiskAssessment.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="RiskAssessment.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RiskAssessment.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>RiskAssessment.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="RiskAssessment.date", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>RiskAssessment.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="RiskAssessment.encounter", description="", type="reference"  )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.performer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="performer", path="RiskAssessment.performer", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_PERFORMER = "performer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.performer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PERFORMER = new ReferenceClientParam(SP_PERFORMER);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="RiskAssessment.subject", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>condition</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.condition</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="condition", path="RiskAssessment.condition", description="", type="reference"  )
	public static final String SP_CONDITION = "condition";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>condition</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.condition</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam CONDITION = new ReferenceClientParam(SP_CONDITION);

	/**
	 * Search parameter constant for <b>method</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RiskAssessment.method</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="method", path="RiskAssessment.method", description="", type="token"  )
	public static final String SP_METHOD = "method";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>method</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RiskAssessment.method</b><br>
	 * </p>
	 */
	public static final TokenClientParam METHOD = new TokenClientParam(SP_METHOD);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="RiskAssessment.subject", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RiskAssessment.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>RiskAssessment:condition</b>".
	 */
	public static final Include INCLUDE_CONDITION = new Include("RiskAssessment:condition");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>RiskAssessment:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("RiskAssessment:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>RiskAssessment:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("RiskAssessment:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>RiskAssessment:performer</b>".
	 */
	public static final Include INCLUDE_PERFORMER = new Include("RiskAssessment:performer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>RiskAssessment:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("RiskAssessment:subject");


	@Child(name="subject", order=0, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The patient or group the risk assessment applies to"
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="date", type=DateTimeDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date (and possibly time) the risk assessment was performed"
	)
	private DateTimeDt myDate;
	
	@Child(name="condition", order=2, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Condition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="For assessments or prognosis specific to a particular condition, indicates the condition being assessed."
	)
	private ResourceReferenceDt myCondition;
	
	@Child(name="encounter", order=3, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="The encounter where the assessment was performed"
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="performer", order=4, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="who.author",
		formalDefinition="The provider or software application that performed the assessment"
	)
	private ResourceReferenceDt myPerformer;
	
	@Child(name="identifier", type=IdentifierDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Business identifier assigned to the risk assessment"
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="method", type=CodeableConceptDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="The algorithm, process or mechanism used to evaluate the risk"
	)
	private CodeableConceptDt myMethod;
	
	@Child(name="basis", order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.)"
	)
	private java.util.List<ResourceReferenceDt> myBasis;
	
	@Child(name="prediction", order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the expected outcome for the subject"
	)
	private java.util.List<Prediction> myPrediction;
	
	@Child(name="mitigation", type=StringDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of the steps that might be taken to reduce the identified risk(s)."
	)
	private StringDt myMitigation;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySubject,  myDate,  myCondition,  myEncounter,  myPerformer,  myIdentifier,  myMethod,  myBasis,  myPrediction,  myMitigation);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySubject, myDate, myCondition, myEncounter, myPerformer, myIdentifier, myMethod, myBasis, myPrediction, myMitigation);
	}

	/**
	 * Gets the value(s) for <b>subject</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient or group the risk assessment applies to
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
     * The patient or group the risk assessment applies to
     * </p> 
	 */
	public RiskAssessment setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>date</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and possibly time) the risk assessment was performed
     * </p> 
	 */
	public DateTimeDt getDateElement() {  
		if (myDate == null) {
			myDate = new DateTimeDt();
		}
		return myDate;
	}

	
	/**
	 * Gets the value(s) for <b>date</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and possibly time) the risk assessment was performed
     * </p> 
	 */
	public Date getDate() {  
		return getDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and possibly time) the risk assessment was performed
     * </p> 
	 */
	public RiskAssessment setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and possibly time) the risk assessment was performed
     * </p> 
	 */
	public RiskAssessment setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and possibly time) the risk assessment was performed
     * </p> 
	 */
	public RiskAssessment setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>condition</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
     * </p> 
	 */
	public ResourceReferenceDt getCondition() {  
		if (myCondition == null) {
			myCondition = new ResourceReferenceDt();
		}
		return myCondition;
	}

	/**
	 * Sets the value(s) for <b>condition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
     * </p> 
	 */
	public RiskAssessment setCondition(ResourceReferenceDt theValue) {
		myCondition = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The encounter where the assessment was performed
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
     * The encounter where the assessment was performed
     * </p> 
	 */
	public RiskAssessment setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>performer</b> (who.author).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The provider or software application that performed the assessment
     * </p> 
	 */
	public ResourceReferenceDt getPerformer() {  
		if (myPerformer == null) {
			myPerformer = new ResourceReferenceDt();
		}
		return myPerformer;
	}

	/**
	 * Sets the value(s) for <b>performer</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * The provider or software application that performed the assessment
     * </p> 
	 */
	public RiskAssessment setPerformer(ResourceReferenceDt theValue) {
		myPerformer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Business identifier assigned to the risk assessment
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Business identifier assigned to the risk assessment
     * </p> 
	 */
	public RiskAssessment setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>method</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The algorithm, process or mechanism used to evaluate the risk
     * </p> 
	 */
	public CodeableConceptDt getMethod() {  
		if (myMethod == null) {
			myMethod = new CodeableConceptDt();
		}
		return myMethod;
	}

	/**
	 * Sets the value(s) for <b>method</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * The algorithm, process or mechanism used to evaluate the risk
     * </p> 
	 */
	public RiskAssessment setMethod(CodeableConceptDt theValue) {
		myMethod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>basis</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.)
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getBasis() {  
		if (myBasis == null) {
			myBasis = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myBasis;
	}

	/**
	 * Sets the value(s) for <b>basis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.)
     * </p> 
	 */
	public RiskAssessment setBasis(java.util.List<ResourceReferenceDt> theValue) {
		myBasis = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>basis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.)
     * </p> 
	 */
	public ResourceReferenceDt addBasis() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getBasis().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>prediction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the expected outcome for the subject
     * </p> 
	 */
	public java.util.List<Prediction> getPrediction() {  
		if (myPrediction == null) {
			myPrediction = new java.util.ArrayList<Prediction>();
		}
		return myPrediction;
	}

	/**
	 * Sets the value(s) for <b>prediction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the expected outcome for the subject
     * </p> 
	 */
	public RiskAssessment setPrediction(java.util.List<Prediction> theValue) {
		myPrediction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>prediction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the expected outcome for the subject
     * </p> 
	 */
	public Prediction addPrediction() {
		Prediction newType = new Prediction();
		getPrediction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>prediction</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Describes the expected outcome for the subject
	 * </p>
	 * @param theValue The prediction to add (must not be <code>null</code>)
	 */
	public RiskAssessment addPrediction(Prediction theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPrediction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>prediction</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the expected outcome for the subject
     * </p> 
	 */
	public Prediction getPredictionFirstRep() {
		if (getPrediction().isEmpty()) {
			return addPrediction();
		}
		return getPrediction().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>mitigation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the steps that might be taken to reduce the identified risk(s).
     * </p> 
	 */
	public StringDt getMitigationElement() {  
		if (myMitigation == null) {
			myMitigation = new StringDt();
		}
		return myMitigation;
	}

	
	/**
	 * Gets the value(s) for <b>mitigation</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the steps that might be taken to reduce the identified risk(s).
     * </p> 
	 */
	public String getMitigation() {  
		return getMitigationElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>mitigation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the steps that might be taken to reduce the identified risk(s).
     * </p> 
	 */
	public RiskAssessment setMitigation(StringDt theValue) {
		myMitigation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>mitigation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the steps that might be taken to reduce the identified risk(s).
     * </p> 
	 */
	public RiskAssessment setMitigation( String theString) {
		myMitigation = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Block class for child element: <b>RiskAssessment.prediction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the expected outcome for the subject
     * </p> 
	 */
	@Block()	
	public static class Prediction 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="outcome", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="One of the potential outcomes for the patient (e.g. remission, death,  a particular condition)"
	)
	private CodeableConceptDt myOutcome;
	
	@Child(name="probability", order=1, min=0, max=1, summary=false, modifier=false, type={
		DecimalDt.class, 		RangeDt.class, 		CodeableConceptDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="How likely is the outcome (in the specified timeframe)"
	)
	private IDatatype myProbability;
	
	@Child(name="relativeRisk", type=DecimalDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)"
	)
	private DecimalDt myRelativeRisk;
	
	@Child(name="when", order=3, min=0, max=1, summary=false, modifier=false, type={
		PeriodDt.class, 		RangeDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the period of time or age range of the subject to which the specified probability applies"
	)
	private IDatatype myWhen;
	
	@Child(name="rationale", type=StringDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional information explaining the basis for the prediction"
	)
	private StringDt myRationale;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myOutcome,  myProbability,  myRelativeRisk,  myWhen,  myRationale);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myOutcome, myProbability, myRelativeRisk, myWhen, myRationale);
	}

	/**
	 * Gets the value(s) for <b>outcome</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * One of the potential outcomes for the patient (e.g. remission, death,  a particular condition)
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
     * One of the potential outcomes for the patient (e.g. remission, death,  a particular condition)
     * </p> 
	 */
	public Prediction setOutcome(CodeableConceptDt theValue) {
		myOutcome = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>probability[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * How likely is the outcome (in the specified timeframe)
     * </p> 
	 */
	public IDatatype getProbability() {  
		return myProbability;
	}

	/**
	 * Sets the value(s) for <b>probability[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How likely is the outcome (in the specified timeframe)
     * </p> 
	 */
	public Prediction setProbability(IDatatype theValue) {
		myProbability = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>relativeRisk</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)
     * </p> 
	 */
	public DecimalDt getRelativeRiskElement() {  
		if (myRelativeRisk == null) {
			myRelativeRisk = new DecimalDt();
		}
		return myRelativeRisk;
	}

	
	/**
	 * Gets the value(s) for <b>relativeRisk</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)
     * </p> 
	 */
	public BigDecimal getRelativeRisk() {  
		return getRelativeRiskElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>relativeRisk</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)
     * </p> 
	 */
	public Prediction setRelativeRisk(DecimalDt theValue) {
		myRelativeRisk = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>relativeRisk</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)
     * </p> 
	 */
	public Prediction setRelativeRisk( long theValue) {
		myRelativeRisk = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>relativeRisk</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)
     * </p> 
	 */
	public Prediction setRelativeRisk( double theValue) {
		myRelativeRisk = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>relativeRisk</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)
     * </p> 
	 */
	public Prediction setRelativeRisk( java.math.BigDecimal theValue) {
		myRelativeRisk = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>when[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the period of time or age range of the subject to which the specified probability applies
     * </p> 
	 */
	public IDatatype getWhen() {  
		return myWhen;
	}

	/**
	 * Sets the value(s) for <b>when[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the period of time or age range of the subject to which the specified probability applies
     * </p> 
	 */
	public Prediction setWhen(IDatatype theValue) {
		myWhen = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>rationale</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information explaining the basis for the prediction
     * </p> 
	 */
	public StringDt getRationaleElement() {  
		if (myRationale == null) {
			myRationale = new StringDt();
		}
		return myRationale;
	}

	
	/**
	 * Gets the value(s) for <b>rationale</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information explaining the basis for the prediction
     * </p> 
	 */
	public String getRationale() {  
		return getRationaleElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>rationale</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information explaining the basis for the prediction
     * </p> 
	 */
	public Prediction setRationale(StringDt theValue) {
		myRationale = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>rationale</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information explaining the basis for the prediction
     * </p> 
	 */
	public Prediction setRationale( String theString) {
		myRationale = new StringDt(theString); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "RiskAssessment";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
