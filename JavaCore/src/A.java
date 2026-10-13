
public class A {	
	
	
	int a;
	int b;
	public void addition( )
	{
		
		int c=a+b;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		
		A a=new A();
		a.a=100;
		a.b=300;
		  a.addition();
		A a1=new A();
		  a1.a=500;
		  a1.b=600;
		  a1.addition();
		
		
		
	}

}
