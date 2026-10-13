
public class Test {	
	
	public void addition()
	{
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void multiply()
	{
		int x=50;
		int y=100;
		int z=x*y;
		System.out.println(z);		
	}	
	public static void main(String[] args) {		
		Test t=new Test();		
		t.addition();
		t.multiply();
		t.addition();
		
	}

}
