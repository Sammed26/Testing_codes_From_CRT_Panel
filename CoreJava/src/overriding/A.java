package overriding;

public class A {
	
	protected A m1()
	{
		
System.out.println("m1--A");
return new A();
	}

}
