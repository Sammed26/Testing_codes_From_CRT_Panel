package objectt;

public class Student {
	
	int rollno;
	String name;
	
	
	
	public void display()
	{
		
		System.out.println(rollno);
		System.out.println(name);
		
	}
	
	
	public static void main(String[] args) {
		
		
		Student s=new Student();
		
		
		    s.rollno=1;
		    s.name="xyz";
		    
	Student s1=	new Student();
	    s1.rollno=2;
	    s1.name="Pqr";
	    
	   
		s.display();
		s1.display();
		
		
		
	}

}
