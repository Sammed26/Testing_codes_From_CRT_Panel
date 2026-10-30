package com.testing;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		// pageloadtimeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='post-body-5280210221385817166']/div[1]/button")).click();
		
		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement demo_we_found = fw.until(new Function<WebDriver, WebElement> (){

			@Override
			public WebElement apply(WebDriver arg0) {
				System.out.println("checking condition");
				
				WebElement demo_we = driver.findElement(By.id("demo"));
				String demo_we_text = demo_we.getText();
				
				if(demo_we_text.equalsIgnoreCase("Software Testing Material - DEMO PAGE"))
				{
					System.out.println("text appeared");
					return demo_we;
				}
				
				return null;
				
			}	
		});
		
		System.out.println(demo_we_found.getText());
		
		
	}
	
}
