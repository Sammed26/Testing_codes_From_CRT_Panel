package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://myportfolio-s26.netlify.app/");
		
		driver.manage().window().maximize();
		
		// id
		// you can locate element by using its id attribute value
		// By.id("idvalue")
		System.out.println("By.id = " + driver.findElement(By.id("name")));
//		driver.findElement(By.id("name")).sendKeys("hello how are you");
		
		
		// name
		// you can locate element by using its name attribute value
		// By.name("name_attribute_value")
		System.out.println("By.name = " + driver.findElement(By.name("email")));
		driver.findElement(By.name("email")).sendKeys("hello@gmail.com");
		
		
		// className
		// you can locate element by using class attribute value
		// By.className("classname")
		System.out.println("By.className = " + driver.findElement(By.className("feedback-form")).getText());
		
		
		// tagname
		// you can locate element by using any tagname, picks first match only
		// By.tagName("tagname")
		System.out.println("By.tagName = " + driver.findElement(By.tagName("input")).getText());
		driver.findElement(By.tagName("input")).sendKeys("hello hi");
		
		
	}
	
}
