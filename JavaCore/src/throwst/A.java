package throwst;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A {
	
	
	public void m1() throws FileNotFoundException
	{
		
		System.out.println("m1--start");
		FileReader fr=new FileReader("abc.txt");

		System.out.println("m1--send");
		
	}
	
	public void m2(int age)throws AgeInvalideException
	{
		System.out.println("m2==star");
		if(age<0)
	throw new AgeInvalideException("AgeProblem");
		
		System.out.println("m2--end");
		
	}
	
	public static void main(String[] args) {
		
		A a=new A();
		/*
		 * try { a.m1(); } catch (FileNotFoundException e) {
		 * System.out.println("catch--Block--"+e.getMessage()); }
		 */
		
		
		try {
			a.m2(-5);
		} catch (AgeInvalideException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	  
	
	
	

}
