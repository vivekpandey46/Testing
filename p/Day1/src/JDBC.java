import java.sql.*;


public class JDBC {

	public static void main(String[] args) {
		
	try
	{		
		Class.forName("oracle:jdbc:driver:OrcaleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","username","password");
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select ename from emp");
		
		while(rs.next())
			
			System.out.println(rs.getString(1));
		
		con.close();
	}
	catch (Exception e)
	{
		System.out.println(e);		
	}
	
  }
}

