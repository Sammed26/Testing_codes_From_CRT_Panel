package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String args[]) throws InterruptedException
	{
		/*
		 Action(I) and Actions(C)
			- To perform keyboard and mouse events
			- eg. click, double click, right click, mouse hover, drag and drop, sendkeys
		
		*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//		Thread.sleep(5);
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		// doubleClick(webelement)
//		WebElement doubleBtn = driver.findElement(By.xpath("//button[@id=\"doubleBtn\"]"));
//		ac.doubleClick(doubleBtn).build().perform();
		
		// contextClick(webelement)
		// used to right click on any web element
		WebElement rightclickwe = driver.findElement(By.xpath("//button[@id='rightBtn']"));
		ac.contextClick(rightclickwe).build().perform();
		
		
	}
	
}
