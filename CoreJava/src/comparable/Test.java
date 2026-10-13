package comparable;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Set<Developer>s=new TreeSet<>();
	for (int i = 0; i < 3; i++) {
		Developer d=new Developer();
		System.out.println("Enter Id");
		d.setId(sc.nextInt());
		System.out.println("Enter Name");
		d.setName(sc.next());
		System.out.println("Enter salary");
		d.setSalary(sc.nextDouble());
		
		s.add(d);
	}
	
	for(Developer x:s)
	{
		System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary());
	}
}
}
