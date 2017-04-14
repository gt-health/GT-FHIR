















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
 * HAPI/FHIR <b>Immunization</b> Resource
 * (clinical.medication)
 *
 * <p>
 * <b>Definition:</b>
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Immunization">http://hl7.org/fhir/profiles/Immunization</a> 
 * </p>
 *
 */
@ResourceDef(name="Immunization", profile="http://hl7.org/fhir/profiles/Immunization", id="immunization")
public class Immunization extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>Vaccination  (non)-Administration Date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Immunization.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="Immunization.date", description="Vaccination  (non)-Administration Date", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>Vaccination  (non)-Administration Date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Immunization.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>dose-sequence</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>number</b><br>
	 * Path: <b>Immunization.vaccinationProtocol.doseSequence</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="dose-sequence", path="Immunization.vaccinationProtocol.doseSequence", description="", type="number"  )
	public static final String SP_DOSE_SEQUENCE = "dose-sequence";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>dose-sequence</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>number</b><br>
	 * Path: <b>Immunization.vaccinationProtocol.doseSequence</b><br>
	 * </p>
	 */
	public static final NumberClientParam DOSE_SEQUENCE = new NumberClientParam(SP_DOSE_SEQUENCE);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Immunization.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>The service delivery location or facility in which the vaccine was / was to be administered</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.location</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location", path="Immunization.location", description="The service delivery location or facility in which the vaccine was / was to be administered", type="reference"  )
	public static final String SP_LOCATION = "location";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>The service delivery location or facility in which the vaccine was / was to be administered</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.location</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam LOCATION = new ReferenceClientParam(SP_LOCATION);

	/**
	 * Search parameter constant for <b>lot-number</b>
	 * <p>
	 * Description: <b>Vaccine Lot Number</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Immunization.lotNumber</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="lot-number", path="Immunization.lotNumber", description="Vaccine Lot Number", type="string"  )
	public static final String SP_LOT_NUMBER = "lot-number";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>lot-number</b>
	 * <p>
	 * Description: <b>Vaccine Lot Number</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Immunization.lotNumber</b><br>
	 * </p>
	 */
	public static final StringClientParam LOT_NUMBER = new StringClientParam(SP_LOT_NUMBER);

	/**
	 * Search parameter constant for <b>manufacturer</b>
	 * <p>
	 * Description: <b>Vaccine Manufacturer</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.manufacturer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="manufacturer", path="Immunization.manufacturer", description="Vaccine Manufacturer", type="reference"  )
	public static final String SP_MANUFACTURER = "manufacturer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>manufacturer</b>
	 * <p>
	 * Description: <b>Vaccine Manufacturer</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.manufacturer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam MANUFACTURER = new ReferenceClientParam(SP_MANUFACTURER);

	/**
	 * Search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b>The practitioner who administered the vaccination</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.performer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="performer", path="Immunization.performer", description="The practitioner who administered the vaccination", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_PERFORMER = "performer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b>The practitioner who administered the vaccination</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.performer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PERFORMER = new ReferenceClientParam(SP_PERFORMER);

	/**
	 * Search parameter constant for <b>reaction</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.reaction.detail</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="reaction", path="Immunization.reaction.detail", description="", type="reference"  )
	public static final String SP_REACTION = "reaction";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>reaction</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.reaction.detail</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam REACTION = new ReferenceClientParam(SP_REACTION);

	/**
	 * Search parameter constant for <b>reaction-date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Immunization.reaction.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="reaction-date", path="Immunization.reaction.date", description="", type="date"  )
	public static final String SP_REACTION_DATE = "reaction-date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>reaction-date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Immunization.reaction.date</b><br>
	 * </p>
	 */
	public static final DateClientParam REACTION_DATE = new DateClientParam(SP_REACTION_DATE);

	/**
	 * Search parameter constant for <b>reason</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.explanation.reason</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="reason", path="Immunization.explanation.reason", description="", type="token"  )
	public static final String SP_REASON = "reason";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>reason</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.explanation.reason</b><br>
	 * </p>
	 */
	public static final TokenClientParam REASON = new TokenClientParam(SP_REASON);

	/**
	 * Search parameter constant for <b>reason-not-given</b>
	 * <p>
	 * Description: <b>Explanation of reason vaccination was not administered</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.explanation.reasonNotGiven</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="reason-not-given", path="Immunization.explanation.reasonNotGiven", description="Explanation of reason vaccination was not administered", type="token"  )
	public static final String SP_REASON_NOT_GIVEN = "reason-not-given";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>reason-not-given</b>
	 * <p>
	 * Description: <b>Explanation of reason vaccination was not administered</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.explanation.reasonNotGiven</b><br>
	 * </p>
	 */
	public static final TokenClientParam REASON_NOT_GIVEN = new TokenClientParam(SP_REASON_NOT_GIVEN);

	/**
	 * Search parameter constant for <b>notgiven</b>
	 * <p>
	 * Description: <b>Administrations which were not given</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.wasNotGiven</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="notgiven", path="Immunization.wasNotGiven", description="Administrations which were not given", type="token"  )
	public static final String SP_NOTGIVEN = "notgiven";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>notgiven</b>
	 * <p>
	 * Description: <b>Administrations which were not given</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.wasNotGiven</b><br>
	 * </p>
	 */
	public static final TokenClientParam NOTGIVEN = new TokenClientParam(SP_NOTGIVEN);

	/**
	 * Search parameter constant for <b>requester</b>
	 * <p>
	 * Description: <b>The practitioner who ordered the vaccination</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.requester</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="requester", path="Immunization.requester", description="The practitioner who ordered the vaccination", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_REQUESTER = "requester";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>requester</b>
	 * <p>
	 * Description: <b>The practitioner who ordered the vaccination</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.requester</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam REQUESTER = new ReferenceClientParam(SP_REQUESTER);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The patient for the vaccination record</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Immunization.patient", description="The patient for the vaccination record", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The patient for the vaccination record</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Immunization.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>vaccine-code</b>
	 * <p>
	 * Description: <b>Vaccine Product Administered</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.vaccineCode</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="vaccine-code", path="Immunization.vaccineCode", description="Vaccine Product Administered", type="token"  )
	public static final String SP_VACCINE_CODE = "vaccine-code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>vaccine-code</b>
	 * <p>
	 * Description: <b>Vaccine Product Administered</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.vaccineCode</b><br>
	 * </p>
	 */
	public static final TokenClientParam VACCINE_CODE = new TokenClientParam(SP_VACCINE_CODE);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Immunization event status</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Immunization.status", description="Immunization event status", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Immunization event status</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Immunization.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Immunization:location</b>".
	 */
	public static final Include INCLUDE_LOCATION = new Include("Immunization:location");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Immunization:manufacturer</b>".
	 */
	public static final Include INCLUDE_MANUFACTURER = new Include("Immunization:manufacturer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Immunization:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Immunization:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Immunization:performer</b>".
	 */
	public static final Include INCLUDE_PERFORMER = new Include("Immunization:performer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Immunization:reaction</b>".
	 */
	public static final Include INCLUDE_REACTION = new Include("Immunization:reaction");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Immunization:requester</b>".
	 */
	public static final Include INCLUDE_REQUESTER = new Include("Immunization:requester");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="A unique identifier assigned to this immunization record."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="status", type=CodeDt.class, order=1, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="Indicates the current status of the vaccination event"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-admin-status")
	private CodeDt myStatus;
	
	@Child(name="date", type=DateTimeDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.init",
		formalDefinition="Date vaccine administered or was to be administered"
	)
	private DateTimeDt myDate;
	
	@Child(name="vaccineCode", type=CodeableConceptDt.class, order=3, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="what",
		formalDefinition="Vaccine that was administered or was to be administered"
	)
	private CodeableConceptDt myVaccineCode;
	
	@Child(name="patient", order=4, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The patient who either received or did not receive the immunization."
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="wasNotGiven", type=BooleanDt.class, order=5, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="Indicates if the vaccination was or was not given"
	)
	private BooleanDt myWasNotGiven;
	
	@Child(name="reported", type=BooleanDt.class, order=6, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="who.source",
		formalDefinition="True if this administration was reported rather than directly administered."
	)
	private BooleanDt myReported;
	
	@Child(name="performer", order=7, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="Clinician who administered the vaccine"
	)
	private ResourceReferenceDt myPerformer;
	
	@Child(name="requester", order=8, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.cause",
		formalDefinition="Clinician who ordered the vaccination"
	)
	private ResourceReferenceDt myRequester;
	
	@Child(name="encounter", order=9, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="The visit or admission or other contact between patient and health care provider the immunization was performed as part of."
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="manufacturer", order=10, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Name of vaccine manufacturer"
	)
	private ResourceReferenceDt myManufacturer;
	
	@Child(name="location", order=11, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="where",
		formalDefinition="The service delivery location where the vaccine administration occurred."
	)
	private ResourceReferenceDt myLocation;
	
	@Child(name="lotNumber", type=StringDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Lot number of the  vaccine product"
	)
	private StringDt myLotNumber;
	
	@Child(name="expirationDate", type=DateDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date vaccine batch expires"
	)
	private DateDt myExpirationDate;
	
	@Child(name="site", type=CodeableConceptDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Body site where vaccine was administered"
	)
	private CodeableConceptDt mySite;
	
	@Child(name="route", type=CodeableConceptDt.class, order=15, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The path by which the vaccine product is taken into the body."
	)
	private CodeableConceptDt myRoute;
	
	@Child(name="doseQuantity", type=SimpleQuantityDt.class, order=16, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The quantity of vaccine product that was administered"
	)
	private SimpleQuantityDt myDoseQuantity;
	
	@Child(name="note", type=AnnotationDt.class, order=17, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Extra information about the immunization that is not conveyed by the other attributes."
	)
	private java.util.List<AnnotationDt> myNote;
	
	@Child(name="explanation", order=18, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Reasons why a vaccine was or was not administered"
	)
	private Explanation myExplanation;
	
	@Child(name="reaction", order=19, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Categorical data indicating that an adverse event is associated in time to an immunization"
	)
	private java.util.List<Reaction> myReaction;
	
	@Child(name="vaccinationProtocol", order=20, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contains information about the protocol(s) under which the vaccine was administered"
	)
	private java.util.List<VaccinationProtocol> myVaccinationProtocol;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myStatus,  myDate,  myVaccineCode,  myPatient,  myWasNotGiven,  myReported,  myPerformer,  myRequester,  myEncounter,  myManufacturer,  myLocation,  myLotNumber,  myExpirationDate,  mySite,  myRoute,  myDoseQuantity,  myNote,  myExplanation,  myReaction,  myVaccinationProtocol);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myStatus, myDate, myVaccineCode, myPatient, myWasNotGiven, myReported, myPerformer, myRequester, myEncounter, myManufacturer, myLocation, myLotNumber, myExpirationDate, mySite, myRoute, myDoseQuantity, myNote, myExplanation, myReaction, myVaccinationProtocol);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier assigned to this immunization record.
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
     * A unique identifier assigned to this immunization record.
     * </p> 
	 */
	public Immunization setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier assigned to this immunization record.
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
	 * A unique identifier assigned to this immunization record.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Immunization addIdentifier(IdentifierDt theValue) {
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
     * A unique identifier assigned to this immunization record.
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
     * Indicates the current status of the vaccination event
     * </p> 
	 */
	public CodeDt getStatusElement() {  
		if (myStatus == null) {
			myStatus = new CodeDt();
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
     * Indicates the current status of the vaccination event
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
     * Indicates the current status of the vaccination event
     * </p> 
	 */
	public Immunization setStatus(CodeDt theValue) {
		myStatus = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the current status of the vaccination event
     * </p> 
	 */
	public Immunization setStatus( String theCode) {
		myStatus = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>date</b> (when.init).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine administered or was to be administered
     * </p> 
	 */
	public DateTimeDt getDateElement() {  
		if (myDate == null) {
			myDate = new DateTimeDt();
		}
		return myDate;
	}

	
	/**
	 * Gets the value(s) for <b>date</b> (when.init).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine administered or was to be administered
     * </p> 
	 */
	public Date getDate() {  
		return getDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>date</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine administered or was to be administered
     * </p> 
	 */
	public Immunization setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine administered or was to be administered
     * </p> 
	 */
	public Immunization setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine administered or was to be administered
     * </p> 
	 */
	public Immunization setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>vaccineCode</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine that was administered or was to be administered
     * </p> 
	 */
	public CodeableConceptDt getVaccineCode() {  
		if (myVaccineCode == null) {
			myVaccineCode = new CodeableConceptDt();
		}
		return myVaccineCode;
	}

	/**
	 * Sets the value(s) for <b>vaccineCode</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine that was administered or was to be administered
     * </p> 
	 */
	public Immunization setVaccineCode(CodeableConceptDt theValue) {
		myVaccineCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient who either received or did not receive the immunization.
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
     * The patient who either received or did not receive the immunization.
     * </p> 
	 */
	public Immunization setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>wasNotGiven</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates if the vaccination was or was not given
     * </p> 
	 */
	public BooleanDt getWasNotGivenElement() {  
		if (myWasNotGiven == null) {
			myWasNotGiven = new BooleanDt();
		}
		return myWasNotGiven;
	}

	
	/**
	 * Gets the value(s) for <b>wasNotGiven</b> (status).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates if the vaccination was or was not given
     * </p> 
	 */
	public Boolean getWasNotGiven() {  
		return getWasNotGivenElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>wasNotGiven</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates if the vaccination was or was not given
     * </p> 
	 */
	public Immunization setWasNotGiven(BooleanDt theValue) {
		myWasNotGiven = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>wasNotGiven</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates if the vaccination was or was not given
     * </p> 
	 */
	public Immunization setWasNotGiven( boolean theBoolean) {
		myWasNotGiven = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>reported</b> (who.source).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * True if this administration was reported rather than directly administered.
     * </p> 
	 */
	public BooleanDt getReportedElement() {  
		if (myReported == null) {
			myReported = new BooleanDt();
		}
		return myReported;
	}

	
	/**
	 * Gets the value(s) for <b>reported</b> (who.source).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * True if this administration was reported rather than directly administered.
     * </p> 
	 */
	public Boolean getReported() {  
		return getReportedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>reported</b> (who.source)
	 *
     * <p>
     * <b>Definition:</b>
     * True if this administration was reported rather than directly administered.
     * </p> 
	 */
	public Immunization setReported(BooleanDt theValue) {
		myReported = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>reported</b> (who.source)
	 *
     * <p>
     * <b>Definition:</b>
     * True if this administration was reported rather than directly administered.
     * </p> 
	 */
	public Immunization setReported( boolean theBoolean) {
		myReported = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>performer</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Clinician who administered the vaccine
     * </p> 
	 */
	public ResourceReferenceDt getPerformer() {  
		if (myPerformer == null) {
			myPerformer = new ResourceReferenceDt();
		}
		return myPerformer;
	}

	/**
	 * Sets the value(s) for <b>performer</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * Clinician who administered the vaccine
     * </p> 
	 */
	public Immunization setPerformer(ResourceReferenceDt theValue) {
		myPerformer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>requester</b> (who.cause).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Clinician who ordered the vaccination
     * </p> 
	 */
	public ResourceReferenceDt getRequester() {  
		if (myRequester == null) {
			myRequester = new ResourceReferenceDt();
		}
		return myRequester;
	}

	/**
	 * Sets the value(s) for <b>requester</b> (who.cause)
	 *
     * <p>
     * <b>Definition:</b>
     * Clinician who ordered the vaccination
     * </p> 
	 */
	public Immunization setRequester(ResourceReferenceDt theValue) {
		myRequester = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
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
     * The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
     * </p> 
	 */
	public Immunization setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>manufacturer</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Name of vaccine manufacturer
     * </p> 
	 */
	public ResourceReferenceDt getManufacturer() {  
		if (myManufacturer == null) {
			myManufacturer = new ResourceReferenceDt();
		}
		return myManufacturer;
	}

	/**
	 * Sets the value(s) for <b>manufacturer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Name of vaccine manufacturer
     * </p> 
	 */
	public Immunization setManufacturer(ResourceReferenceDt theValue) {
		myManufacturer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>location</b> (where).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The service delivery location where the vaccine administration occurred.
     * </p> 
	 */
	public ResourceReferenceDt getLocation() {  
		if (myLocation == null) {
			myLocation = new ResourceReferenceDt();
		}
		return myLocation;
	}

	/**
	 * Sets the value(s) for <b>location</b> (where)
	 *
     * <p>
     * <b>Definition:</b>
     * The service delivery location where the vaccine administration occurred.
     * </p> 
	 */
	public Immunization setLocation(ResourceReferenceDt theValue) {
		myLocation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>lotNumber</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Lot number of the  vaccine product
     * </p> 
	 */
	public StringDt getLotNumberElement() {  
		if (myLotNumber == null) {
			myLotNumber = new StringDt();
		}
		return myLotNumber;
	}

	
	/**
	 * Gets the value(s) for <b>lotNumber</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Lot number of the  vaccine product
     * </p> 
	 */
	public String getLotNumber() {  
		return getLotNumberElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>lotNumber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Lot number of the  vaccine product
     * </p> 
	 */
	public Immunization setLotNumber(StringDt theValue) {
		myLotNumber = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>lotNumber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Lot number of the  vaccine product
     * </p> 
	 */
	public Immunization setLotNumber( String theString) {
		myLotNumber = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>expirationDate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine batch expires
     * </p> 
	 */
	public DateDt getExpirationDateElement() {  
		if (myExpirationDate == null) {
			myExpirationDate = new DateDt();
		}
		return myExpirationDate;
	}

	
	/**
	 * Gets the value(s) for <b>expirationDate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine batch expires
     * </p> 
	 */
	public Date getExpirationDate() {  
		return getExpirationDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>expirationDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine batch expires
     * </p> 
	 */
	public Immunization setExpirationDate(DateDt theValue) {
		myExpirationDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>expirationDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine batch expires
     * </p> 
	 */
	public Immunization setExpirationDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myExpirationDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>expirationDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date vaccine batch expires
     * </p> 
	 */
	public Immunization setExpirationDateWithDayPrecision( Date theDate) {
		myExpirationDate = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>site</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Body site where vaccine was administered
     * </p> 
	 */
	public CodeableConceptDt getSite() {  
		if (mySite == null) {
			mySite = new CodeableConceptDt();
		}
		return mySite;
	}

	/**
	 * Sets the value(s) for <b>site</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Body site where vaccine was administered
     * </p> 
	 */
	public Immunization setSite(CodeableConceptDt theValue) {
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
     * The path by which the vaccine product is taken into the body.
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
     * The path by which the vaccine product is taken into the body.
     * </p> 
	 */
	public Immunization setRoute(CodeableConceptDt theValue) {
		myRoute = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>doseQuantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of vaccine product that was administered
     * </p> 
	 */
	public SimpleQuantityDt getDoseQuantity() {  
		if (myDoseQuantity == null) {
			myDoseQuantity = new SimpleQuantityDt();
		}
		return myDoseQuantity;
	}

	/**
	 * Sets the value(s) for <b>doseQuantity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of vaccine product that was administered
     * </p> 
	 */
	public Immunization setDoseQuantity(SimpleQuantityDt theValue) {
		myDoseQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the immunization that is not conveyed by the other attributes.
     * </p> 
	 */
	public java.util.List<AnnotationDt> getNote() {  
		if (myNote == null) {
			myNote = new java.util.ArrayList<AnnotationDt>();
		}
		return myNote;
	}

	/**
	 * Sets the value(s) for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the immunization that is not conveyed by the other attributes.
     * </p> 
	 */
	public Immunization setNote(java.util.List<AnnotationDt> theValue) {
		myNote = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the immunization that is not conveyed by the other attributes.
     * </p> 
	 */
	public AnnotationDt addNote() {
		AnnotationDt newType = new AnnotationDt();
		getNote().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>note</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Extra information about the immunization that is not conveyed by the other attributes.
	 * </p>
	 * @param theValue The note to add (must not be <code>null</code>)
	 */
	public Immunization addNote(AnnotationDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getNote().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>note</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Extra information about the immunization that is not conveyed by the other attributes.
     * </p> 
	 */
	public AnnotationDt getNoteFirstRep() {
		if (getNote().isEmpty()) {
			return addNote();
		}
		return getNote().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>explanation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reasons why a vaccine was or was not administered
     * </p> 
	 */
	public Explanation getExplanation() {  
		if (myExplanation == null) {
			myExplanation = new Explanation();
		}
		return myExplanation;
	}

	/**
	 * Sets the value(s) for <b>explanation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reasons why a vaccine was or was not administered
     * </p> 
	 */
	public Immunization setExplanation(Explanation theValue) {
		myExplanation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reaction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Categorical data indicating that an adverse event is associated in time to an immunization
     * </p> 
	 */
	public java.util.List<Reaction> getReaction() {  
		if (myReaction == null) {
			myReaction = new java.util.ArrayList<Reaction>();
		}
		return myReaction;
	}

	/**
	 * Sets the value(s) for <b>reaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Categorical data indicating that an adverse event is associated in time to an immunization
     * </p> 
	 */
	public Immunization setReaction(java.util.List<Reaction> theValue) {
		myReaction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Categorical data indicating that an adverse event is associated in time to an immunization
     * </p> 
	 */
	public Reaction addReaction() {
		Reaction newType = new Reaction();
		getReaction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>reaction</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Categorical data indicating that an adverse event is associated in time to an immunization
	 * </p>
	 * @param theValue The reaction to add (must not be <code>null</code>)
	 */
	public Immunization addReaction(Reaction theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReaction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>reaction</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Categorical data indicating that an adverse event is associated in time to an immunization
     * </p> 
	 */
	public Reaction getReactionFirstRep() {
		if (getReaction().isEmpty()) {
			return addReaction();
		}
		return getReaction().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>vaccinationProtocol</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contains information about the protocol(s) under which the vaccine was administered
     * </p> 
	 */
	public java.util.List<VaccinationProtocol> getVaccinationProtocol() {  
		if (myVaccinationProtocol == null) {
			myVaccinationProtocol = new java.util.ArrayList<VaccinationProtocol>();
		}
		return myVaccinationProtocol;
	}

	/**
	 * Sets the value(s) for <b>vaccinationProtocol</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains information about the protocol(s) under which the vaccine was administered
     * </p> 
	 */
	public Immunization setVaccinationProtocol(java.util.List<VaccinationProtocol> theValue) {
		myVaccinationProtocol = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>vaccinationProtocol</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains information about the protocol(s) under which the vaccine was administered
     * </p> 
	 */
	public VaccinationProtocol addVaccinationProtocol() {
		VaccinationProtocol newType = new VaccinationProtocol();
		getVaccinationProtocol().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>vaccinationProtocol</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Contains information about the protocol(s) under which the vaccine was administered
	 * </p>
	 * @param theValue The vaccinationProtocol to add (must not be <code>null</code>)
	 */
	public Immunization addVaccinationProtocol(VaccinationProtocol theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getVaccinationProtocol().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>vaccinationProtocol</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Contains information about the protocol(s) under which the vaccine was administered
     * </p> 
	 */
	public VaccinationProtocol getVaccinationProtocolFirstRep() {
		if (getVaccinationProtocol().isEmpty()) {
			return addVaccinationProtocol();
		}
		return getVaccinationProtocol().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Immunization.explanation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reasons why a vaccine was or was not administered
     * </p> 
	 */
	@Block()	
	public static class Explanation 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="reason", type=CodeableConceptDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Reasons why a vaccine was administered"
	)
	private java.util.List<CodeableConceptDt> myReason;
	
	@Child(name="reasonNotGiven", type=CodeableConceptDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Reason why a vaccine was not administered"
	)
	private java.util.List<CodeableConceptDt> myReasonNotGiven;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myReason,  myReasonNotGiven);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myReason, myReasonNotGiven);
	}

	/**
	 * Gets the value(s) for <b>reason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reasons why a vaccine was administered
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
     * Reasons why a vaccine was administered
     * </p> 
	 */
	public Explanation setReason(java.util.List<CodeableConceptDt> theValue) {
		myReason = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reasons why a vaccine was administered
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
	 * Reasons why a vaccine was administered
	 * </p>
	 * @param theValue The reason to add (must not be <code>null</code>)
	 */
	public Explanation addReason(CodeableConceptDt theValue) {
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
     * Reasons why a vaccine was administered
     * </p> 
	 */
	public CodeableConceptDt getReasonFirstRep() {
		if (getReason().isEmpty()) {
			return addReason();
		}
		return getReason().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>reasonNotGiven</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason why a vaccine was not administered
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getReasonNotGiven() {  
		if (myReasonNotGiven == null) {
			myReasonNotGiven = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myReasonNotGiven;
	}

	/**
	 * Sets the value(s) for <b>reasonNotGiven</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reason why a vaccine was not administered
     * </p> 
	 */
	public Explanation setReasonNotGiven(java.util.List<CodeableConceptDt> theValue) {
		myReasonNotGiven = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reasonNotGiven</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reason why a vaccine was not administered
     * </p> 
	 */
	public CodeableConceptDt addReasonNotGiven() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getReasonNotGiven().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>reasonNotGiven</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Reason why a vaccine was not administered
	 * </p>
	 * @param theValue The reasonNotGiven to add (must not be <code>null</code>)
	 */
	public Explanation addReasonNotGiven(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReasonNotGiven().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>reasonNotGiven</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason why a vaccine was not administered
     * </p> 
	 */
	public CodeableConceptDt getReasonNotGivenFirstRep() {
		if (getReasonNotGiven().isEmpty()) {
			return addReasonNotGiven();
		}
		return getReasonNotGiven().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>Immunization.reaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Categorical data indicating that an adverse event is associated in time to an immunization
     * </p> 
	 */
	@Block()	
	public static class Reaction 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="date", type=DateTimeDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date of reaction to the immunization"
	)
	private DateTimeDt myDate;
	
	@Child(name="detail", order=1, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Observation.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Details of the reaction"
	)
	private ResourceReferenceDt myDetail;
	
	@Child(name="reported", type=BooleanDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Self-reported indicator"
	)
	private BooleanDt myReported;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myDate,  myDetail,  myReported);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myDate, myDetail, myReported);
	}

	/**
	 * Gets the value(s) for <b>date</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date of reaction to the immunization
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
     * Date of reaction to the immunization
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
     * Date of reaction to the immunization
     * </p> 
	 */
	public Reaction setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date of reaction to the immunization
     * </p> 
	 */
	public Reaction setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date of reaction to the immunization
     * </p> 
	 */
	public Reaction setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>detail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details of the reaction
     * </p> 
	 */
	public ResourceReferenceDt getDetail() {  
		if (myDetail == null) {
			myDetail = new ResourceReferenceDt();
		}
		return myDetail;
	}

	/**
	 * Sets the value(s) for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details of the reaction
     * </p> 
	 */
	public Reaction setDetail(ResourceReferenceDt theValue) {
		myDetail = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reported</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Self-reported indicator
     * </p> 
	 */
	public BooleanDt getReportedElement() {  
		if (myReported == null) {
			myReported = new BooleanDt();
		}
		return myReported;
	}

	
	/**
	 * Gets the value(s) for <b>reported</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Self-reported indicator
     * </p> 
	 */
	public Boolean getReported() {  
		return getReportedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>reported</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Self-reported indicator
     * </p> 
	 */
	public Reaction setReported(BooleanDt theValue) {
		myReported = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>reported</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Self-reported indicator
     * </p> 
	 */
	public Reaction setReported( boolean theBoolean) {
		myReported = new BooleanDt(theBoolean); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Immunization.vaccinationProtocol</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains information about the protocol(s) under which the vaccine was administered
     * </p> 
	 */
	@Block()	
	public static class VaccinationProtocol 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="doseSequence", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Nominal position in a series"
	)
	private PositiveIntDt myDoseSequence;
	
	@Child(name="description", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contains the description about the protocol under which the vaccine was administered"
	)
	private StringDt myDescription;
	
	@Child(name="authority", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the authority who published the protocol.  E.g. ACIP"
	)
	private ResourceReferenceDt myAuthority;
	
	@Child(name="series", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="One possible path to achieve presumed immunity against a disease - within the context of an authority"
	)
	private StringDt mySeries;
	
	@Child(name="seriesDoses", type=PositiveIntDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The recommended number of doses to achieve immunity."
	)
	private PositiveIntDt mySeriesDoses;
	
	@Child(name="targetDisease", type=CodeableConceptDt.class, order=5, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The targeted disease"
	)
	private java.util.List<CodeableConceptDt> myTargetDisease;
	
	@Child(name="doseStatus", type=CodeableConceptDt.class, order=6, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates if the immunization event should \"count\" against  the protocol."
	)
	private CodeableConceptDt myDoseStatus;
	
	@Child(name="doseStatusReason", type=CodeableConceptDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Provides an explanation as to why an immunization event should or should not count against the protocol."
	)
	private CodeableConceptDt myDoseStatusReason;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myDoseSequence,  myDescription,  myAuthority,  mySeries,  mySeriesDoses,  myTargetDisease,  myDoseStatus,  myDoseStatusReason);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myDoseSequence, myDescription, myAuthority, mySeries, mySeriesDoses, myTargetDisease, myDoseStatus, myDoseStatusReason);
	}

	/**
	 * Gets the value(s) for <b>doseSequence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Nominal position in a series
     * </p> 
	 */
	public PositiveIntDt getDoseSequenceElement() {  
		if (myDoseSequence == null) {
			myDoseSequence = new PositiveIntDt();
		}
		return myDoseSequence;
	}

	
	/**
	 * Gets the value(s) for <b>doseSequence</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Nominal position in a series
     * </p> 
	 */
	public Integer getDoseSequence() {  
		return getDoseSequenceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>doseSequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nominal position in a series
     * </p> 
	 */
	public VaccinationProtocol setDoseSequence(PositiveIntDt theValue) {
		myDoseSequence = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>doseSequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nominal position in a series
     * </p> 
	 */
	public VaccinationProtocol setDoseSequence( int theInteger) {
		myDoseSequence = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contains the description about the protocol under which the vaccine was administered
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
     * Contains the description about the protocol under which the vaccine was administered
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
     * Contains the description about the protocol under which the vaccine was administered
     * </p> 
	 */
	public VaccinationProtocol setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains the description about the protocol under which the vaccine was administered
     * </p> 
	 */
	public VaccinationProtocol setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>authority</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the authority who published the protocol.  E.g. ACIP
     * </p> 
	 */
	public ResourceReferenceDt getAuthority() {  
		if (myAuthority == null) {
			myAuthority = new ResourceReferenceDt();
		}
		return myAuthority;
	}

	/**
	 * Sets the value(s) for <b>authority</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the authority who published the protocol.  E.g. ACIP
     * </p> 
	 */
	public VaccinationProtocol setAuthority(ResourceReferenceDt theValue) {
		myAuthority = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>series</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * One possible path to achieve presumed immunity against a disease - within the context of an authority
     * </p> 
	 */
	public StringDt getSeriesElement() {  
		if (mySeries == null) {
			mySeries = new StringDt();
		}
		return mySeries;
	}

	
	/**
	 * Gets the value(s) for <b>series</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * One possible path to achieve presumed immunity against a disease - within the context of an authority
     * </p> 
	 */
	public String getSeries() {  
		return getSeriesElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One possible path to achieve presumed immunity against a disease - within the context of an authority
     * </p> 
	 */
	public VaccinationProtocol setSeries(StringDt theValue) {
		mySeries = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One possible path to achieve presumed immunity against a disease - within the context of an authority
     * </p> 
	 */
	public VaccinationProtocol setSeries( String theString) {
		mySeries = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>seriesDoses</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended number of doses to achieve immunity.
     * </p> 
	 */
	public PositiveIntDt getSeriesDosesElement() {  
		if (mySeriesDoses == null) {
			mySeriesDoses = new PositiveIntDt();
		}
		return mySeriesDoses;
	}

	
	/**
	 * Gets the value(s) for <b>seriesDoses</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended number of doses to achieve immunity.
     * </p> 
	 */
	public Integer getSeriesDoses() {  
		return getSeriesDosesElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>seriesDoses</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended number of doses to achieve immunity.
     * </p> 
	 */
	public VaccinationProtocol setSeriesDoses(PositiveIntDt theValue) {
		mySeriesDoses = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>seriesDoses</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended number of doses to achieve immunity.
     * </p> 
	 */
	public VaccinationProtocol setSeriesDoses( int theInteger) {
		mySeriesDoses = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>targetDisease</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The targeted disease
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getTargetDisease() {  
		if (myTargetDisease == null) {
			myTargetDisease = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myTargetDisease;
	}

	/**
	 * Sets the value(s) for <b>targetDisease</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The targeted disease
     * </p> 
	 */
	public VaccinationProtocol setTargetDisease(java.util.List<CodeableConceptDt> theValue) {
		myTargetDisease = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>targetDisease</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The targeted disease
     * </p> 
	 */
	public CodeableConceptDt addTargetDisease() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getTargetDisease().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>targetDisease</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The targeted disease
	 * </p>
	 * @param theValue The targetDisease to add (must not be <code>null</code>)
	 */
	public VaccinationProtocol addTargetDisease(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTargetDisease().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>targetDisease</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The targeted disease
     * </p> 
	 */
	public CodeableConceptDt getTargetDiseaseFirstRep() {
		if (getTargetDisease().isEmpty()) {
			return addTargetDisease();
		}
		return getTargetDisease().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>doseStatus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates if the immunization event should \&quot;count\&quot; against  the protocol.
     * </p> 
	 */
	public CodeableConceptDt getDoseStatus() {  
		if (myDoseStatus == null) {
			myDoseStatus = new CodeableConceptDt();
		}
		return myDoseStatus;
	}

	/**
	 * Sets the value(s) for <b>doseStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates if the immunization event should \&quot;count\&quot; against  the protocol.
     * </p> 
	 */
	public VaccinationProtocol setDoseStatus(CodeableConceptDt theValue) {
		myDoseStatus = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>doseStatusReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Provides an explanation as to why an immunization event should or should not count against the protocol.
     * </p> 
	 */
	public CodeableConceptDt getDoseStatusReason() {  
		if (myDoseStatusReason == null) {
			myDoseStatusReason = new CodeableConceptDt();
		}
		return myDoseStatusReason;
	}

	/**
	 * Sets the value(s) for <b>doseStatusReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Provides an explanation as to why an immunization event should or should not count against the protocol.
     * </p> 
	 */
	public VaccinationProtocol setDoseStatusReason(CodeableConceptDt theValue) {
		myDoseStatusReason = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Immunization";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
