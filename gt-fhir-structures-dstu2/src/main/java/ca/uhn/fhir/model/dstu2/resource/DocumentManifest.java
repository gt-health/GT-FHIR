















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
 * HAPI/FHIR <b>DocumentManifest</b> Resource
 * (infrastructure.documents)
 *
 * <p>
 * <b>Definition:</b>
 * A manifest that defines a set of documents.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/DocumentManifest">http://hl7.org/fhir/profiles/DocumentManifest</a> 
 * </p>
 *
 */
@ResourceDef(name="DocumentManifest", profile="http://hl7.org/fhir/profiles/DocumentManifest", id="documentmanifest")
public class DocumentManifest extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentManifest.masterIdentifier | DocumentManifest.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="DocumentManifest.masterIdentifier | DocumentManifest.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentManifest.masterIdentifier | DocumentManifest.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="DocumentManifest.subject", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentManifest.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="DocumentManifest.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentManifest.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>recipient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.recipient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="recipient", path="DocumentManifest.recipient", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_RECIPIENT = "recipient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>recipient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.recipient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RECIPIENT = new ReferenceClientParam(SP_RECIPIENT);

	/**
	 * Search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.author</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="author", path="DocumentManifest.author", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_AUTHOR = "author";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.author</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam AUTHOR = new ReferenceClientParam(SP_AUTHOR);

	/**
	 * Search parameter constant for <b>created</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DocumentManifest.created</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="created", path="DocumentManifest.created", description="", type="date"  )
	public static final String SP_CREATED = "created";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>created</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DocumentManifest.created</b><br>
	 * </p>
	 */
	public static final DateClientParam CREATED = new DateClientParam(SP_CREATED);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentManifest.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="DocumentManifest.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentManifest.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>DocumentManifest.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="description", path="DocumentManifest.description", description="", type="string"  )
	public static final String SP_DESCRIPTION = "description";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>DocumentManifest.description</b><br>
	 * </p>
	 */
	public static final StringClientParam DESCRIPTION = new StringClientParam(SP_DESCRIPTION);

	/**
	 * Search parameter constant for <b>content-ref</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.content.pReference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="content-ref", path="DocumentManifest.content.pReference", description="", type="reference"  )
	public static final String SP_CONTENT_REF = "content-ref";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>content-ref</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.content.pReference</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam CONTENT_REF = new ReferenceClientParam(SP_CONTENT_REF);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="DocumentManifest.subject", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>DocumentManifest.source</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="source", path="DocumentManifest.source", description="", type="uri"  )
	public static final String SP_SOURCE = "source";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>DocumentManifest.source</b><br>
	 * </p>
	 */
	public static final UriClientParam SOURCE = new UriClientParam(SP_SOURCE);

	/**
	 * Search parameter constant for <b>related-id</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentManifest.related.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="related-id", path="DocumentManifest.related.identifier", description="", type="token"  )
	public static final String SP_RELATED_ID = "related-id";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>related-id</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentManifest.related.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam RELATED_ID = new TokenClientParam(SP_RELATED_ID);

	/**
	 * Search parameter constant for <b>related-ref</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.related.ref</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="related-ref", path="DocumentManifest.related.ref", description="", type="reference"  )
	public static final String SP_RELATED_REF = "related-ref";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>related-ref</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentManifest.related.ref</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RELATED_REF = new ReferenceClientParam(SP_RELATED_REF);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentManifest:author</b>".
	 */
	public static final Include INCLUDE_AUTHOR = new Include("DocumentManifest:author");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentManifest:content-ref</b>".
	 */
	public static final Include INCLUDE_CONTENT_REF = new Include("DocumentManifest:content-ref");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentManifest:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("DocumentManifest:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentManifest:recipient</b>".
	 */
	public static final Include INCLUDE_RECIPIENT = new Include("DocumentManifest:recipient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentManifest:related-ref</b>".
	 */
	public static final Include INCLUDE_RELATED_REF = new Include("DocumentManifest:related-ref");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentManifest:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("DocumentManifest:subject");


	@Child(name="masterIdentifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts"
	)
	private IdentifierDt myMasterIdentifier;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Other identifiers associated with the document manifest, including version independent  identifiers"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="subject", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case)"
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="recipient", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who.cause",
		formalDefinition="A patient, practitioner, or organization for which this set of documents is intended"
	)
	private java.util.List<ResourceReferenceDt> myRecipient;
	
	@Child(name="type", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/c80-doc-typecodes")
	private CodeableConceptDt myType;
	
	@Child(name="author", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who.author",
		formalDefinition="Identifies who is responsible for creating the manifest, and adding  documents to it"
	)
	private java.util.List<ResourceReferenceDt> myAuthor;
	
	@Child(name="created", type=DateTimeDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.done",
		formalDefinition="When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.)"
	)
	private DateTimeDt myCreated;
	
	@Child(name="source", type=UriDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the source system, application, or software that produced the document manifest"
	)
	private UriDt mySource;
	
	@Child(name="status", type=CodeDt.class, order=8, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of this document manifest"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/document-reference-status")
	private BoundCodeDt<DocumentReferenceStatusEnum> myStatus;
	
	@Child(name="description", type=StringDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Human-readable description of the source document. This is sometimes known as the \"title\""
	)
	private StringDt myDescription;
	
	@Child(name="content", order=10, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The list of Documents included in the manifest."
	)
	private java.util.List<Content> myContent;
	
	@Child(name="related", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Related identifiers or resources associated with the DocumentManifest."
	)
	private java.util.List<Related> myRelated;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myMasterIdentifier,  myIdentifier,  mySubject,  myRecipient,  myType,  myAuthor,  myCreated,  mySource,  myStatus,  myDescription,  myContent,  myRelated);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myMasterIdentifier, myIdentifier, mySubject, myRecipient, myType, myAuthor, myCreated, mySource, myStatus, myDescription, myContent, myRelated);
	}

	/**
	 * Gets the value(s) for <b>masterIdentifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts
     * </p> 
	 */
	public IdentifierDt getMasterIdentifier() {  
		if (myMasterIdentifier == null) {
			myMasterIdentifier = new IdentifierDt();
		}
		return myMasterIdentifier;
	}

	/**
	 * Sets the value(s) for <b>masterIdentifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts
     * </p> 
	 */
	public DocumentManifest setMasterIdentifier(IdentifierDt theValue) {
		myMasterIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Other identifiers associated with the document manifest, including version independent  identifiers
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
     * Other identifiers associated with the document manifest, including version independent  identifiers
     * </p> 
	 */
	public DocumentManifest setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Other identifiers associated with the document manifest, including version independent  identifiers
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
	 * Other identifiers associated with the document manifest, including version independent  identifiers
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public DocumentManifest addIdentifier(IdentifierDt theValue) {
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
     * Other identifiers associated with the document manifest, including version independent  identifiers
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
     * Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case)
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
     * Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case)
     * </p> 
	 */
	public DocumentManifest setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>recipient</b> (who.cause).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A patient, practitioner, or organization for which this set of documents is intended
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getRecipient() {  
		if (myRecipient == null) {
			myRecipient = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myRecipient;
	}

	/**
	 * Sets the value(s) for <b>recipient</b> (who.cause)
	 *
     * <p>
     * <b>Definition:</b>
     * A patient, practitioner, or organization for which this set of documents is intended
     * </p> 
	 */
	public DocumentManifest setRecipient(java.util.List<ResourceReferenceDt> theValue) {
		myRecipient = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>recipient</b> (who.cause)
	 *
     * <p>
     * <b>Definition:</b>
     * A patient, practitioner, or organization for which this set of documents is intended
     * </p> 
	 */
	public ResourceReferenceDt addRecipient() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getRecipient().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>type</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider
     * </p> 
	 */
	public CodeableConceptDt getType() {  
		if (myType == null) {
			myType = new CodeableConceptDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider
     * </p> 
	 */
	public DocumentManifest setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>author</b> (who.author).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who is responsible for creating the manifest, and adding  documents to it
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAuthor() {  
		if (myAuthor == null) {
			myAuthor = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAuthor;
	}

	/**
	 * Sets the value(s) for <b>author</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who is responsible for creating the manifest, and adding  documents to it
     * </p> 
	 */
	public DocumentManifest setAuthor(java.util.List<ResourceReferenceDt> theValue) {
		myAuthor = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>author</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who is responsible for creating the manifest, and adding  documents to it
     * </p> 
	 */
	public ResourceReferenceDt addAuthor() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAuthor().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>created</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.)
     * </p> 
	 */
	public DateTimeDt getCreatedElement() {  
		if (myCreated == null) {
			myCreated = new DateTimeDt();
		}
		return myCreated;
	}

	
	/**
	 * Gets the value(s) for <b>created</b> (when.done).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.)
     * </p> 
	 */
	public Date getCreated() {  
		return getCreatedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>created</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.)
     * </p> 
	 */
	public DocumentManifest setCreated(DateTimeDt theValue) {
		myCreated = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>created</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.)
     * </p> 
	 */
	public DocumentManifest setCreated( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myCreated = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>created</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.)
     * </p> 
	 */
	public DocumentManifest setCreatedWithSecondsPrecision( Date theDate) {
		myCreated = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>source</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the source system, application, or software that produced the document manifest
     * </p> 
	 */
	public UriDt getSourceElement() {  
		if (mySource == null) {
			mySource = new UriDt();
		}
		return mySource;
	}

	
	/**
	 * Gets the value(s) for <b>source</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the source system, application, or software that produced the document manifest
     * </p> 
	 */
	public String getSource() {  
		return getSourceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>source</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the source system, application, or software that produced the document manifest
     * </p> 
	 */
	public DocumentManifest setSource(UriDt theValue) {
		mySource = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>source</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the source system, application, or software that produced the document manifest
     * </p> 
	 */
	public DocumentManifest setSource( String theUri) {
		mySource = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of this document manifest
     * </p> 
	 */
	public BoundCodeDt<DocumentReferenceStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<DocumentReferenceStatusEnum>(DocumentReferenceStatusEnum.VALUESET_BINDER);
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
     * The status of this document manifest
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
     * The status of this document manifest
     * </p> 
	 */
	public DocumentManifest setStatus(BoundCodeDt<DocumentReferenceStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of this document manifest
     * </p> 
	 */
	public DocumentManifest setStatus(DocumentReferenceStatusEnum theValue) {
		setStatus(new BoundCodeDt<DocumentReferenceStatusEnum>(DocumentReferenceStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of the source document. This is sometimes known as the \&quot;title\&quot;
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
     * Human-readable description of the source document. This is sometimes known as the \&quot;title\&quot;
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
     * Human-readable description of the source document. This is sometimes known as the \&quot;title\&quot;
     * </p> 
	 */
	public DocumentManifest setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of the source document. This is sometimes known as the \&quot;title\&quot;
     * </p> 
	 */
	public DocumentManifest setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>content</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The list of Documents included in the manifest.
     * </p> 
	 */
	public java.util.List<Content> getContent() {  
		if (myContent == null) {
			myContent = new java.util.ArrayList<Content>();
		}
		return myContent;
	}

	/**
	 * Sets the value(s) for <b>content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of Documents included in the manifest.
     * </p> 
	 */
	public DocumentManifest setContent(java.util.List<Content> theValue) {
		myContent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of Documents included in the manifest.
     * </p> 
	 */
	public Content addContent() {
		Content newType = new Content();
		getContent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>content</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The list of Documents included in the manifest.
	 * </p>
	 * @param theValue The content to add (must not be <code>null</code>)
	 */
	public DocumentManifest addContent(Content theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getContent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>content</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The list of Documents included in the manifest.
     * </p> 
	 */
	public Content getContentFirstRep() {
		if (getContent().isEmpty()) {
			return addContent();
		}
		return getContent().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>related</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifiers or resources associated with the DocumentManifest.
     * </p> 
	 */
	public java.util.List<Related> getRelated() {  
		if (myRelated == null) {
			myRelated = new java.util.ArrayList<Related>();
		}
		return myRelated;
	}

	/**
	 * Sets the value(s) for <b>related</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifiers or resources associated with the DocumentManifest.
     * </p> 
	 */
	public DocumentManifest setRelated(java.util.List<Related> theValue) {
		myRelated = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>related</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifiers or resources associated with the DocumentManifest.
     * </p> 
	 */
	public Related addRelated() {
		Related newType = new Related();
		getRelated().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>related</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Related identifiers or resources associated with the DocumentManifest.
	 * </p>
	 * @param theValue The related to add (must not be <code>null</code>)
	 */
	public DocumentManifest addRelated(Related theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRelated().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>related</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifiers or resources associated with the DocumentManifest.
     * </p> 
	 */
	public Related getRelatedFirstRep() {
		if (getRelated().isEmpty()) {
			return addRelated();
		}
		return getRelated().get(0); 
	}
  
	/**
	 * Block class for child element: <b>DocumentManifest.content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of Documents included in the manifest.
     * </p> 
	 */
	@Block()	
	public static class Content 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="p", order=0, min=1, max=1, summary=false, modifier=false, type={
		AttachmentDt.class, 		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed"
	)
	private IDatatype myP;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myP);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myP);
	}

	/**
	 * Gets the value(s) for <b>p[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed
     * </p> 
	 */
	public IDatatype getP() {  
		return myP;
	}

	/**
	 * Sets the value(s) for <b>p[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed
     * </p> 
	 */
	public Content setP(IDatatype theValue) {
		myP = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>DocumentManifest.related</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifiers or resources associated with the DocumentManifest.
     * </p> 
	 */
	@Block()	
	public static class Related 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="ref", order=1, min=0, max=1, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Related Resource to this DocumentManifest. For example, Order, DiagnosticOrder,  Procedure, EligibilityRequest, etc."
	)
	private ResourceReferenceDt myRef;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myRef);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myRef);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.
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
     * Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.
     * </p> 
	 */
	public Related setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>ref</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Related Resource to this DocumentManifest. For example, Order, DiagnosticOrder,  Procedure, EligibilityRequest, etc.
     * </p> 
	 */
	public ResourceReferenceDt getRef() {  
		if (myRef == null) {
			myRef = new ResourceReferenceDt();
		}
		return myRef;
	}

	/**
	 * Sets the value(s) for <b>ref</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Related Resource to this DocumentManifest. For example, Order, DiagnosticOrder,  Procedure, EligibilityRequest, etc.
     * </p> 
	 */
	public Related setRef(ResourceReferenceDt theValue) {
		myRef = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "DocumentManifest";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
