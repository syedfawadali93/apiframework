package com.apiautomation.cucumber.steps.petstore;



import com.apiautomation.cucumber.utils.ExpectedResults;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetStoreFetchUserAPI {
	
	private ExpectedResults expected = new ExpectedResults();
	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for Petstore user API call$")
	
	public void GetPetStoreUserHeaders()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json");
	            
	            
	                
	}

@Step	
@When("^PetStore user sends a get request and API will return user details$")

public void getUserrequest()
{
	  response = request.
	   when().
	   get("/user/Fawad");
}

@Step
@Then("^User details get request should be success with status code 200$")

public void returnUserDetails()
{
	response.then().assertThat().statusCode(expected.expectedStatusCode).and()
	.contentType(expected.expectedContentType);

}
}
