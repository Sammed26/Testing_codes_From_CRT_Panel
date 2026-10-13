package tests;

import org.testng.annotations.Test;

public class TestMethods {
	
	/*
	 number system
	 .........  -4 -3 -2 -1 0 1 2 3 4  ........
	 
	 smallest priority number method will be executed first then again smallest from remaining
	 a = 0, b = -25, c = 3, d = -4
	 bdac
	 
	 if two methods are having same priority
	 -> same priority methods will be executed in alphabetical order.
	 a = 2, b = 2, c = -1, d = 5
	 cabd
	 
	 if any of the method is not having priority
	 -> without priority method = 0 priority
	 a = 1, b = 0, c = -3, d
	 cbda
	 
	 
	 
	 */
	
	

	@Test
	public void d()
	{
		System.out.println("inside d method");
	}
	
	@Test (priority = -3)
	public void c()
	{
		System.out.println("inside c method");
	}
	
	@Test (priority = 0)
	public void b()
	{
		System.out.println("inside b method");
	}
	
	@Test (priority = 1)
	public void a()
	{
		System.out.println("inside a method");
	}
	
}
