# GT-FHIR

This is the Georgia Tech FHIR Server. It is built on top of <a href="https://github.com/jamesagnew/hapi-fhir/releases/tag/v1.1">Hapi Fhir (v1.1)</a> Fhir spec implementation. Currently the objects model is built in conformance to Fhir spec <a href="http://hl7.org/fhir/2015May">DSTU2</a> - some features in DSTU1 are not supported.
For the Data Access Layer, this server uses a modified version of Hapi Fhir <a href="https://github.com/ismael-sarmento-jr/hapi-fhir/tree/master/hapi-fhir-jpaserver-base">JpaServer-Base</a> project, which is implemented to provided support for any database schema, so we can focus on the creation of Resources from the data on the databases.

<img src="https://gtvault-my.sharepoint.com/personal/isarmento6_gatech_edu/_layouts/15/guestaccess.aspx?guestaccesstoken=FFSRHfel2NS71y8vd%2fLMx21iXrcNbU%2bYAg7tVElc%2fAw%3d&docid=00227279769bc4ea3b77aaede60011f45">Server Structure and Communication</img>


## gt-fhir-webapp

This project contains part of the business layer and the presentation layer, with the controller/servlets. It contains the providers for each resource and their DAO classes. It uses <a href="http://projects.spring.io/spring-framework">Spring framework</a>, with CORS filter. The configuration files are found in the 'WEB-INF' folder.
The providers are generated by using <a>Tinder plugin</a> and then modified to match the operations and search params provided by the server - which are defined in gt-fhir-entities project.

## gt-fhir-entities-dstu2

This project contains the object model representing the schema for the database used by the server. 
The server is connected to a database which follows the Omop v4.0 specification for its basic tables - some extension tables are added in order to provide more information
The model is built to represent the database schema. The relationship between the Entity Fields and its respective Fhir Resource Fields are expressed in the methods 'getRelatedResource' and 'constructEntityFromResource', or in the javadocs where applicable. 
Tables' names and columns' names are specified under javax.persistence annotations, as well any constraints. Javax Bean Validation annotations are specified as well.

## gt-fhir-overlay

This overlay has a user interface - which follows the design of Hapi Fhir's <a href="https://github.com/jamesagnew/hapi-fhir/tree/master/hapi-fhir-testpage-overlay">Example interface</a>, being our default client for Fhir server.


### Build Instructions

importing the sources as a maven project in IntelliJ seems to work well for testing

# including cleaning old artifacts

$ cd gt-fhir-jpabase

$ mvn clean

$ cd ../gt-fhir-entities

$ mvn clean

$ cd ../gt-fhir-overlay

$ mvn clean

$ cd ../gt-fhir-webapp

$ mvn clean

$ cd ../..

$ rm -rf gtFHIR

It may be worthwhile rm'ing old deployment files from [/var/lib/]tomcat/webapps too

# for clean installations start here 

$ git clone https://github.gatech.edu/cdchealthyweight/gtFHIR.git (edited)

startup intelliJ

import project -> import from external model -> Maven

check 'search for projects recursively", "Import Maven projects automatically", "create module groups for multi-module projects"

allow intelliJ to overwrite .idea directory during project creation

then back to the console

$ cd gtFHIR

$ git checkout -- .idea/runConfigurations/fhir_webapp_local.xml

$ cd gt-fhir-jpabase

$ mvn install -DskipTests

$ cd ../gt-fhir-entities

$ mvn install

$ cd ../gt-fhir-overlay

$ mvn install

$ cd ../gt-fhir-webapp

$ mvn install

create a mysql database called fhir_omop with user devuser@localhost, no password, listening on default port 3306

then from intelliJ run->run "fhir_webapp_local"

**NB need to update tests**