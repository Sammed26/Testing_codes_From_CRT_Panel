package com.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWinsowHandling {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// click on orangehrm.inc button
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		
		
		String parent_window = driver.getWindowHandle();
		System.out.println("parent window = " + parent_window);
		
		Set<String> all_windows = driver.getWindowHandles();
		for(String curr_window : all_windows)
		{
			System.out.print(curr_window + "  ");
			if(parent_window != curr_window)
			{
				driver.switchTo().window(curr_window);
			}
		}
		
		// passing email on new opened tab
		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("example@gmail.com");
		
		
		// switch back to parent window
		driver.switchTo().window(parent_window);
		
		// passing username on parent window
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sammed26");
		// passing password on parent window
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hello@123");
	
		
	}
	
}
