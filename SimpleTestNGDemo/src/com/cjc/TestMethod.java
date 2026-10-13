package com.cjc;

import org.testng.annotations.Test;

import utilities.BeforeTestWork;

public class TestMethod extends BeforeTestWork{

	@Test (groups = "regression")
	void m1()
	{
		System.out.println("inside m1 ");
	}
	
	@Test (groups = "integration")
	void m2()
	{
		System.out.println("inside m2 ");
	}
	
}
