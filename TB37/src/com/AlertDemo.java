package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
			
			
			driver.findElement(By.id("alert")).click();
			Thread.sleep(2000);
			String msg_in_alert = driver.switchTo().alert().getText();
			System.out.println(msg_in_alert);
			driver.switchTo().alert().accept();
			
			driver.findElement(By.id("confirm")).click();
			Thread.sleep(2000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
			
			
			driver.findElement(By.id("prompt")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().sendKeys("msg passed from eclipse");
			driver.switchTo().alert().sendKeys(msg_in_alert);
			System.out.println(driver.switchTo().alert().getText());
		}
}
