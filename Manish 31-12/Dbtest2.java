import java.sql.*;
public class Dbtest2
{
 public static void main(String[] args) throws Exception
 {
	 String url="jdbc:oracle:thin:@localhost:1521:orcl";
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 try
	 {
	 Connection con = DriverManager.getConnection(url,"scott","tiger");
	 Statement st = con.createStatement();
	 ResultSet rs = st.executeQuery("select * from Staffbranch4");
		while(rs.next())
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" ");
      }
	 catch(Exception e)
	 { 
		 System.out.println(e);
		 System.out.println("Program terminated");
	 }   
	 finally
	 {
		try
		{
		  Connection con = null;
		  if (con != null ) 
			 con.close();
	     } 
		catch (Exception e2)
		{
			System.out.println("error");
		}
      }
  }
}