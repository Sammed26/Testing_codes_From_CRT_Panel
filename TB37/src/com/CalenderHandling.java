package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://msrtc.maharashtra.gov.in/GeneralPages/Home.aspx");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='rcCalPopup']")).click();
		
		String day = "28";
		String month = "october";
		String year = "2026";
		String monthyear = month + " " +year;
		for(int i = 1; i<=12; i++)
		{
			Thread.sleep(1000);
			WebElement curr_date = driver.findElement(By.xpath("//td[@class='rcTitle']"));
			String curr_date_str = curr_date.getText();
			System.out.println(curr_date_str);
			if(curr_date_str.equalsIgnoreCase(monthyear))
			{
				break;
			}
			driver.findElement(By.xpath("//a[@class='rcNext']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rcMainTable']/tbody/tr/td[not(contains(@class, 'rcOtherMonth'))]"));
		
		System.out.println("no of days = " + dates.size());
		for(int i = 0; i<dates.size(); i++)
		{
			System.out.print(dates.get(i).getText() + " ");
			String curr_day = dates.get(i).getText();
			if(curr_day.equalsIgnoreCase(day))
			{
				dates.get(i).click();
				break;
			}
		}
		
		System.out.println("done");
	}
	
}
