package login;

import org.testng.annotations.*;

import utilities.BeforeTestWork;

public class LoginCheck extends BeforeTestWork{

	@Test (groups = "regression")
	public void fillLoginDetails()
	{
		System.out.println("Login Details filled");
	}
	
	@Test(groups = {"integration", "regression" , "sam"})
	public void clickOnLogin()
	{
		System.out.println("Clicked on Login");
	}
	
	@Test (groups = "regression")
	public void CheckLogin()
	{
		System.out.println("Login Successful");
	}
	
	@Test(groups = "integration")
	public void m1()
	{
		System.out.println("m1 method");
	}
	
}
