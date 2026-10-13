
public class Demo {
	
	
	public static void main(String[] args) {
		
		
		
		NumberG odd=new NumberG(1,100);
		NumberG even=new NumberG(2,100);
		
		Thread t1=new Thread(odd);
		Thread t2=new Thread(even);
		t1.start();
		t2.start();
		
	//	odd.start();
	}

}
