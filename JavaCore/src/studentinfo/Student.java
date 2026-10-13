package studentinfo;

public class Student {
	
	int rollno;
	
	String name;
	
	public void display()
	{
		System.out.println(this.rollno);
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		
		
		Student pranav=new Student();
		    pranav.rollno=1;
		    pranav.name="Pranav S.";
		
		    Student sainath=new Student();
		      sainath.rollno=2;
		      sainath.name="Sainath W.";
		      
		      pranav.display();
		      sainath.display();
		      
		     
		
	}

}
