package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesHandling {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		int total_rows = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr")).size();
		System.out.println("total rows = " + total_rows);
		for(int i = 1; i<= total_rows; i++)
		{
			WebElement name = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr[" + i + "]/td[2]"));
			System.out.println(name.getText());
			
		}
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='nameInput']")).sendKeys("Hello");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='roleInput']")).sendKeys("Software Tester");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='emailInput']")).sendKeys("hello@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='locationInput']")).sendKeys("Pune");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='departmentInput']")).sendKeys("IT");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@id='addBtn']")).click();
		
		Thread.sleep(1500);
		
		total_rows = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr")).size();
		System.out.println("total rows = " + total_rows);
		for(int i = 1; i<= total_rows; i++)
		{
//			WebElement name = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr[" + i + "]/td[2]"));
//			System.out.println(name.getText());
			
			int cols = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr[" + i + "]/td")).size();
			for(int j = 2; j<=cols; j++)
			{
				WebElement data = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr[" + i + "]/td[" + j +"]"));
				System.out.print(data.getText() + "  ");
			}
			System.out.println();
		}
		
	}
	
}
