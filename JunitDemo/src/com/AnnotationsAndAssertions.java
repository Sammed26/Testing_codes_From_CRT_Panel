package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class AnnotationsAndAssertions {
	
	// annotations
//	@Before = calls before every test method (@BeforeEach)
//	@After = calls after every test method (@AfterEach)
//  @Test = used for test method
	
//	@BeforeClass = calls before all test methods, before class (@BeforeAll)
//	@AfterClass = calls after all test methods, after class (@AfterAll)
	
	
	// assertions
	// assertEquals(actual, expected)
	// assertTrue(condition)
	// assertNotNull() = object null or not
	
	@BeforeClass
	public static void beforeall()
	{
		System.out.println("beforeall method called");
	}
	
	@AfterClass
	public static void afterall()
	{
		System.out.println("afterall method called");
	}
	
	@Before
	public void beforeEveryMethod()
	{
		System.out.println("before Method called");
	}
	
	@After
	public void afterEveryMethod()
	{
		System.out.println("after Method called");
	}
	
	@Test
	public void testlogin()
	{
		int actualloginval = login();
//		assertEquals(actualloginval, 2);
		
		//assertTrue(actualloginval == 2);
		assertNotNull(null);
	}
	
	@Test
	public void testaddtocart()
	{
		int actualaddtocartval = addToCart();
		assertEquals(actualaddtocartval, 5);
	}

	public int login()
	{
		System.out.println("login feature is developed");
		return 1;
	}
	
	public int addToCart()
	{
		System.out.println("product is added to cart");
		return 1;
	}
	
}
