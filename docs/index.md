# The FHIR Project at Georgia Tech

GT-FHIR is a Georgia Tech Fast Healthcare Interoperability Resources (FHIR) project to build a FHIR resource on Observational Medical Outcomes Partnership (OMOP) common data model (CDM). It is built on top of <a href="http://hapifhir.io">Hapi Fhir</a> reference implementation. Currently the objects model is built in conformance to Fhir spec DSTU2 - some features in DSTU1 are not supported.

The key component of GT-FHIR is a data access layer that has been modified to support any database schema. The component allows OMOP CDM to be deployed as a backend database. FHIR resources from/to OMOP CDM mapping is done at the gt-fhir-entities. However, as FHIR and OMOP CDM cannot be mapped one-to-one, some of data elements are set statically. Some mappings require multiple FHIR entity-jpa classes to support bidirectional mappings. 

For more detail information about the mapping, visit [**Mapping Document**](fhir_omop_mapping.md).

We are constantly working on mapping new concepts and adding to new features. *Pull requests are welcome!* GT-FHIR consists of several sub-projects. Please see the following notes for what the base projects are. For more details on source codes, visit [GT-FHIR Project Github](https://github.com/gt-health/GT-FHIR).

**SMART on FHIR**: GT-FHIR is also equipped to support SMART on FHIR. GT-FHIR talks to Authorization server in [SMART-on-FHIR Reference Implementation](https://github.com/smart-on-fhir/installer) for launch ID resolution. You will need to install this reference implementation of SMART on FHIR and use the Authorization server part with GT-FHIR.

[Deployment scripts](https://github.com/gt-health/gt-fhir-ansible) are available in ansible. These scripts help you installing GT-FHIR and other components for a complete GT-FHIR platform.

## People
**FHIR** 
 * [Myung Choi](https://github.com/myungchoi)
 * [Ismael Sarmento](https://github.com/ismael-sarmento-jr) 

**OMOP CDM**
 * [Richard Starr](https://github.com/orgs/gt-health/people/rstarr7)

**Deployment and Infrastructure**
 * [Michael Riley](https://github.com/MikeRileyGTRI)
 
## Collaborators
 * Apervita
 * Cerner
 * Docsnap
 * Duke University
 * Emory University School of Medicine
 * Medical University in South Carolina
 * Mulesoft
 * Salesforce
 * UCB
 * VA 
 
## Related Publications
 1. M. Choi, R. Starr, M. Braunstein, and J. Duke, "OHDSI on FHIR Platform Development with OMOP CDM mapping to FHIR Resources," [ODHSI 2016](http://www.ohdsi.org/web/wiki/lib/exe/fetch.php?media=resources:ohdsionfhir_gatech.pdf)
 2. H. Su, A. Henderson, M. Choi, R. Starr, and J. Sun, "Clinical Predictive Modeling Development and Deployment with OMOP CDM and FHIR," [ODHSI 2015](http://www.ohdsi.org/web/wiki/lib/exe/fetch.php?media=resources:gt_ohdsi-abs-final.pdf)
 3. K. Mohammed, M. Choi, A. Henderson, S. Iyengar, M. Braunstein, and J. Sun, "Clinical Predictive Modeling Development and Deployment through FHIR Web Services," [AMIA 2015](https://knowledge.amia.org/59310-amia-1.2741865/t004-1.2745466/f004-1.2745467/2248709-1.2745684/2248709-1.2745685?qr=1)
r
