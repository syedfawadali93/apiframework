# apiframework
## Automation Framework
1. Folowing Page object model.
2. Using BDD & Serenity to manage test.
3. Using serenity for reporting. 
4. Using Maven for Build Management.
## Installation Pre-requisites
- Install JDK
- Install Maven
- Install Eclipse
## Petstore Feature Files 
### Create an store
- Feature: As a petstore user I want to create pet  
- Scenario: Validate create pet for petstore 
- Given Header parameters are given for create pet API call
- When PetStore user sends a post request and API will create a pet
- Then Create pet request should be success with status code 200
### Delete an Store
- Feature: As a petstore user I want to  delete Pet 
- Scenario: Validate delete Pet  for petstore 
- Given Header parameters are given for delete Pet  API call
- When PetStore user sends a delete request and API will delete Pet 
- Then  delete Pet request should be success with status code 200
### Find an store
- Feature: As a petstore user I want to  Retrieve Pet 
- Scenario: Validate Retrieve Pet for petstore 
- Given Header parameters are given for find Pet status API call
- When PetStore user sends a get request and API will Retrieve Pets by status
- Then  request should be success with status code 200
### Get user detail
- Feature: As a petstore user I want to see user details 
- Scenario: Validate get user details from petstore 
- Given Header parameters are given for Petstore user API call
- When PetStore user sends a get request and API will return user details
- Then User details get request should be success with status code 200


## Steps to execute code
1. Open Eclipse IDE & import project. 
2. Wait couple of minutes to download repositories. 
3. Right click of the project go to Run as > Run configuration 
4. Add new configuration > Select workspace > Setup Goals: clean verify serenity:aggregate 
5. Click on Run button to run program. 
6. Wait until bulit is created.
7. Open Console to view all running test cases. 
8. View Complete senerity report. 
