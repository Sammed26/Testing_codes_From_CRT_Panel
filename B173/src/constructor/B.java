package constructor;

public class B {

	public int m1() {
		System.out.println("m1 called");
		int a=10+10;
		return a;
	}
	
	public String m2() {
		System.out.println("m2 called");
		String str="Hello";
		return str;
	}
	public static void main(String[] args) {
		B obj=new B();
		int x=obj.m1();
		System.out.println(x);
		
		System.out.println(obj.m2());
	}
}
