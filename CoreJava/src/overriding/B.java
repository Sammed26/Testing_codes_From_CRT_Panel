package overriding;

public class B extends A {
	
	  @Override
	  protected B m1()
	  {
		  
		 return new B(); 
	  }

}
