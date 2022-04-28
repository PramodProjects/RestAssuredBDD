package com.api.qa.test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class TC003_PUT {
	HashMap map = new HashMap();
	
	@BeforeClass
	public void testData() {
		
		map.put("name", "jjjj001");
		map.put("job", "DEV");
		
	}
	
	
	@Test
	public void putTC003() {
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.body("name", equalTo("jjjj001"))
			.body("job", equalTo("DEV"))
			.header("content-type", equalTo("application/json; charset=utf-8"));
		
	}

}
