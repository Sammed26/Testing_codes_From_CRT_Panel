package com;



import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;


public class Waits {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		//driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		
		/*
		// implicit wait
		driver.findElement(By.xpath("//button[@id=\"btn1\"]")).click();
		System.out.println("start");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"txt1\"]")).sendKeys("hello");
		System.out.println("after finding element");
		*/
		
		
		/*
		//explicit wait
		driver.findElement(By.xpath("//button[@id=\"btn1\"]")).click();
		System.out.println("start");
		WebDriverWait ew = new WebDriverWait(driver, 10);
		ew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txt1\"]")));
		driver.findElement(By.xpath("//*[@id=\"txt1\"]")).sendKeys("hello");
		*/
			

			
		// fluent wait
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15))
																  .pollingEvery(Duration.ofSeconds(3))
																  .ignoring(NoSuchElementException.class);
			
		
		WebElement msgbox = fwait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver arg0) {
				System.out.println("checking condition");
				
				WebElement textele = driver.findElement(By.xpath("//p[@id='demo']"));
				
				String text = textele.getText();
				
				if(text.equalsIgnoreCase("Software Testing Material - DEMO PAGE"))
				{
					System.out.println("element with excepted text found");
					return textele;
				}
				
				return null;
			}

		});
		
		System.out.println(msgbox);
		System.out.println(msgbox.getText());
		
	}
	
}
