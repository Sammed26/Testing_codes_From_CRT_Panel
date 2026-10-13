package tests;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Register;

public class DemoWebShopTest {
	
	WebDriver driver;
	
	@BeforeAll
	void setDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	void purchaseProduct()
	{
		// register into site
		Register reg = new Register(driver);
		reg.register();
		
		
		
	}
	
}
