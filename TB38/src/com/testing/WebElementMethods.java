package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/form.html");
		
		driver.manage().window().maximize();
		
		/*
		
		WebElement 
		- is an interface
		- represents and html element which we have found by using locators
		- syntax => WebElement wename = driver.findElement(locator); 
		
		
		*/
		
		WebElement fname = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		System.out.println(fname);
		
		// Methods of WebElement
		// 1) sendKeys("stringvalue")
		// used to send string value to that html element
		fname.sendKeys("sammed");
		
		WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.sendKeys("koshti");
		
		// 2) click()
		// - used to click on any button, radio button, etc
		driver.findElement(By.xpath("//input[@id='Male']")).click();
		
		// 3) clear()
		// - used to clear the passed text on that webelement
		Thread.sleep(2000);
		lname.clear();
		
		
		// 4) submit()
		// - used to click on submit button of an HTML form
		WebElement submit_btn = driver.findElement(By.xpath("//input[@type='submit']"));
//		submit_btn.submit();
		
		// 5) getText()
		// - used to retrieve the text of that webelement
		WebElement para_text = driver.findElement(By.xpath("//form/p[3]"));
		String para_text_str = para_text.getText();
		System.out.println(para_text_str);
		
		
		// 6) getAttribute()
		// - used to get the attribute value of the particular webelement
		String attribute_value = lname.getAttribute("placeholder");
		System.out.println(attribute_value);
		
		// 7) isSelected()
		// - used to know whether a particular radio button, checkbox is selected or not
		// - works on only radio, checkbox element
		System.out.println(driver.findElement(By.xpath("//input[@id='Female']")).isSelected());
		
		
		// 8) isDisplayed()
		// - used to know whether a particular webelement is displayed or not
		// - works on all webelement
		System.out.println(fname.isDisplayed());
		
		
		// 9) isEnabled()
		// - used to know whether a button is enabled or not
		// - works on ony button type elements
		System.out.println(submit_btn.isEnabled());
	
		
	}
	
}
