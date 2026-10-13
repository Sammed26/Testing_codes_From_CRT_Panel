import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class TestMethod {

	@Test
	public void testadd()
	{
		if(add(2, 4) == 5)
		{
			System.out.println("add method passed");
		}
		else
		{
			fail("add method failed for 2 and 4");
		}
	}
	
	@Test
	public void testmultiply()
	{
		if(multiply(2, 4) == 8)
		{
			System.out.println("multiply method passed");
		}
		else
		{
			fail("multiply method failed for 2 and 4");
		}
	}
	
	public int add(int a, int b)
	{
		return a + b;
	}
	
	public int multiply(int a, int b)
	{
		return a*b;
	}
}
