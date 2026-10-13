package abstractionbyusinginterface;

public class Test {
	
	public static void main(String[] args) {
		
		
		Connection con=new Mysql();
		
		  con.commit();
		  con.rollback();
		
	}

}
