import java.sql.*;  
class OracleCon
	{  
	
	public static void main(String args[])
	{  

		try
		{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS = (PROTOCOL = TCP)(HOST = 172.20.39.54)(PORT = 1521))(CONNECT_DATA =(SERVER = DEDICATED)(SERVICE_NAME = SITDB)))","SIT_CE411","SIT_CE411");  
  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select SUBSCRIBER_ACCOUNT_TYPE,CALLS_RESTRICTION,ERROR_CODE from profile_server");  
			while(rs.next())  

				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
			//step5 close the connection object  

			con.close();  
  
}

catch(Exception e)
		{ 
			System.out.println(e);
		}  
  
}  
} 
