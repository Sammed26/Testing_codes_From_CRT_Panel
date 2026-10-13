package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.Callable;

public class Test {
	
	
	public void m1() throws FileNotFoundException
	{
		
		FileReader fr=new FileReader("abc.txt");	
	}
	
	
	public void m2() throws FileNotFoundException
	{
		
		m1();
		
	}	
	public static void main(String[] args) {
		
		Test t=new Test();
		  try {
			t.m2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
