package basicSeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertTestingExamples {

	WebDriver driver; 
	
	public void openBrowser() {
		
		WebDriverManager.chromedriver()
		
		
		@Test
	    public void firstAlert() {
	        
	        driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Alert')]")).click();
	        
	        String jsText = driver.switchTo().alert().getText();
	        
	        System.out.println(jsText);
	        
	        driver.switchTo().alert().accept();
	   
	     @Test
	        public void secondAlert() {
	            driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Confirm')]")).click();
	            
	            String jsText = driver.switchTo().alert().getText();
	            System.out.println(jsText);
	            
	            driver.switchTo().alert().accept();
	        
	        
	            
	            
	            
	        
	        
	    }
		
		
		
	}
	
	
}
