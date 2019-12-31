import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 class DbTest9
{
 public static void main(String[] args) throws Exception
 {
	 String url="jdbc:oracle:thin:@localhost:1521:orcl";
	 Connection con = null;
	 PreparedStatement st = null;
	 ResultSet rs = null;
	 try
	 {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 con = DriverManager.getConnection(url,"scott","tiger");
	     st = con.prepareStatement("delete from Emp  where empid=?");
	     st.setInt(1,10);
	     int count = st.executeUpdate();
	     System.out.println(count+"Rows updated");
      }
	 catch(Exception e)
	 { 
		e.printStackTrace();
		
	 }   
	 finally
	 {
		try
		{
			if (rs != null ) 
			 rs.close();
			if(st != null)
			 st.close();
			if(con != null)
				con.close();
		}
		catch(Exception ex)
		{
			 ex.printStackTrace();
		}
     }
}
}
