package com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		
//		WebElement btn = driver.findElement(By.id("myAnchor"));
		// querySelector('id or class') -> id = #, class = .
		// getElementById('idvalue')
		
		WebElement btn = (WebElement) js.executeScript("return document.getElementById('myAnchor')");
		js.executeScript("console.log('hello')");
		
		String value = "how are you";
		js.executeScript("arguments[0].innerText = arguments[1]", btn, value);
		
		// btn.innerText = "how are you"
		
		 
		
		
		/*
		WebElement searchbox = (WebElement) js.executeScript("return document.getElementById('twotabsearchtextbox')");
		
//		searchbox.sendKeys("s25 ultra");
		js.executeScript("return document.getElementById('twotabsearchtextbox').value='mobile'");
		*/
		
		
	}
	
}
