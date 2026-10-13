package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {
	@Test
	public void a()
	{
		System.out.println("a method started");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		Assert.assertEquals(4, 1); // if it fails then all the below lines in this method are skipped 
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("a method ends");
	}
	@Test
	public void b()
	{
		System.out.println("b method starts");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("b method ends");
	}
	
}
