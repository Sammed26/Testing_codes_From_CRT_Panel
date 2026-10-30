package com.testing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FrameHandlingDemo {

	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		/*
		 Frame Handling
		 1) by index
		 	- index starts from 0
		 	- first iframe tag = 0 index and so on
		 	driver.switchTo().frame(index);
		 
		 2) by name or id
		 	- by using name, id attribute value
		 	driver.switchTo().frame("idvalue");
		 
		 3) by webelement
		 	- find the locator of that iframe tag and pass that locator to the frame method
		 	driver.switchTo().frame(iframe_web_element);
		 
		 */
		
		
		// by index
//		driver.switchTo().frame(1);
		
		// by name or id
//		driver.switchTo().frame("singleframe");
		
		// by webelement
		WebElement frame_we = driver.findElement(By.xpath("//div[@id='Single']/iframe[@name='SingleFrame']"));
		driver.switchTo().frame(frame_we);
		
		WebElement input_box = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(input_box);
		input_box.sendKeys("how are you");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();  // switched to main content
//		driver.switchTo().parentFrame();  // switched to the parent frame
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		
		// taking screen shot 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\TB38\\framehandlingSS.png");
		FileHandler.copy(src, dest);
		
	}
	
}
