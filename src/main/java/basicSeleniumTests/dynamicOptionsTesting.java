package basicSeleniumTests;

public class dynamicOptionsTesting {

	public static void main(String[] args) {
	
		WebDriver driver;
	    Select select;

	    @Before
	    public void openBrowser() {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("http://the-internet.herokuapp.com/dropdown");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    }
	    
	    @Test
	    public void dropOption() throws InterruptedException {
	        
	        
	        Thread.sleep(2000);
	        
	        select = new Select(driver.findElement(By.id("dropdown")));
	        
	        
	        select.selectByValue("2");
	        
	        Thread.sleep(3000);
	        
	        select.selectByIndex(1);
	        
	    
	        Thread.sleep(3000);
	        
	        
	        select.selectByVisibleText("Please select an option");
	        
	        
	    }
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
