















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
 * HAPI/FHIR <b>ClaimResponse</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * This resource provides the adjudication details from the processing of a Claim resource.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ClaimResponse">http://hl7.org/fhir/profiles/ClaimResponse</a> 
 * </p>
 *
 */
@ResourceDef(name="ClaimResponse", profile="http://hl7.org/fhir/profiles/ClaimResponse", id="claimresponse")
public class ClaimResponse extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identity of the insurer</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClaimResponse.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="ClaimResponse.identifier", description="The identity of the insurer", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identity of the insurer</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ClaimResponse.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);



	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The Response business identifier"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="request", order=1, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Claim.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Original request resource referrence"
	)
	private ResourceReferenceDt myRequest;
	
	@Child(name="ruleset", type=CodingDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources."
	)
	private CodingDt myRuleset;
	
	@Child(name="originalRuleset", type=CodingDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The style (standard) and version of the original material which was converted into this resource."
	)
	private CodingDt myOriginalRuleset;
	
	@Child(name="created", type=DateTimeDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date when the enclosed suite of services were performed or completed"
	)
	private DateTimeDt myCreated;
	
	@Child(name="organization", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The Insurer who produced this adjudicated response."
	)
	private ResourceReferenceDt myOrganization;
	
	@Child(name="requestProvider", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The practitioner who is responsible for the services rendered to the patient."
	)
	private ResourceReferenceDt myRequestProvider;
	
	@Child(name="requestOrganization", order=7, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The organization which is responsible for the services rendered to the patient."
	)
	private ResourceReferenceDt myRequestOrganization;
	
	@Child(name="outcome", type=CodeDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Transaction status: error, complete"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/remittance-outcome")
	private BoundCodeDt<RemittanceOutcomeEnum> myOutcome;
	
	@Child(name="disposition", type=StringDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of the status of the adjudication."
	)
	private StringDt myDisposition;
	
	@Child(name="payeeType", type=CodingDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Party to be reimbursed: Subscriber, provider, other."
	)
	private CodingDt myPayeeType;
	
	@Child(name="item", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The first tier service adjudications for submitted services."
	)
	private java.util.List<Item> myItem;
	
	@Child(name="addItem", order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The first tier service adjudications for payor added services."
	)
	private java.util.List<AddItem> myAddItem;
	
	@Child(name="error", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Mutually exclusive with Services Provided (Item)."
	)
	private java.util.List<Error> myError;
	
	@Child(name="totalCost", type=MoneyDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The total cost of the services reported."
	)
	private MoneyDt myTotalCost;
	
	@Child(name="unallocDeductable", type=MoneyDt.class, order=15, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The amount of deductible applied which was not allocated to any particular service line."
	)
	private MoneyDt myUnallocDeductable;
	
	@Child(name="totalBenefit", type=MoneyDt.class, order=16, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible)"
	)
	private MoneyDt myTotalBenefit;
	
	@Child(name="paymentAdjustment", type=MoneyDt.class, order=17, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Adjustment to the payment of this transaction which is not related to adjudication of this transaction."
	)
	private MoneyDt myPaymentAdjustment;
	
	@Child(name="paymentAdjustmentReason", type=CodingDt.class, order=18, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Reason for the payment adjustment."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-adjustment-reason")
	private CodingDt myPaymentAdjustmentReason;
	
	@Child(name="paymentDate", type=DateDt.class, order=19, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Estimated payment data"
	)
	private DateDt myPaymentDate;
	
	@Child(name="paymentAmount", type=MoneyDt.class, order=20, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Payable less any payment adjustment."
	)
	private MoneyDt myPaymentAmount;
	
	@Child(name="paymentRef", type=IdentifierDt.class, order=21, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Payment identifier"
	)
	private IdentifierDt myPaymentRef;
	
	@Child(name="reserved", type=CodingDt.class, order=22, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Status of funds reservation (For provider, for Patient, None)."
	)
	private CodingDt myReserved;
	
	@Child(name="form", type=CodingDt.class, order=23, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The form to be used for printing the content."
	)
	private CodingDt myForm;
	
	@Child(name="note", order=24, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Note text"
	)
	private java.util.List<Note> myNote;
	
	@Child(name="coverage", order=25, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Financial instrument by which payment information for health care"
	)
	private java.util.List<Coverage> myCoverage;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myRequest,  myRuleset,  myOriginalRuleset,  myCreated,  myOrganization,  myRequestProvider,  myRequestOrganization,  myOutcome,  myDisposition,  myPayeeType,  myItem,  myAddItem,  myError,  myTotalCost,  myUnallocDeductable,  myTotalBenefit,  myPaymentAdjustment,  myPaymentAdjustmentReason,  myPaymentDate,  myPaymentAmount,  myPaymentRef,  myReserved,  myForm,  myNote,  myCoverage);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myRequest, myRuleset, myOriginalRuleset, myCreated, myOrganization, myRequestProvider, myRequestOrganization, myOutcome, myDisposition, myPayeeType, myItem, myAddItem, myError, myTotalCost, myUnallocDeductable, myTotalBenefit, myPaymentAdjustment, myPaymentAdjustmentReason, myPaymentDate, myPaymentAmount, myPaymentRef, myReserved, myForm, myNote, myCoverage);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Response business identifier
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
     * The Response business identifier
     * </p> 
	 */
	public ClaimResponse setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Response business identifier
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
	 * The Response business identifier
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public ClaimResponse addIdentifier(IdentifierDt theValue) {
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
     * The Response business identifier
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>request</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Original request resource referrence
     * </p> 
	 */
	public ResourceReferenceDt getRequest() {  
		if (myRequest == null) {
			myRequest = new ResourceReferenceDt();
		}
		return myRequest;
	}

	/**
	 * Sets the value(s) for <b>request</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Original request resource referrence
     * </p> 
	 */
	public ClaimResponse setRequest(ResourceReferenceDt theValue) {
		myRequest = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>ruleset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     * </p> 
	 */
	public CodingDt getRuleset() {  
		if (myRuleset == null) {
			myRuleset = new CodingDt();
		}
		return myRuleset;
	}

	/**
	 * Sets the value(s) for <b>ruleset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     * </p> 
	 */
	public ClaimResponse setRuleset(CodingDt theValue) {
		myRuleset = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>originalRuleset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The style (standard) and version of the original material which was converted into this resource.
     * </p> 
	 */
	public CodingDt getOriginalRuleset() {  
		if (myOriginalRuleset == null) {
			myOriginalRuleset = new CodingDt();
		}
		return myOriginalRuleset;
	}

	/**
	 * Sets the value(s) for <b>originalRuleset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The style (standard) and version of the original material which was converted into this resource.
     * </p> 
	 */
	public ClaimResponse setOriginalRuleset(CodingDt theValue) {
		myOriginalRuleset = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>created</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public DateTimeDt getCreatedElement() {  
		if (myCreated == null) {
			myCreated = new DateTimeDt();
		}
		return myCreated;
	}

	
	/**
	 * Gets the value(s) for <b>created</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public Date getCreated() {  
		return getCreatedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>created</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public ClaimResponse setCreated(DateTimeDt theValue) {
		myCreated = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>created</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public ClaimResponse setCreated( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myCreated = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>created</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public ClaimResponse setCreatedWithSecondsPrecision( Date theDate) {
		myCreated = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>organization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Insurer who produced this adjudicated response.
     * </p> 
	 */
	public ResourceReferenceDt getOrganization() {  
		if (myOrganization == null) {
			myOrganization = new ResourceReferenceDt();
		}
		return myOrganization;
	}

	/**
	 * Sets the value(s) for <b>organization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Insurer who produced this adjudicated response.
     * </p> 
	 */
	public ClaimResponse setOrganization(ResourceReferenceDt theValue) {
		myOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>requestProvider</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner who is responsible for the services rendered to the patient.
     * </p> 
	 */
	public ResourceReferenceDt getRequestProvider() {  
		if (myRequestProvider == null) {
			myRequestProvider = new ResourceReferenceDt();
		}
		return myRequestProvider;
	}

	/**
	 * Sets the value(s) for <b>requestProvider</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner who is responsible for the services rendered to the patient.
     * </p> 
	 */
	public ClaimResponse setRequestProvider(ResourceReferenceDt theValue) {
		myRequestProvider = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>requestOrganization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The organization which is responsible for the services rendered to the patient.
     * </p> 
	 */
	public ResourceReferenceDt getRequestOrganization() {  
		if (myRequestOrganization == null) {
			myRequestOrganization = new ResourceReferenceDt();
		}
		return myRequestOrganization;
	}

	/**
	 * Sets the value(s) for <b>requestOrganization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The organization which is responsible for the services rendered to the patient.
     * </p> 
	 */
	public ClaimResponse setRequestOrganization(ResourceReferenceDt theValue) {
		myRequestOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>outcome</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Transaction status: error, complete
     * </p> 
	 */
	public BoundCodeDt<RemittanceOutcomeEnum> getOutcomeElement() {  
		if (myOutcome == null) {
			myOutcome = new BoundCodeDt<RemittanceOutcomeEnum>(RemittanceOutcomeEnum.VALUESET_BINDER);
		}
		return myOutcome;
	}

	
	/**
	 * Gets the value(s) for <b>outcome</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Transaction status: error, complete
     * </p> 
	 */
	public String getOutcome() {  
		return getOutcomeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>outcome</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Transaction status: error, complete
     * </p> 
	 */
	public ClaimResponse setOutcome(BoundCodeDt<RemittanceOutcomeEnum> theValue) {
		myOutcome = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>outcome</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Transaction status: error, complete
     * </p> 
	 */
	public ClaimResponse setOutcome(RemittanceOutcomeEnum theValue) {
		setOutcome(new BoundCodeDt<RemittanceOutcomeEnum>(RemittanceOutcomeEnum.VALUESET_BINDER, theValue));
		
/*
		getOutcomeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>disposition</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the status of the adjudication.
     * </p> 
	 */
	public StringDt getDispositionElement() {  
		if (myDisposition == null) {
			myDisposition = new StringDt();
		}
		return myDisposition;
	}

	
	/**
	 * Gets the value(s) for <b>disposition</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the status of the adjudication.
     * </p> 
	 */
	public String getDisposition() {  
		return getDispositionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>disposition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the status of the adjudication.
     * </p> 
	 */
	public ClaimResponse setDisposition(StringDt theValue) {
		myDisposition = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>disposition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the status of the adjudication.
     * </p> 
	 */
	public ClaimResponse setDisposition( String theString) {
		myDisposition = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>payeeType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Party to be reimbursed: Subscriber, provider, other.
     * </p> 
	 */
	public CodingDt getPayeeType() {  
		if (myPayeeType == null) {
			myPayeeType = new CodingDt();
		}
		return myPayeeType;
	}

	/**
	 * Sets the value(s) for <b>payeeType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Party to be reimbursed: Subscriber, provider, other.
     * </p> 
	 */
	public ClaimResponse setPayeeType(CodingDt theValue) {
		myPayeeType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>item</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for submitted services.
     * </p> 
	 */
	public java.util.List<Item> getItem() {  
		if (myItem == null) {
			myItem = new java.util.ArrayList<Item>();
		}
		return myItem;
	}

	/**
	 * Sets the value(s) for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for submitted services.
     * </p> 
	 */
	public ClaimResponse setItem(java.util.List<Item> theValue) {
		myItem = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for submitted services.
     * </p> 
	 */
	public Item addItem() {
		Item newType = new Item();
		getItem().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>item</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The first tier service adjudications for submitted services.
	 * </p>
	 * @param theValue The item to add (must not be <code>null</code>)
	 */
	public ClaimResponse addItem(Item theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getItem().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>item</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for submitted services.
     * </p> 
	 */
	public Item getItemFirstRep() {
		if (getItem().isEmpty()) {
			return addItem();
		}
		return getItem().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>addItem</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for payor added services.
     * </p> 
	 */
	public java.util.List<AddItem> getAddItem() {  
		if (myAddItem == null) {
			myAddItem = new java.util.ArrayList<AddItem>();
		}
		return myAddItem;
	}

	/**
	 * Sets the value(s) for <b>addItem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for payor added services.
     * </p> 
	 */
	public ClaimResponse setAddItem(java.util.List<AddItem> theValue) {
		myAddItem = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>addItem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for payor added services.
     * </p> 
	 */
	public AddItem addAddItem() {
		AddItem newType = new AddItem();
		getAddItem().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>addItem</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The first tier service adjudications for payor added services.
	 * </p>
	 * @param theValue The addItem to add (must not be <code>null</code>)
	 */
	public ClaimResponse addAddItem(AddItem theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAddItem().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>addItem</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for payor added services.
     * </p> 
	 */
	public AddItem getAddItemFirstRep() {
		if (getAddItem().isEmpty()) {
			return addAddItem();
		}
		return getAddItem().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>error</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Mutually exclusive with Services Provided (Item).
     * </p> 
	 */
	public java.util.List<Error> getError() {  
		if (myError == null) {
			myError = new java.util.ArrayList<Error>();
		}
		return myError;
	}

	/**
	 * Sets the value(s) for <b>error</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Mutually exclusive with Services Provided (Item).
     * </p> 
	 */
	public ClaimResponse setError(java.util.List<Error> theValue) {
		myError = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>error</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Mutually exclusive with Services Provided (Item).
     * </p> 
	 */
	public Error addError() {
		Error newType = new Error();
		getError().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>error</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Mutually exclusive with Services Provided (Item).
	 * </p>
	 * @param theValue The error to add (must not be <code>null</code>)
	 */
	public ClaimResponse addError(Error theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getError().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>error</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Mutually exclusive with Services Provided (Item).
     * </p> 
	 */
	public Error getErrorFirstRep() {
		if (getError().isEmpty()) {
			return addError();
		}
		return getError().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>totalCost</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The total cost of the services reported.
     * </p> 
	 */
	public MoneyDt getTotalCost() {  
		if (myTotalCost == null) {
			myTotalCost = new MoneyDt();
		}
		return myTotalCost;
	}

	/**
	 * Sets the value(s) for <b>totalCost</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The total cost of the services reported.
     * </p> 
	 */
	public ClaimResponse setTotalCost(MoneyDt theValue) {
		myTotalCost = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>unallocDeductable</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of deductible applied which was not allocated to any particular service line.
     * </p> 
	 */
	public MoneyDt getUnallocDeductable() {  
		if (myUnallocDeductable == null) {
			myUnallocDeductable = new MoneyDt();
		}
		return myUnallocDeductable;
	}

	/**
	 * Sets the value(s) for <b>unallocDeductable</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of deductible applied which was not allocated to any particular service line.
     * </p> 
	 */
	public ClaimResponse setUnallocDeductable(MoneyDt theValue) {
		myUnallocDeductable = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>totalBenefit</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible)
     * </p> 
	 */
	public MoneyDt getTotalBenefit() {  
		if (myTotalBenefit == null) {
			myTotalBenefit = new MoneyDt();
		}
		return myTotalBenefit;
	}

	/**
	 * Sets the value(s) for <b>totalBenefit</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible)
     * </p> 
	 */
	public ClaimResponse setTotalBenefit(MoneyDt theValue) {
		myTotalBenefit = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>paymentAdjustment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Adjustment to the payment of this transaction which is not related to adjudication of this transaction.
     * </p> 
	 */
	public MoneyDt getPaymentAdjustment() {  
		if (myPaymentAdjustment == null) {
			myPaymentAdjustment = new MoneyDt();
		}
		return myPaymentAdjustment;
	}

	/**
	 * Sets the value(s) for <b>paymentAdjustment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Adjustment to the payment of this transaction which is not related to adjudication of this transaction.
     * </p> 
	 */
	public ClaimResponse setPaymentAdjustment(MoneyDt theValue) {
		myPaymentAdjustment = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>paymentAdjustmentReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason for the payment adjustment.
     * </p> 
	 */
	public CodingDt getPaymentAdjustmentReason() {  
		if (myPaymentAdjustmentReason == null) {
			myPaymentAdjustmentReason = new CodingDt();
		}
		return myPaymentAdjustmentReason;
	}

	/**
	 * Sets the value(s) for <b>paymentAdjustmentReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reason for the payment adjustment.
     * </p> 
	 */
	public ClaimResponse setPaymentAdjustmentReason(CodingDt theValue) {
		myPaymentAdjustmentReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>paymentDate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Estimated payment data
     * </p> 
	 */
	public DateDt getPaymentDateElement() {  
		if (myPaymentDate == null) {
			myPaymentDate = new DateDt();
		}
		return myPaymentDate;
	}

	
	/**
	 * Gets the value(s) for <b>paymentDate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Estimated payment data
     * </p> 
	 */
	public Date getPaymentDate() {  
		return getPaymentDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>paymentDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Estimated payment data
     * </p> 
	 */
	public ClaimResponse setPaymentDate(DateDt theValue) {
		myPaymentDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>paymentDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Estimated payment data
     * </p> 
	 */
	public ClaimResponse setPaymentDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myPaymentDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>paymentDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Estimated payment data
     * </p> 
	 */
	public ClaimResponse setPaymentDateWithDayPrecision( Date theDate) {
		myPaymentDate = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>paymentAmount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Payable less any payment adjustment.
     * </p> 
	 */
	public MoneyDt getPaymentAmount() {  
		if (myPaymentAmount == null) {
			myPaymentAmount = new MoneyDt();
		}
		return myPaymentAmount;
	}

	/**
	 * Sets the value(s) for <b>paymentAmount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Payable less any payment adjustment.
     * </p> 
	 */
	public ClaimResponse setPaymentAmount(MoneyDt theValue) {
		myPaymentAmount = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>paymentRef</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Payment identifier
     * </p> 
	 */
	public IdentifierDt getPaymentRef() {  
		if (myPaymentRef == null) {
			myPaymentRef = new IdentifierDt();
		}
		return myPaymentRef;
	}

	/**
	 * Sets the value(s) for <b>paymentRef</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Payment identifier
     * </p> 
	 */
	public ClaimResponse setPaymentRef(IdentifierDt theValue) {
		myPaymentRef = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reserved</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Status of funds reservation (For provider, for Patient, None).
     * </p> 
	 */
	public CodingDt getReserved() {  
		if (myReserved == null) {
			myReserved = new CodingDt();
		}
		return myReserved;
	}

	/**
	 * Sets the value(s) for <b>reserved</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Status of funds reservation (For provider, for Patient, None).
     * </p> 
	 */
	public ClaimResponse setReserved(CodingDt theValue) {
		myReserved = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>form</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The form to be used for printing the content.
     * </p> 
	 */
	public CodingDt getForm() {  
		if (myForm == null) {
			myForm = new CodingDt();
		}
		return myForm;
	}

	/**
	 * Sets the value(s) for <b>form</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The form to be used for printing the content.
     * </p> 
	 */
	public ClaimResponse setForm(CodingDt theValue) {
		myForm = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Note text
     * </p> 
	 */
	public java.util.List<Note> getNote() {  
		if (myNote == null) {
			myNote = new java.util.ArrayList<Note>();
		}
		return myNote;
	}

	/**
	 * Sets the value(s) for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Note text
     * </p> 
	 */
	public ClaimResponse setNote(java.util.List<Note> theValue) {
		myNote = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Note text
     * </p> 
	 */
	public Note addNote() {
		Note newType = new Note();
		getNote().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>note</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Note text
	 * </p>
	 * @param theValue The note to add (must not be <code>null</code>)
	 */
	public ClaimResponse addNote(Note theValue) {
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
     * Note text
     * </p> 
	 */
	public Note getNoteFirstRep() {
		if (getNote().isEmpty()) {
			return addNote();
		}
		return getNote().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>coverage</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	public java.util.List<Coverage> getCoverage() {  
		if (myCoverage == null) {
			myCoverage = new java.util.ArrayList<Coverage>();
		}
		return myCoverage;
	}

	/**
	 * Sets the value(s) for <b>coverage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	public ClaimResponse setCoverage(java.util.List<Coverage> theValue) {
		myCoverage = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>coverage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	public Coverage addCoverage() {
		Coverage newType = new Coverage();
		getCoverage().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>coverage</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Financial instrument by which payment information for health care
	 * </p>
	 * @param theValue The coverage to add (must not be <code>null</code>)
	 */
	public ClaimResponse addCoverage(Coverage theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCoverage().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>coverage</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	public Coverage getCoverageFirstRep() {
		if (getCoverage().isEmpty()) {
			return addCoverage();
		}
		return getCoverage().get(0); 
	}
  
	/**
	 * Block class for child element: <b>ClaimResponse.item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for submitted services.
     * </p> 
	 */
	@Block()	
	public static class Item 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequenceLinkId", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A service line number."
	)
	private PositiveIntDt mySequenceLinkId;
	
	@Child(name="noteNumber", type=PositiveIntDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of note references to the notes provided below."
	)
	private java.util.List<PositiveIntDt> myNoteNumber;
	
	@Child(name="adjudication", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The adjudications results."
	)
	private java.util.List<ItemAdjudication> myAdjudication;
	
	@Child(name="detail", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The second tier service adjudications for submitted services."
	)
	private java.util.List<ItemDetail> myDetail;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequenceLinkId,  myNoteNumber,  myAdjudication,  myDetail);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequenceLinkId, myNoteNumber, myAdjudication, myDetail);
	}

	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public PositiveIntDt getSequenceLinkIdElement() {  
		if (mySequenceLinkId == null) {
			mySequenceLinkId = new PositiveIntDt();
		}
		return mySequenceLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public Integer getSequenceLinkId() {  
		return getSequenceLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public Item setSequenceLinkId(PositiveIntDt theValue) {
		mySequenceLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public Item setSequenceLinkId( int theInteger) {
		mySequenceLinkId = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>noteNumber</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
	 */
	public java.util.List<PositiveIntDt> getNoteNumber() {  
		if (myNoteNumber == null) {
			myNoteNumber = new java.util.ArrayList<PositiveIntDt>();
		}
		return myNoteNumber;
	}

	/**
	 * Sets the value(s) for <b>noteNumber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
	 */
	public Item setNoteNumber(java.util.List<PositiveIntDt> theValue) {
		myNoteNumber = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>noteNumber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
	 */
	public PositiveIntDt addNoteNumber() {
		PositiveIntDt newType = new PositiveIntDt();
		getNoteNumber().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>noteNumber</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of note references to the notes provided below.
	 * </p>
	 * @param theValue The noteNumber to add (must not be <code>null</code>)
	 */
	public Item addNoteNumber(PositiveIntDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getNoteNumber().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>noteNumber</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
	 */
	public PositiveIntDt getNoteNumberFirstRep() {
		if (getNoteNumber().isEmpty()) {
			return addNoteNumber();
		}
		return getNoteNumber().get(0); 
	}
 	/**
	 * Adds a new value for <b>noteNumber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Item addNoteNumber( int theInteger) {
		if (myNoteNumber == null) {
			myNoteNumber = new java.util.ArrayList<PositiveIntDt>();
		}
		myNoteNumber.add(new PositiveIntDt(theInteger));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>adjudication</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public java.util.List<ItemAdjudication> getAdjudication() {  
		if (myAdjudication == null) {
			myAdjudication = new java.util.ArrayList<ItemAdjudication>();
		}
		return myAdjudication;
	}

	/**
	 * Sets the value(s) for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public Item setAdjudication(java.util.List<ItemAdjudication> theValue) {
		myAdjudication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public ItemAdjudication addAdjudication() {
		ItemAdjudication newType = new ItemAdjudication();
		getAdjudication().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>adjudication</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The adjudications results.
	 * </p>
	 * @param theValue The adjudication to add (must not be <code>null</code>)
	 */
	public Item addAdjudication(ItemAdjudication theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAdjudication().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>adjudication</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public ItemAdjudication getAdjudicationFirstRep() {
		if (getAdjudication().isEmpty()) {
			return addAdjudication();
		}
		return getAdjudication().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>detail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for submitted services.
     * </p> 
	 */
	public java.util.List<ItemDetail> getDetail() {  
		if (myDetail == null) {
			myDetail = new java.util.ArrayList<ItemDetail>();
		}
		return myDetail;
	}

	/**
	 * Sets the value(s) for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for submitted services.
     * </p> 
	 */
	public Item setDetail(java.util.List<ItemDetail> theValue) {
		myDetail = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for submitted services.
     * </p> 
	 */
	public ItemDetail addDetail() {
		ItemDetail newType = new ItemDetail();
		getDetail().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>detail</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The second tier service adjudications for submitted services.
	 * </p>
	 * @param theValue The detail to add (must not be <code>null</code>)
	 */
	public Item addDetail(ItemDetail theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDetail().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>detail</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for submitted services.
     * </p> 
	 */
	public ItemDetail getDetailFirstRep() {
		if (getDetail().isEmpty()) {
			return addDetail();
		}
		return getDetail().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ClaimResponse.item.adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	@Block()	
	public static class ItemAdjudication 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-adjudication")
	private CodingDt myCode;
	
	@Child(name="amount", type=MoneyDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Monetary amount associated with the code"
	)
	private MoneyDt myAmount;
	
	@Child(name="value", type=DecimalDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A non-monetary value for example a percentage. Mutually exclusive to the amount element above."
	)
	private DecimalDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myAmount,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myAmount, myValue);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public CodingDt getCode() {  
		if (myCode == null) {
			myCode = new CodingDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public ItemAdjudication setCode(CodingDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>amount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code
     * </p> 
	 */
	public MoneyDt getAmount() {  
		if (myAmount == null) {
			myAmount = new MoneyDt();
		}
		return myAmount;
	}

	/**
	 * Sets the value(s) for <b>amount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code
     * </p> 
	 */
	public ItemAdjudication setAmount(MoneyDt theValue) {
		myAmount = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public DecimalDt getValueElement() {  
		if (myValue == null) {
			myValue = new DecimalDt();
		}
		return myValue;
	}

	
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public BigDecimal getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemAdjudication setValue(DecimalDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemAdjudication setValue( long theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemAdjudication setValue( double theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemAdjudication setValue( java.math.BigDecimal theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>ClaimResponse.item.detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for submitted services.
     * </p> 
	 */
	@Block()	
	public static class ItemDetail 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequenceLinkId", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A service line number."
	)
	private PositiveIntDt mySequenceLinkId;
	
	@Child(name="adjudication", order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The adjudications results."
	)
	private java.util.List<ItemDetailAdjudication> myAdjudication;
	
	@Child(name="subDetail", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The third tier service adjudications for submitted services."
	)
	private java.util.List<ItemDetailSubDetail> mySubDetail;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequenceLinkId,  myAdjudication,  mySubDetail);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequenceLinkId, myAdjudication, mySubDetail);
	}

	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public PositiveIntDt getSequenceLinkIdElement() {  
		if (mySequenceLinkId == null) {
			mySequenceLinkId = new PositiveIntDt();
		}
		return mySequenceLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public Integer getSequenceLinkId() {  
		return getSequenceLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public ItemDetail setSequenceLinkId(PositiveIntDt theValue) {
		mySequenceLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public ItemDetail setSequenceLinkId( int theInteger) {
		mySequenceLinkId = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>adjudication</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public java.util.List<ItemDetailAdjudication> getAdjudication() {  
		if (myAdjudication == null) {
			myAdjudication = new java.util.ArrayList<ItemDetailAdjudication>();
		}
		return myAdjudication;
	}

	/**
	 * Sets the value(s) for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public ItemDetail setAdjudication(java.util.List<ItemDetailAdjudication> theValue) {
		myAdjudication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public ItemDetailAdjudication addAdjudication() {
		ItemDetailAdjudication newType = new ItemDetailAdjudication();
		getAdjudication().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>adjudication</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The adjudications results.
	 * </p>
	 * @param theValue The adjudication to add (must not be <code>null</code>)
	 */
	public ItemDetail addAdjudication(ItemDetailAdjudication theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAdjudication().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>adjudication</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public ItemDetailAdjudication getAdjudicationFirstRep() {
		if (getAdjudication().isEmpty()) {
			return addAdjudication();
		}
		return getAdjudication().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>subDetail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The third tier service adjudications for submitted services.
     * </p> 
	 */
	public java.util.List<ItemDetailSubDetail> getSubDetail() {  
		if (mySubDetail == null) {
			mySubDetail = new java.util.ArrayList<ItemDetailSubDetail>();
		}
		return mySubDetail;
	}

	/**
	 * Sets the value(s) for <b>subDetail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The third tier service adjudications for submitted services.
     * </p> 
	 */
	public ItemDetail setSubDetail(java.util.List<ItemDetailSubDetail> theValue) {
		mySubDetail = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>subDetail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The third tier service adjudications for submitted services.
     * </p> 
	 */
	public ItemDetailSubDetail addSubDetail() {
		ItemDetailSubDetail newType = new ItemDetailSubDetail();
		getSubDetail().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>subDetail</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The third tier service adjudications for submitted services.
	 * </p>
	 * @param theValue The subDetail to add (must not be <code>null</code>)
	 */
	public ItemDetail addSubDetail(ItemDetailSubDetail theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSubDetail().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>subDetail</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The third tier service adjudications for submitted services.
     * </p> 
	 */
	public ItemDetailSubDetail getSubDetailFirstRep() {
		if (getSubDetail().isEmpty()) {
			return addSubDetail();
		}
		return getSubDetail().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ClaimResponse.item.detail.adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	@Block()	
	public static class ItemDetailAdjudication 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-adjudication")
	private CodingDt myCode;
	
	@Child(name="amount", type=MoneyDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Monetary amount associated with the code."
	)
	private MoneyDt myAmount;
	
	@Child(name="value", type=DecimalDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A non-monetary value for example a percentage. Mutually exclusive to the amount element above."
	)
	private DecimalDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myAmount,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myAmount, myValue);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public CodingDt getCode() {  
		if (myCode == null) {
			myCode = new CodingDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public ItemDetailAdjudication setCode(CodingDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>amount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code.
     * </p> 
	 */
	public MoneyDt getAmount() {  
		if (myAmount == null) {
			myAmount = new MoneyDt();
		}
		return myAmount;
	}

	/**
	 * Sets the value(s) for <b>amount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code.
     * </p> 
	 */
	public ItemDetailAdjudication setAmount(MoneyDt theValue) {
		myAmount = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public DecimalDt getValueElement() {  
		if (myValue == null) {
			myValue = new DecimalDt();
		}
		return myValue;
	}

	
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public BigDecimal getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemDetailAdjudication setValue(DecimalDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemDetailAdjudication setValue( long theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemDetailAdjudication setValue( double theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemDetailAdjudication setValue( java.math.BigDecimal theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>ClaimResponse.item.detail.subDetail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The third tier service adjudications for submitted services.
     * </p> 
	 */
	@Block()	
	public static class ItemDetailSubDetail 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequenceLinkId", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A service line number."
	)
	private PositiveIntDt mySequenceLinkId;
	
	@Child(name="adjudication", order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The adjudications results."
	)
	private java.util.List<ItemDetailSubDetailAdjudication> myAdjudication;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequenceLinkId,  myAdjudication);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequenceLinkId, myAdjudication);
	}

	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public PositiveIntDt getSequenceLinkIdElement() {  
		if (mySequenceLinkId == null) {
			mySequenceLinkId = new PositiveIntDt();
		}
		return mySequenceLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public Integer getSequenceLinkId() {  
		return getSequenceLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public ItemDetailSubDetail setSequenceLinkId(PositiveIntDt theValue) {
		mySequenceLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public ItemDetailSubDetail setSequenceLinkId( int theInteger) {
		mySequenceLinkId = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>adjudication</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public java.util.List<ItemDetailSubDetailAdjudication> getAdjudication() {  
		if (myAdjudication == null) {
			myAdjudication = new java.util.ArrayList<ItemDetailSubDetailAdjudication>();
		}
		return myAdjudication;
	}

	/**
	 * Sets the value(s) for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public ItemDetailSubDetail setAdjudication(java.util.List<ItemDetailSubDetailAdjudication> theValue) {
		myAdjudication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public ItemDetailSubDetailAdjudication addAdjudication() {
		ItemDetailSubDetailAdjudication newType = new ItemDetailSubDetailAdjudication();
		getAdjudication().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>adjudication</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The adjudications results.
	 * </p>
	 * @param theValue The adjudication to add (must not be <code>null</code>)
	 */
	public ItemDetailSubDetail addAdjudication(ItemDetailSubDetailAdjudication theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAdjudication().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>adjudication</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public ItemDetailSubDetailAdjudication getAdjudicationFirstRep() {
		if (getAdjudication().isEmpty()) {
			return addAdjudication();
		}
		return getAdjudication().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ClaimResponse.item.detail.subDetail.adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	@Block()	
	public static class ItemDetailSubDetailAdjudication 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-adjudication")
	private CodingDt myCode;
	
	@Child(name="amount", type=MoneyDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Monetary amount associated with the code."
	)
	private MoneyDt myAmount;
	
	@Child(name="value", type=DecimalDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A non-monetary value for example a percentage. Mutually exclusive to the amount element above."
	)
	private DecimalDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myAmount,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myAmount, myValue);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public CodingDt getCode() {  
		if (myCode == null) {
			myCode = new CodingDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public ItemDetailSubDetailAdjudication setCode(CodingDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>amount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code.
     * </p> 
	 */
	public MoneyDt getAmount() {  
		if (myAmount == null) {
			myAmount = new MoneyDt();
		}
		return myAmount;
	}

	/**
	 * Sets the value(s) for <b>amount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code.
     * </p> 
	 */
	public ItemDetailSubDetailAdjudication setAmount(MoneyDt theValue) {
		myAmount = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public DecimalDt getValueElement() {  
		if (myValue == null) {
			myValue = new DecimalDt();
		}
		return myValue;
	}

	
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public BigDecimal getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemDetailSubDetailAdjudication setValue(DecimalDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemDetailSubDetailAdjudication setValue( long theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemDetailSubDetailAdjudication setValue( double theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public ItemDetailSubDetailAdjudication setValue( java.math.BigDecimal theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

 


	}





	/**
	 * Block class for child element: <b>ClaimResponse.addItem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The first tier service adjudications for payor added services.
     * </p> 
	 */
	@Block()	
	public static class AddItem 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequenceLinkId", type=PositiveIntDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of input service items which this service line is intended to replace."
	)
	private java.util.List<PositiveIntDt> mySequenceLinkId;
	
	@Child(name="service", type=CodingDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code to indicate the Professional Service or Product supplied."
	)
	private CodingDt myService;
	
	@Child(name="fee", type=MoneyDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The fee charged for the professional service or product.."
	)
	private MoneyDt myFee;
	
	@Child(name="noteNumberLinkId", type=PositiveIntDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of note references to the notes provided below."
	)
	private java.util.List<PositiveIntDt> myNoteNumberLinkId;
	
	@Child(name="adjudication", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The adjudications results."
	)
	private java.util.List<AddItemAdjudication> myAdjudication;
	
	@Child(name="detail", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The second tier service adjudications for payor added services."
	)
	private java.util.List<AddItemDetail> myDetail;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequenceLinkId,  myService,  myFee,  myNoteNumberLinkId,  myAdjudication,  myDetail);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequenceLinkId, myService, myFee, myNoteNumberLinkId, myAdjudication, myDetail);
	}

	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of input service items which this service line is intended to replace.
     * </p> 
	 */
	public java.util.List<PositiveIntDt> getSequenceLinkId() {  
		if (mySequenceLinkId == null) {
			mySequenceLinkId = new java.util.ArrayList<PositiveIntDt>();
		}
		return mySequenceLinkId;
	}

	/**
	 * Sets the value(s) for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of input service items which this service line is intended to replace.
     * </p> 
	 */
	public AddItem setSequenceLinkId(java.util.List<PositiveIntDt> theValue) {
		mySequenceLinkId = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of input service items which this service line is intended to replace.
     * </p> 
	 */
	public PositiveIntDt addSequenceLinkId() {
		PositiveIntDt newType = new PositiveIntDt();
		getSequenceLinkId().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>sequenceLinkId</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * List of input service items which this service line is intended to replace.
	 * </p>
	 * @param theValue The sequenceLinkId to add (must not be <code>null</code>)
	 */
	public AddItem addSequenceLinkId(PositiveIntDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSequenceLinkId().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>sequenceLinkId</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * List of input service items which this service line is intended to replace.
     * </p> 
	 */
	public PositiveIntDt getSequenceLinkIdFirstRep() {
		if (getSequenceLinkId().isEmpty()) {
			return addSequenceLinkId();
		}
		return getSequenceLinkId().get(0); 
	}
 	/**
	 * Adds a new value for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of input service items which this service line is intended to replace.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public AddItem addSequenceLinkId( int theInteger) {
		if (mySequenceLinkId == null) {
			mySequenceLinkId = new java.util.ArrayList<PositiveIntDt>();
		}
		mySequenceLinkId.add(new PositiveIntDt(theInteger));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>service</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code to indicate the Professional Service or Product supplied.
     * </p> 
	 */
	public CodingDt getService() {  
		if (myService == null) {
			myService = new CodingDt();
		}
		return myService;
	}

	/**
	 * Sets the value(s) for <b>service</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code to indicate the Professional Service or Product supplied.
     * </p> 
	 */
	public AddItem setService(CodingDt theValue) {
		myService = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>fee</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The fee charged for the professional service or product..
     * </p> 
	 */
	public MoneyDt getFee() {  
		if (myFee == null) {
			myFee = new MoneyDt();
		}
		return myFee;
	}

	/**
	 * Sets the value(s) for <b>fee</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The fee charged for the professional service or product..
     * </p> 
	 */
	public AddItem setFee(MoneyDt theValue) {
		myFee = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>noteNumberLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
	 */
	public java.util.List<PositiveIntDt> getNoteNumberLinkId() {  
		if (myNoteNumberLinkId == null) {
			myNoteNumberLinkId = new java.util.ArrayList<PositiveIntDt>();
		}
		return myNoteNumberLinkId;
	}

	/**
	 * Sets the value(s) for <b>noteNumberLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
	 */
	public AddItem setNoteNumberLinkId(java.util.List<PositiveIntDt> theValue) {
		myNoteNumberLinkId = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>noteNumberLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
	 */
	public PositiveIntDt addNoteNumberLinkId() {
		PositiveIntDt newType = new PositiveIntDt();
		getNoteNumberLinkId().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>noteNumberLinkId</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of note references to the notes provided below.
	 * </p>
	 * @param theValue The noteNumberLinkId to add (must not be <code>null</code>)
	 */
	public AddItem addNoteNumberLinkId(PositiveIntDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getNoteNumberLinkId().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>noteNumberLinkId</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
	 */
	public PositiveIntDt getNoteNumberLinkIdFirstRep() {
		if (getNoteNumberLinkId().isEmpty()) {
			return addNoteNumberLinkId();
		}
		return getNoteNumberLinkId().get(0); 
	}
 	/**
	 * Adds a new value for <b>noteNumberLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of note references to the notes provided below.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public AddItem addNoteNumberLinkId( int theInteger) {
		if (myNoteNumberLinkId == null) {
			myNoteNumberLinkId = new java.util.ArrayList<PositiveIntDt>();
		}
		myNoteNumberLinkId.add(new PositiveIntDt(theInteger));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>adjudication</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public java.util.List<AddItemAdjudication> getAdjudication() {  
		if (myAdjudication == null) {
			myAdjudication = new java.util.ArrayList<AddItemAdjudication>();
		}
		return myAdjudication;
	}

	/**
	 * Sets the value(s) for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public AddItem setAdjudication(java.util.List<AddItemAdjudication> theValue) {
		myAdjudication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public AddItemAdjudication addAdjudication() {
		AddItemAdjudication newType = new AddItemAdjudication();
		getAdjudication().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>adjudication</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The adjudications results.
	 * </p>
	 * @param theValue The adjudication to add (must not be <code>null</code>)
	 */
	public AddItem addAdjudication(AddItemAdjudication theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAdjudication().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>adjudication</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public AddItemAdjudication getAdjudicationFirstRep() {
		if (getAdjudication().isEmpty()) {
			return addAdjudication();
		}
		return getAdjudication().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>detail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for payor added services.
     * </p> 
	 */
	public java.util.List<AddItemDetail> getDetail() {  
		if (myDetail == null) {
			myDetail = new java.util.ArrayList<AddItemDetail>();
		}
		return myDetail;
	}

	/**
	 * Sets the value(s) for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for payor added services.
     * </p> 
	 */
	public AddItem setDetail(java.util.List<AddItemDetail> theValue) {
		myDetail = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for payor added services.
     * </p> 
	 */
	public AddItemDetail addDetail() {
		AddItemDetail newType = new AddItemDetail();
		getDetail().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>detail</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The second tier service adjudications for payor added services.
	 * </p>
	 * @param theValue The detail to add (must not be <code>null</code>)
	 */
	public AddItem addDetail(AddItemDetail theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDetail().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>detail</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for payor added services.
     * </p> 
	 */
	public AddItemDetail getDetailFirstRep() {
		if (getDetail().isEmpty()) {
			return addDetail();
		}
		return getDetail().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ClaimResponse.addItem.adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	@Block()	
	public static class AddItemAdjudication 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-adjudication")
	private CodingDt myCode;
	
	@Child(name="amount", type=MoneyDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Monetary amount associated with the code"
	)
	private MoneyDt myAmount;
	
	@Child(name="value", type=DecimalDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A non-monetary value for example a percentage. Mutually exclusive to the amount element above."
	)
	private DecimalDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myAmount,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myAmount, myValue);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public CodingDt getCode() {  
		if (myCode == null) {
			myCode = new CodingDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public AddItemAdjudication setCode(CodingDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>amount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code
     * </p> 
	 */
	public MoneyDt getAmount() {  
		if (myAmount == null) {
			myAmount = new MoneyDt();
		}
		return myAmount;
	}

	/**
	 * Sets the value(s) for <b>amount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code
     * </p> 
	 */
	public AddItemAdjudication setAmount(MoneyDt theValue) {
		myAmount = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public DecimalDt getValueElement() {  
		if (myValue == null) {
			myValue = new DecimalDt();
		}
		return myValue;
	}

	
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public BigDecimal getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public AddItemAdjudication setValue(DecimalDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public AddItemAdjudication setValue( long theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public AddItemAdjudication setValue( double theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public AddItemAdjudication setValue( java.math.BigDecimal theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>ClaimResponse.addItem.detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The second tier service adjudications for payor added services.
     * </p> 
	 */
	@Block()	
	public static class AddItemDetail 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="service", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code to indicate the Professional Service or Product supplied."
	)
	private CodingDt myService;
	
	@Child(name="fee", type=MoneyDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The fee charged for the professional service or product.."
	)
	private MoneyDt myFee;
	
	@Child(name="adjudication", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The adjudications results."
	)
	private java.util.List<AddItemDetailAdjudication> myAdjudication;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myService,  myFee,  myAdjudication);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myService, myFee, myAdjudication);
	}

	/**
	 * Gets the value(s) for <b>service</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code to indicate the Professional Service or Product supplied.
     * </p> 
	 */
	public CodingDt getService() {  
		if (myService == null) {
			myService = new CodingDt();
		}
		return myService;
	}

	/**
	 * Sets the value(s) for <b>service</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code to indicate the Professional Service or Product supplied.
     * </p> 
	 */
	public AddItemDetail setService(CodingDt theValue) {
		myService = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>fee</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The fee charged for the professional service or product..
     * </p> 
	 */
	public MoneyDt getFee() {  
		if (myFee == null) {
			myFee = new MoneyDt();
		}
		return myFee;
	}

	/**
	 * Sets the value(s) for <b>fee</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The fee charged for the professional service or product..
     * </p> 
	 */
	public AddItemDetail setFee(MoneyDt theValue) {
		myFee = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>adjudication</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public java.util.List<AddItemDetailAdjudication> getAdjudication() {  
		if (myAdjudication == null) {
			myAdjudication = new java.util.ArrayList<AddItemDetailAdjudication>();
		}
		return myAdjudication;
	}

	/**
	 * Sets the value(s) for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public AddItemDetail setAdjudication(java.util.List<AddItemDetailAdjudication> theValue) {
		myAdjudication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public AddItemDetailAdjudication addAdjudication() {
		AddItemDetailAdjudication newType = new AddItemDetailAdjudication();
		getAdjudication().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>adjudication</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The adjudications results.
	 * </p>
	 * @param theValue The adjudication to add (must not be <code>null</code>)
	 */
	public AddItemDetail addAdjudication(AddItemDetailAdjudication theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAdjudication().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>adjudication</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	public AddItemDetailAdjudication getAdjudicationFirstRep() {
		if (getAdjudication().isEmpty()) {
			return addAdjudication();
		}
		return getAdjudication().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ClaimResponse.addItem.detail.adjudication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The adjudications results.
     * </p> 
	 */
	@Block()	
	public static class AddItemDetailAdjudication 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-adjudication")
	private CodingDt myCode;
	
	@Child(name="amount", type=MoneyDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Monetary amount associated with the code"
	)
	private MoneyDt myAmount;
	
	@Child(name="value", type=DecimalDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A non-monetary value for example a percentage. Mutually exclusive to the amount element above."
	)
	private DecimalDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myAmount,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myAmount, myValue);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public CodingDt getCode() {  
		if (myCode == null) {
			myCode = new CodingDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     * </p> 
	 */
	public AddItemDetailAdjudication setCode(CodingDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>amount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code
     * </p> 
	 */
	public MoneyDt getAmount() {  
		if (myAmount == null) {
			myAmount = new MoneyDt();
		}
		return myAmount;
	}

	/**
	 * Sets the value(s) for <b>amount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Monetary amount associated with the code
     * </p> 
	 */
	public AddItemDetailAdjudication setAmount(MoneyDt theValue) {
		myAmount = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public DecimalDt getValueElement() {  
		if (myValue == null) {
			myValue = new DecimalDt();
		}
		return myValue;
	}

	
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public BigDecimal getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public AddItemDetailAdjudication setValue(DecimalDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public AddItemDetailAdjudication setValue( long theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public AddItemDetailAdjudication setValue( double theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
     * </p> 
	 */
	public AddItemDetailAdjudication setValue( java.math.BigDecimal theValue) {
		myValue = new DecimalDt(theValue); 
		return this; 
	}

 


	}




	/**
	 * Block class for child element: <b>ClaimResponse.error</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Mutually exclusive with Services Provided (Item).
     * </p> 
	 */
	@Block()	
	public static class Error 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequenceLinkId", type=PositiveIntDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere."
	)
	private PositiveIntDt mySequenceLinkId;
	
	@Child(name="detailSequenceLinkId", type=PositiveIntDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition."
	)
	private PositiveIntDt myDetailSequenceLinkId;
	
	@Child(name="subdetailSequenceLinkId", type=PositiveIntDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition."
	)
	private PositiveIntDt mySubdetailSequenceLinkId;
	
	@Child(name="code", type=CodingDt.class, order=3, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An error code,froma specified code system, which details why the claim could not be adjudicated."
	)
	private CodingDt myCode;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequenceLinkId,  myDetailSequenceLinkId,  mySubdetailSequenceLinkId,  myCode);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequenceLinkId, myDetailSequenceLinkId, mySubdetailSequenceLinkId, myCode);
	}

	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
     * </p> 
	 */
	public PositiveIntDt getSequenceLinkIdElement() {  
		if (mySequenceLinkId == null) {
			mySequenceLinkId = new PositiveIntDt();
		}
		return mySequenceLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>sequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
     * </p> 
	 */
	public Integer getSequenceLinkId() {  
		return getSequenceLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
     * </p> 
	 */
	public Error setSequenceLinkId(PositiveIntDt theValue) {
		mySequenceLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
     * </p> 
	 */
	public Error setSequenceLinkId( int theInteger) {
		mySequenceLinkId = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>detailSequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     * </p> 
	 */
	public PositiveIntDt getDetailSequenceLinkIdElement() {  
		if (myDetailSequenceLinkId == null) {
			myDetailSequenceLinkId = new PositiveIntDt();
		}
		return myDetailSequenceLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>detailSequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     * </p> 
	 */
	public Integer getDetailSequenceLinkId() {  
		return getDetailSequenceLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>detailSequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     * </p> 
	 */
	public Error setDetailSequenceLinkId(PositiveIntDt theValue) {
		myDetailSequenceLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>detailSequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     * </p> 
	 */
	public Error setDetailSequenceLinkId( int theInteger) {
		myDetailSequenceLinkId = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>subdetailSequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     * </p> 
	 */
	public PositiveIntDt getSubdetailSequenceLinkIdElement() {  
		if (mySubdetailSequenceLinkId == null) {
			mySubdetailSequenceLinkId = new PositiveIntDt();
		}
		return mySubdetailSequenceLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>subdetailSequenceLinkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     * </p> 
	 */
	public Integer getSubdetailSequenceLinkId() {  
		return getSubdetailSequenceLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>subdetailSequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     * </p> 
	 */
	public Error setSubdetailSequenceLinkId(PositiveIntDt theValue) {
		mySubdetailSequenceLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>subdetailSequenceLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
     * </p> 
	 */
	public Error setSubdetailSequenceLinkId( int theInteger) {
		mySubdetailSequenceLinkId = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An error code,froma specified code system, which details why the claim could not be adjudicated.
     * </p> 
	 */
	public CodingDt getCode() {  
		if (myCode == null) {
			myCode = new CodingDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An error code,froma specified code system, which details why the claim could not be adjudicated.
     * </p> 
	 */
	public Error setCode(CodingDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>ClaimResponse.note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Note text
     * </p> 
	 */
	@Block()	
	public static class Note 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="number", type=PositiveIntDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An integer associated with each note which may be referred to from each service line item."
	)
	private PositiveIntDt myNumber;
	
	@Child(name="type", type=CodingDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The note purpose: Print/Display."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/note-type")
	private CodingDt myType;
	
	@Child(name="text", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The note text."
	)
	private StringDt myText;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myNumber,  myType,  myText);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myNumber, myType, myText);
	}

	/**
	 * Gets the value(s) for <b>number</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An integer associated with each note which may be referred to from each service line item.
     * </p> 
	 */
	public PositiveIntDt getNumberElement() {  
		if (myNumber == null) {
			myNumber = new PositiveIntDt();
		}
		return myNumber;
	}

	
	/**
	 * Gets the value(s) for <b>number</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An integer associated with each note which may be referred to from each service line item.
     * </p> 
	 */
	public Integer getNumber() {  
		return getNumberElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>number</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An integer associated with each note which may be referred to from each service line item.
     * </p> 
	 */
	public Note setNumber(PositiveIntDt theValue) {
		myNumber = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>number</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An integer associated with each note which may be referred to from each service line item.
     * </p> 
	 */
	public Note setNumber( int theInteger) {
		myNumber = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The note purpose: Print/Display.
     * </p> 
	 */
	public CodingDt getType() {  
		if (myType == null) {
			myType = new CodingDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The note purpose: Print/Display.
     * </p> 
	 */
	public Note setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The note text.
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
     * The note text.
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
     * The note text.
     * </p> 
	 */
	public Note setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The note text.
     * </p> 
	 */
	public Note setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>ClaimResponse.coverage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	@Block()	
	public static class Coverage 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequence", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A service line item."
	)
	private PositiveIntDt mySequence;
	
	@Child(name="focal", type=BooleanDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated."
	)
	private BooleanDt myFocal;
	
	@Child(name="coverage", order=2, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Coverage.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference to the program or plan identification, underwriter or payor."
	)
	private ResourceReferenceDt myCoverage;
	
	@Child(name="businessArrangement", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The contract number of a business agreement which describes the terms and conditions."
	)
	private StringDt myBusinessArrangement;
	
	@Child(name="relationship", type=CodingDt.class, order=4, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The relationship of the patient to the subscriber"
	)
	private CodingDt myRelationship;
	
	@Child(name="preAuthRef", type=StringDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of references from the Insurer to which these services pertain."
	)
	private java.util.List<StringDt> myPreAuthRef;
	
	@Child(name="claimResponse", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ClaimResponse.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The Coverages adjudication details."
	)
	private ResourceReferenceDt myClaimResponse;
	
	@Child(name="originalRuleset", type=CodingDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The style (standard) and version of the original material which was converted into this resource."
	)
	private CodingDt myOriginalRuleset;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequence,  myFocal,  myCoverage,  myBusinessArrangement,  myRelationship,  myPreAuthRef,  myClaimResponse,  myOriginalRuleset);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequence, myFocal, myCoverage, myBusinessArrangement, myRelationship, myPreAuthRef, myClaimResponse, myOriginalRuleset);
	}

	/**
	 * Gets the value(s) for <b>sequence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line item.
     * </p> 
	 */
	public PositiveIntDt getSequenceElement() {  
		if (mySequence == null) {
			mySequence = new PositiveIntDt();
		}
		return mySequence;
	}

	
	/**
	 * Gets the value(s) for <b>sequence</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line item.
     * </p> 
	 */
	public Integer getSequence() {  
		return getSequenceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line item.
     * </p> 
	 */
	public Coverage setSequence(PositiveIntDt theValue) {
		mySequence = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line item.
     * </p> 
	 */
	public Coverage setSequence( int theInteger) {
		mySequence = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>focal</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     * </p> 
	 */
	public BooleanDt getFocalElement() {  
		if (myFocal == null) {
			myFocal = new BooleanDt();
		}
		return myFocal;
	}

	
	/**
	 * Gets the value(s) for <b>focal</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     * </p> 
	 */
	public Boolean getFocal() {  
		return getFocalElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>focal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     * </p> 
	 */
	public Coverage setFocal(BooleanDt theValue) {
		myFocal = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>focal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     * </p> 
	 */
	public Coverage setFocal( boolean theBoolean) {
		myFocal = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>coverage</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the program or plan identification, underwriter or payor.
     * </p> 
	 */
	public ResourceReferenceDt getCoverage() {  
		if (myCoverage == null) {
			myCoverage = new ResourceReferenceDt();
		}
		return myCoverage;
	}

	/**
	 * Sets the value(s) for <b>coverage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the program or plan identification, underwriter or payor.
     * </p> 
	 */
	public Coverage setCoverage(ResourceReferenceDt theValue) {
		myCoverage = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>businessArrangement</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The contract number of a business agreement which describes the terms and conditions.
     * </p> 
	 */
	public StringDt getBusinessArrangementElement() {  
		if (myBusinessArrangement == null) {
			myBusinessArrangement = new StringDt();
		}
		return myBusinessArrangement;
	}

	
	/**
	 * Gets the value(s) for <b>businessArrangement</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The contract number of a business agreement which describes the terms and conditions.
     * </p> 
	 */
	public String getBusinessArrangement() {  
		return getBusinessArrangementElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>businessArrangement</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The contract number of a business agreement which describes the terms and conditions.
     * </p> 
	 */
	public Coverage setBusinessArrangement(StringDt theValue) {
		myBusinessArrangement = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>businessArrangement</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The contract number of a business agreement which describes the terms and conditions.
     * </p> 
	 */
	public Coverage setBusinessArrangement( String theString) {
		myBusinessArrangement = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>relationship</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The relationship of the patient to the subscriber
     * </p> 
	 */
	public CodingDt getRelationship() {  
		if (myRelationship == null) {
			myRelationship = new CodingDt();
		}
		return myRelationship;
	}

	/**
	 * Sets the value(s) for <b>relationship</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The relationship of the patient to the subscriber
     * </p> 
	 */
	public Coverage setRelationship(CodingDt theValue) {
		myRelationship = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>preAuthRef</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
	 */
	public java.util.List<StringDt> getPreAuthRef() {  
		if (myPreAuthRef == null) {
			myPreAuthRef = new java.util.ArrayList<StringDt>();
		}
		return myPreAuthRef;
	}

	/**
	 * Sets the value(s) for <b>preAuthRef</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
	 */
	public Coverage setPreAuthRef(java.util.List<StringDt> theValue) {
		myPreAuthRef = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>preAuthRef</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
	 */
	public StringDt addPreAuthRef() {
		StringDt newType = new StringDt();
		getPreAuthRef().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>preAuthRef</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of references from the Insurer to which these services pertain.
	 * </p>
	 * @param theValue The preAuthRef to add (must not be <code>null</code>)
	 */
	public Coverage addPreAuthRef(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPreAuthRef().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>preAuthRef</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
	 */
	public StringDt getPreAuthRefFirstRep() {
		if (getPreAuthRef().isEmpty()) {
			return addPreAuthRef();
		}
		return getPreAuthRef().get(0); 
	}
 	/**
	 * Adds a new value for <b>preAuthRef</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Coverage addPreAuthRef( String theString) {
		if (myPreAuthRef == null) {
			myPreAuthRef = new java.util.ArrayList<StringDt>();
		}
		myPreAuthRef.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>claimResponse</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Coverages adjudication details.
     * </p> 
	 */
	public ResourceReferenceDt getClaimResponse() {  
		if (myClaimResponse == null) {
			myClaimResponse = new ResourceReferenceDt();
		}
		return myClaimResponse;
	}

	/**
	 * Sets the value(s) for <b>claimResponse</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Coverages adjudication details.
     * </p> 
	 */
	public Coverage setClaimResponse(ResourceReferenceDt theValue) {
		myClaimResponse = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>originalRuleset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The style (standard) and version of the original material which was converted into this resource.
     * </p> 
	 */
	public CodingDt getOriginalRuleset() {  
		if (myOriginalRuleset == null) {
			myOriginalRuleset = new CodingDt();
		}
		return myOriginalRuleset;
	}

	/**
	 * Sets the value(s) for <b>originalRuleset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The style (standard) and version of the original material which was converted into this resource.
     * </p> 
	 */
	public Coverage setOriginalRuleset(CodingDt theValue) {
		myOriginalRuleset = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "ClaimResponse";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
