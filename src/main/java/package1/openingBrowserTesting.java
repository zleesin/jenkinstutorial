package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingBrowserTesting {

	public static void main(String[] args) {
		
		//declare driver object
		WebDriver driver;
		
		//setting the chrome driver path
		System.setProperty("webdriver.chrome.driver", "/Users/zena/Downloads/chromedriver_mac_arm64/chromedriver");
		
		
		//declared and initialized webdriver to chromedriver
		driver = new ChromeDriver();
		
		
		String url = "https://www.techcircleschool.com"; 
		
		driver.get(url);
		
		
		

	}

}
