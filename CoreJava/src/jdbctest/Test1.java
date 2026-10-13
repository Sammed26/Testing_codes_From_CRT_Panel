package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test1 {
	
	
	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		String sql="insert into student values(?,?,?)";
		try(Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		    PreparedStatement ps=con.prepareStatement(sql);
				)
		{
			 ps.setInt(1,4);
			  ps.setString(2,"aaa");
			  ps.setString(3,"Akurdi");
			  ps.execute();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		}
		catch (Exception e) {
			System.out.println("catch--"+e.getMessage());
		}
		
		
	}

}
