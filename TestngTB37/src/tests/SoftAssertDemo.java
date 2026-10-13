package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	@Test
	public void a()
	{
		SoftAssert sa = new SoftAssert();
		
		System.out.println("a method started");
		System.out.println("logged in ");
		System.out.println("product searched");
		System.out.println("product is added to cart");
		System.out.println("check cart is having 2 products");
		sa.assertEquals(1, 2);
		System.out.println("address fill");
		System.out.println("payment");
		System.out.println("checkout");
		System.out.println("a method ends");
		sa.assertAll();
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
