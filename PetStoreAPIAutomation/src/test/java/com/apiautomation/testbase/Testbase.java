package com.apiautomation.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class Testbase {
	
	@BeforeClass
	
	public static void init()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2/";
	}

}

