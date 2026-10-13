package mapt;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		
		List al=new ArrayList<>();
		al.add(10);
		al.add("xyz");
		al.add('A');
		
		for(Object p:al)
		{
			
			System.out.println(p);
		}
		
	}

}
