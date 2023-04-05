package basicSeleniumTests;

public class WorkingOnAssertions {

	public static void main(String[] args) {

		
		//TestNG
		
		@Test
	    public void softAssertions() {
	        
	        SoftAssert softAssertion = new SoftAssert();
	        System.out.println("Soft assert start");
	        softAssertion.assertTrue(false);
	        System.out.println("Soft assert ends");

	    }
		
		
		
		
		
		
		
		
		
	}

}
