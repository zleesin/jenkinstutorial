package restAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class restAssuredGet {

	public void getMethodTest() {
	
		// set the base URL
		RestAssured.baseURI = "";
		
		// create requst object 
		RequestSpecification httpRequest = RestAssured.given();
		
		// response object
		Response myResponse = httpRequest.request(Method.GET);
		
		//print #1 
		System.out.println("This is the print #1 Message : " 
		+ myResponse.getBody().asString()); 
		
		//print #2
		System.out.println("This is the print #2 Message : " 
				+ myResponse.then().log().all()); 
		
		//print #3 
		System.out.println("This is the print #3 Message : " 
				+ myResponse.prettyPrint()); 
				
		//validate status code
		System.out.println("Status code is : ===== " + myResponse.getStatusCode());
		
		Assert.assertEquals(200, myResponse.getStatusCode());
		
		System.out.println("its a pass"); 
		
		
		
		
}
}