package narrowingt;

public class Test {
	public static void main(String[] args) {
		
		
		A a=new A();
		
	//a.m1(null);//Ambiguous
	a.m1((A)null);
	a.m1((String)null);	
	}

}
