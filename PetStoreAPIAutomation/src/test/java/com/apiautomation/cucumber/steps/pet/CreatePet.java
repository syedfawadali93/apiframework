package com.apiautomation.cucumber.steps.pet;



import com.apiautomation.cucumber.utils.ExpectedResults;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CreatePet {
	
	private ExpectedResults expected = new ExpectedResults();
	private Response response;
	private RequestSpecification request;
	
	
@Step	
@Given("^Header parameters are given for create pet API call$")
	
	public void CreatePetHeaders()
	
	{
	
		
		request=SerenityRest.rest()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.body("{\r\n" + 
						"    \"id\": 5656,\r\n" + 
						"    \"name\": \"Bela Bardog\",\r\n" + 
						"    \"status\": \"available\"\r\n" + 
						"}");
		       
	            
	            
	                
	}

@Step	
@When("^PetStore user sends a post request and API will create a pet$")

public void createpetrequest()
{
	  response = request.
	   when().
	   post("/pet/");
}

@Step
@Then("^Create pet request should be success with status code 200$")

public void returnPetdetails()
{
	response.then().assertThat().statusCode(expected.expectedStatusCode).and()
	.contentType(expected.expectedContentType);

}
}
