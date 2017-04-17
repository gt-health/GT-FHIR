















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
 * HAPI/FHIR <b>Media</b> Resource
 * (infrastructure.structure)
 *
 * <p>
 * <b>Definition:</b>
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Media">http://hl7.org/fhir/profiles/Media</a> 
 * </p>
 *
 */
@ResourceDef(name="Media", profile="http://hl7.org/fhir/profiles/Media", id="media")
public class Media extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Media.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="Media.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Media.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>subtype</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Media.subtype</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subtype", path="Media.subtype", description="", type="token"  )
	public static final String SP_SUBTYPE = "subtype";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subtype</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Media.subtype</b><br>
	 * </p>
	 */
	public static final TokenClientParam SUBTYPE = new TokenClientParam(SP_SUBTYPE);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Media.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Media.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Media.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>created</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Media.content.creation</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="created", path="Media.content.creation", description="", type="date"  )
	public static final String SP_CREATED = "created";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>created</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Media.content.creation</b><br>
	 * </p>
	 */
	public static final DateClientParam CREATED = new DateClientParam(SP_CREATED);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Media.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="Media.subject", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Media.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>operator</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Media.operator</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="operator", path="Media.operator", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_OPERATOR = "operator";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>operator</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Media.operator</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam OPERATOR = new ReferenceClientParam(SP_OPERATOR);

	/**
	 * Search parameter constant for <b>view</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Media.view</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="view", path="Media.view", description="", type="token"  )
	public static final String SP_VIEW = "view";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>view</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Media.view</b><br>
	 * </p>
	 */
	public static final TokenClientParam VIEW = new TokenClientParam(SP_VIEW);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Media.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Media.subject", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Media.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Media:operator</b>".
	 */
	public static final Include INCLUDE_OPERATOR = new Include("Media:operator");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Media:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Media:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Media:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("Media:subject");


	@Child(name="type", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Whether the media is a photo (still image), an audio recording, or a video recording"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/digital-media-type")
	private BoundCodeDt<DigitalMediaTypeEnum> myType;
	
	@Child(name="subtype", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality"
	)
	private CodeableConceptDt mySubtype;
	
	@Child(name="identifier", type=IdentifierDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="subject", order=3, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Specimen.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="Who/What this Media is a record of"
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="operator", order=4, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The person who administered the collection of the image"
	)
	private ResourceReferenceDt myOperator;
	
	@Child(name="view", type=CodeableConceptDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="The name of the imaging view e.g. Lateral or Antero-posterior (AP)."
	)
	private CodeableConceptDt myView;
	
	@Child(name="deviceName", type=StringDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of the device / manufacturer of the device  that was used to make the recording"
	)
	private StringDt myDeviceName;
	
	@Child(name="height", type=PositiveIntDt.class, order=7, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Height of the image in pixels (photo/video)"
	)
	private PositiveIntDt myHeight;
	
	@Child(name="width", type=PositiveIntDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Width of the image in pixels (photo/video)"
	)
	private PositiveIntDt myWidth;
	
	@Child(name="frames", type=PositiveIntDt.class, order=9, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required"
	)
	private PositiveIntDt myFrames;
	
	@Child(name="duration", type=UnsignedIntDt.class, order=10, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The duration of the recording in seconds - for audio and video"
	)
	private UnsignedIntDt myDuration;
	
	@Child(name="content", type=AttachmentDt.class, order=11, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The actual content of the media - inline or by direct reference to the media source file"
	)
	private AttachmentDt myContent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  mySubtype,  myIdentifier,  mySubject,  myOperator,  myView,  myDeviceName,  myHeight,  myWidth,  myFrames,  myDuration,  myContent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, mySubtype, myIdentifier, mySubject, myOperator, myView, myDeviceName, myHeight, myWidth, myFrames, myDuration, myContent);
	}

	/**
	 * Gets the value(s) for <b>type</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether the media is a photo (still image), an audio recording, or a video recording
     * </p> 
	 */
	public BoundCodeDt<DigitalMediaTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<DigitalMediaTypeEnum>(DigitalMediaTypeEnum.VALUESET_BINDER);
		}
		return myType;
	}

	
	/**
	 * Gets the value(s) for <b>type</b> (class).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether the media is a photo (still image), an audio recording, or a video recording
     * </p> 
	 */
	public String getType() {  
		return getTypeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether the media is a photo (still image), an audio recording, or a video recording
     * </p> 
	 */
	public Media setType(BoundCodeDt<DigitalMediaTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether the media is a photo (still image), an audio recording, or a video recording
     * </p> 
	 */
	public Media setType(DigitalMediaTypeEnum theValue) {
		setType(new BoundCodeDt<DigitalMediaTypeEnum>(DigitalMediaTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>subtype</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality
     * </p> 
	 */
	public CodeableConceptDt getSubtype() {  
		if (mySubtype == null) {
			mySubtype = new CodeableConceptDt();
		}
		return mySubtype;
	}

	/**
	 * Sets the value(s) for <b>subtype</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality
     * </p> 
	 */
	public Media setSubtype(CodeableConceptDt theValue) {
		mySubtype = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers
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
     * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers
     * </p> 
	 */
	public Media setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers
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
	 * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Media addIdentifier(IdentifierDt theValue) {
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
     * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers
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
     * Who/What this Media is a record of
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
     * Who/What this Media is a record of
     * </p> 
	 */
	public Media setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>operator</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person who administered the collection of the image
     * </p> 
	 */
	public ResourceReferenceDt getOperator() {  
		if (myOperator == null) {
			myOperator = new ResourceReferenceDt();
		}
		return myOperator;
	}

	/**
	 * Sets the value(s) for <b>operator</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The person who administered the collection of the image
     * </p> 
	 */
	public Media setOperator(ResourceReferenceDt theValue) {
		myOperator = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>view</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the imaging view e.g. Lateral or Antero-posterior (AP).
     * </p> 
	 */
	public CodeableConceptDt getView() {  
		if (myView == null) {
			myView = new CodeableConceptDt();
		}
		return myView;
	}

	/**
	 * Sets the value(s) for <b>view</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the imaging view e.g. Lateral or Antero-posterior (AP).
     * </p> 
	 */
	public Media setView(CodeableConceptDt theValue) {
		myView = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>deviceName</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the device / manufacturer of the device  that was used to make the recording
     * </p> 
	 */
	public StringDt getDeviceNameElement() {  
		if (myDeviceName == null) {
			myDeviceName = new StringDt();
		}
		return myDeviceName;
	}

	
	/**
	 * Gets the value(s) for <b>deviceName</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the device / manufacturer of the device  that was used to make the recording
     * </p> 
	 */
	public String getDeviceName() {  
		return getDeviceNameElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>deviceName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the device / manufacturer of the device  that was used to make the recording
     * </p> 
	 */
	public Media setDeviceName(StringDt theValue) {
		myDeviceName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>deviceName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the device / manufacturer of the device  that was used to make the recording
     * </p> 
	 */
	public Media setDeviceName( String theString) {
		myDeviceName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>height</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Height of the image in pixels (photo/video)
     * </p> 
	 */
	public PositiveIntDt getHeightElement() {  
		if (myHeight == null) {
			myHeight = new PositiveIntDt();
		}
		return myHeight;
	}

	
	/**
	 * Gets the value(s) for <b>height</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Height of the image in pixels (photo/video)
     * </p> 
	 */
	public Integer getHeight() {  
		return getHeightElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>height</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Height of the image in pixels (photo/video)
     * </p> 
	 */
	public Media setHeight(PositiveIntDt theValue) {
		myHeight = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>height</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Height of the image in pixels (photo/video)
     * </p> 
	 */
	public Media setHeight( int theInteger) {
		myHeight = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>width</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Width of the image in pixels (photo/video)
     * </p> 
	 */
	public PositiveIntDt getWidthElement() {  
		if (myWidth == null) {
			myWidth = new PositiveIntDt();
		}
		return myWidth;
	}

	
	/**
	 * Gets the value(s) for <b>width</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Width of the image in pixels (photo/video)
     * </p> 
	 */
	public Integer getWidth() {  
		return getWidthElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>width</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Width of the image in pixels (photo/video)
     * </p> 
	 */
	public Media setWidth(PositiveIntDt theValue) {
		myWidth = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>width</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Width of the image in pixels (photo/video)
     * </p> 
	 */
	public Media setWidth( int theInteger) {
		myWidth = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>frames</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required
     * </p> 
	 */
	public PositiveIntDt getFramesElement() {  
		if (myFrames == null) {
			myFrames = new PositiveIntDt();
		}
		return myFrames;
	}

	
	/**
	 * Gets the value(s) for <b>frames</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required
     * </p> 
	 */
	public Integer getFrames() {  
		return getFramesElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>frames</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required
     * </p> 
	 */
	public Media setFrames(PositiveIntDt theValue) {
		myFrames = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>frames</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required
     * </p> 
	 */
	public Media setFrames( int theInteger) {
		myFrames = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>duration</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The duration of the recording in seconds - for audio and video
     * </p> 
	 */
	public UnsignedIntDt getDurationElement() {  
		if (myDuration == null) {
			myDuration = new UnsignedIntDt();
		}
		return myDuration;
	}

	
	/**
	 * Gets the value(s) for <b>duration</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The duration of the recording in seconds - for audio and video
     * </p> 
	 */
	public Integer getDuration() {  
		return getDurationElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>duration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The duration of the recording in seconds - for audio and video
     * </p> 
	 */
	public Media setDuration(UnsignedIntDt theValue) {
		myDuration = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>duration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The duration of the recording in seconds - for audio and video
     * </p> 
	 */
	public Media setDuration( int theInteger) {
		myDuration = new UnsignedIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>content</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual content of the media - inline or by direct reference to the media source file
     * </p> 
	 */
	public AttachmentDt getContent() {  
		if (myContent == null) {
			myContent = new AttachmentDt();
		}
		return myContent;
	}

	/**
	 * Sets the value(s) for <b>content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual content of the media - inline or by direct reference to the media source file
     * </p> 
	 */
	public Media setContent(AttachmentDt theValue) {
		myContent = theValue;
		return this;
	}
	
	

  


    @Override
    public String getResourceName() {
        return "Media";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
