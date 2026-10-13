package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {	
	public static void main(String[] args){		
		
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");		
	   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		String sql="insert into student values(?,?,?)";
		 ps=con.prepareStatement(sql);
		 ps.setInt(1,4);
		  ps.setString(2,"aaa");
		  ps.setString(3,"Akurdi");
		  ps.execute();
		}
		catch(Exception e)
		{
			System.out.println("catch--Block-"+e.getMessage());
		}		 
		  
		  finally
		  {
			  if(ps!=null)
			  {
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			  }
			  if(con!=null)
			  {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			  }
		  }
		
		
		
	}

}
