package synchronizationtest;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		Hello h=new Hello();
		MyThread t1=new MyThread("Java", h);
		MyThread t2=new MyThread("classes", h);
		t1.start();
		t2.start();
		
		Hello h1=new Hello();
		
		
		MyThread t3=new MyThread("CJC", h1);
		MyThread t4=new MyThread("Pune", h1);
		t3.start();
		t4.start();
	}

}
