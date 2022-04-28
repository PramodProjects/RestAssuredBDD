package com.api.qa.test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class TC005_GET {
	
	@Test
	public void getTC005() {
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id", hasItems(7, 8, 9));
	}
	

}
