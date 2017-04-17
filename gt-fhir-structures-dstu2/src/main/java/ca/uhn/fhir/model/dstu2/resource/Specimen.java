















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
 * HAPI/FHIR <b>Specimen</b> Resource
 * (clinical.diagnostics)
 *
 * <p>
 * <b>Definition:</b>
 * A sample to be used for analysis.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Specimen">http://hl7.org/fhir/profiles/Specimen</a> 
 * </p>
 *
 */
@ResourceDef(name="Specimen", profile="http://hl7.org/fhir/profiles/Specimen", id="specimen")
public class Specimen extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The subject of the specimen</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Specimen.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="Specimen.subject", description="The subject of the specimen", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The subject of the specimen</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Specimen.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The patient the specimen comes from</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Specimen.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Specimen.subject", description="The patient the specimen comes from", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The patient the specimen comes from</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Specimen.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The unique identifier associated with the specimen</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Specimen.identifier", description="The unique identifier associated with the specimen", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The unique identifier associated with the specimen</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The specimen type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="Specimen.type", description="The specimen type", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The specimen type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>parent</b>
	 * <p>
	 * Description: <b>The parent of the specimen</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Specimen.parent</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="parent", path="Specimen.parent", description="The parent of the specimen", type="reference"  )
	public static final String SP_PARENT = "parent";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>parent</b>
	 * <p>
	 * Description: <b>The parent of the specimen</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Specimen.parent</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PARENT = new ReferenceClientParam(SP_PARENT);

	/**
	 * Search parameter constant for <b>accession</b>
	 * <p>
	 * Description: <b>The accession number associated with the specimen</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.accessionIdentifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="accession", path="Specimen.accessionIdentifier", description="The accession number associated with the specimen", type="token"  )
	public static final String SP_ACCESSION = "accession";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>accession</b>
	 * <p>
	 * Description: <b>The accession number associated with the specimen</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.accessionIdentifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam ACCESSION = new TokenClientParam(SP_ACCESSION);

	/**
	 * Search parameter constant for <b>collected</b>
	 * <p>
	 * Description: <b>The date the specimen was collected</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Specimen.collection.collected[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="collected", path="Specimen.collection.collected[x]", description="The date the specimen was collected", type="date"  )
	public static final String SP_COLLECTED = "collected";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>collected</b>
	 * <p>
	 * Description: <b>The date the specimen was collected</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Specimen.collection.collected[x]</b><br>
	 * </p>
	 */
	public static final DateClientParam COLLECTED = new DateClientParam(SP_COLLECTED);

	/**
	 * Search parameter constant for <b>collector</b>
	 * <p>
	 * Description: <b>Who collected the specimen</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Specimen.collection.collector</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="collector", path="Specimen.collection.collector", description="Who collected the specimen", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_COLLECTOR = "collector";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>collector</b>
	 * <p>
	 * Description: <b>Who collected the specimen</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Specimen.collection.collector</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam COLLECTOR = new ReferenceClientParam(SP_COLLECTOR);

	/**
	 * Search parameter constant for <b>bodysite</b>
	 * <p>
	 * Description: <b>The code for the body site from where the specimen originated</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.collection.bodySite</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="bodysite", path="Specimen.collection.bodySite", description="The code for the body site from where the specimen originated", type="token"  )
	public static final String SP_BODYSITE = "bodysite";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>bodysite</b>
	 * <p>
	 * Description: <b>The code for the body site from where the specimen originated</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.collection.bodySite</b><br>
	 * </p>
	 */
	public static final TokenClientParam BODYSITE = new TokenClientParam(SP_BODYSITE);

	/**
	 * Search parameter constant for <b>container-id</b>
	 * <p>
	 * Description: <b>The unique identifier associated with the specimen container</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.container.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="container-id", path="Specimen.container.identifier", description="The unique identifier associated with the specimen container", type="token"  )
	public static final String SP_CONTAINER_ID = "container-id";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>container-id</b>
	 * <p>
	 * Description: <b>The unique identifier associated with the specimen container</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.container.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam CONTAINER_ID = new TokenClientParam(SP_CONTAINER_ID);

	/**
	 * Search parameter constant for <b>container</b>
	 * <p>
	 * Description: <b>The kind of specimen container</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.container.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="container", path="Specimen.container.type", description="The kind of specimen container", type="token"  )
	public static final String SP_CONTAINER = "container";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>container</b>
	 * <p>
	 * Description: <b>The kind of specimen container</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Specimen.container.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam CONTAINER = new TokenClientParam(SP_CONTAINER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Specimen:collector</b>".
	 */
	public static final Include INCLUDE_COLLECTOR = new Include("Specimen:collector");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Specimen:parent</b>".
	 */
	public static final Include INCLUDE_PARENT = new Include("Specimen:parent");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Specimen:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Specimen:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Specimen:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("Specimen:subject");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Id for specimen"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="status", type=CodeDt.class, order=1, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The availability of the specimen"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/specimen-status")
	private BoundCodeDt<SpecimenStatusEnum> myStatus;
	
	@Child(name="type", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="The kind of material that forms the specimen"
	)
	private CodeableConceptDt myType;
	
	@Child(name="parent", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Specimen.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen."
	)
	private java.util.List<ResourceReferenceDt> myParent;
	
	@Child(name="subject", order=4, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Substance.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition=""
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="accessionIdentifier", type=IdentifierDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures."
	)
	private IdentifierDt myAccessionIdentifier;
	
	@Child(name="receivedTime", type=DateTimeDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.done",
		formalDefinition="Time when specimen was received for processing or testing"
	)
	private DateTimeDt myReceivedTime;
	
	@Child(name="collection", order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Details concerning the specimen collection"
	)
	private Collection myCollection;
	
	@Child(name="treatment", order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Details concerning treatment and processing steps for the specimen"
	)
	private java.util.List<Treatment> myTreatment;
	
	@Child(name="container", order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here."
	)
	private java.util.List<Container> myContainer;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myStatus,  myType,  myParent,  mySubject,  myAccessionIdentifier,  myReceivedTime,  myCollection,  myTreatment,  myContainer);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myStatus, myType, myParent, mySubject, myAccessionIdentifier, myReceivedTime, myCollection, myTreatment, myContainer);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Id for specimen
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
     * Id for specimen
     * </p> 
	 */
	public Specimen setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Id for specimen
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
	 * Id for specimen
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Specimen addIdentifier(IdentifierDt theValue) {
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
     * Id for specimen
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The availability of the specimen
     * </p> 
	 */
	public BoundCodeDt<SpecimenStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<SpecimenStatusEnum>(SpecimenStatusEnum.VALUESET_BINDER);
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
     * The availability of the specimen
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
     * The availability of the specimen
     * </p> 
	 */
	public Specimen setStatus(BoundCodeDt<SpecimenStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The availability of the specimen
     * </p> 
	 */
	public Specimen setStatus(SpecimenStatusEnum theValue) {
		setStatus(new BoundCodeDt<SpecimenStatusEnum>(SpecimenStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>type</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of material that forms the specimen
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
     * The kind of material that forms the specimen
     * </p> 
	 */
	public Specimen setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>parent</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getParent() {  
		if (myParent == null) {
			myParent = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myParent;
	}

	/**
	 * Sets the value(s) for <b>parent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
     * </p> 
	 */
	public Specimen setParent(java.util.List<ResourceReferenceDt> theValue) {
		myParent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>parent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
     * </p> 
	 */
	public ResourceReferenceDt addParent() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getParent().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>subject</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
     * 
     * </p> 
	 */
	public Specimen setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>accessionIdentifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
     * </p> 
	 */
	public IdentifierDt getAccessionIdentifier() {  
		if (myAccessionIdentifier == null) {
			myAccessionIdentifier = new IdentifierDt();
		}
		return myAccessionIdentifier;
	}

	/**
	 * Sets the value(s) for <b>accessionIdentifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
     * </p> 
	 */
	public Specimen setAccessionIdentifier(IdentifierDt theValue) {
		myAccessionIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>receivedTime</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was received for processing or testing
     * </p> 
	 */
	public DateTimeDt getReceivedTimeElement() {  
		if (myReceivedTime == null) {
			myReceivedTime = new DateTimeDt();
		}
		return myReceivedTime;
	}

	
	/**
	 * Gets the value(s) for <b>receivedTime</b> (when.done).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was received for processing or testing
     * </p> 
	 */
	public Date getReceivedTime() {  
		return getReceivedTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>receivedTime</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was received for processing or testing
     * </p> 
	 */
	public Specimen setReceivedTime(DateTimeDt theValue) {
		myReceivedTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>receivedTime</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was received for processing or testing
     * </p> 
	 */
	public Specimen setReceivedTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myReceivedTime = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>receivedTime</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was received for processing or testing
     * </p> 
	 */
	public Specimen setReceivedTimeWithSecondsPrecision( Date theDate) {
		myReceivedTime = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>collection</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning the specimen collection
     * </p> 
	 */
	public Collection getCollection() {  
		if (myCollection == null) {
			myCollection = new Collection();
		}
		return myCollection;
	}

	/**
	 * Sets the value(s) for <b>collection</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning the specimen collection
     * </p> 
	 */
	public Specimen setCollection(Collection theValue) {
		myCollection = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>treatment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning treatment and processing steps for the specimen
     * </p> 
	 */
	public java.util.List<Treatment> getTreatment() {  
		if (myTreatment == null) {
			myTreatment = new java.util.ArrayList<Treatment>();
		}
		return myTreatment;
	}

	/**
	 * Sets the value(s) for <b>treatment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning treatment and processing steps for the specimen
     * </p> 
	 */
	public Specimen setTreatment(java.util.List<Treatment> theValue) {
		myTreatment = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>treatment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning treatment and processing steps for the specimen
     * </p> 
	 */
	public Treatment addTreatment() {
		Treatment newType = new Treatment();
		getTreatment().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>treatment</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Details concerning treatment and processing steps for the specimen
	 * </p>
	 * @param theValue The treatment to add (must not be <code>null</code>)
	 */
	public Specimen addTreatment(Treatment theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTreatment().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>treatment</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning treatment and processing steps for the specimen
     * </p> 
	 */
	public Treatment getTreatmentFirstRep() {
		if (getTreatment().isEmpty()) {
			return addTreatment();
		}
		return getTreatment().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>container</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * </p> 
	 */
	public java.util.List<Container> getContainer() {  
		if (myContainer == null) {
			myContainer = new java.util.ArrayList<Container>();
		}
		return myContainer;
	}

	/**
	 * Sets the value(s) for <b>container</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * </p> 
	 */
	public Specimen setContainer(java.util.List<Container> theValue) {
		myContainer = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>container</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * </p> 
	 */
	public Container addContainer() {
		Container newType = new Container();
		getContainer().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>container</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
	 * </p>
	 * @param theValue The container to add (must not be <code>null</code>)
	 */
	public Specimen addContainer(Container theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getContainer().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>container</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * </p> 
	 */
	public Container getContainerFirstRep() {
		if (getContainer().isEmpty()) {
			return addContainer();
		}
		return getContainer().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Specimen.collection</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning the specimen collection
     * </p> 
	 */
	@Block()	
	public static class Collection 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="collector", order=0, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Person who collected the specimen"
	)
	private ResourceReferenceDt myCollector;
	
	@Child(name="comment", type=StringDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="To communicate any details or issues encountered during the specimen collection procedure."
	)
	private java.util.List<StringDt> myComment;
	
	@Child(name="collected", order=2, min=0, max=1, summary=true, modifier=false, type={
		DateTimeDt.class, 		PeriodDt.class	})
	@Description(
		shortDefinition="when.init",
		formalDefinition="Time when specimen was collected from subject - the physiologically relevant time"
	)
	private IDatatype myCollected;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample."
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="method", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A coded value specifying the technique that is used to perform the procedure"
	)
	private CodeableConceptDt myMethod;
	
	@Child(name="bodySite", type=CodeableConceptDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens."
	)
	private CodeableConceptDt myBodySite;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCollector,  myComment,  myCollected,  myQuantity,  myMethod,  myBodySite);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCollector, myComment, myCollected, myQuantity, myMethod, myBodySite);
	}

	/**
	 * Gets the value(s) for <b>collector</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Person who collected the specimen
     * </p> 
	 */
	public ResourceReferenceDt getCollector() {  
		if (myCollector == null) {
			myCollector = new ResourceReferenceDt();
		}
		return myCollector;
	}

	/**
	 * Sets the value(s) for <b>collector</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Person who collected the specimen
     * </p> 
	 */
	public Collection setCollector(ResourceReferenceDt theValue) {
		myCollector = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>comment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * To communicate any details or issues encountered during the specimen collection procedure.
     * </p> 
	 */
	public java.util.List<StringDt> getComment() {  
		if (myComment == null) {
			myComment = new java.util.ArrayList<StringDt>();
		}
		return myComment;
	}

	/**
	 * Sets the value(s) for <b>comment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * To communicate any details or issues encountered during the specimen collection procedure.
     * </p> 
	 */
	public Collection setComment(java.util.List<StringDt> theValue) {
		myComment = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>comment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * To communicate any details or issues encountered during the specimen collection procedure.
     * </p> 
	 */
	public StringDt addComment() {
		StringDt newType = new StringDt();
		getComment().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>comment</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * To communicate any details or issues encountered during the specimen collection procedure.
	 * </p>
	 * @param theValue The comment to add (must not be <code>null</code>)
	 */
	public Collection addComment(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getComment().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>comment</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * To communicate any details or issues encountered during the specimen collection procedure.
     * </p> 
	 */
	public StringDt getCommentFirstRep() {
		if (getComment().isEmpty()) {
			return addComment();
		}
		return getComment().get(0); 
	}
 	/**
	 * Adds a new value for <b>comment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * To communicate any details or issues encountered during the specimen collection procedure.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Collection addComment( String theString) {
		if (myComment == null) {
			myComment = new java.util.ArrayList<StringDt>();
		}
		myComment.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>collected[x]</b> (when.init).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was collected from subject - the physiologically relevant time
     * </p> 
	 */
	public IDatatype getCollected() {  
		return myCollected;
	}

	/**
	 * Sets the value(s) for <b>collected[x]</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Time when specimen was collected from subject - the physiologically relevant time
     * </p> 
	 */
	public Collection setCollected(IDatatype theValue) {
		myCollected = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.
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
     * The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.
     * </p> 
	 */
	public Collection setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>method</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the technique that is used to perform the procedure
     * </p> 
	 */
	public CodeableConceptDt getMethod() {  
		if (myMethod == null) {
			myMethod = new CodeableConceptDt();
		}
		return myMethod;
	}

	/**
	 * Sets the value(s) for <b>method</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the technique that is used to perform the procedure
     * </p> 
	 */
	public Collection setMethod(CodeableConceptDt theValue) {
		myMethod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>bodySite</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.
     * </p> 
	 */
	public CodeableConceptDt getBodySite() {  
		if (myBodySite == null) {
			myBodySite = new CodeableConceptDt();
		}
		return myBodySite;
	}

	/**
	 * Sets the value(s) for <b>bodySite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.
     * </p> 
	 */
	public Collection setBodySite(CodeableConceptDt theValue) {
		myBodySite = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Specimen.treatment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning treatment and processing steps for the specimen
     * </p> 
	 */
	@Block()	
	public static class Treatment 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="description", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private StringDt myDescription;
	
	@Child(name="procedure", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A coded value specifying the procedure used to process the specimen"
	)
	private CodeableConceptDt myProcedure;
	
	@Child(name="additive", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Substance.class	})
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<ResourceReferenceDt> myAdditive;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myDescription,  myProcedure,  myAdditive);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myDescription, myProcedure, myAdditive);
	}

	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
     * 
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
     * 
     * </p> 
	 */
	public Treatment setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Treatment setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>procedure</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the procedure used to process the specimen
     * </p> 
	 */
	public CodeableConceptDt getProcedure() {  
		if (myProcedure == null) {
			myProcedure = new CodeableConceptDt();
		}
		return myProcedure;
	}

	/**
	 * Sets the value(s) for <b>procedure</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value specifying the procedure used to process the specimen
     * </p> 
	 */
	public Treatment setProcedure(CodeableConceptDt theValue) {
		myProcedure = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>additive</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAdditive() {  
		if (myAdditive == null) {
			myAdditive = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAdditive;
	}

	/**
	 * Sets the value(s) for <b>additive</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Treatment setAdditive(java.util.List<ResourceReferenceDt> theValue) {
		myAdditive = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>additive</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt addAdditive() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAdditive().add(newType);
		return newType; 
	}
  


	}


	/**
	 * Block class for child element: <b>Specimen.container</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     * </p> 
	 */
	@Block()	
	public static class Container 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="description", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private StringDt myDescription;
	
	@Child(name="type", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of container associated with the specimen (e.g. slide, aliquot, etc.)"
	)
	private CodeableConceptDt myType;
	
	@Child(name="capacity", type=SimpleQuantityDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The capacity (volume or other measure) the container may contain."
	)
	private SimpleQuantityDt myCapacity;
	
	@Child(name="specimenQuantity", type=SimpleQuantityDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type."
	)
	private SimpleQuantityDt mySpecimenQuantity;
	
	@Child(name="additive", order=5, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Substance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA"
	)
	private IDatatype myAdditive;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myDescription,  myType,  myCapacity,  mySpecimenQuantity,  myAdditive);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myDescription, myType, myCapacity, mySpecimenQuantity, myAdditive);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
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
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
     * </p> 
	 */
	public Container setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
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
	 * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Container addIdentifier(IdentifierDt theValue) {
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
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
     * 
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
     * 
     * </p> 
	 */
	public Container setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Container setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of container associated with the specimen (e.g. slide, aliquot, etc.)
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
     * The type of container associated with the specimen (e.g. slide, aliquot, etc.)
     * </p> 
	 */
	public Container setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>capacity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The capacity (volume or other measure) the container may contain.
     * </p> 
	 */
	public SimpleQuantityDt getCapacity() {  
		if (myCapacity == null) {
			myCapacity = new SimpleQuantityDt();
		}
		return myCapacity;
	}

	/**
	 * Sets the value(s) for <b>capacity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The capacity (volume or other measure) the container may contain.
     * </p> 
	 */
	public Container setCapacity(SimpleQuantityDt theValue) {
		myCapacity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>specimenQuantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
     * </p> 
	 */
	public SimpleQuantityDt getSpecimenQuantity() {  
		if (mySpecimenQuantity == null) {
			mySpecimenQuantity = new SimpleQuantityDt();
		}
		return mySpecimenQuantity;
	}

	/**
	 * Sets the value(s) for <b>specimenQuantity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
     * </p> 
	 */
	public Container setSpecimenQuantity(SimpleQuantityDt theValue) {
		mySpecimenQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>additive[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA
     * </p> 
	 */
	public IDatatype getAdditive() {  
		return myAdditive;
	}

	/**
	 * Sets the value(s) for <b>additive[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA
     * </p> 
	 */
	public Container setAdditive(IDatatype theValue) {
		myAdditive = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Specimen";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
