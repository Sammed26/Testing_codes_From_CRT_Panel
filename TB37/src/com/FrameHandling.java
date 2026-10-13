package com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class FrameHandling {

	
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		/*
		 1. by index (in case there are multiple iframe tags in html)
		   driver.switchTo().frame(index);
		   
		 2. by id or name 
		 	<iframe name="firstframe"> ....... </iframe>
		 	driver.switchTo().frame("firstframe");
		 
		 3. by webelement
		 	<iframe class="singleframe"> ...... </iframe>
		 	WebElement framesingle = driver.findElement(By.className("singleframe");
		 	driver.switchTo().frame(framesingle);
		 
		 */
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("SingleFrame");
		
		// executeScript("window.open('about:blank','_blank');");
		
		
		WebElement sf = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(sf);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
		// taking screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\Desktop\\dsa\\framess.png");
		FileHandler.copy(src, dest);
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[3]/a")).click();
		
		
		
	}
	
}
