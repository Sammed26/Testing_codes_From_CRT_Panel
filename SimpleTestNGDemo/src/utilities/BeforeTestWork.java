package utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BeforeTestWork {

	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("BeforeTest is called");
	}
	@AfterTest
	public void afterTestMethod()
	{
		System.out.println("afterTest is called");
	}
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("BeforeClass is called");
	}
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("afterClass is called");
	}
}
