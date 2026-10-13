package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/webtable/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> tablerow = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr"));
		
		
		for(int i = 1; i<=tablerow.size(); i++)
		{
			WebElement nametd = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr["+i+"]/td[2]"));
			System.out.println(nametd.getText());
		}
		
		driver.findElement(By.id("nameInput")).sendKeys("hello");
		Thread.sleep(500);
		driver.findElement(By.id("roleInput")).sendKeys("developer");
		Thread.sleep(500);
		driver.findElement(By.id("emailInput")).sendKeys("hello@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("locationInput")).sendKeys("pune");
		Thread.sleep(500);
		driver.findElement(By.id("departmentInput")).sendKeys("IT");
		Thread.sleep(500);
		
		Thread.sleep(2000);
		driver.findElement(By.id("addBtn")).click();
		
		
		tablerow = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr"));
		
		for(int i = 1; i<=tablerow.size(); i++)
		{
			WebElement nametd = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr["+i+"]/td[2]"));
			WebElement roletd = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr["+i+"]/td[3]"));

			System.out.println(nametd.getText() + "  " + roletd.getText());
		}
		
	}
	
}
