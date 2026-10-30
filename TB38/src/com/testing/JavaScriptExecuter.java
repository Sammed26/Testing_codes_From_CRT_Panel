package com.testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://myportfolio-s26.netlify.app/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("console.log(\"Hello\")");
		
		System.out.println(js.executeScript("return document.getElementById(\"name\")"));
		WebElement name = (WebElement) js.executeScript("return document.getElementById(\"name\")");
		// js.executeScript("return document.querySelector(".classname"));
		name.sendKeys("hello how are you?");
		System.out.println(name);
		
		js.executeScript("window.scrollTo({top: 1000, left: 0, behavior: 'smooth'});");
		
		/*
			
		
		
		*/
	}
	
}
