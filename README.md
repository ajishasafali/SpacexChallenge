# SpacexChallenge
This project offers a a maven-J2EE based RestFul webservice.

# Prerequisite
To run this application on local machine, you’ll need to have maven, Java 8 and Glassfish payara 5. ( I had used Intellij as IDE)

# Steps to deploy locally
- check this project out locally to a folder.
- execute the maven command "mvn clean install" 
- execute these commands
    - cd {gf-installed-directory}/bin/asadmin 
    - start-domain domain1
    - deploy {project-directory}/target/SpacexChallenge-1.0-SNAPSHOT.war
    
# Playtime
The REST service can be accessed with baseUrl as "http://localhost:8080/SpacexChallenge-1.0-SNAPSHOT/"
At present, this REST service only provides 3 GET endpoints
  - {baseUrl}/api/v1/company-info
  - {baseUrl}/api/v1/dragons-details
  - {baseUrl}/api/v1/crew-details

Note: /crew-details endpoint offers a possibility to pass a query parameter 'agency'

Template with query parameter: {baseUrl}/api/v1/crew-details?agency={agency}
