Feature: As a petstore user I want to see user details 

Scenario: Validate get user details from petstore 

Given Header parameters are given for Petstore user API call

When PetStore user sends a get request and API will return user details

Then User details get request should be success with status code 200