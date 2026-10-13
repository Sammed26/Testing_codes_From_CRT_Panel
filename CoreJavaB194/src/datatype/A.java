package datatype;

public class A {	
	 byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean flag;
	String s1;
	A a;
	
	public void m1()
	{
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		
		System.out.println(d);
		System.out.println(c);
		System.out.println(flag);
		System.out.println(s1);
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		A a=new A();
		
		a.m1();
		
	}

}
