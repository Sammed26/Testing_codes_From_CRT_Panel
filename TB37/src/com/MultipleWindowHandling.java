package com;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		System.out.println(driver.getWindowHandle());
		
		Set<String> allwindows= driver.getWindowHandles();
		System.out.println("iterating over all windows");
		for(String singlewindow : allwindows)
		{
			System.out.println(singlewindow);
			if(singlewindow != parentwindow)
			{
				driver.switchTo().window(singlewindow);
			}
		}
		
		driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
		
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.name("username")).sendKeys("Adminhello");
		driver.findElement(By.name("password")).sendKeys("hello");
		
		
		
		
	}
	
}
