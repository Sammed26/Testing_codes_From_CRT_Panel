package com.testing;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Opening Browser");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// .get("url");
		// get method is used to open any webpage in browser
		driver.get("https://wwww.amazon.com");
		
		// .getTitle();
		// used to get title of the webpage
		// return type is String
		String title = driver.getTitle();
		System.out.println("title of webpage = " + title);
		
		
		// .getCurrentUrl()
		// used to get the url of current webpage
		// return type is String
		String url = driver.getCurrentUrl();
		System.out.println("current Url = " + url);
		
		
		// .getPageSource()
		// used to retrieve all source code of current webpage
		// return type is String
//		String source_code = driver.getPageSource();
//		System.out.println(source_code);
		
		
		// .getWindowHandle()
		// used to get the current window tabs unique id (window handle)
		// return type is String
		String window_handle = driver.getWindowHandle();
		System.out.println("current window handle = " + window_handle);
		
		
		// .getWindowHandles()
		// used to get the current opened all window tabs unique ids (window handles)
		// return type is set of Strings
		Set<String> window_handles = driver.getWindowHandles();
		System.out.println("all window handle = " + window_handles);
		
		
		// .findElement(locator)
		// driver.findElement(locator);
		
		// .findElements(locator)
		
		// .manage()
		driver.manage().window().maximize();
		
		// .navigate()
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		// .close()
		// used to close the current window
		driver.close();
		
		// .quit()
		// used to close all the current opened windows
		driver.quit();
		
		// .switchTo()
		
		
		
	}
	
}
