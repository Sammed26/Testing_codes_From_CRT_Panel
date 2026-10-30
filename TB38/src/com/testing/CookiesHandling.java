package com.testing;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://http-cookie-demo.netlify.app/");
		driver.manage().window().maximize();
		
		// get all cookies 
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("total cookies = " + cookies.size());
		for(Cookie cookie : cookies)
		{
			System.out.println(cookie);
			System.out.println(cookie.getName());
		}
		
		System.out.println();
		
		// get a specific cookie by name
		System.out.println("getting a specific cookie by name");
		Cookie specific_cookie = driver.manage().getCookieNamed("name2");
		System.out.println(specific_cookie);
		
		System.out.println();
		
		// adding a cookie
		System.out.println("adding a custom cookie");
		Cookie newcookie = new Cookie("TB 38", "4 students are there");
		driver.manage().addCookie(newcookie);
		
		cookies = driver.manage().getCookies();
		System.out.println("total cookies = " + cookies.size());
		for(Cookie cookie : cookies)
		{
			System.out.println(cookie.getName());
		}
		
		
		System.out.println();
		
		// delete a specific cookie
		System.out.println("deleting cookie");
//		driver.manage().deleteCookieNamed("name3");
//		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookie(specific_cookie);
		
		cookies = driver.manage().getCookies();
		System.out.println("total cookies = " + cookies.size());
		for(Cookie cookie : cookies)
		{
			System.out.println(cookie.getName());
		}
		
		System.out.println();
		System.out.println();
		
		// all cookie methods
		System.out.println("cookie methods");
		cookies = driver.manage().getCookies();
		System.out.println("total cookies = " + cookies.size());
		for(Cookie cookie : cookies)
		{
			System.out.println("getName = " + cookie.getName());
			System.out.println("getValue = " + cookie.getValue());
			System.out.println("getDomain = " + cookie.getDomain());
			System.out.println("getPath = " + cookie.getPath());
			System.out.println("isHttpOnly = " + cookie.isHttpOnly());
			System.out.println("isSecure = " + cookie.isSecure());
			System.out.println("getExpiry = " + cookie.getExpiry());
			System.out.println();
		}
		
		
	}
	
}
