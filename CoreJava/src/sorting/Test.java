package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	
	public static void main(String[] args) {
		Set<Studet> s=null;
		Scanner sc=new Scanner(System.in);
	System.out.println("---select--\n"
			+ "1 Rollno Sort \n"
			+ "2 Name Sort");	
		
	int ch=sc.nextInt();
	  if(ch==1)
	  {
	//Comparator<Studet> rnosort=Comparator.comparingInt(Studet::getRollno);
		  Comparator<Studet> rnosort=(o1,o2)->o1.getRollno()-o2.getRollno();
		  s=new TreeSet<>(rnosort);
	  }
	  else if(ch==2)
	  {
		  Comparator<Studet> nmsort=Comparator.comparing(Studet::getName);
		  s=new TreeSet<>(nmsort);	  
	  }
		
		Studet s1=new Studet();
		
		  s1.setRollno(2);
		  s1.setName("ccc");
		
		  Studet s2=new Studet();
			
		  s2.setRollno(1);
		  s2.setName("bbb");
		  
		  Studet s3=new Studet();
			
		  s3.setRollno(3);
		  s3.setName("aaa");
		 
		  
		  s.add(s1);
		  s.add(s2);
		  s.add(s3);
		
		
		  s.forEach((stu)->System.out.println(stu.getRollno()+"  "+stu.getName()));
		
		
		
	
	/*	Set<Integer> s=new TreeSet<>();
		
		   s.add(4);
		   s.add(10);
		   s.add(3);
		   s.add(5);
		   System.out.println(s);
		   
		   Set<String> s1=new TreeSet<>();
			
		   s1.add("ccc");
		   s1.add("ddd");
		   s1.add("aaa");
		   s1.add("bbb");
		   System.out.println(s1); */
		   
		   
		   
		   
		   
		   
	}

}
