package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class DemoJunit {
	
	@Test
	public void addTest()
	{
		int addition = add(2, 4);
		if(addition == 6)
		{	
			System.out.println(addition + " test case passed");			
		}
		else
		{
			fail("test case failed");
		}
	}
	
	@Test
	public void multiplyTest()
	{
		int mul = multiply(2, 4);
		assertEquals(10, mul, "multiplication for 2 and 4 is failed");
		System.out.println(mul);
	}

	public int add(int num1, int num2)
	{
		return (num1 + num2);
	}
	
	public int multiply(int num1, int num2)
	{
		return (num1 * num2);
	}
}
