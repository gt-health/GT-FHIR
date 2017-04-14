















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
 * HAPI/FHIR <b>MedicationDispense</b> Resource
 * (clinical.medication)
 *
 * <p>
 * <b>Definition:</b>
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/MedicationDispense">http://hl7.org/fhir/profiles/MedicationDispense</a> 
 * </p>
 *
 */
@ResourceDef(name="MedicationDispense", profile="http://hl7.org/fhir/profiles/MedicationDispense", id="medicationdispense")
public class MedicationDispense extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>destination</b>
	 * <p>
	 * Description: <b>Return dispenses that should be sent to a specific destination</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.destination</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="destination", path="MedicationDispense.destination", description="Return dispenses that should be sent to a specific destination", type="reference"  )
	public static final String SP_DESTINATION = "destination";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>destination</b>
	 * <p>
	 * Description: <b>Return dispenses that should be sent to a specific destination</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.destination</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam DESTINATION = new ReferenceClientParam(SP_DESTINATION);

	/**
	 * Search parameter constant for <b>dispenser</b>
	 * <p>
	 * Description: <b>Return all dispenses performed by a specific individual</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.dispenser</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="dispenser", path="MedicationDispense.dispenser", description="Return all dispenses performed by a specific individual", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_DISPENSER = "dispenser";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>dispenser</b>
	 * <p>
	 * Description: <b>Return all dispenses performed by a specific individual</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.dispenser</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam DISPENSER = new ReferenceClientParam(SP_DISPENSER);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return dispenses with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationDispense.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="MedicationDispense.identifier", description="Return dispenses with this external identifier", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return dispenses with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationDispense.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>medication</b>
	 * <p>
	 * Description: <b>Return dispenses of this medicine resource</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.medicationReference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="medication", path="MedicationDispense.medicationReference", description="Return dispenses of this medicine resource", type="reference"  )
	public static final String SP_MEDICATION = "medication";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>medication</b>
	 * <p>
	 * Description: <b>Return dispenses of this medicine resource</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.medicationReference</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam MEDICATION = new ReferenceClientParam(SP_MEDICATION);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>Return dispenses of this medicine code</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationDispense.medicationCodeableConcept</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="MedicationDispense.medicationCodeableConcept", description="Return dispenses of this medicine code", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>Return dispenses of this medicine code</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationDispense.medicationCodeableConcept</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a patient to list dispenses  for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="MedicationDispense.patient", description="The identity of a patient to list dispenses  for", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a patient to list dispenses  for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>prescription</b>
	 * <p>
	 * Description: <b>The identity of a prescription to list dispenses from</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.authorizingPrescription</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="prescription", path="MedicationDispense.authorizingPrescription", description="The identity of a prescription to list dispenses from", type="reference"  )
	public static final String SP_PRESCRIPTION = "prescription";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>prescription</b>
	 * <p>
	 * Description: <b>The identity of a prescription to list dispenses from</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.authorizingPrescription</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PRESCRIPTION = new ReferenceClientParam(SP_PRESCRIPTION);

	/**
	 * Search parameter constant for <b>responsibleparty</b>
	 * <p>
	 * Description: <b>Return all dispenses with the specified responsible party</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.substitution.responsibleParty</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="responsibleparty", path="MedicationDispense.substitution.responsibleParty", description="Return all dispenses with the specified responsible party", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_RESPONSIBLEPARTY = "responsibleparty";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>responsibleparty</b>
	 * <p>
	 * Description: <b>Return all dispenses with the specified responsible party</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.substitution.responsibleParty</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RESPONSIBLEPARTY = new ReferenceClientParam(SP_RESPONSIBLEPARTY);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Status of the dispense</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationDispense.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="MedicationDispense.status", description="Status of the dispense", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Status of the dispense</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationDispense.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>Return all dispenses of a specific type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationDispense.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="MedicationDispense.type", description="Return all dispenses of a specific type", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>Return all dispenses of a specific type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationDispense.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>whenhandedover</b>
	 * <p>
	 * Description: <b>Date when medication handed over to patient (outpatient setting), or supplied to ward or clinic (inpatient setting)</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MedicationDispense.whenHandedOver</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="whenhandedover", path="MedicationDispense.whenHandedOver", description="Date when medication handed over to patient (outpatient setting), or supplied to ward or clinic (inpatient setting)", type="date"  )
	public static final String SP_WHENHANDEDOVER = "whenhandedover";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>whenhandedover</b>
	 * <p>
	 * Description: <b>Date when medication handed over to patient (outpatient setting), or supplied to ward or clinic (inpatient setting)</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MedicationDispense.whenHandedOver</b><br>
	 * </p>
	 */
	public static final DateClientParam WHENHANDEDOVER = new DateClientParam(SP_WHENHANDEDOVER);

	/**
	 * Search parameter constant for <b>whenprepared</b>
	 * <p>
	 * Description: <b>Date when medication prepared</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MedicationDispense.whenPrepared</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="whenprepared", path="MedicationDispense.whenPrepared", description="Date when medication prepared", type="date"  )
	public static final String SP_WHENPREPARED = "whenprepared";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>whenprepared</b>
	 * <p>
	 * Description: <b>Date when medication prepared</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MedicationDispense.whenPrepared</b><br>
	 * </p>
	 */
	public static final DateClientParam WHENPREPARED = new DateClientParam(SP_WHENPREPARED);

	/**
	 * Search parameter constant for <b>receiver</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.receiver</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="receiver", path="MedicationDispense.receiver", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_RECEIVER = "receiver";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>receiver</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationDispense.receiver</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RECEIVER = new ReferenceClientParam(SP_RECEIVER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationDispense:destination</b>".
	 */
	public static final Include INCLUDE_DESTINATION = new Include("MedicationDispense:destination");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationDispense:dispenser</b>".
	 */
	public static final Include INCLUDE_DISPENSER = new Include("MedicationDispense:dispenser");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationDispense:medication</b>".
	 */
	public static final Include INCLUDE_MEDICATION = new Include("MedicationDispense:medication");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationDispense:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("MedicationDispense:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationDispense:prescription</b>".
	 */
	public static final Include INCLUDE_PRESCRIPTION = new Include("MedicationDispense:prescription");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationDispense:receiver</b>".
	 */
	public static final Include INCLUDE_RECEIVER = new Include("MedicationDispense:receiver");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationDispense:responsibleparty</b>".
	 */
	public static final Include INCLUDE_RESPONSIBLEPARTY = new Include("MedicationDispense:responsibleparty");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="status", type=CodeDt.class, order=1, min=0, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="A code specifying the state of the set of dispense events."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-dispense-status")
	private BoundCodeDt<MedicationDispenseStatusEnum> myStatus;
	
	@Child(name="patient", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="A link to a resource representing the person to whom the medication will be given."
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="dispenser", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The individual responsible for dispensing the medication"
	)
	private ResourceReferenceDt myDispenser;
	
	@Child(name="authorizingPrescription", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.MedicationOrder.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the medication order that is being dispensed against."
	)
	private java.util.List<ResourceReferenceDt> myAuthorizingPrescription;
	
	@Child(name="type", type=CodeableConceptDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc."
	)
	private CodeableConceptDt myType;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The amount of medication that has been dispensed. Includes unit of measure."
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="daysSupply", type=SimpleQuantityDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The amount of medication expressed as a timing amount."
	)
	private SimpleQuantityDt myDaysSupply;
	
	@Child(name="medication", order=8, min=1, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Medication.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
	)
	private IDatatype myMedication;
	
	@Child(name="whenPrepared", type=DateTimeDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The time when the dispensed product was packaged and reviewed."
	)
	private DateTimeDt myWhenPrepared;
	
	@Child(name="whenHandedOver", type=DateTimeDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The time the dispensed product was provided to the patient or their representative."
	)
	private DateTimeDt myWhenHandedOver;
	
	@Child(name="destination", order=11, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identification of the facility/location where the medication was shipped to, as part of the dispense event."
	)
	private ResourceReferenceDt myDestination;
	
	@Child(name="receiver", order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional"
	)
	private java.util.List<ResourceReferenceDt> myReceiver;
	
	@Child(name="note", type=StringDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Extra information about the dispense that could not be conveyed in the other attributes."
	)
	private StringDt myNote;
	
	@Child(name="dosageInstruction", order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates how the medication is to be used by the patient"
	)
	private java.util.List<DosageInstruction> myDosageInstruction;
	
	@Child(name="substitution", order=15, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why."
	)
	private Substitution mySubstitution;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myStatus,  myPatient,  myDispenser,  myAuthorizingPrescription,  myType,  myQuantity,  myDaysSupply,  myMedication,  myWhenPrepared,  myWhenHandedOver,  myDestination,  myReceiver,  myNote,  myDosageInstruction,  mySubstitution);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myStatus, myPatient, myDispenser, myAuthorizingPrescription, myType, myQuantity, myDaysSupply, myMedication, myWhenPrepared, myWhenHandedOver, myDestination, myReceiver, myNote, myDosageInstruction, mySubstitution);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.
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
     * Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.
     * </p> 
	 */
	public MedicationDispense setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the state of the set of dispense events.
     * </p> 
	 */
	public BoundCodeDt<MedicationDispenseStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<MedicationDispenseStatusEnum>(MedicationDispenseStatusEnum.VALUESET_BINDER);
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
     * A code specifying the state of the set of dispense events.
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
     * A code specifying the state of the set of dispense events.
     * </p> 
	 */
	public MedicationDispense setStatus(BoundCodeDt<MedicationDispenseStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the state of the set of dispense events.
     * </p> 
	 */
	public MedicationDispense setStatus(MedicationDispenseStatusEnum theValue) {
		setStatus(new BoundCodeDt<MedicationDispenseStatusEnum>(MedicationDispenseStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
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
	public MedicationDispense setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dispenser</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The individual responsible for dispensing the medication
     * </p> 
	 */
	public ResourceReferenceDt getDispenser() {  
		if (myDispenser == null) {
			myDispenser = new ResourceReferenceDt();
		}
		return myDispenser;
	}

	/**
	 * Sets the value(s) for <b>dispenser</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The individual responsible for dispensing the medication
     * </p> 
	 */
	public MedicationDispense setDispenser(ResourceReferenceDt theValue) {
		myDispenser = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>authorizingPrescription</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the medication order that is being dispensed against.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAuthorizingPrescription() {  
		if (myAuthorizingPrescription == null) {
			myAuthorizingPrescription = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAuthorizingPrescription;
	}

	/**
	 * Sets the value(s) for <b>authorizingPrescription</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the medication order that is being dispensed against.
     * </p> 
	 */
	public MedicationDispense setAuthorizingPrescription(java.util.List<ResourceReferenceDt> theValue) {
		myAuthorizingPrescription = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>authorizingPrescription</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the medication order that is being dispensed against.
     * </p> 
	 */
	public ResourceReferenceDt addAuthorizingPrescription() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAuthorizingPrescription().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
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
     * Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
     * </p> 
	 */
	public MedicationDispense setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of medication that has been dispensed. Includes unit of measure.
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
     * The amount of medication that has been dispensed. Includes unit of measure.
     * </p> 
	 */
	public MedicationDispense setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>daysSupply</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of medication expressed as a timing amount.
     * </p> 
	 */
	public SimpleQuantityDt getDaysSupply() {  
		if (myDaysSupply == null) {
			myDaysSupply = new SimpleQuantityDt();
		}
		return myDaysSupply;
	}

	/**
	 * Sets the value(s) for <b>daysSupply</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of medication expressed as a timing amount.
     * </p> 
	 */
	public MedicationDispense setDaysSupply(SimpleQuantityDt theValue) {
		myDaysSupply = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>medication[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
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
     * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
     * </p> 
	 */
	public MedicationDispense setMedication(IDatatype theValue) {
		myMedication = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>whenPrepared</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the dispensed product was packaged and reviewed.
     * </p> 
	 */
	public DateTimeDt getWhenPreparedElement() {  
		if (myWhenPrepared == null) {
			myWhenPrepared = new DateTimeDt();
		}
		return myWhenPrepared;
	}

	
	/**
	 * Gets the value(s) for <b>whenPrepared</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the dispensed product was packaged and reviewed.
     * </p> 
	 */
	public Date getWhenPrepared() {  
		return getWhenPreparedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>whenPrepared</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the dispensed product was packaged and reviewed.
     * </p> 
	 */
	public MedicationDispense setWhenPrepared(DateTimeDt theValue) {
		myWhenPrepared = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>whenPrepared</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the dispensed product was packaged and reviewed.
     * </p> 
	 */
	public MedicationDispense setWhenPrepared( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myWhenPrepared = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>whenPrepared</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the dispensed product was packaged and reviewed.
     * </p> 
	 */
	public MedicationDispense setWhenPreparedWithSecondsPrecision( Date theDate) {
		myWhenPrepared = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>whenHandedOver</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time the dispensed product was provided to the patient or their representative.
     * </p> 
	 */
	public DateTimeDt getWhenHandedOverElement() {  
		if (myWhenHandedOver == null) {
			myWhenHandedOver = new DateTimeDt();
		}
		return myWhenHandedOver;
	}

	
	/**
	 * Gets the value(s) for <b>whenHandedOver</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time the dispensed product was provided to the patient or their representative.
     * </p> 
	 */
	public Date getWhenHandedOver() {  
		return getWhenHandedOverElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>whenHandedOver</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time the dispensed product was provided to the patient or their representative.
     * </p> 
	 */
	public MedicationDispense setWhenHandedOver(DateTimeDt theValue) {
		myWhenHandedOver = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>whenHandedOver</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time the dispensed product was provided to the patient or their representative.
     * </p> 
	 */
	public MedicationDispense setWhenHandedOver( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myWhenHandedOver = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>whenHandedOver</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time the dispensed product was provided to the patient or their representative.
     * </p> 
	 */
	public MedicationDispense setWhenHandedOverWithSecondsPrecision( Date theDate) {
		myWhenHandedOver = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>destination</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of the facility/location where the medication was shipped to, as part of the dispense event.
     * </p> 
	 */
	public ResourceReferenceDt getDestination() {  
		if (myDestination == null) {
			myDestination = new ResourceReferenceDt();
		}
		return myDestination;
	}

	/**
	 * Sets the value(s) for <b>destination</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of the facility/location where the medication was shipped to, as part of the dispense event.
     * </p> 
	 */
	public MedicationDispense setDestination(ResourceReferenceDt theValue) {
		myDestination = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>receiver</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getReceiver() {  
		if (myReceiver == null) {
			myReceiver = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myReceiver;
	}

	/**
	 * Sets the value(s) for <b>receiver</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional
     * </p> 
	 */
	public MedicationDispense setReceiver(java.util.List<ResourceReferenceDt> theValue) {
		myReceiver = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>receiver</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional
     * </p> 
	 */
	public ResourceReferenceDt addReceiver() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getReceiver().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the dispense that could not be conveyed in the other attributes.
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
     * Extra information about the dispense that could not be conveyed in the other attributes.
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
     * Extra information about the dispense that could not be conveyed in the other attributes.
     * </p> 
	 */
	public MedicationDispense setNote(StringDt theValue) {
		myNote = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the dispense that could not be conveyed in the other attributes.
     * </p> 
	 */
	public MedicationDispense setNote( String theString) {
		myNote = new StringDt(theString); 
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
	public MedicationDispense setDosageInstruction(java.util.List<DosageInstruction> theValue) {
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
	public MedicationDispense addDosageInstruction(DosageInstruction theValue) {
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
	 * Gets the value(s) for <b>substitution</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.
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
     * Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.
     * </p> 
	 */
	public MedicationDispense setSubstitution(Substitution theValue) {
		mySubstitution = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>MedicationDispense.dosageInstruction</b> ()
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
		formalDefinition="Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication."
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
		formalDefinition="The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions.  For example, \"Every  8 hours\"; \"Three times a day\"; \"1/2 an hour before breakfast for 10 days from 23-Dec 2011:\";  \"15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\""
	)
	private TimingDt myTiming;
	
	@Child(name="asNeeded", order=3, min=0, max=1, summary=false, modifier=false, type={
		BooleanDt.class, 		CodeableConceptDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).  Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule."
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
		formalDefinition="A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject."
	)
	private CodeableConceptDt myRoute;
	
	@Child(name="method", type=CodeableConceptDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A coded value indicating the method by which the medication is intended to be or was introduced into or on the body."
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
		formalDefinition="The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time,  e.g. 1000mg in 24 hours."
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
     * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
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
     * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
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
     * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
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
     * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
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
     * The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions.  For example, \&quot;Every  8 hours\&quot;; \&quot;Three times a day\&quot;; \&quot;1/2 an hour before breakfast for 10 days from 23-Dec 2011:\&quot;;  \&quot;15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\&quot;
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
     * The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions.  For example, \&quot;Every  8 hours\&quot;; \&quot;Three times a day\&quot;; \&quot;1/2 an hour before breakfast for 10 days from 23-Dec 2011:\&quot;;  \&quot;15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\&quot;
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
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).  Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.
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
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).  Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.
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
     * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.
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
     * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.
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
     * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.
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
     * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.
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
     * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time,  e.g. 1000mg in 24 hours.
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
     * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time,  e.g. 1000mg in 24 hours.
     * </p> 
	 */
	public DosageInstruction setMaxDosePerPeriod(RatioDt theValue) {
		myMaxDosePerPeriod = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>MedicationDispense.substitution</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.
     * </p> 
	 */
	@Block()	
	public static class Substitution 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code signifying whether a different drug was dispensed from what was prescribed."
	)
	private CodeableConceptDt myType;
	
	@Child(name="reason", type=CodeableConceptDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the reason for the substitution of (or lack of substitution) from what was prescribed."
	)
	private java.util.List<CodeableConceptDt> myReason;
	
	@Child(name="responsibleParty", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The person or organization that has primary responsibility for the substitution"
	)
	private java.util.List<ResourceReferenceDt> myResponsibleParty;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myReason,  myResponsibleParty);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myReason, myResponsibleParty);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code signifying whether a different drug was dispensed from what was prescribed.
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
     * A code signifying whether a different drug was dispensed from what was prescribed.
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
     * Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getReason() {  
		if (myReason == null) {
			myReason = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
     * </p> 
	 */
	public Substitution setReason(java.util.List<CodeableConceptDt> theValue) {
		myReason = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
     * </p> 
	 */
	public CodeableConceptDt addReason() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getReason().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>reason</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
	 * </p>
	 * @param theValue The reason to add (must not be <code>null</code>)
	 */
	public Substitution addReason(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReason().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>reason</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
     * </p> 
	 */
	public CodeableConceptDt getReasonFirstRep() {
		if (getReason().isEmpty()) {
			return addReason();
		}
		return getReason().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>responsibleParty</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person or organization that has primary responsibility for the substitution
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getResponsibleParty() {  
		if (myResponsibleParty == null) {
			myResponsibleParty = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myResponsibleParty;
	}

	/**
	 * Sets the value(s) for <b>responsibleParty</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The person or organization that has primary responsibility for the substitution
     * </p> 
	 */
	public Substitution setResponsibleParty(java.util.List<ResourceReferenceDt> theValue) {
		myResponsibleParty = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>responsibleParty</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The person or organization that has primary responsibility for the substitution
     * </p> 
	 */
	public ResourceReferenceDt addResponsibleParty() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getResponsibleParty().add(newType);
		return newType; 
	}
  


	}




    @Override
    public String getResourceName() {
        return "MedicationDispense";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
