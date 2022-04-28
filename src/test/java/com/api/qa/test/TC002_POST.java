package com.api.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class TC002_POST {
	
	HashMap map = new HashMap();
	
	@BeforeClass
	public void testData() {
		map.put("name", "ppp001");
		map.put("job", "QA");	
		
//		RestAssured.baseURI = "https://reqres.in/";
//		RestAssured.basePath = "/api/users";
	}
	@Test
	public void postTC002() {
//		HashMap map = new HashMap();
//		map.put("name", "ppp001");
//		map.put("job", "QA");
		
		given()
			.contentType("application/json")
			.body(map)			
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.assertThat().body("name", equalTo("ppp001"))
			.assertThat().body("job", equalTo("QA")).log().all();
			

	}

}
