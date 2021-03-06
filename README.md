# SpacexChallenge
This project offers a a maven-J2EE based RESTful webservice. This REST service offers few insights about SpaceX-Dragons and SpaceX-Crew. Additionally also provides the spaceX company information.
This service is built as a wrapper on top of the information provided by https://github.com/r-spacex/SpaceX-API/tree/master/docs/v4

# Access details
At present, the application is deployed on AWS EBS, baseUrl: http://sie-space-x-challenge-rest-service-env.eba-32pahimi.eu-central-1.elasticbeanstalk.com/
No authorization is needed to access theservice.

# Offered endpoints
At present, this REST service only provides 3 GET endpoints
  - {baseUrl}/api/v1/company-info
  - {baseUrl}/api/v1/dragons-details
  - {baseUrl}/api/v1/crew-details

Note: /crew-details endpoint offers a possibility to pass a query parameter 'agency'

Template with query parameter: {baseUrl}/api/v1/crew-details?agency={agency}

# Prerequisite for local deployment
To run this application on local machine, you’ll need to have maven, Java 8 and Glassfish payara 5. ( I had used Intellij as IDE).
Make sure maven and java home are pointing to the correct  folders

# Steps to deploy in local machine
- check this project out locally to a folder.
- execute the maven command "mvn clean install" 
- execute these commands
    - cd {gf-installed-directory}/bin/asadmin 
    - start-domain domain1
    - deploy {project-directory}/target/SpacexChallenge-1.0-SNAPSHOT.war
    
# Playtime (local environment)
The REST service can be accessed locally with baseUrl as "http://localhost:8080/SpacexChallenge-1.0-SNAPSHOT/". 

