package com.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandlingMSRTC {

	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://msrtc.maharashtra.gov.in/GeneralPages/Home.aspx");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// clicking on calender popup
		driver.findElement(By.xpath("//a[@class='rcCalPopup']")).click();
		
		String day = "24";
		String month = "april";
		String year = "2027";
		String month_year = month + " " + year;
		
		for(int i = 1; i<12; i++)
		{
			String curr_month_year = driver.findElement(By.xpath("//td[@class='rcTitle']")).getText();
			System.out.println(curr_month_year);
			if(curr_month_year.equalsIgnoreCase(month_year))
			{
				break;
			}
			
			// going on next month
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='rcNext']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rcMainTable']/tbody/tr/td[not(contains(@class, 'rcOtherMonth'))]"));
		System.out.println("no of months = " + dates.size());
		
		for(int i = 0; i<dates.size(); i++)
		{
			Thread.sleep(300);
			String curr_day = dates.get(i).getText();
			System.out.print(curr_day + " ");
			if(curr_day.equalsIgnoreCase(day))
			{
				dates.get(i).click();
				break;
			}
		}
		
		System.out.println();
		System.out.println("date selected");
		
	}
	
}
