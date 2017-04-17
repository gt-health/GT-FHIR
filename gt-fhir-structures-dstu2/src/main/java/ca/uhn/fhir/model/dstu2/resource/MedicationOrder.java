















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
 * HAPI/FHIR <b>MedicationOrder</b> Resource
 * (clinical.medication)
 *
 * <p>
 * <b>Definition:</b>
 * An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationOrder\" rather than \"MedicationPrescription\" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/MedicationOrder">http://hl7.org/fhir/profiles/MedicationOrder</a> 
 * </p>
 *
 */
@ResourceDef(name="MedicationOrder", profile="http://hl7.org/fhir/profiles/MedicationOrder", id="medicationorder")
public class MedicationOrder extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>datewritten</b>
	 * <p>
	 * Description: <b>Return prescriptions written on this date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MedicationOrder.dateWritten</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="datewritten", path="MedicationOrder.dateWritten", description="Return prescriptions written on this date", type="date"  )
	public static final String SP_DATEWRITTEN = "datewritten";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>datewritten</b>
	 * <p>
	 * Description: <b>Return prescriptions written on this date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MedicationOrder.dateWritten</b><br>
	 * </p>
	 */
	public static final DateClientParam DATEWRITTEN = new DateClientParam(SP_DATEWRITTEN);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Return prescriptions with this encounter identifier</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationOrder.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="MedicationOrder.encounter", description="Return prescriptions with this encounter identifier", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Return prescriptions with this encounter identifier</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationOrder.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return prescriptions with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationOrder.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="MedicationOrder.identifier", description="Return prescriptions with this external identifier", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return prescriptions with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationOrder.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>medication</b>
	 * <p>
	 * Description: <b>Return administrations of this medication reference</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationOrder.medicationReference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="medication", path="MedicationOrder.medicationReference", description="Return administrations of this medication reference", type="reference"  )
	public static final String SP_MEDICATION = "medication";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>medication</b>
	 * <p>
	 * Description: <b>Return administrations of this medication reference</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationOrder.medicationReference</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam MEDICATION = new ReferenceClientParam(SP_MEDICATION);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>Return administrations of this medication code</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationOrder.medicationCodeableConcept</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="MedicationOrder.medicationCodeableConcept", description="Return administrations of this medication code", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>Return administrations of this medication code</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationOrder.medicationCodeableConcept</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a patient to list orders  for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationOrder.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="MedicationOrder.patient", description="The identity of a patient to list orders  for", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a patient to list orders  for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationOrder.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Status of the prescription</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationOrder.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="MedicationOrder.status", description="Status of the prescription", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Status of the prescription</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationOrder.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>prescriber</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationOrder.prescriber</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="prescriber", path="MedicationOrder.prescriber", description="", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_PRESCRIBER = "prescriber";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>prescriber</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationOrder.prescriber</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PRESCRIBER = new ReferenceClientParam(SP_PRESCRIBER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationOrder:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("MedicationOrder:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationOrder:medication</b>".
	 */
	public static final Include INCLUDE_MEDICATION = new Include("MedicationOrder:medication");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationOrder:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("MedicationOrder:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationOrder:prescriber</b>".
	 */
	public static final Include INCLUDE_PRESCRIBER = new Include("MedicationOrder:prescriber");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="dateWritten", type=DateTimeDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date (and perhaps time) when the prescription was written"
	)
	private DateTimeDt myDateWritten;
	
	@Child(name="status", type=CodeDt.class, order=2, min=0, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="A code specifying the state of the order.  Generally this will be active or completed state"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-order-status")
	private BoundCodeDt<MedicationOrderStatusEnum> myStatus;
	
	@Child(name="dateEnded", type=DateTimeDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date (and perhaps time) when the prescription was stopped"
	)
	private DateTimeDt myDateEnded;
	
	@Child(name="reasonEnded", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The reason why the prescription was stopped, if it was"
	)
	private CodeableConceptDt myReasonEnded;
	
	@Child(name="patient", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="A link to a resource representing the person to whom the medication will be given."
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="prescriber", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The healthcare professional responsible for authorizing the prescription"
	)
	private ResourceReferenceDt myPrescriber;
	
	@Child(name="encounter", order=7, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="A link to a resource that identifies the particular occurrence of contact between patient and health care provider."
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="reason", order=8, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Condition.class	})
	@Description(
		shortDefinition="why",
		formalDefinition="Can be the reason or the indication for writing the prescription."
	)
	private IDatatype myReason;
	
	@Child(name="note", type=StringDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Extra information about the prescription that could not be conveyed by the other attributes."
	)
	private StringDt myNote;
	
	@Child(name="medication", order=10, min=1, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Medication.class	})
	@Description(
		shortDefinition="what",
		formalDefinition="Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
	)
	private IDatatype myMedication;
	
	@Child(name="dosageInstruction", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates how the medication is to be used by the patient"
	)
	private java.util.List<DosageInstruction> myDosageInstruction;
	
	@Child(name="dispenseRequest", order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the specific details for the dispense or medication supply part of a medication order (also known as a Medication Prescription).  Note that this information is NOT always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department."
	)
	private DispenseRequest myDispenseRequest;
	
	@Child(name="substitution", order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done."
	)
	private Substitution mySubstitution;
	
	@Child(name="priorPrescription", order=14, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.MedicationOrder.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A link to a resource representing an earlier order or prescription that this order supersedes"
	)
	private ResourceReferenceDt myPriorPrescription;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myDateWritten,  myStatus,  myDateEnded,  myReasonEnded,  myPatient,  myPrescriber,  myEncounter,  myReason,  myNote,  myMedication,  myDosageInstruction,  myDispenseRequest,  mySubstitution,  myPriorPrescription);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myDateWritten, myStatus, myDateEnded, myReasonEnded, myPatient, myPrescriber, myEncounter, myReason, myNote, myMedication, myDosageInstruction, myDispenseRequest, mySubstitution, myPriorPrescription);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.
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
     * External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.
     * </p> 
	 */
	public MedicationOrder setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.
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
	 * External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public MedicationOrder addIdentifier(IdentifierDt theValue) {
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
     * External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>dateWritten</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public DateTimeDt getDateWrittenElement() {  
		if (myDateWritten == null) {
			myDateWritten = new DateTimeDt();
		}
		return myDateWritten;
	}

	
	/**
	 * Gets the value(s) for <b>dateWritten</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public Date getDateWritten() {  
		return getDateWrittenElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dateWritten</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public MedicationOrder setDateWritten(DateTimeDt theValue) {
		myDateWritten = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dateWritten</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public MedicationOrder setDateWritten( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDateWritten = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>dateWritten</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public MedicationOrder setDateWrittenWithSecondsPrecision( Date theDate) {
		myDateWritten = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the state of the order.  Generally this will be active or completed state
     * </p> 
	 */
	public BoundCodeDt<MedicationOrderStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<MedicationOrderStatusEnum>(MedicationOrderStatusEnum.VALUESET_BINDER);
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
     * A code specifying the state of the order.  Generally this will be active or completed state
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
     * A code specifying the state of the order.  Generally this will be active or completed state
     * </p> 
	 */
	public MedicationOrder setStatus(BoundCodeDt<MedicationOrderStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the state of the order.  Generally this will be active or completed state
     * </p> 
	 */
	public MedicationOrder setStatus(MedicationOrderStatusEnum theValue) {
		setStatus(new BoundCodeDt<MedicationOrderStatusEnum>(MedicationOrderStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>dateEnded</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was stopped
     * </p> 
	 */
	public DateTimeDt getDateEndedElement() {  
		if (myDateEnded == null) {
			myDateEnded = new DateTimeDt();
		}
		return myDateEnded;
	}

	
	/**
	 * Gets the value(s) for <b>dateEnded</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was stopped
     * </p> 
	 */
	public Date getDateEnded() {  
		return getDateEndedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dateEnded</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was stopped
     * </p> 
	 */
	public MedicationOrder setDateEnded(DateTimeDt theValue) {
		myDateEnded = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dateEnded</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was stopped
     * </p> 
	 */
	public MedicationOrder setDateEnded( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDateEnded = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>dateEnded</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was stopped
     * </p> 
	 */
	public MedicationOrder setDateEndedWithSecondsPrecision( Date theDate) {
		myDateEnded = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>reasonEnded</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reason why the prescription was stopped, if it was
     * </p> 
	 */
	public CodeableConceptDt getReasonEnded() {  
		if (myReasonEnded == null) {
			myReasonEnded = new CodeableConceptDt();
		}
		return myReasonEnded;
	}

	/**
	 * Sets the value(s) for <b>reasonEnded</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reason why the prescription was stopped, if it was
     * </p> 
	 */
	public MedicationOrder setReasonEnded(CodeableConceptDt theValue) {
		myReasonEnded = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a resource representing the person to whom the medication will be given.
     * </p> 
	 */
	public ResourceReferenceDt getPatient() {  
		if (myPatient == null) {
			myPatient = new ResourceReferenceDt();
		}
		return myPatient;
	}

	/**
	 * Sets the value(s) for <b>patient</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a resource representing the person to whom the medication will be given.
     * </p> 
	 */
	public MedicationOrder setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>prescriber</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare professional responsible for authorizing the prescription
     * </p> 
	 */
	public ResourceReferenceDt getPrescriber() {  
		if (myPrescriber == null) {
			myPrescriber = new ResourceReferenceDt();
		}
		return myPrescriber;
	}

	/**
	 * Sets the value(s) for <b>prescriber</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare professional responsible for authorizing the prescription
     * </p> 
	 */
	public MedicationOrder setPrescriber(ResourceReferenceDt theValue) {
		myPrescriber = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
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
     * A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
     * </p> 
	 */
	public MedicationOrder setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reason[x]</b> (why).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Can be the reason or the indication for writing the prescription.
     * </p> 
	 */
	public IDatatype getReason() {  
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason[x]</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * Can be the reason or the indication for writing the prescription.
     * </p> 
	 */
	public MedicationOrder setReason(IDatatype theValue) {
		myReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the prescription that could not be conveyed by the other attributes.
     * </p> 
	 */
	public StringDt getNoteElement() {  
		if (myNote == null) {
			myNote = new StringDt();
		}
		return myNote;
	}

	
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the prescription that could not be conveyed by the other attributes.
     * </p> 
	 */
	public String getNote() {  
		return getNoteElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the prescription that could not be conveyed by the other attributes.
     * </p> 
	 */
	public MedicationOrder setNote(StringDt theValue) {
		myNote = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the prescription that could not be conveyed by the other attributes.
     * </p> 
	 */
	public MedicationOrder setNote( String theString) {
		myNote = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>medication[x]</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
     * </p> 
	 */
	public IDatatype getMedication() {  
		return myMedication;
	}

	/**
	 * Sets the value(s) for <b>medication[x]</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
     * </p> 
	 */
	public MedicationOrder setMedication(IDatatype theValue) {
		myMedication = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dosageInstruction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is to be used by the patient
     * </p> 
	 */
	public java.util.List<DosageInstruction> getDosageInstruction() {  
		if (myDosageInstruction == null) {
			myDosageInstruction = new java.util.ArrayList<DosageInstruction>();
		}
		return myDosageInstruction;
	}

	/**
	 * Sets the value(s) for <b>dosageInstruction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is to be used by the patient
     * </p> 
	 */
	public MedicationOrder setDosageInstruction(java.util.List<DosageInstruction> theValue) {
		myDosageInstruction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>dosageInstruction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is to be used by the patient
     * </p> 
	 */
	public DosageInstruction addDosageInstruction() {
		DosageInstruction newType = new DosageInstruction();
		getDosageInstruction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>dosageInstruction</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Indicates how the medication is to be used by the patient
	 * </p>
	 * @param theValue The dosageInstruction to add (must not be <code>null</code>)
	 */
	public MedicationOrder addDosageInstruction(DosageInstruction theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDosageInstruction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>dosageInstruction</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is to be used by the patient
     * </p> 
	 */
	public DosageInstruction getDosageInstructionFirstRep() {
		if (getDosageInstruction().isEmpty()) {
			return addDosageInstruction();
		}
		return getDosageInstruction().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>dispenseRequest</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the specific details for the dispense or medication supply part of a medication order (also known as a Medication Prescription).  Note that this information is NOT always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
     * </p> 
	 */
	public DispenseRequest getDispenseRequest() {  
		if (myDispenseRequest == null) {
			myDispenseRequest = new DispenseRequest();
		}
		return myDispenseRequest;
	}

	/**
	 * Sets the value(s) for <b>dispenseRequest</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the specific details for the dispense or medication supply part of a medication order (also known as a Medication Prescription).  Note that this information is NOT always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
     * </p> 
	 */
	public MedicationOrder setDispenseRequest(DispenseRequest theValue) {
		myDispenseRequest = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>substitution</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.
     * </p> 
	 */
	public Substitution getSubstitution() {  
		if (mySubstitution == null) {
			mySubstitution = new Substitution();
		}
		return mySubstitution;
	}

	/**
	 * Sets the value(s) for <b>substitution</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.
     * </p> 
	 */
	public MedicationOrder setSubstitution(Substitution theValue) {
		mySubstitution = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>priorPrescription</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a resource representing an earlier order or prescription that this order supersedes
     * </p> 
	 */
	public ResourceReferenceDt getPriorPrescription() {  
		if (myPriorPrescription == null) {
			myPriorPrescription = new ResourceReferenceDt();
		}
		return myPriorPrescription;
	}

	/**
	 * Sets the value(s) for <b>priorPrescription</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a resource representing an earlier order or prescription that this order supersedes
     * </p> 
	 */
	public MedicationOrder setPriorPrescription(ResourceReferenceDt theValue) {
		myPriorPrescription = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>MedicationOrder.dosageInstruction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is to be used by the patient
     * </p> 
	 */
	@Block()	
	public static class DosageInstruction 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="text", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Free text dosage instructions can be used for cases where the instructions are too complex to code.  The content of this attribute does not include the name or description of the medication. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication. It is expected that the text instructions will always be populated.  If the dosage.timing attribute is also populated, then the dosage.text should reflect the same information as the timing."
	)
	private StringDt myText;
	
	@Child(name="additionalInstructions", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional instructions such as \"Swallow with plenty of water\" which may or may not be coded."
	)
	private CodeableConceptDt myAdditionalInstructions;
	
	@Child(name="timing", type=TimingDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The timing schedule for giving the medication to the patient. The Schedule data type allows many different expressions. For example: \"Every 8 hours\"; \"Three times a day\"; \"1/2 an hour before breakfast for 10 days from 23-Dec 2011:\"; \"15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\"."
	)
	private TimingDt myTiming;
	
	@Child(name="asNeeded", order=3, min=0, max=1, summary=false, modifier=false, type={
		BooleanDt.class, 		CodeableConceptDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept)."
	)
	private IDatatype myAsNeeded;
	
	@Child(name="site", order=4, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		BodySite.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A coded specification of the anatomic site where the medication first enters the body"
	)
	private IDatatype mySite;
	
	@Child(name="route", type=CodeableConceptDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code specifying the route or physiological path of administration of a therapeutic agent into or onto a patient's body."
	)
	private CodeableConceptDt myRoute;
	
	@Child(name="method", type=CodeableConceptDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A coded value indicating the method by which the medication is introduced into or onto the body. Most commonly used for injections.  For examples, Slow Push; Deep IV."
	)
	private CodeableConceptDt myMethod;
	
	@Child(name="dose", order=7, min=0, max=1, summary=false, modifier=false, type={
		RangeDt.class, 		SimpleQuantityDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The amount of therapeutic or other substance given at one administration event."
	)
	private IDatatype myDose;
	
	@Child(name="rate", order=8, min=0, max=1, summary=false, modifier=false, type={
		RatioDt.class, 		RangeDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours"
	)
	private IDatatype myRate;
	
	@Child(name="maxDosePerPeriod", type=RatioDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time.  For example, 1000mg in 24 hours."
	)
	private RatioDt myMaxDosePerPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myText,  myAdditionalInstructions,  myTiming,  myAsNeeded,  mySite,  myRoute,  myMethod,  myDose,  myRate,  myMaxDosePerPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myText, myAdditionalInstructions, myTiming, myAsNeeded, mySite, myRoute, myMethod, myDose, myRate, myMaxDosePerPeriod);
	}

	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Free text dosage instructions can be used for cases where the instructions are too complex to code.  The content of this attribute does not include the name or description of the medication. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication. It is expected that the text instructions will always be populated.  If the dosage.timing attribute is also populated, then the dosage.text should reflect the same information as the timing.
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
     * Free text dosage instructions can be used for cases where the instructions are too complex to code.  The content of this attribute does not include the name or description of the medication. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication. It is expected that the text instructions will always be populated.  If the dosage.timing attribute is also populated, then the dosage.text should reflect the same information as the timing.
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
     * Free text dosage instructions can be used for cases where the instructions are too complex to code.  The content of this attribute does not include the name or description of the medication. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication. It is expected that the text instructions will always be populated.  If the dosage.timing attribute is also populated, then the dosage.text should reflect the same information as the timing.
     * </p> 
	 */
	public DosageInstruction setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Free text dosage instructions can be used for cases where the instructions are too complex to code.  The content of this attribute does not include the name or description of the medication. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication. It is expected that the text instructions will always be populated.  If the dosage.timing attribute is also populated, then the dosage.text should reflect the same information as the timing.
     * </p> 
	 */
	public DosageInstruction setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>additionalInstructions</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional instructions such as \&quot;Swallow with plenty of water\&quot; which may or may not be coded.
     * </p> 
	 */
	public CodeableConceptDt getAdditionalInstructions() {  
		if (myAdditionalInstructions == null) {
			myAdditionalInstructions = new CodeableConceptDt();
		}
		return myAdditionalInstructions;
	}

	/**
	 * Sets the value(s) for <b>additionalInstructions</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional instructions such as \&quot;Swallow with plenty of water\&quot; which may or may not be coded.
     * </p> 
	 */
	public DosageInstruction setAdditionalInstructions(CodeableConceptDt theValue) {
		myAdditionalInstructions = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>timing</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The timing schedule for giving the medication to the patient. The Schedule data type allows many different expressions. For example: \&quot;Every 8 hours\&quot;; \&quot;Three times a day\&quot;; \&quot;1/2 an hour before breakfast for 10 days from 23-Dec 2011:\&quot;; \&quot;15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\&quot;.
     * </p> 
	 */
	public TimingDt getTiming() {  
		if (myTiming == null) {
			myTiming = new TimingDt();
		}
		return myTiming;
	}

	/**
	 * Sets the value(s) for <b>timing</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The timing schedule for giving the medication to the patient. The Schedule data type allows many different expressions. For example: \&quot;Every 8 hours\&quot;; \&quot;Three times a day\&quot;; \&quot;1/2 an hour before breakfast for 10 days from 23-Dec 2011:\&quot;; \&quot;15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\&quot;.
     * </p> 
	 */
	public DosageInstruction setTiming(TimingDt theValue) {
		myTiming = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>asNeeded[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     * </p> 
	 */
	public IDatatype getAsNeeded() {  
		return myAsNeeded;
	}

	/**
	 * Sets the value(s) for <b>asNeeded[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     * </p> 
	 */
	public DosageInstruction setAsNeeded(IDatatype theValue) {
		myAsNeeded = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>site[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded specification of the anatomic site where the medication first enters the body
     * </p> 
	 */
	public IDatatype getSite() {  
		return mySite;
	}

	/**
	 * Sets the value(s) for <b>site[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A coded specification of the anatomic site where the medication first enters the body
     * </p> 
	 */
	public DosageInstruction setSite(IDatatype theValue) {
		mySite = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>route</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a patient's body.
     * </p> 
	 */
	public CodeableConceptDt getRoute() {  
		if (myRoute == null) {
			myRoute = new CodeableConceptDt();
		}
		return myRoute;
	}

	/**
	 * Sets the value(s) for <b>route</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a patient's body.
     * </p> 
	 */
	public DosageInstruction setRoute(CodeableConceptDt theValue) {
		myRoute = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>method</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value indicating the method by which the medication is introduced into or onto the body. Most commonly used for injections.  For examples, Slow Push; Deep IV.
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
     * A coded value indicating the method by which the medication is introduced into or onto the body. Most commonly used for injections.  For examples, Slow Push; Deep IV.
     * </p> 
	 */
	public DosageInstruction setMethod(CodeableConceptDt theValue) {
		myMethod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dose[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of therapeutic or other substance given at one administration event.
     * </p> 
	 */
	public IDatatype getDose() {  
		return myDose;
	}

	/**
	 * Sets the value(s) for <b>dose[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of therapeutic or other substance given at one administration event.
     * </p> 
	 */
	public DosageInstruction setDose(IDatatype theValue) {
		myDose = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>rate[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours
     * </p> 
	 */
	public IDatatype getRate() {  
		return myRate;
	}

	/**
	 * Sets the value(s) for <b>rate[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours
     * </p> 
	 */
	public DosageInstruction setRate(IDatatype theValue) {
		myRate = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>maxDosePerPeriod</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time.  For example, 1000mg in 24 hours.
     * </p> 
	 */
	public RatioDt getMaxDosePerPeriod() {  
		if (myMaxDosePerPeriod == null) {
			myMaxDosePerPeriod = new RatioDt();
		}
		return myMaxDosePerPeriod;
	}

	/**
	 * Sets the value(s) for <b>maxDosePerPeriod</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time.  For example, 1000mg in 24 hours.
     * </p> 
	 */
	public DosageInstruction setMaxDosePerPeriod(RatioDt theValue) {
		myMaxDosePerPeriod = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>MedicationOrder.dispenseRequest</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the specific details for the dispense or medication supply part of a medication order (also known as a Medication Prescription).  Note that this information is NOT always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
     * </p> 
	 */
	@Block()	
	public static class DispenseRequest 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="medication", order=0, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Medication.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
	)
	private IDatatype myMedication;
	
	@Child(name="validityPeriod", type=PeriodDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This indicates the validity period of a prescription (stale dating the Prescription)"
	)
	private PeriodDt myValidityPeriod;
	
	@Child(name="numberOfRepeatsAllowed", type=PositiveIntDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  \"3 repeats\", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets."
	)
	private PositiveIntDt myNumberOfRepeatsAllowed;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The amount that is to be dispensed for one fill."
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="expectedSupplyDuration", type=DurationDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last."
	)
	private DurationDt myExpectedSupplyDuration;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myMedication,  myValidityPeriod,  myNumberOfRepeatsAllowed,  myQuantity,  myExpectedSupplyDuration);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myMedication, myValidityPeriod, myNumberOfRepeatsAllowed, myQuantity, myExpectedSupplyDuration);
	}

	/**
	 * Gets the value(s) for <b>medication[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
     * </p> 
	 */
	public IDatatype getMedication() {  
		return myMedication;
	}

	/**
	 * Sets the value(s) for <b>medication[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
     * </p> 
	 */
	public DispenseRequest setMedication(IDatatype theValue) {
		myMedication = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>validityPeriod</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This indicates the validity period of a prescription (stale dating the Prescription)
     * </p> 
	 */
	public PeriodDt getValidityPeriod() {  
		if (myValidityPeriod == null) {
			myValidityPeriod = new PeriodDt();
		}
		return myValidityPeriod;
	}

	/**
	 * Sets the value(s) for <b>validityPeriod</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This indicates the validity period of a prescription (stale dating the Prescription)
     * </p> 
	 */
	public DispenseRequest setValidityPeriod(PeriodDt theValue) {
		myValidityPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>numberOfRepeatsAllowed</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  \&quot;3 repeats\&quot;, then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
     * </p> 
	 */
	public PositiveIntDt getNumberOfRepeatsAllowedElement() {  
		if (myNumberOfRepeatsAllowed == null) {
			myNumberOfRepeatsAllowed = new PositiveIntDt();
		}
		return myNumberOfRepeatsAllowed;
	}

	
	/**
	 * Gets the value(s) for <b>numberOfRepeatsAllowed</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  \&quot;3 repeats\&quot;, then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
     * </p> 
	 */
	public Integer getNumberOfRepeatsAllowed() {  
		return getNumberOfRepeatsAllowedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>numberOfRepeatsAllowed</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  \&quot;3 repeats\&quot;, then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
     * </p> 
	 */
	public DispenseRequest setNumberOfRepeatsAllowed(PositiveIntDt theValue) {
		myNumberOfRepeatsAllowed = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>numberOfRepeatsAllowed</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  \&quot;3 repeats\&quot;, then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
     * </p> 
	 */
	public DispenseRequest setNumberOfRepeatsAllowed( int theInteger) {
		myNumberOfRepeatsAllowed = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount that is to be dispensed for one fill.
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
     * The amount that is to be dispensed for one fill.
     * </p> 
	 */
	public DispenseRequest setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>expectedSupplyDuration</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.
     * </p> 
	 */
	public DurationDt getExpectedSupplyDuration() {  
		if (myExpectedSupplyDuration == null) {
			myExpectedSupplyDuration = new DurationDt();
		}
		return myExpectedSupplyDuration;
	}

	/**
	 * Sets the value(s) for <b>expectedSupplyDuration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.
     * </p> 
	 */
	public DispenseRequest setExpectedSupplyDuration(DurationDt theValue) {
		myExpectedSupplyDuration = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>MedicationOrder.substitution</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.
     * </p> 
	 */
	@Block()	
	public static class Substitution 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code signifying whether a different drug should be dispensed from what was prescribed."
	)
	private CodeableConceptDt myType;
	
	@Child(name="reason", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the reason for the substitution, or why substitution must or must not be performed."
	)
	private CodeableConceptDt myReason;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myReason);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myReason);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code signifying whether a different drug should be dispensed from what was prescribed.
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
     * A code signifying whether a different drug should be dispensed from what was prescribed.
     * </p> 
	 */
	public Substitution setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the reason for the substitution, or why substitution must or must not be performed.
     * </p> 
	 */
	public CodeableConceptDt getReason() {  
		if (myReason == null) {
			myReason = new CodeableConceptDt();
		}
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the reason for the substitution, or why substitution must or must not be performed.
     * </p> 
	 */
	public Substitution setReason(CodeableConceptDt theValue) {
		myReason = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "MedicationOrder";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
