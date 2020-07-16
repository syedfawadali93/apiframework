package com.apiautomation.cucumber.steps.pet;



import com.apiautomation.cucumber.utils.ExpectedResults;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class deletePet {
	
	private ExpectedResults expected = new ExpectedResults();
	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for delete Pet  API call$")
	
	public void deletePetHeaders()
	
	{
		
		
		request=SerenityRest.rest()
				.header("Accept", "application/json");
			
		       
	            
	            
	                
	}

@Step	
@When("^PetStore user sends a delete request and API will delete Pet$")

public void deletepetrequest()
{
	  response = request.
	   when().
	   delete("/pet/5656");
}

@Step
@Then("^delete Pet request should be success with status code 200$")

public void deletePetdetails()
{
	response.then().assertThat().statusCode(expected.expectedStatusCode).and()
	.contentType(expected.expectedContentType);

}
}
