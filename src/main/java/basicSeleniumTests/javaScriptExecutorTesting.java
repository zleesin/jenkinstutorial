package basicSeleniumTests;

import org.openqa.selenium.WebDriver;

public class javaScriptExecutorTesting {

	WebDriver driver;
	
	WebElement element = driver.findElement(By.id("id_of_element")); 
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);"); 
	
	
	
	
}
