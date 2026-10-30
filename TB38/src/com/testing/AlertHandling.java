package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// accept()
		// - it is used to click on ok button of the pop up window or alert
		driver.findElement(By.xpath("//a[@id='empty-alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		// dismiss()
		// - it is used to click on cancel button of the pop up window or alert
		driver.findElement(By.xpath("//a[@id='confirm']")).click();
		Thread.sleep(2000);
		String msg_from_alert_box = driver.switchTo().alert().getText();   // used to get the text present in alert
		System.out.println(msg_from_alert_box);
		driver.switchTo().alert().dismiss();
		
		
		// sendKeys()
		// - it is used to send data in the textbox provided by alert
		driver.findElement(By.xpath("//a[@id='prompt']")).click();
		driver.switchTo().alert().sendKeys("how are you?");
		Thread.sleep(2000); 
		driver.switchTo().alert().accept();
		
	}
	
}
