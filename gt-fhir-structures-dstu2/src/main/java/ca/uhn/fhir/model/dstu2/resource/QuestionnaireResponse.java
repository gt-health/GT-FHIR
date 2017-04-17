















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
 * HAPI/FHIR <b>QuestionnaireResponse</b> Resource
 * (infrastructure.information)
 *
 * <p>
 * <b>Definition:</b>
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * To support structured, hierarchical registration of data gathered using digital forms and other questionnaires.
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/QuestionnaireResponse">http://hl7.org/fhir/profiles/QuestionnaireResponse</a> 
 * </p>
 *
 */
@ResourceDef(name="QuestionnaireResponse", profile="http://hl7.org/fhir/profiles/QuestionnaireResponse", id="questionnaireresponse")
public class QuestionnaireResponse extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the questionnaire response</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>QuestionnaireResponse.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="QuestionnaireResponse.status", description="The status of the questionnaire response", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the questionnaire response</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>QuestionnaireResponse.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>authored</b>
	 * <p>
	 * Description: <b>When the questionnaire was authored</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>QuestionnaireResponse.authored</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="authored", path="QuestionnaireResponse.authored", description="When the questionnaire was authored", type="date"  )
	public static final String SP_AUTHORED = "authored";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>authored</b>
	 * <p>
	 * Description: <b>When the questionnaire was authored</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>QuestionnaireResponse.authored</b><br>
	 * </p>
	 */
	public static final DateClientParam AUTHORED = new DateClientParam(SP_AUTHORED);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The subject of the questionnaire</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="QuestionnaireResponse.subject", description="The subject of the questionnaire", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The subject of the questionnaire</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b>The author of the questionnaire</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.author</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="author", path="QuestionnaireResponse.author", description="The author of the questionnaire", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") ,  @Compartment(name="Device") 	}
 )
	public static final String SP_AUTHOR = "author";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b>The author of the questionnaire</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.author</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam AUTHOR = new ReferenceClientParam(SP_AUTHOR);

	/**
	 * Search parameter constant for <b>questionnaire</b>
	 * <p>
	 * Description: <b>The questionnaire the answers are provided for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.questionnaire</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="questionnaire", path="QuestionnaireResponse.questionnaire", description="The questionnaire the answers are provided for", type="reference"  )
	public static final String SP_QUESTIONNAIRE = "questionnaire";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>questionnaire</b>
	 * <p>
	 * Description: <b>The questionnaire the answers are provided for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.questionnaire</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam QUESTIONNAIRE = new ReferenceClientParam(SP_QUESTIONNAIRE);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Encounter during which questionnaire was authored</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="QuestionnaireResponse.encounter", description="Encounter during which questionnaire was authored", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Encounter during which questionnaire was authored</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The patient that is the subject of the questionnaire</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="QuestionnaireResponse.subject", description="The patient that is the subject of the questionnaire", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The patient that is the subject of the questionnaire</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.source</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="source", path="QuestionnaireResponse.source", description="", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_SOURCE = "source";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>QuestionnaireResponse.source</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SOURCE = new ReferenceClientParam(SP_SOURCE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>QuestionnaireResponse:author</b>".
	 */
	public static final Include INCLUDE_AUTHOR = new Include("QuestionnaireResponse:author");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>QuestionnaireResponse:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("QuestionnaireResponse:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>QuestionnaireResponse:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("QuestionnaireResponse:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>QuestionnaireResponse:questionnaire</b>".
	 */
	public static final Include INCLUDE_QUESTIONNAIRE = new Include("QuestionnaireResponse:questionnaire");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>QuestionnaireResponse:source</b>".
	 */
	public static final Include INCLUDE_SOURCE = new Include("QuestionnaireResponse:source");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>QuestionnaireResponse:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("QuestionnaireResponse:subject");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="A business identifier assigned to a particular completed (or partially completed) questionnaire"
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="questionnaire", order=1, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Questionnaire.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the Questionnaire resource that defines the form for which answers are being provided"
	)
	private ResourceReferenceDt myQuestionnaire;
	
	@Child(name="status", type=CodeDt.class, order=2, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The lifecycle status of the questionnaire response as a whole."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers-status")
	private BoundCodeDt<QuestionnaireResponseStatusEnum> myStatus;
	
	@Child(name="subject", order=3, min=0, max=1, summary=true, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information"
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="author", order=4, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who.author",
		formalDefinition="Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system"
	)
	private ResourceReferenceDt myAuthor;
	
	@Child(name="authored", type=DateTimeDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date and/or time that this version of the questionnaire response was authored"
	)
	private DateTimeDt myAuthored;
	
	@Child(name="source", order=6, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who.source",
		formalDefinition="The person who answered the questions about the subject."
	)
	private ResourceReferenceDt mySource;
	
	@Child(name="encounter", order=7, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers."
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="group", order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A group of questions to a possibly similarly grouped set of questions in the questionnaire response"
	)
	private Group myGroup;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myQuestionnaire,  myStatus,  mySubject,  myAuthor,  myAuthored,  mySource,  myEncounter,  myGroup);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myQuestionnaire, myStatus, mySubject, myAuthor, myAuthored, mySource, myEncounter, myGroup);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A business identifier assigned to a particular completed (or partially completed) questionnaire
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
     * A business identifier assigned to a particular completed (or partially completed) questionnaire
     * </p> 
	 */
	public QuestionnaireResponse setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>questionnaire</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the Questionnaire resource that defines the form for which answers are being provided
     * </p> 
	 */
	public ResourceReferenceDt getQuestionnaire() {  
		if (myQuestionnaire == null) {
			myQuestionnaire = new ResourceReferenceDt();
		}
		return myQuestionnaire;
	}

	/**
	 * Sets the value(s) for <b>questionnaire</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the Questionnaire resource that defines the form for which answers are being provided
     * </p> 
	 */
	public QuestionnaireResponse setQuestionnaire(ResourceReferenceDt theValue) {
		myQuestionnaire = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The lifecycle status of the questionnaire response as a whole.
     * </p> 
	 */
	public BoundCodeDt<QuestionnaireResponseStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<QuestionnaireResponseStatusEnum>(QuestionnaireResponseStatusEnum.VALUESET_BINDER);
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
     * The lifecycle status of the questionnaire response as a whole.
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
     * The lifecycle status of the questionnaire response as a whole.
     * </p> 
	 */
	public QuestionnaireResponse setStatus(BoundCodeDt<QuestionnaireResponseStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The lifecycle status of the questionnaire response as a whole.
     * </p> 
	 */
	public QuestionnaireResponse setStatus(QuestionnaireResponseStatusEnum theValue) {
		setStatus(new BoundCodeDt<QuestionnaireResponseStatusEnum>(QuestionnaireResponseStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>subject</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information
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
     * The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information
     * </p> 
	 */
	public QuestionnaireResponse setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>author</b> (who.author).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system
     * </p> 
	 */
	public ResourceReferenceDt getAuthor() {  
		if (myAuthor == null) {
			myAuthor = new ResourceReferenceDt();
		}
		return myAuthor;
	}

	/**
	 * Sets the value(s) for <b>author</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system
     * </p> 
	 */
	public QuestionnaireResponse setAuthor(ResourceReferenceDt theValue) {
		myAuthor = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>authored</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and/or time that this version of the questionnaire response was authored
     * </p> 
	 */
	public DateTimeDt getAuthoredElement() {  
		if (myAuthored == null) {
			myAuthored = new DateTimeDt();
		}
		return myAuthored;
	}

	
	/**
	 * Gets the value(s) for <b>authored</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and/or time that this version of the questionnaire response was authored
     * </p> 
	 */
	public Date getAuthored() {  
		return getAuthoredElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>authored</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and/or time that this version of the questionnaire response was authored
     * </p> 
	 */
	public QuestionnaireResponse setAuthored(DateTimeDt theValue) {
		myAuthored = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>authored</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and/or time that this version of the questionnaire response was authored
     * </p> 
	 */
	public QuestionnaireResponse setAuthored( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myAuthored = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>authored</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and/or time that this version of the questionnaire response was authored
     * </p> 
	 */
	public QuestionnaireResponse setAuthoredWithSecondsPrecision( Date theDate) {
		myAuthored = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>source</b> (who.source).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person who answered the questions about the subject.
     * </p> 
	 */
	public ResourceReferenceDt getSource() {  
		if (mySource == null) {
			mySource = new ResourceReferenceDt();
		}
		return mySource;
	}

	/**
	 * Sets the value(s) for <b>source</b> (who.source)
	 *
     * <p>
     * <b>Definition:</b>
     * The person who answered the questions about the subject.
     * </p> 
	 */
	public QuestionnaireResponse setSource(ResourceReferenceDt theValue) {
		mySource = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.
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
     * Encounter during which this set of questionnaire response were collected. When there were multiple encounters, this is the one considered most relevant to the context of the answers.
     * </p> 
	 */
	public QuestionnaireResponse setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>group</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A group of questions to a possibly similarly grouped set of questions in the questionnaire response
     * </p> 
	 */
	public Group getGroup() {  
		if (myGroup == null) {
			myGroup = new Group();
		}
		return myGroup;
	}

	/**
	 * Sets the value(s) for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A group of questions to a possibly similarly grouped set of questions in the questionnaire response
     * </p> 
	 */
	public QuestionnaireResponse setGroup(Group theValue) {
		myGroup = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>QuestionnaireResponse.group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A group of questions to a possibly similarly grouped set of questions in the questionnaire response
     * </p> 
	 */
	@Block()	
	public static class Group 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="linkId", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource."
	)
	private StringDt myLinkId;
	
	@Child(name="title", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Text that is displayed above the contents of the group"
	)
	private StringDt myTitle;
	
	@Child(name="text", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional text for the group, used for display purposes"
	)
	private StringDt myText;
	
	@Child(name="subject", order=3, min=0, max=1, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="More specific subject this section's answers are about, details the subject given in QuestionnaireResponse"
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="group", type=Group.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A sub-group within a group. The ordering of groups within this group is relevant"
	)
	private java.util.List<Group> myGroup;
	
	@Child(name="question", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Set of questions within this group. The order of questions within the group is relevant"
	)
	private java.util.List<GroupQuestion> myQuestion;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLinkId,  myTitle,  myText,  mySubject,  myGroup,  myQuestion);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLinkId, myTitle, myText, mySubject, myGroup, myQuestion);
	}

	/**
	 * Gets the value(s) for <b>linkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.
     * </p> 
	 */
	public StringDt getLinkIdElement() {  
		if (myLinkId == null) {
			myLinkId = new StringDt();
		}
		return myLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>linkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.
     * </p> 
	 */
	public String getLinkId() {  
		return getLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>linkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.
     * </p> 
	 */
	public Group setLinkId(StringDt theValue) {
		myLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>linkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the group from the Questionnaire that corresponds to this group in the QuestionnaireResponse resource.
     * </p> 
	 */
	public Group setLinkId( String theString) {
		myLinkId = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>title</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Text that is displayed above the contents of the group
     * </p> 
	 */
	public StringDt getTitleElement() {  
		if (myTitle == null) {
			myTitle = new StringDt();
		}
		return myTitle;
	}

	
	/**
	 * Gets the value(s) for <b>title</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Text that is displayed above the contents of the group
     * </p> 
	 */
	public String getTitle() {  
		return getTitleElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Text that is displayed above the contents of the group
     * </p> 
	 */
	public Group setTitle(StringDt theValue) {
		myTitle = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Text that is displayed above the contents of the group
     * </p> 
	 */
	public Group setTitle( String theString) {
		myTitle = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional text for the group, used for display purposes
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
     * Additional text for the group, used for display purposes
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
     * Additional text for the group, used for display purposes
     * </p> 
	 */
	public Group setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional text for the group, used for display purposes
     * </p> 
	 */
	public Group setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>subject</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * More specific subject this section's answers are about, details the subject given in QuestionnaireResponse
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
     * More specific subject this section's answers are about, details the subject given in QuestionnaireResponse
     * </p> 
	 */
	public Group setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>group</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A sub-group within a group. The ordering of groups within this group is relevant
     * </p> 
	 */
	public java.util.List<Group> getGroup() {  
		if (myGroup == null) {
			myGroup = new java.util.ArrayList<Group>();
		}
		return myGroup;
	}

	/**
	 * Sets the value(s) for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A sub-group within a group. The ordering of groups within this group is relevant
     * </p> 
	 */
	public Group setGroup(java.util.List<Group> theValue) {
		myGroup = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A sub-group within a group. The ordering of groups within this group is relevant
     * </p> 
	 */
	public Group addGroup() {
		Group newType = new Group();
		getGroup().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>group</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A sub-group within a group. The ordering of groups within this group is relevant
	 * </p>
	 * @param theValue The group to add (must not be <code>null</code>)
	 */
	public Group addGroup(Group theValue) {
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
     * A sub-group within a group. The ordering of groups within this group is relevant
     * </p> 
	 */
	public Group getGroupFirstRep() {
		if (getGroup().isEmpty()) {
			return addGroup();
		}
		return getGroup().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>question</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	public java.util.List<GroupQuestion> getQuestion() {  
		if (myQuestion == null) {
			myQuestion = new java.util.ArrayList<GroupQuestion>();
		}
		return myQuestion;
	}

	/**
	 * Sets the value(s) for <b>question</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	public Group setQuestion(java.util.List<GroupQuestion> theValue) {
		myQuestion = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>question</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	public GroupQuestion addQuestion() {
		GroupQuestion newType = new GroupQuestion();
		getQuestion().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>question</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Set of questions within this group. The order of questions within the group is relevant
	 * </p>
	 * @param theValue The question to add (must not be <code>null</code>)
	 */
	public Group addQuestion(GroupQuestion theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getQuestion().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>question</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	public GroupQuestion getQuestionFirstRep() {
		if (getQuestion().isEmpty()) {
			return addQuestion();
		}
		return getQuestion().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>QuestionnaireResponse.group.question</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	@Block()	
	public static class GroupQuestion 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="linkId", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource."
	)
	private StringDt myLinkId;
	
	@Child(name="text", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The actual question as shown to the user to prompt them for an answer."
	)
	private StringDt myText;
	
	@Child(name="answer", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The respondent's answer(s) to the question"
	)
	private java.util.List<GroupQuestionAnswer> myAnswer;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLinkId,  myText,  myAnswer);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLinkId, myText, myAnswer);
	}

	/**
	 * Gets the value(s) for <b>linkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.
     * </p> 
	 */
	public StringDt getLinkIdElement() {  
		if (myLinkId == null) {
			myLinkId = new StringDt();
		}
		return myLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>linkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.
     * </p> 
	 */
	public String getLinkId() {  
		return getLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>linkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.
     * </p> 
	 */
	public GroupQuestion setLinkId(StringDt theValue) {
		myLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>linkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the question from the Questionnaire that corresponds to this question in the QuestionnaireResponse resource.
     * </p> 
	 */
	public GroupQuestion setLinkId( String theString) {
		myLinkId = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual question as shown to the user to prompt them for an answer.
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
     * The actual question as shown to the user to prompt them for an answer.
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
     * The actual question as shown to the user to prompt them for an answer.
     * </p> 
	 */
	public GroupQuestion setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual question as shown to the user to prompt them for an answer.
     * </p> 
	 */
	public GroupQuestion setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>answer</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The respondent's answer(s) to the question
     * </p> 
	 */
	public java.util.List<GroupQuestionAnswer> getAnswer() {  
		if (myAnswer == null) {
			myAnswer = new java.util.ArrayList<GroupQuestionAnswer>();
		}
		return myAnswer;
	}

	/**
	 * Sets the value(s) for <b>answer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The respondent's answer(s) to the question
     * </p> 
	 */
	public GroupQuestion setAnswer(java.util.List<GroupQuestionAnswer> theValue) {
		myAnswer = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>answer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The respondent's answer(s) to the question
     * </p> 
	 */
	public GroupQuestionAnswer addAnswer() {
		GroupQuestionAnswer newType = new GroupQuestionAnswer();
		getAnswer().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>answer</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The respondent's answer(s) to the question
	 * </p>
	 * @param theValue The answer to add (must not be <code>null</code>)
	 */
	public GroupQuestion addAnswer(GroupQuestionAnswer theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAnswer().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>answer</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The respondent's answer(s) to the question
     * </p> 
	 */
	public GroupQuestionAnswer getAnswerFirstRep() {
		if (getAnswer().isEmpty()) {
			return addAnswer();
		}
		return getAnswer().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>QuestionnaireResponse.group.question.answer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The respondent's answer(s) to the question
     * </p> 
	 */
	@Block()	
	public static class GroupQuestionAnswer 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="value", order=0, min=0, max=1, summary=false, modifier=false, type={
		BooleanDt.class, 		DecimalDt.class, 		IntegerDt.class, 		DateDt.class, 		DateTimeDt.class, 		InstantDt.class, 		TimeDt.class, 		StringDt.class, 		UriDt.class, 		AttachmentDt.class, 		CodingDt.class, 		QuantityDt.class, 		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The answer (or one of the answers) provided by the respondent to the question"
	)
	private IDatatype myValue;
	
	@Child(name="group", type=Group.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Nested group, containing nested question for this question. The order of groups within the question is relevant"
	)
	private java.util.List<Group> myGroup;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myValue,  myGroup);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myValue, myGroup);
	}

	/**
	 * Gets the value(s) for <b>value[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The answer (or one of the answers) provided by the respondent to the question
     * </p> 
	 */
	public IDatatype getValue() {  
		return myValue;
	}

	/**
	 * Sets the value(s) for <b>value[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The answer (or one of the answers) provided by the respondent to the question
     * </p> 
	 */
	public GroupQuestionAnswer setValue(IDatatype theValue) {
		myValue = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>group</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group, containing nested question for this question. The order of groups within the question is relevant
     * </p> 
	 */
	public java.util.List<Group> getGroup() {  
		if (myGroup == null) {
			myGroup = new java.util.ArrayList<Group>();
		}
		return myGroup;
	}

	/**
	 * Sets the value(s) for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group, containing nested question for this question. The order of groups within the question is relevant
     * </p> 
	 */
	public GroupQuestionAnswer setGroup(java.util.List<Group> theValue) {
		myGroup = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group, containing nested question for this question. The order of groups within the question is relevant
     * </p> 
	 */
	public Group addGroup() {
		Group newType = new Group();
		getGroup().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>group</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Nested group, containing nested question for this question. The order of groups within the question is relevant
	 * </p>
	 * @param theValue The group to add (must not be <code>null</code>)
	 */
	public GroupQuestionAnswer addGroup(Group theValue) {
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
     * Nested group, containing nested question for this question. The order of groups within the question is relevant
     * </p> 
	 */
	public Group getGroupFirstRep() {
		if (getGroup().isEmpty()) {
			return addGroup();
		}
		return getGroup().get(0); 
	}
  


	}






    @Override
    public String getResourceName() {
        return "QuestionnaireResponse";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
