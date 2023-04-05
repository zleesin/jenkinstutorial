package restAssuredTests;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassureed.http.Header; 


public class printingoutHeaders {

	@Test
	public void testingHeaders() {
		
		//set the base URL
		RestAssured.baseURI = "http://reqres.in/api/users?page=2";
		
		// response object
		Response myResponse = httpRequest.request(Method.GET); 
		
		
		
		
		
	}
	
}
