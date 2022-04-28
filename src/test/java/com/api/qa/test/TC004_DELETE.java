package com.api.qa.test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TC004_DELETE {
	
	
	@Test
	public void deleteTC004() {
		given()
		.when()
			.delete("https://reqres.in/api/users/2")
		.then()
			.statusCode(204).log().all();
		
		

	}
	

}
