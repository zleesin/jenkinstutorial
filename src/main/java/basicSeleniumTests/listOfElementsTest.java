package basicSeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listOfElementsTest {

	WebDriver driver; 
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get("https://www.amazon.com/");
		driver.manager().window().maximize(); 
		driver.manager().timeouts().implicitlyWait(15, TimeUnit.SECONDS)
		
		
	}
	
	@Test
	public void getListOfTabs() {
		
		List<WebElement> tabs =
				driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		
			for (WebElement eachTab : tabs) {
				String eachTabText = eachTab.getText();
				System.out.println(eachTabText); 
				
			}
		
		
		
	}
	
	
}
