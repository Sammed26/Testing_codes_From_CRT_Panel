package abstraction;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		Connection o=new Mysql();
		
		o.commit();
		o.rollback();
		
		//30
		
	}

}
