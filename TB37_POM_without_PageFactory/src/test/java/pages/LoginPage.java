package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By email = By.id("Email");
	By password = By.id("Password");
	By login_btn = By.className("login-button");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void login(String email_value, String password_value)
	{
		driver.findElement(email).sendKeys(email_value);
		driver.findElement(password).sendKeys(password_value);
		driver.findElement(login_btn).click();
	}
	
}
