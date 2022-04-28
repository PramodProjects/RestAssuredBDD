package com.api.qa.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class TC001_GET {

	@Test
	public void getTC001() {
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.assertThat().body("data.id[0]", equalTo(7))
			.assertThat().body("data.first_name[1]", equalTo("Lindsay"))
			.assertThat().header("content-type", equalTo("application/json; charset=utf-8"))
			.assertThat().header("server", equalTo("cloudflare"));

	}
}
