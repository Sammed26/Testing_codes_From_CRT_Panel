package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Properties pro = new Properties();
		
		InputStream input = PropertiesFileDemo.class
				.getClassLoader()
				.getResourceAsStream("config.properties");
		
		pro.load(input);
		
//		System.out.println(pro.getProperty("email"));
//		System.out.println(pro.getProperty("password"));
		
		System.setProperty("webdriver.chrome.driver", pro.getProperty("chromedriverpath"));
		WebDriver driver = new ChromeDriver();
		driver.get(pro.getProperty("url"));
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(pro.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(pro.getProperty("password"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		
	}
	
}
