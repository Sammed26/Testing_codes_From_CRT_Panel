package methodWithReturnType;

public class Calculator {

	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public int sub(int x,int y) {
		return x-y;
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int a=100;
		int b=20;
		int sum=calc.add(a, b);
		System.out.println("Addition is: "+sum);
		
		System.out.println("Substraction is: "+calc.sub(a, b));

	}

}
