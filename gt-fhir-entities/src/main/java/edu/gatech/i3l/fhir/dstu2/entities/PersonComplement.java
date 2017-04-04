package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.ContactPointSystemEnum;
import ca.uhn.fhir.model.dstu2.valueset.ContactPointUseEnum;
import ca.uhn.fhir.model.dstu2.valueset.MaritalStatusCodesEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

/** 
 * This class adds some properties to the Omop data model Person, in order to provide
 * all the data specified for FHIR.
 * @author Ismael Sarmento
 */
@Entity
@Table(name="f_person")
@PrimaryKeyJoinColumn(name="person_id")
@Audited
public class PersonComplement extends Person{

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(PersonComplement.class);
	
	@Column(name="family_name")
	private String familyName;
	
	@Column(name="given1_name")
	private String givenName1;
	
	@Column(name="given2_name")
	private String givenName2;
	
	@Column(name="prefix_name")
	private String prefixName;
	
	@Column(name="suffix_name")
	private String suffixName;
	
	@Column(name="preferred_language")
	private String preferredLanguage;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="maritalstatus")
	private String maritalStatus;
	
	@Column(name="active")
	private Short active;
	
	@Column(name="contact_point1")
	String contactPoint1;
	
	@Column(name="contact_point2")
	String contactPoint2;
	
	@Column(name="contact_point3")
	String contactPoint3;
	
	public PersonComplement() {
		super();
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenName1() {
		return givenName1;
	}

	public void setGivenName1(String givenName1) {
		this.givenName1 = givenName1;
	}

	public String getGivenName2() {
		return givenName2;
	}

	public void setGivenName2(String givenName2) {
		this.givenName2 = givenName2;
	}

	public String getPrefixName() {
		return prefixName;
	}

	public void setPrefixName(String prefixName) {
		this.prefixName = prefixName;
	}

	public String getSuffixName() {
		return suffixName;
	}

	public void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	public Short getActive() {
		return active;
	}
	
	public void setActive(Short active) {
		this.active = active;
	}
	
	public String getContactPoint1() {
		return contactPoint1;
	}
	
	public void setContactPoint1(String contactPoint1) {
		this.contactPoint1 = contactPoint1;
	}
	
	public String getContactPoint2() {
		return contactPoint2;
	}
	
	public void setContactPoint2(String contactPoint2) {
		this.contactPoint2 = contactPoint2;
	}
	
	public String getContactPoint3() {
		return contactPoint3;
	}
	
	public void setContactPoint3(String contactPoint3) {
		this.contactPoint3 = contactPoint3;
	}

	@Override
	public Patient getRelatedResource() {
		Patient patient = (Patient) super.getRelatedResource();
		patient.addName().addFamily(this.familyName).addGiven(this.givenName1);
		if(this.givenName2 != null)
			patient.getName().get(0).addGiven(this.givenName2);
//		short active = this.active != null ? this.active : 0;
		if (this.active == null || this.active == 0)
			patient.setActive(false);
		else
			patient.setActive(true);

		if (this.maritalStatus != null && !this.maritalStatus.isEmpty()) {
			patient.setMaritalStatus(MaritalStatusCodesEnum.valueOf(this.maritalStatus.toUpperCase()));
		}
		
		List<ContactPointDt> contactPoints = new ArrayList<ContactPointDt>();
		if (this.contactPoint1 != null && !this.contactPoint1.isEmpty()) {
			String[] contactInfo = this.contactPoint1.split(":");
			if (contactInfo.length == 3) {
				ContactPointDt contactPoint = new ContactPointDt();
				contactPoint.setSystem(ContactPointSystemEnum.valueOf(contactInfo[0].toUpperCase()));
				contactPoint.setUse(ContactPointUseEnum.valueOf(contactInfo[1].toUpperCase()));
				contactPoint.setValue(contactInfo[2]);
				contactPoints.add(contactPoint);
			}
		}
		if (this.contactPoint2 != null && !this.contactPoint2.isEmpty()) {
			String[] contactInfo = this.contactPoint2.split(":");
			if (contactInfo.length == 3) {
				ContactPointDt contactPoint = new ContactPointDt();
				contactPoint.setSystem(ContactPointSystemEnum.valueOf(contactInfo[0].toUpperCase()));
				contactPoint.setUse(ContactPointUseEnum.valueOf(contactInfo[1].toUpperCase()));
				contactPoint.setValue(contactInfo[2]);
				contactPoints.add(contactPoint);
			}
		}
		if (this.contactPoint3 != null && !this.contactPoint3.isEmpty()) {
			String[] contactInfo = this.contactPoint3.split(":");
			if (contactInfo.length == 3) {
				ContactPointDt contactPoint = new ContactPointDt();
				contactPoint.setSystem(ContactPointSystemEnum.valueOf(contactInfo[0].toUpperCase()));
				contactPoint.setUse(ContactPointUseEnum.valueOf(contactInfo[1].toUpperCase()));
				contactPoint.setValue(contactInfo[2]);
				contactPoints.add(contactPoint);
			}
		}
		
		patient.setTelecom(contactPoints);
		
//MARITAL STATUS
//		MaritalStatusCodesEnum[] values = MaritalStatusCodesEnum.values();
//		for (int i = 0; i < values.length; i++) {
//			if(values[i].equals(this.maritalStatus.getName())){
//				patient.setMaritalStatus(values[i]);
//				break;
//			}
//		}
//		or patient.setMaritalStatus(MaritalStatusCodesEnum.valueOf(""));
		return patient;
	}
	
	/**
	 * @notice In Fhir model, {@link Patient} has a collection of names, while in this extension table, {@link PersonComplement},
	 * there is only one name for each {@link Person}.
	 */
	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		super.constructEntityFromResource(resource);
		
		if(resource instanceof Patient){
			Patient patient = (Patient)resource;
			
			Iterator<HumanNameDt> iterator = patient.getName().iterator();
			//while(iterator.hasNext()){
			if(iterator.hasNext()){
				HumanNameDt next = iterator.next();
				this.givenName1 = next.getGiven().get(0).getValue();//the next method was not advancing to the next element, then the need to use the get(index) method
				if(next.getGiven().size() > 1) //TODO add unit tests, to assure this won't be changed to hasNext
					this.givenName2 = next.getGiven().get(1).getValue();
				Iterator<StringDt> family = next.getFamily().iterator();
				this.familyName = "";
				while(family.hasNext()){
					if (this.familyName == "") {
						this.familyName = this.familyName.concat(family.next().getValue());
					} else {
						this.familyName = this.familyName.concat(" "+family.next().getValue());						
					}
				}
				if(next.getSuffix().iterator().hasNext())
					this.suffixName = next.getSuffix().iterator().next().getValue();
				if(next.getPrefix().iterator().hasNext())
					this.prefixName = next.getPrefix().iterator().next().getValue();
			}
			//}
			
			IdDt myID = patient.getId();
			if (myID != null && myID.getIdPartAsLong() != null && myID.getIdPart() != null) {
				PersonComplement person = (PersonComplement) OmopConceptMapping.getInstance().loadEntityById(PersonComplement.class, myID.getIdPartAsLong());
				if (person != null) {
					this.setId(myID.getIdPartAsLong());
				} else {
					person = (PersonComplement) OmopConceptMapping.getInstance().loadEntityBySource(PersonComplement.class, "PersonComplement", "personSourceValue", myID.getIdPart());
					if (person != null) {
						this.setId(person.getId());
					} 
					this.setPersonSourceValue(myID.getIdPart());
				}
			} else {
				// We have no Patient ID. However, we could have a matching patient. Compare 
				// name and address.
				System.out.println("No Patient ID provided");
				List<AddressDt> addresses = patient.getAddress();
				AddressDt newAddress = null;
				if (addresses.size() > 0) {
					newAddress = addresses.get(0);
				}
				Long existingID = OmopConceptMapping.getInstance().getPersonByNameAndLocation(this, Location.searchByAddressDt(newAddress));
				System.out.println("Patient Exists with PID="+existingID);
				if (existingID != null) {
					this.setId(existingID);
				} else {
					//TODO: Add this to OmopConceptMapping class. Race Concept is required in OMOP v5
					//      But, FHIR Patient does not have race data element
					Concept race = new Concept();
					race.setId(8552L);
					this.setRaceConcept(race);
					
					// Ethnicity is not available in FHIR resource. Set to 0L as there is no unknown ethnicity.
					Concept ethnicity = new Concept();
					ethnicity.setId(0L);
					this.setEthnicityConcept(ethnicity);
				}
			}	
			
			
			if (patient.getActive())
				this.setActive((short)1);
			else
				this.setActive((short)0);
			
			BoundCodeableConceptDt<MaritalStatusCodesEnum> maritalStat = patient.getMaritalStatus();
			if (maritalStat != null) {
				Set<MaritalStatusCodesEnum> maritalEnum = maritalStat.getValueAsEnum();
				if (maritalEnum != null) {
					for (MaritalStatusCodesEnum myCode : maritalEnum) {
						System.out.println("MARITAL STATUS:"+myCode.name());
						this.setMaritalStatus(myCode.name());
						break;
					}
				}
			}
			
			// Get contact information.
			List<ContactPointDt> contactPoints = patient.getTelecom();
			if (contactPoints.size() > 0) {
				ContactPointDt contactPoint = contactPoints.get(0);
				String system = contactPoint.getSystem();
				String use = contactPoint.getUse();
				String value = contactPoint.getValue();
				this.setContactPoint1(system+":"+use+":"+value);
			}
			if (contactPoints.size() > 1) {
				ContactPointDt contactPoint = contactPoints.get(1);
				String system = contactPoint.getSystem();
				String use = contactPoint.getUse();
				String value = contactPoint.getValue();
				this.setContactPoint2(system+":"+use+":"+value);
			}
			if (contactPoints.size() > 2) {
				ContactPointDt contactPoint = contactPoints.get(2);
				String system = contactPoint.getSystem();
				String use = contactPoint.getUse();
				String value = contactPoint.getValue();
				this.setContactPoint3(system+":"+use+":"+value);
			}
			
			//MARITAL STATUS
//			this.maritalStatus.setId(OmopConceptMapping.getInstance().get(patient.getMaritalStatus().getText(), OmopConceptMapping.MARITAL_STATUS));
		} else {
			ourLog.error("There was not possible to construct the entity ? using the resource ?. It should be used the resource ?.",
					this.getClass().getSimpleName(), resource.getResourceName(), getResourceType());
		}
		return this;
	}

	public String getNameAsSingleString() {
		String name="";
		if (this.givenName1 != null && !this.givenName1.isEmpty())
			name = this.givenName1;
		if (this.givenName2 != null && !this.givenName2.isEmpty())
			name = name+" "+this.givenName2;
		if (this.familyName != null && !this.familyName.isEmpty()) 
			name = name+" "+this.familyName;
		
		return name;
	}
	
	public void setNameFromString(String fullName) {
		if (fullName == null || fullName.isEmpty()) return;
		String[] names = fullName.trim().split(",", 2);
		if (names.length > 1) {
			this.setFamilyName(names[0]);
			String[] subNames = names[1].trim().split(" ", 2);
			if (subNames.length > 1) {
				this.setGivenName1(subNames[0]);
				this.setGivenName2(subNames[1]);
			} else {
				this.setGivenName1(subNames[0]);
			}
		} else {
			String[] subNames = names[0].trim().split(" ", 2);
			if (subNames.length > 1) {
				this.setGivenName1(subNames[0]);
				this.setFamilyName(subNames[1]);
			} else {
				this.setFamilyName(subNames[0]);
			}
		}
	}
		
	public static PersonComplement searchAndUpdate(ResourceReferenceDt patientResourceRef) {
		if (patientResourceRef == null) return null;
				
		Long patientRef = patientResourceRef.getReference().getIdPartAsLong();
		PersonComplement person = (PersonComplement) OmopConceptMapping.getInstance()
				.loadEntityById(PersonComplement.class, patientRef);
		if (person != null) {
			return person;
		} else {
			// See if we have already received this.
			person = (PersonComplement) OmopConceptMapping.getInstance()
					.loadEntityBySource(PersonComplement.class, "PersonComplement", "personSourceValue", patientRef.toString());
			if (person != null) {
				return person;
			} else {
				person = new PersonComplement();
				person.setNameFromString(patientResourceRef.getDisplay().toString());
				person.setPersonSourceValue(patientRef.toString());
				
				return person;
			}
		}
	}
	
}
