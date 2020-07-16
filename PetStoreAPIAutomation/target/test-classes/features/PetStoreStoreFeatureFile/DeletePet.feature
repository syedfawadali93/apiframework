Feature: As a petstore user I want to  delete Pet 

Scenario: Validate delete Pet  for petstore 

Given Header parameters are given for delete Pet  API call

When PetStore user sends a delete request and API will delete Pet 

Then  delete Pet request should be success with status code 200