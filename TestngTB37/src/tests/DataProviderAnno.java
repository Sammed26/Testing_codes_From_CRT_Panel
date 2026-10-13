package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnno {

//	@Test(dataProvider = "passingData")
//	public void login(String username, String password)
//	{
//		System.out.println(username + "  " + password);
//		
//	}
	
	@Test(dataProvider = "passingData")
	public void loginToDemoWebShop(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		drvier.findfbyx.sed(username)
//		pass
//		
//		click login
//		back
//		clear username field
//		clear password field
	}
	
	
	@DataProvider
	public Object[][] passingData()
	{		
		return new Object[][] {
			{"Admin", "admin123"},
			{"Rutika", "rutika123"},
			{"sonali", "sonali123"},
			{"rashmi", "rashmi123"},
			{"ashwini", "ashwini123"}
		};
	}
	
}
