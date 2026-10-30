package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		// pageloadtimeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		// https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html
//		driver.findElement(By.xpath("//div[@dir='ltr']/button")).click();
		
//		driver.findElement(By.id("reveal")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("revealedd")).sendKeys("hello, how are you?");
//		driver.findElement(By.id("revealed")).sendKeys("hello, how are you?");
		
		
		/*
		 
		 Waits
		 	1) pageloadtimeout
		 		- responsible for waiting till our page loads properly
		 		- driver.manage().timeouts.pageLoadTimeout(time, timeunit);
		  
		  	2) Implicit Wait
		  		- it holds the execution blindly
		  		- driver.manage().timeouts.implicitlyWait(time, timeunit);
		  			time = integer value
		  			timeunit = TimeUnit.SECONDS/HOURS...
		 
		 	3) Explicit Wait
		 		- if you want to wait until some condition will be satisfied
		 		WebDriverWait ew = new WebDriverWait(driver, 10);
		 		ew.until(condition);
		  
		 */
		
		// explicit wait
		driver.findElement(By.id("reveal")).click();
		
		WebDriverWait ew = new WebDriverWait(driver, 10);
		ew.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
		
		driver.findElement(By.id("revealed")).sendKeys("hello how are you");
		
		
	}
	
}
