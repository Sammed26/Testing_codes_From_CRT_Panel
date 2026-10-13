package abstractionbyusinginterface;

public class Mysql 
implements Connection{

	
public void commit()
	  {
System.out.println("commit--Mysql");
	  }
	  
	  public void rollback()
	  {
System.out.println("rollback--Mysql");
	  }
}
