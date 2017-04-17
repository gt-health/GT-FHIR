















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
 * HAPI/FHIR <b>DiagnosticReport</b> Resource
 * (clinical.diagnostics)
 *
 * <p>
 * <b>Definition:</b>
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * To support reporting for any diagnostic report into a clinical data repository.
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/DiagnosticReport">http://hl7.org/fhir/profiles/DiagnosticReport</a> 
 * </p>
 *
 */
@ResourceDef(name="DiagnosticReport", profile="http://hl7.org/fhir/profiles/DiagnosticReport", id="diagnosticreport")
public class DiagnosticReport extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the report</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="DiagnosticReport.status", description="The status of the report", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the report</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>issued</b>
	 * <p>
	 * Description: <b>When the report was issued</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DiagnosticReport.issued</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="issued", path="DiagnosticReport.issued", description="When the report was issued", type="date"  )
	public static final String SP_ISSUED = "issued";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>issued</b>
	 * <p>
	 * Description: <b>When the report was issued</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DiagnosticReport.issued</b><br>
	 * </p>
	 */
	public static final DateClientParam ISSUED = new DateClientParam(SP_ISSUED);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The subject of the report</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="DiagnosticReport.subject", description="The subject of the report", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The subject of the report</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b>Who was the source of the report (organization)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.performer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="performer", path="DiagnosticReport.performer", description="Who was the source of the report (organization)", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_PERFORMER = "performer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b>Who was the source of the report (organization)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.performer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PERFORMER = new ReferenceClientParam(SP_PERFORMER);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>An identifier for the report</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="DiagnosticReport.identifier", description="An identifier for the report", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>An identifier for the report</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>Which diagnostic discipline/department created the report</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.category</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="category", path="DiagnosticReport.category", description="Which diagnostic discipline/department created the report", type="token"  )
	public static final String SP_CATEGORY = "category";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>Which diagnostic discipline/department created the report</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.category</b><br>
	 * </p>
	 */
	public static final TokenClientParam CATEGORY = new TokenClientParam(SP_CATEGORY);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The clinically relevant time of the report</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DiagnosticReport.effective[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="DiagnosticReport.effective[x]", description="The clinically relevant time of the report", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The clinically relevant time of the report</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DiagnosticReport.effective[x]</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>specimen</b>
	 * <p>
	 * Description: <b>The specimen details</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.specimen</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="specimen", path="DiagnosticReport.specimen", description="The specimen details", type="reference"  )
	public static final String SP_SPECIMEN = "specimen";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>specimen</b>
	 * <p>
	 * Description: <b>The specimen details</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.specimen</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SPECIMEN = new ReferenceClientParam(SP_SPECIMEN);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>The code for the report as a whole, as opposed to codes for the atomic results, which are the names on the observation resource referred to from the result</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="DiagnosticReport.code", description="The code for the report as a whole, as opposed to codes for the atomic results, which are the names on the observation resource referred to from the result", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>The code for the report as a whole, as opposed to codes for the atomic results, which are the names on the observation resource referred to from the result</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>result</b>
	 * <p>
	 * Description: <b>Link to an atomic result (observation resource)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.result</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="result", path="DiagnosticReport.result", description="Link to an atomic result (observation resource)", type="reference"  )
	public static final String SP_RESULT = "result";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>result</b>
	 * <p>
	 * Description: <b>Link to an atomic result (observation resource)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.result</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RESULT = new ReferenceClientParam(SP_RESULT);

	/**
	 * Search parameter constant for <b>diagnosis</b>
	 * <p>
	 * Description: <b>A coded diagnosis on the report</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.codedDiagnosis</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="diagnosis", path="DiagnosticReport.codedDiagnosis", description="A coded diagnosis on the report", type="token"  )
	public static final String SP_DIAGNOSIS = "diagnosis";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>diagnosis</b>
	 * <p>
	 * Description: <b>A coded diagnosis on the report</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticReport.codedDiagnosis</b><br>
	 * </p>
	 */
	public static final TokenClientParam DIAGNOSIS = new TokenClientParam(SP_DIAGNOSIS);

	/**
	 * Search parameter constant for <b>image</b>
	 * <p>
	 * Description: <b>A reference to the image source.</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.image.link</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="image", path="DiagnosticReport.image.link", description="A reference to the image source.", type="reference"  )
	public static final String SP_IMAGE = "image";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>image</b>
	 * <p>
	 * Description: <b>A reference to the image source.</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.image.link</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam IMAGE = new ReferenceClientParam(SP_IMAGE);

	/**
	 * Search parameter constant for <b>request</b>
	 * <p>
	 * Description: <b>Reference to the test or procedure request.</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.request</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="request", path="DiagnosticReport.request", description="Reference to the test or procedure request.", type="reference"  )
	public static final String SP_REQUEST = "request";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>request</b>
	 * <p>
	 * Description: <b>Reference to the test or procedure request.</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.request</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam REQUEST = new ReferenceClientParam(SP_REQUEST);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The subject of the report if a patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="DiagnosticReport.subject", description="The subject of the report if a patient", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The subject of the report if a patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>The Encounter when the order was made</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="DiagnosticReport.encounter", description="The Encounter when the order was made", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>The Encounter when the order was made</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticReport.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticReport:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("DiagnosticReport:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticReport:image</b>".
	 */
	public static final Include INCLUDE_IMAGE = new Include("DiagnosticReport:image");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticReport:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("DiagnosticReport:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticReport:performer</b>".
	 */
	public static final Include INCLUDE_PERFORMER = new Include("DiagnosticReport:performer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticReport:request</b>".
	 */
	public static final Include INCLUDE_REQUEST = new Include("DiagnosticReport:request");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticReport:result</b>".
	 */
	public static final Include INCLUDE_RESULT = new Include("DiagnosticReport:result");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticReport:specimen</b>".
	 */
	public static final Include INCLUDE_SPECIMEN = new Include("DiagnosticReport:specimen");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticReport:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("DiagnosticReport:subject");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="status", type=CodeDt.class, order=1, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of the diagnostic report as a whole"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/diagnostic-report-status")
	private BoundCodeDt<DiagnosticReportStatusEnum> myStatus;
	
	@Child(name="category", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes."
	)
	private CodeableConceptDt myCategory;
	
	@Child(name="code", type=CodeableConceptDt.class, order=3, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="what",
		formalDefinition="A code or name that describes this diagnostic report"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-report-codes")
	private CodeableConceptDt myCode;
	
	@Child(name="subject", order=4, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources."
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="encounter", order=5, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="The link to the health care event (encounter) when the order was made."
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="effective", order=6, min=1, max=1, summary=true, modifier=false, type={
		DateTimeDt.class, 		PeriodDt.class	})
	@Description(
		shortDefinition="when.done",
		formalDefinition="The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself."
	)
	private IDatatype myEffective;
	
	@Child(name="issued", type=InstantDt.class, order=7, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date and time that this version of the report was released from the source diagnostic service"
	)
	private InstantDt myIssued;
	
	@Child(name="performer", order=8, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who.witness",
		formalDefinition="The diagnostic service that is responsible for issuing the report"
	)
	private ResourceReferenceDt myPerformer;
	
	@Child(name="request", order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.class, 		ca.uhn.fhir.model.dstu2.resource.ProcedureRequest.class, 		ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Details concerning a test or procedure requested."
	)
	private java.util.List<ResourceReferenceDt> myRequest;
	
	@Child(name="specimen", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Specimen.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Details about the specimens on which this diagnostic report is based"
	)
	private java.util.List<ResourceReferenceDt> mySpecimen;
	
	@Child(name="result", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Observation.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. \"atomic\" results), or they can be grouping observations that include references to other members of the group (e.g. \"panels\")."
	)
	private java.util.List<ResourceReferenceDt> myResult;
	
	@Child(name="imagingStudy", order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ImagingStudy.class, 		ca.uhn.fhir.model.dstu2.resource.ImagingObjectSelection.class	})
	@Description(
		shortDefinition="",
		formalDefinition="One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images."
	)
	private java.util.List<ResourceReferenceDt> myImagingStudy;
	
	@Child(name="image", order=13, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest)."
	)
	private java.util.List<Image> myImage;
	
	@Child(name="conclusion", type=StringDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Concise and clinically contextualized narrative interpretation of the diagnostic report"
	)
	private StringDt myConclusion;
	
	@Child(name="codedDiagnosis", type=CodeableConceptDt.class, order=15, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<CodeableConceptDt> myCodedDiagnosis;
	
	@Child(name="presentedForm", type=AttachmentDt.class, order=16, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent."
	)
	private java.util.List<AttachmentDt> myPresentedForm;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myStatus,  myCategory,  myCode,  mySubject,  myEncounter,  myEffective,  myIssued,  myPerformer,  myRequest,  mySpecimen,  myResult,  myImagingStudy,  myImage,  myConclusion,  myCodedDiagnosis,  myPresentedForm);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myStatus, myCategory, myCode, mySubject, myEncounter, myEffective, myIssued, myPerformer, myRequest, mySpecimen, myResult, myImagingStudy, myImage, myConclusion, myCodedDiagnosis, myPresentedForm);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider
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
     * The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider
     * </p> 
	 */
	public DiagnosticReport setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider
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
	 * The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public DiagnosticReport addIdentifier(IdentifierDt theValue) {
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
     * The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider
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
     * The status of the diagnostic report as a whole
     * </p> 
	 */
	public BoundCodeDt<DiagnosticReportStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<DiagnosticReportStatusEnum>(DiagnosticReportStatusEnum.VALUESET_BINDER);
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
     * The status of the diagnostic report as a whole
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
     * The status of the diagnostic report as a whole
     * </p> 
	 */
	public DiagnosticReport setStatus(BoundCodeDt<DiagnosticReportStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the diagnostic report as a whole
     * </p> 
	 */
	public DiagnosticReport setStatus(DiagnosticReportStatusEnum theValue) {
		setStatus(new BoundCodeDt<DiagnosticReportStatusEnum>(DiagnosticReportStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>category</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
     * </p> 
	 */
	public CodeableConceptDt getCategory() {  
		if (myCategory == null) {
			myCategory = new CodeableConceptDt();
		}
		return myCategory;
	}

	/**
	 * Sets the value(s) for <b>category</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
     * </p> 
	 */
	public DiagnosticReport setCategory(CodeableConceptDt theValue) {
		myCategory = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>code</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code or name that describes this diagnostic report
     * </p> 
	 */
	public CodeableConceptDt getCode() {  
		if (myCode == null) {
			myCode = new CodeableConceptDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * A code or name that describes this diagnostic report
     * </p> 
	 */
	public DiagnosticReport setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subject</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.
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
     * The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.
     * </p> 
	 */
	public DiagnosticReport setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The link to the health care event (encounter) when the order was made.
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
     * The link to the health care event (encounter) when the order was made.
     * </p> 
	 */
	public DiagnosticReport setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>effective[x]</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
     * </p> 
	 */
	public IDatatype getEffective() {  
		return myEffective;
	}

	/**
	 * Sets the value(s) for <b>effective[x]</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself.
     * </p> 
	 */
	public DiagnosticReport setEffective(IDatatype theValue) {
		myEffective = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>issued</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this version of the report was released from the source diagnostic service
     * </p> 
	 */
	public InstantDt getIssuedElement() {  
		if (myIssued == null) {
			myIssued = new InstantDt();
		}
		return myIssued;
	}

	
	/**
	 * Gets the value(s) for <b>issued</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this version of the report was released from the source diagnostic service
     * </p> 
	 */
	public Date getIssued() {  
		return getIssuedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>issued</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this version of the report was released from the source diagnostic service
     * </p> 
	 */
	public DiagnosticReport setIssued(InstantDt theValue) {
		myIssued = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>issued</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this version of the report was released from the source diagnostic service
     * </p> 
	 */
	public DiagnosticReport setIssuedWithMillisPrecision( Date theDate) {
		myIssued = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>issued</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this version of the report was released from the source diagnostic service
     * </p> 
	 */
	public DiagnosticReport setIssued( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myIssued = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>performer</b> (who.witness).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The diagnostic service that is responsible for issuing the report
     * </p> 
	 */
	public ResourceReferenceDt getPerformer() {  
		if (myPerformer == null) {
			myPerformer = new ResourceReferenceDt();
		}
		return myPerformer;
	}

	/**
	 * Sets the value(s) for <b>performer</b> (who.witness)
	 *
     * <p>
     * <b>Definition:</b>
     * The diagnostic service that is responsible for issuing the report
     * </p> 
	 */
	public DiagnosticReport setPerformer(ResourceReferenceDt theValue) {
		myPerformer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>request</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning a test or procedure requested.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getRequest() {  
		if (myRequest == null) {
			myRequest = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myRequest;
	}

	/**
	 * Sets the value(s) for <b>request</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning a test or procedure requested.
     * </p> 
	 */
	public DiagnosticReport setRequest(java.util.List<ResourceReferenceDt> theValue) {
		myRequest = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>request</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details concerning a test or procedure requested.
     * </p> 
	 */
	public ResourceReferenceDt addRequest() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getRequest().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>specimen</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details about the specimens on which this diagnostic report is based
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSpecimen() {  
		if (mySpecimen == null) {
			mySpecimen = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySpecimen;
	}

	/**
	 * Sets the value(s) for <b>specimen</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details about the specimens on which this diagnostic report is based
     * </p> 
	 */
	public DiagnosticReport setSpecimen(java.util.List<ResourceReferenceDt> theValue) {
		mySpecimen = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>specimen</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details about the specimens on which this diagnostic report is based
     * </p> 
	 */
	public ResourceReferenceDt addSpecimen() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSpecimen().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>result</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. \&quot;atomic\&quot; results), or they can be grouping observations that include references to other members of the group (e.g. \&quot;panels\&quot;).
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getResult() {  
		if (myResult == null) {
			myResult = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myResult;
	}

	/**
	 * Sets the value(s) for <b>result</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. \&quot;atomic\&quot; results), or they can be grouping observations that include references to other members of the group (e.g. \&quot;panels\&quot;).
     * </p> 
	 */
	public DiagnosticReport setResult(java.util.List<ResourceReferenceDt> theValue) {
		myResult = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>result</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. \&quot;atomic\&quot; results), or they can be grouping observations that include references to other members of the group (e.g. \&quot;panels\&quot;).
     * </p> 
	 */
	public ResourceReferenceDt addResult() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getResult().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>imagingStudy</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getImagingStudy() {  
		if (myImagingStudy == null) {
			myImagingStudy = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myImagingStudy;
	}

	/**
	 * Sets the value(s) for <b>imagingStudy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
     * </p> 
	 */
	public DiagnosticReport setImagingStudy(java.util.List<ResourceReferenceDt> theValue) {
		myImagingStudy = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>imagingStudy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
     * </p> 
	 */
	public ResourceReferenceDt addImagingStudy() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getImagingStudy().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>image</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     * </p> 
	 */
	public java.util.List<Image> getImage() {  
		if (myImage == null) {
			myImage = new java.util.ArrayList<Image>();
		}
		return myImage;
	}

	/**
	 * Sets the value(s) for <b>image</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     * </p> 
	 */
	public DiagnosticReport setImage(java.util.List<Image> theValue) {
		myImage = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>image</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     * </p> 
	 */
	public Image addImage() {
		Image newType = new Image();
		getImage().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>image</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
	 * </p>
	 * @param theValue The image to add (must not be <code>null</code>)
	 */
	public DiagnosticReport addImage(Image theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getImage().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>image</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     * </p> 
	 */
	public Image getImageFirstRep() {
		if (getImage().isEmpty()) {
			return addImage();
		}
		return getImage().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>conclusion</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Concise and clinically contextualized narrative interpretation of the diagnostic report
     * </p> 
	 */
	public StringDt getConclusionElement() {  
		if (myConclusion == null) {
			myConclusion = new StringDt();
		}
		return myConclusion;
	}

	
	/**
	 * Gets the value(s) for <b>conclusion</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Concise and clinically contextualized narrative interpretation of the diagnostic report
     * </p> 
	 */
	public String getConclusion() {  
		return getConclusionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>conclusion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Concise and clinically contextualized narrative interpretation of the diagnostic report
     * </p> 
	 */
	public DiagnosticReport setConclusion(StringDt theValue) {
		myConclusion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>conclusion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Concise and clinically contextualized narrative interpretation of the diagnostic report
     * </p> 
	 */
	public DiagnosticReport setConclusion( String theString) {
		myConclusion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>codedDiagnosis</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getCodedDiagnosis() {  
		if (myCodedDiagnosis == null) {
			myCodedDiagnosis = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myCodedDiagnosis;
	}

	/**
	 * Sets the value(s) for <b>codedDiagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public DiagnosticReport setCodedDiagnosis(java.util.List<CodeableConceptDt> theValue) {
		myCodedDiagnosis = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>codedDiagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt addCodedDiagnosis() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getCodedDiagnosis().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>codedDiagnosis</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The codedDiagnosis to add (must not be <code>null</code>)
	 */
	public DiagnosticReport addCodedDiagnosis(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCodedDiagnosis().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>codedDiagnosis</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt getCodedDiagnosisFirstRep() {
		if (getCodedDiagnosis().isEmpty()) {
			return addCodedDiagnosis();
		}
		return getCodedDiagnosis().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>presentedForm</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
     * </p> 
	 */
	public java.util.List<AttachmentDt> getPresentedForm() {  
		if (myPresentedForm == null) {
			myPresentedForm = new java.util.ArrayList<AttachmentDt>();
		}
		return myPresentedForm;
	}

	/**
	 * Sets the value(s) for <b>presentedForm</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
     * </p> 
	 */
	public DiagnosticReport setPresentedForm(java.util.List<AttachmentDt> theValue) {
		myPresentedForm = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>presentedForm</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
     * </p> 
	 */
	public AttachmentDt addPresentedForm() {
		AttachmentDt newType = new AttachmentDt();
		getPresentedForm().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>presentedForm</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
	 * </p>
	 * @param theValue The presentedForm to add (must not be <code>null</code>)
	 */
	public DiagnosticReport addPresentedForm(AttachmentDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPresentedForm().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>presentedForm</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
     * </p> 
	 */
	public AttachmentDt getPresentedFormFirstRep() {
		if (getPresentedForm().isEmpty()) {
			return addPresentedForm();
		}
		return getPresentedForm().get(0); 
	}
  
	/**
	 * Block class for child element: <b>DiagnosticReport.image</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     * </p> 
	 */
	@Block()	
	public static class Image 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="comment", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features."
	)
	private StringDt myComment;
	
	@Child(name="link", order=1, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Media.class	})
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private ResourceReferenceDt myLink;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myComment,  myLink);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myComment, myLink);
	}

	/**
	 * Gets the value(s) for <b>comment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
     * </p> 
	 */
	public StringDt getCommentElement() {  
		if (myComment == null) {
			myComment = new StringDt();
		}
		return myComment;
	}

	
	/**
	 * Gets the value(s) for <b>comment</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
     * </p> 
	 */
	public String getComment() {  
		return getCommentElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>comment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
     * </p> 
	 */
	public Image setComment(StringDt theValue) {
		myComment = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>comment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
     * </p> 
	 */
	public Image setComment( String theString) {
		myComment = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>link</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt getLink() {  
		if (myLink == null) {
			myLink = new ResourceReferenceDt();
		}
		return myLink;
	}

	/**
	 * Sets the value(s) for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Image setLink(ResourceReferenceDt theValue) {
		myLink = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "DiagnosticReport";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
