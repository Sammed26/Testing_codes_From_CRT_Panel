package constructor;

public class D {

	public void m1(String str) {
		System.out.println("Hi! "+str);
	}
	
	public void m2(float per) {
		System.out.println("Percentage: "+per);
	}
	public static void main(String[] args) {
		D obj=new D();
		String s="Mark";
		obj.m1(s);
		
		obj.m2(89.90f);
	}
}
