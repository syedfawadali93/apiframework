package com.apiautomation.cucumber.steps.pet;



import com.apiautomation.cucumber.utils.ExpectedResults;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class FindPet {
	
	private ExpectedResults expected = new ExpectedResults();
	private Response response;
	private RequestSpecification request;
	
	
@SuppressWarnings("deprecation")
@Step	
@Given("^Header parameters are given for find Pet status API call$")
	
	public void RetrievePetHeaders()
	
	{
		
	
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.queryParameter("status","available");
				
	            
	            
	                
	}

@Step	
@When("^PetStore user sends a get request and API will Retrieve Pets by status$")

public void Retrievepetrequest()
{
	  response = request.
	   when().
	   get("/pet/findByStatus");
}

@Step
@Then("^request should be success with status code 200$")

public void returnPetdetails()
{
	response.then().assertThat().statusCode(expected.expectedStatusCode).and()
	.contentType(expected.expectedContentType);

}
}
