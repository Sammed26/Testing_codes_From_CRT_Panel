package com;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class TestNGDemo {
	/*
		invocation  |  success %   |   failure %
			1			  90				  10			- ontestf....
			2			  80				  20			- ontestf....
			3			  70				  30			- ontestf....
			4			  60				  40			- ....
			..
			..
	
	*/
	
	@Test(invocationCount = 10, successPercentage = 70)
	public void loginTest()
	{
		System.out.println("logging in");
		
//		Assert.fail("login failed");
	}
	
}
