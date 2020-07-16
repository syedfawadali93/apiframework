Feature: As a petstore user I want to  Retrieve Pet 

Scenario: Validate Retrieve Pet for petstore 

Given Header parameters are given for find Pet status API call

When PetStore user sends a get request and API will Retrieve Pets by status

Then  request should be success with status code 200