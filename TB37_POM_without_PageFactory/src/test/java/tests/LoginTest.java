package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void loginTest() throws InterruptedException
	{
		LoginPage login_page = new LoginPage(driver);
		
		login_page.login("sammedk4321@gmail.com", "abc@123");
		
		String actaulText = driver.findElement(By.className("topic-html-content-header")).getText();
		String ExpectedText = "Welcome to our store";
		
		Thread.sleep(2000);
		Assert.assertEquals(actaulText, ExpectedText);
		
	}
}
