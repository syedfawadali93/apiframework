Feature: As a petstore user I want to create pet  

Scenario: Validate create pet for petstore 

Given Header parameters are given for create pet API call

When PetStore user sends a post request and API will create a pet

Then Create pet request should be success with status code 200