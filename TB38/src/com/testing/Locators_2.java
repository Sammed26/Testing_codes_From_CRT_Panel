package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/form.html");
		
		driver.manage().window().maximize();
		
		// 4. tagName
		// used to find element by using tag
		System.out.println(driver.findElement(By.tagName("select")));
		Select sel = new Select(driver.findElement(By.tagName("select")));
		Thread.sleep(2000);
//		sel.selectByIndex(2);
		sel.selectByVisibleText("SHRILANKA");
		
		
		
		// 5. linkText
		// used to find element by using link text of an link
		// By.linkText("flipkart")
		// <a href="https://flipkart.com" target="_blank">flipkart</a>
		Thread.sleep(2000);
//		driver.findElement(By.linkText("flipkart")).click();
		
		
		// 6. partialLinkText
		// used to find element by using partial link text of that link
		// By.partialLinkText("flip")
//		driver.findElement(By.partialLinkText("flip")).click();
		
		
		// 7. xpath  - xml path
		/*
			a) Absolute Xpath
				- starts from root of the html i.e html tag
				- /html/body/form/input[1]
				- /html/body/form/select/option[2]
				- driver.findElement(By.xpath("/html/body/form/select/option[2]"));
				
			b) Relative Xpath
				- starts from any element you want
				- single or double quotes both valid
				- //tagname[@attribute = "attribute value"]
				- //a[@aria-label="Laptops"]
				- //form[@class='feedback-form']/input[@id="name"]
				- //div[@role='listitem'][1]/a[@aria-label="Laptops"]
				
			
			c) Dynamic Xpath
				i) Parent
					- syntax = //child element/parent ::parent element
					- //button[@class='view-code']/parent ::a
					- //a[@href='https://leetcode.com/sammed_26/']/parent ::li
				
				ii) Child
					- syntax = //parent element/child ::child element
					- //ul[@class='first-ul']/child ::li[4]
					- //div[@class='skills']/child ::ul/child ::li[3]
					
				iii) Sibling
					A) Preceding Sibling
						- bottom to top
						- syntax = //element1/preceding-sibling ::element2
						- //div[@class="project-boxes"]/child ::div[4]/preceding-sibling ::div[1]
						
					B) Following Sibling
						- top to bottom
						- syntax = //element1/following-sibling ::element2
						- //div[@class='outer-div']/div[2]/following-sibling ::div[6]
						
					C) Immediate Preceding Sibling
						- from all set of siblings you can pick any of the preceding available sibling
						- syntax = //element1/preceding-sibling ::element2
						- //div[@class='experience-content']/div/preceding-sibling ::*[2]
					
					D) Immediate Following Sibling
						- from all set of siblings you can pick any of the following available sibling
						- syntax = //elemen1/following-sibling ::element2
						- //div[@class='experience-content']/p/following-sibling ::*[1]
						
				iv) Regular Expression
					- syntax = //tagname[contains(@attribute, attribute value)]
					- //div[contains(@id, 'EXPERIENCE')]
					- //input[contains(@id, 'name')]
			
		
		*/
		
		
	}
	
}
