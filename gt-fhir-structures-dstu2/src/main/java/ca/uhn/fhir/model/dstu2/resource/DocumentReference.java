















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
 * HAPI/FHIR <b>DocumentReference</b> Resource
 * (infrastructure.documents)
 *
 * <p>
 * <b>Definition:</b>
 * A reference to a document .
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/DocumentReference">http://hl7.org/fhir/profiles/DocumentReference</a> 
 * </p>
 *
 */
@ResourceDef(name="DocumentReference", profile="http://hl7.org/fhir/profiles/DocumentReference", id="documentreference")
public class DocumentReference extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.masterIdentifier | DocumentReference.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="DocumentReference.masterIdentifier | DocumentReference.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.masterIdentifier | DocumentReference.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="DocumentReference.subject", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="DocumentReference.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>class</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.class</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="class", path="DocumentReference.class", description="", type="token"  )
	public static final String SP_CLASS = "class";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>class</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.class</b><br>
	 * </p>
	 */
	public static final TokenClientParam CLASS = new TokenClientParam(SP_CLASS);

	/**
	 * Search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.author</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="author", path="DocumentReference.author", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_AUTHOR = "author";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.author</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam AUTHOR = new ReferenceClientParam(SP_AUTHOR);

	/**
	 * Search parameter constant for <b>custodian</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.custodian</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="custodian", path="DocumentReference.custodian", description="", type="reference"  )
	public static final String SP_CUSTODIAN = "custodian";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>custodian</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.custodian</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam CUSTODIAN = new ReferenceClientParam(SP_CUSTODIAN);

	/**
	 * Search parameter constant for <b>authenticator</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.authenticator</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="authenticator", path="DocumentReference.authenticator", description="", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_AUTHENTICATOR = "authenticator";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>authenticator</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.authenticator</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam AUTHENTICATOR = new ReferenceClientParam(SP_AUTHENTICATOR);

	/**
	 * Search parameter constant for <b>created</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DocumentReference.created</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="created", path="DocumentReference.created", description="", type="date"  )
	public static final String SP_CREATED = "created";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>created</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DocumentReference.created</b><br>
	 * </p>
	 */
	public static final DateClientParam CREATED = new DateClientParam(SP_CREATED);

	/**
	 * Search parameter constant for <b>indexed</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DocumentReference.indexed</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="indexed", path="DocumentReference.indexed", description="", type="date"  )
	public static final String SP_INDEXED = "indexed";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>indexed</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DocumentReference.indexed</b><br>
	 * </p>
	 */
	public static final DateClientParam INDEXED = new DateClientParam(SP_INDEXED);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="DocumentReference.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>relatesto</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.relatesTo.target</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="relatesto", path="DocumentReference.relatesTo.target", description="", type="reference"  )
	public static final String SP_RELATESTO = "relatesto";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>relatesto</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.relatesTo.target</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RELATESTO = new ReferenceClientParam(SP_RELATESTO);

	/**
	 * Search parameter constant for <b>relation</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.relatesTo.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="relation", path="DocumentReference.relatesTo.code", description="", type="token"  )
	public static final String SP_RELATION = "relation";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>relation</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.relatesTo.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam RELATION = new TokenClientParam(SP_RELATION);

	/**
	 * Search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>DocumentReference.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="description", path="DocumentReference.description", description="", type="string"  )
	public static final String SP_DESCRIPTION = "description";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>DocumentReference.description</b><br>
	 * </p>
	 */
	public static final StringClientParam DESCRIPTION = new StringClientParam(SP_DESCRIPTION);

	/**
	 * Search parameter constant for <b>securitylabel</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.securityLabel</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="securitylabel", path="DocumentReference.securityLabel", description="", type="token"  )
	public static final String SP_SECURITYLABEL = "securitylabel";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>securitylabel</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.securityLabel</b><br>
	 * </p>
	 */
	public static final TokenClientParam SECURITYLABEL = new TokenClientParam(SP_SECURITYLABEL);

	/**
	 * Search parameter constant for <b>format</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.content.format</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="format", path="DocumentReference.content.format", description="", type="token"  )
	public static final String SP_FORMAT = "format";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>format</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.content.format</b><br>
	 * </p>
	 */
	public static final TokenClientParam FORMAT = new TokenClientParam(SP_FORMAT);

	/**
	 * Search parameter constant for <b>language</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.content.attachment.language</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="language", path="DocumentReference.content.attachment.language", description="", type="token"  )
	public static final String SP_LANGUAGE = "language";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>language</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.content.attachment.language</b><br>
	 * </p>
	 */
	public static final TokenClientParam LANGUAGE = new TokenClientParam(SP_LANGUAGE);

	/**
	 * Search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>DocumentReference.content.attachment.url</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location", path="DocumentReference.content.attachment.url", description="", type="uri"  )
	public static final String SP_LOCATION = "location";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>DocumentReference.content.attachment.url</b><br>
	 * </p>
	 */
	public static final UriClientParam LOCATION = new UriClientParam(SP_LOCATION);

	/**
	 * Search parameter constant for <b>event</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.context.event</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="event", path="DocumentReference.context.event", description="", type="token"  )
	public static final String SP_EVENT = "event";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>event</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.context.event</b><br>
	 * </p>
	 */
	public static final TokenClientParam EVENT = new TokenClientParam(SP_EVENT);

	/**
	 * Search parameter constant for <b>period</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DocumentReference.context.period</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="period", path="DocumentReference.context.period", description="", type="date"  )
	public static final String SP_PERIOD = "period";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>period</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DocumentReference.context.period</b><br>
	 * </p>
	 */
	public static final DateClientParam PERIOD = new DateClientParam(SP_PERIOD);

	/**
	 * Search parameter constant for <b>facility</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.context.facilityType</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="facility", path="DocumentReference.context.facilityType", description="", type="token"  )
	public static final String SP_FACILITY = "facility";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>facility</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.context.facilityType</b><br>
	 * </p>
	 */
	public static final TokenClientParam FACILITY = new TokenClientParam(SP_FACILITY);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="DocumentReference.subject", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>setting</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.context.practiceSetting</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="setting", path="DocumentReference.context.practiceSetting", description="", type="token"  )
	public static final String SP_SETTING = "setting";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>setting</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.context.practiceSetting</b><br>
	 * </p>
	 */
	public static final TokenClientParam SETTING = new TokenClientParam(SP_SETTING);

	/**
	 * Search parameter constant for <b>related-id</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.context.related.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="related-id", path="DocumentReference.context.related.identifier", description="", type="token"  )
	public static final String SP_RELATED_ID = "related-id";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>related-id</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DocumentReference.context.related.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam RELATED_ID = new TokenClientParam(SP_RELATED_ID);

	/**
	 * Search parameter constant for <b>related-ref</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.context.related.ref</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="related-ref", path="DocumentReference.context.related.ref", description="", type="reference"  )
	public static final String SP_RELATED_REF = "related-ref";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>related-ref</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.context.related.ref</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RELATED_REF = new ReferenceClientParam(SP_RELATED_REF);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.context.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="DocumentReference.context.encounter", description="", type="reference"  )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DocumentReference.context.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>relatesto-relation</b>
	 * <p>
	 * Description: <b>Combination of relation and relatesTo</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>relatesto &amp; relation</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="relatesto-relation", path="relatesto & relation", description="Combination of relation and relatesTo", type="composite"  , compositeOf={  "relatesto",  "relation" }  )
	public static final String SP_RELATESTO_RELATION = "relatesto-relation";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>relatesto-relation</b>
	 * <p>
	 * Description: <b>Combination of relation and relatesTo</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>relatesto &amp; relation</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<ReferenceClientParam, TokenClientParam> RELATESTO_RELATION = new CompositeClientParam<ReferenceClientParam, TokenClientParam>(SP_RELATESTO_RELATION);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentReference:authenticator</b>".
	 */
	public static final Include INCLUDE_AUTHENTICATOR = new Include("DocumentReference:authenticator");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentReference:author</b>".
	 */
	public static final Include INCLUDE_AUTHOR = new Include("DocumentReference:author");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentReference:custodian</b>".
	 */
	public static final Include INCLUDE_CUSTODIAN = new Include("DocumentReference:custodian");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentReference:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("DocumentReference:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentReference:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("DocumentReference:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentReference:related-ref</b>".
	 */
	public static final Include INCLUDE_RELATED_REF = new Include("DocumentReference:related-ref");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentReference:relatesto</b>".
	 */
	public static final Include INCLUDE_RELATESTO = new Include("DocumentReference:relatesto");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DocumentReference:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("DocumentReference:subject");


	@Child(name="masterIdentifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document"
	)
	private IdentifierDt myMasterIdentifier;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Other identifiers associated with the document, including version independent identifiers"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="subject", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure)"
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="type", type=CodeableConceptDt.class, order=3, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-c80-doc-typecodes")
	private CodeableConceptDt myType;
	
	@Child(name="class", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type"
	)
	private CodeableConceptDt myClassElement;
	
	@Child(name="author", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who.author",
		formalDefinition="Identifies who is responsible for adding the information to the document"
	)
	private java.util.List<ResourceReferenceDt> myAuthor;
	
	@Child(name="custodian", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the organization or group who is responsible for ongoing maintenance of and access to the document"
	)
	private ResourceReferenceDt myCustodian;
	
	@Child(name="authenticator", order=7, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who.witness",
		formalDefinition="Which person or organization authenticates that this document is valid"
	)
	private ResourceReferenceDt myAuthenticator;
	
	@Child(name="created", type=DateTimeDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.done",
		formalDefinition="When the document was created"
	)
	private DateTimeDt myCreated;
	
	@Child(name="indexed", type=InstantDt.class, order=9, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="When the document reference was created"
	)
	private InstantDt myIndexed;
	
	@Child(name="status", type=CodeDt.class, order=10, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of this document reference"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/document-reference-status")
	private BoundCodeDt<DocumentReferenceStatusEnum> myStatus;
	
	@Child(name="docStatus", type=CodeableConceptDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of the underlying document"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/composition-status")
	private CodeableConceptDt myDocStatus;
	
	@Child(name="relatesTo", order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Relationships that this document has with other document references that already exist"
	)
	private java.util.List<RelatesTo> myRelatesTo;
	
	@Child(name="description", type=StringDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Human-readable description of the source document. This is sometimes known as the \"title\""
	)
	private StringDt myDescription;
	
	@Child(name="securityLabel", type=CodeableConceptDt.class, order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \"reference\" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to"
	)
	private java.util.List<CodeableConceptDt> mySecurityLabel;
	
	@Child(name="content", order=15, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The document and format referenced. There may be multiple content element repetitions, each with a different format."
	)
	private java.util.List<Content> myContent;
	
	@Child(name="context", order=16, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The clinical context in which the document was prepared"
	)
	private Context myContext;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myMasterIdentifier,  myIdentifier,  mySubject,  myType,  myClassElement,  myAuthor,  myCustodian,  myAuthenticator,  myCreated,  myIndexed,  myStatus,  myDocStatus,  myRelatesTo,  myDescription,  mySecurityLabel,  myContent,  myContext);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myMasterIdentifier, myIdentifier, mySubject, myType, myClassElement, myAuthor, myCustodian, myAuthenticator, myCreated, myIndexed, myStatus, myDocStatus, myRelatesTo, myDescription, mySecurityLabel, myContent, myContext);
	}

	/**
	 * Gets the value(s) for <b>masterIdentifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document
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
     * Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document
     * </p> 
	 */
	public DocumentReference setMasterIdentifier(IdentifierDt theValue) {
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
     * Other identifiers associated with the document, including version independent identifiers
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
     * Other identifiers associated with the document, including version independent identifiers
     * </p> 
	 */
	public DocumentReference setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Other identifiers associated with the document, including version independent identifiers
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
	 * Other identifiers associated with the document, including version independent identifiers
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public DocumentReference addIdentifier(IdentifierDt theValue) {
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
     * Other identifiers associated with the document, including version independent identifiers
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
     * Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure)
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
     * Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure)
     * </p> 
	 */
	public DocumentReference setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>type</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.
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
     * Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.
     * </p> 
	 */
	public DocumentReference setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>class</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type
     * </p> 
	 */
	public CodeableConceptDt getClassElement() {  
		if (myClassElement == null) {
			myClassElement = new CodeableConceptDt();
		}
		return myClassElement;
	}

	/**
	 * Sets the value(s) for <b>class</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type
     * </p> 
	 */
	public DocumentReference setClassElement(CodeableConceptDt theValue) {
		myClassElement = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>author</b> (who.author).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who is responsible for adding the information to the document
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
     * Identifies who is responsible for adding the information to the document
     * </p> 
	 */
	public DocumentReference setAuthor(java.util.List<ResourceReferenceDt> theValue) {
		myAuthor = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>author</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who is responsible for adding the information to the document
     * </p> 
	 */
	public ResourceReferenceDt addAuthor() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAuthor().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>custodian</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the document
     * </p> 
	 */
	public ResourceReferenceDt getCustodian() {  
		if (myCustodian == null) {
			myCustodian = new ResourceReferenceDt();
		}
		return myCustodian;
	}

	/**
	 * Sets the value(s) for <b>custodian</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the document
     * </p> 
	 */
	public DocumentReference setCustodian(ResourceReferenceDt theValue) {
		myCustodian = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>authenticator</b> (who.witness).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Which person or organization authenticates that this document is valid
     * </p> 
	 */
	public ResourceReferenceDt getAuthenticator() {  
		if (myAuthenticator == null) {
			myAuthenticator = new ResourceReferenceDt();
		}
		return myAuthenticator;
	}

	/**
	 * Sets the value(s) for <b>authenticator</b> (who.witness)
	 *
     * <p>
     * <b>Definition:</b>
     * Which person or organization authenticates that this document is valid
     * </p> 
	 */
	public DocumentReference setAuthenticator(ResourceReferenceDt theValue) {
		myAuthenticator = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>created</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the document was created
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
     * When the document was created
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
     * When the document was created
     * </p> 
	 */
	public DocumentReference setCreated(DateTimeDt theValue) {
		myCreated = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>created</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * When the document was created
     * </p> 
	 */
	public DocumentReference setCreated( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myCreated = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>created</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * When the document was created
     * </p> 
	 */
	public DocumentReference setCreatedWithSecondsPrecision( Date theDate) {
		myCreated = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>indexed</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the document reference was created
     * </p> 
	 */
	public InstantDt getIndexedElement() {  
		if (myIndexed == null) {
			myIndexed = new InstantDt();
		}
		return myIndexed;
	}

	
	/**
	 * Gets the value(s) for <b>indexed</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the document reference was created
     * </p> 
	 */
	public Date getIndexed() {  
		return getIndexedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>indexed</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * When the document reference was created
     * </p> 
	 */
	public DocumentReference setIndexed(InstantDt theValue) {
		myIndexed = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>indexed</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * When the document reference was created
     * </p> 
	 */
	public DocumentReference setIndexedWithMillisPrecision( Date theDate) {
		myIndexed = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>indexed</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * When the document reference was created
     * </p> 
	 */
	public DocumentReference setIndexed( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myIndexed = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of this document reference
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
     * The status of this document reference
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
     * The status of this document reference
     * </p> 
	 */
	public DocumentReference setStatus(BoundCodeDt<DocumentReferenceStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of this document reference
     * </p> 
	 */
	public DocumentReference setStatus(DocumentReferenceStatusEnum theValue) {
		setStatus(new BoundCodeDt<DocumentReferenceStatusEnum>(DocumentReferenceStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>docStatus</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the underlying document
     * </p> 
	 */
	public CodeableConceptDt getDocStatus() {  
		if (myDocStatus == null) {
			myDocStatus = new CodeableConceptDt();
		}
		return myDocStatus;
	}

	/**
	 * Sets the value(s) for <b>docStatus</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the underlying document
     * </p> 
	 */
	public DocumentReference setDocStatus(CodeableConceptDt theValue) {
		myDocStatus = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>relatesTo</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Relationships that this document has with other document references that already exist
     * </p> 
	 */
	public java.util.List<RelatesTo> getRelatesTo() {  
		if (myRelatesTo == null) {
			myRelatesTo = new java.util.ArrayList<RelatesTo>();
		}
		return myRelatesTo;
	}

	/**
	 * Sets the value(s) for <b>relatesTo</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Relationships that this document has with other document references that already exist
     * </p> 
	 */
	public DocumentReference setRelatesTo(java.util.List<RelatesTo> theValue) {
		myRelatesTo = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>relatesTo</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Relationships that this document has with other document references that already exist
     * </p> 
	 */
	public RelatesTo addRelatesTo() {
		RelatesTo newType = new RelatesTo();
		getRelatesTo().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>relatesTo</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Relationships that this document has with other document references that already exist
	 * </p>
	 * @param theValue The relatesTo to add (must not be <code>null</code>)
	 */
	public DocumentReference addRelatesTo(RelatesTo theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRelatesTo().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>relatesTo</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Relationships that this document has with other document references that already exist
     * </p> 
	 */
	public RelatesTo getRelatesToFirstRep() {
		if (getRelatesTo().isEmpty()) {
			return addRelatesTo();
		}
		return getRelatesTo().get(0); 
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
	public DocumentReference setDescription(StringDt theValue) {
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
	public DocumentReference setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>securityLabel</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \&quot;reference\&quot; to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getSecurityLabel() {  
		if (mySecurityLabel == null) {
			mySecurityLabel = new java.util.ArrayList<CodeableConceptDt>();
		}
		return mySecurityLabel;
	}

	/**
	 * Sets the value(s) for <b>securityLabel</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \&quot;reference\&quot; to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to
     * </p> 
	 */
	public DocumentReference setSecurityLabel(java.util.List<CodeableConceptDt> theValue) {
		mySecurityLabel = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>securityLabel</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \&quot;reference\&quot; to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to
     * </p> 
	 */
	public CodeableConceptDt addSecurityLabel() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getSecurityLabel().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>securityLabel</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \&quot;reference\&quot; to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to
	 * </p>
	 * @param theValue The securityLabel to add (must not be <code>null</code>)
	 */
	public DocumentReference addSecurityLabel(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSecurityLabel().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>securityLabel</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \&quot;reference\&quot; to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to
     * </p> 
	 */
	public CodeableConceptDt getSecurityLabelFirstRep() {
		if (getSecurityLabel().isEmpty()) {
			return addSecurityLabel();
		}
		return getSecurityLabel().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>content</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
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
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
     * </p> 
	 */
	public DocumentReference setContent(java.util.List<Content> theValue) {
		myContent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
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
	 * The document and format referenced. There may be multiple content element repetitions, each with a different format.
	 * </p>
	 * @param theValue The content to add (must not be <code>null</code>)
	 */
	public DocumentReference addContent(Content theValue) {
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
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
     * </p> 
	 */
	public Content getContentFirstRep() {
		if (getContent().isEmpty()) {
			return addContent();
		}
		return getContent().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>context</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical context in which the document was prepared
     * </p> 
	 */
	public Context getContext() {  
		if (myContext == null) {
			myContext = new Context();
		}
		return myContext;
	}

	/**
	 * Sets the value(s) for <b>context</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical context in which the document was prepared
     * </p> 
	 */
	public DocumentReference setContext(Context theValue) {
		myContext = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>DocumentReference.relatesTo</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Relationships that this document has with other document references that already exist
     * </p> 
	 */
	@Block()	
	public static class RelatesTo 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of relationship that this document has with anther document"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/document-relationship-type")
	private BoundCodeDt<DocumentRelationshipTypeEnum> myCode;
	
	@Child(name="target", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.DocumentReference.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The target document of this relationship"
	)
	private ResourceReferenceDt myTarget;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myTarget);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myTarget);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of relationship that this document has with anther document
     * </p> 
	 */
	public BoundCodeDt<DocumentRelationshipTypeEnum> getCodeElement() {  
		if (myCode == null) {
			myCode = new BoundCodeDt<DocumentRelationshipTypeEnum>(DocumentRelationshipTypeEnum.VALUESET_BINDER);
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
     * The type of relationship that this document has with anther document
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
     * The type of relationship that this document has with anther document
     * </p> 
	 */
	public RelatesTo setCode(BoundCodeDt<DocumentRelationshipTypeEnum> theValue) {
		myCode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of relationship that this document has with anther document
     * </p> 
	 */
	public RelatesTo setCode(DocumentRelationshipTypeEnum theValue) {
		setCode(new BoundCodeDt<DocumentRelationshipTypeEnum>(DocumentRelationshipTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getCodeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>target</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The target document of this relationship
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
     * The target document of this relationship
     * </p> 
	 */
	public RelatesTo setTarget(ResourceReferenceDt theValue) {
		myTarget = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>DocumentReference.content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
     * </p> 
	 */
	@Block()	
	public static class Content 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="attachment", type=AttachmentDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The document or url of the document along with critical metadata to prove content has integrity."
	)
	private AttachmentDt myAttachment;
	
	@Child(name="format", type=CodingDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-formatcodes")
	private java.util.List<CodingDt> myFormat;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myAttachment,  myFormat);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myAttachment, myFormat);
	}

	/**
	 * Gets the value(s) for <b>attachment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The document or url of the document along with critical metadata to prove content has integrity.
     * </p> 
	 */
	public AttachmentDt getAttachment() {  
		if (myAttachment == null) {
			myAttachment = new AttachmentDt();
		}
		return myAttachment;
	}

	/**
	 * Sets the value(s) for <b>attachment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The document or url of the document along with critical metadata to prove content has integrity.
     * </p> 
	 */
	public Content setAttachment(AttachmentDt theValue) {
		myAttachment = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>format</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType
     * </p> 
	 */
	public java.util.List<CodingDt> getFormat() {  
		if (myFormat == null) {
			myFormat = new java.util.ArrayList<CodingDt>();
		}
		return myFormat;
	}

	/**
	 * Sets the value(s) for <b>format</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType
     * </p> 
	 */
	public Content setFormat(java.util.List<CodingDt> theValue) {
		myFormat = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>format</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType
     * </p> 
	 */
	public CodingDt addFormat() {
		CodingDt newType = new CodingDt();
		getFormat().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>format</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType
	 * </p>
	 * @param theValue The format to add (must not be <code>null</code>)
	 */
	public Content addFormat(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFormat().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>format</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType
     * </p> 
	 */
	public CodingDt getFormatFirstRep() {
		if (getFormat().isEmpty()) {
			return addFormat();
		}
		return getFormat().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>DocumentReference.context</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical context in which the document was prepared
     * </p> 
	 */
	@Block()	
	public static class Context 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="encounter", order=0, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="Describes the clinical encounter or type of care that the document content is associated with"
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="event", type=CodeableConceptDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act"
	)
	private java.util.List<CodeableConceptDt> myEvent;
	
	@Child(name="period", type=PeriodDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The time period over which the service that is described by the document was provided"
	)
	private PeriodDt myPeriod;
	
	@Child(name="facilityType", type=CodeableConceptDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The kind of facility where the patient was seen"
	)
	private CodeableConceptDt myFacilityType;
	
	@Child(name="practiceSetting", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty"
	)
	private CodeableConceptDt myPracticeSetting;
	
	@Child(name="sourcePatientInfo", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The Patient Information as known when the document was published. May be a reference to a version specific, or contained"
	)
	private ResourceReferenceDt mySourcePatientInfo;
	
	@Child(name="related", order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Related identifiers or resources associated with the DocumentReference."
	)
	private java.util.List<ContextRelated> myRelated;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myEncounter,  myEvent,  myPeriod,  myFacilityType,  myPracticeSetting,  mySourcePatientInfo,  myRelated);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myEncounter, myEvent, myPeriod, myFacilityType, myPracticeSetting, mySourcePatientInfo, myRelated);
	}

	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the clinical encounter or type of care that the document content is associated with
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
     * Describes the clinical encounter or type of care that the document content is associated with
     * </p> 
	 */
	public Context setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>event</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getEvent() {  
		if (myEvent == null) {
			myEvent = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myEvent;
	}

	/**
	 * Sets the value(s) for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act
     * </p> 
	 */
	public Context setEvent(java.util.List<CodeableConceptDt> theValue) {
		myEvent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act
     * </p> 
	 */
	public CodeableConceptDt addEvent() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getEvent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>event</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act
	 * </p>
	 * @param theValue The event to add (must not be <code>null</code>)
	 */
	public Context addEvent(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getEvent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>event</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act
     * </p> 
	 */
	public CodeableConceptDt getEventFirstRep() {
		if (getEvent().isEmpty()) {
			return addEvent();
		}
		return getEvent().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time period over which the service that is described by the document was provided
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
     * The time period over which the service that is described by the document was provided
     * </p> 
	 */
	public Context setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>facilityType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of facility where the patient was seen
     * </p> 
	 */
	public CodeableConceptDt getFacilityType() {  
		if (myFacilityType == null) {
			myFacilityType = new CodeableConceptDt();
		}
		return myFacilityType;
	}

	/**
	 * Sets the value(s) for <b>facilityType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of facility where the patient was seen
     * </p> 
	 */
	public Context setFacilityType(CodeableConceptDt theValue) {
		myFacilityType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>practiceSetting</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty
     * </p> 
	 */
	public CodeableConceptDt getPracticeSetting() {  
		if (myPracticeSetting == null) {
			myPracticeSetting = new CodeableConceptDt();
		}
		return myPracticeSetting;
	}

	/**
	 * Sets the value(s) for <b>practiceSetting</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty
     * </p> 
	 */
	public Context setPracticeSetting(CodeableConceptDt theValue) {
		myPracticeSetting = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>sourcePatientInfo</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Patient Information as known when the document was published. May be a reference to a version specific, or contained
     * </p> 
	 */
	public ResourceReferenceDt getSourcePatientInfo() {  
		if (mySourcePatientInfo == null) {
			mySourcePatientInfo = new ResourceReferenceDt();
		}
		return mySourcePatientInfo;
	}

	/**
	 * Sets the value(s) for <b>sourcePatientInfo</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Patient Information as known when the document was published. May be a reference to a version specific, or contained
     * </p> 
	 */
	public Context setSourcePatientInfo(ResourceReferenceDt theValue) {
		mySourcePatientInfo = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>related</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifiers or resources associated with the DocumentReference.
     * </p> 
	 */
	public java.util.List<ContextRelated> getRelated() {  
		if (myRelated == null) {
			myRelated = new java.util.ArrayList<ContextRelated>();
		}
		return myRelated;
	}

	/**
	 * Sets the value(s) for <b>related</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifiers or resources associated with the DocumentReference.
     * </p> 
	 */
	public Context setRelated(java.util.List<ContextRelated> theValue) {
		myRelated = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>related</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifiers or resources associated with the DocumentReference.
     * </p> 
	 */
	public ContextRelated addRelated() {
		ContextRelated newType = new ContextRelated();
		getRelated().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>related</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Related identifiers or resources associated with the DocumentReference.
	 * </p>
	 * @param theValue The related to add (must not be <code>null</code>)
	 */
	public Context addRelated(ContextRelated theValue) {
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
     * Related identifiers or resources associated with the DocumentReference.
     * </p> 
	 */
	public ContextRelated getRelatedFirstRep() {
		if (getRelated().isEmpty()) {
			return addRelated();
		}
		return getRelated().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>DocumentReference.context.related</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Related identifiers or resources associated with the DocumentReference.
     * </p> 
	 */
	@Block()	
	public static class ContextRelated 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="ref", order=1, min=0, max=1, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing."
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
     * Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.
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
     * Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.
     * </p> 
	 */
	public ContextRelated setIdentifier(IdentifierDt theValue) {
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
     * Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.
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
     * Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.
     * </p> 
	 */
	public ContextRelated setRef(ResourceReferenceDt theValue) {
		myRef = theValue;
		return this;
	}
	
	

  


	}





    @Override
    public String getResourceName() {
        return "DocumentReference";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
