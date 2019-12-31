import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class DbTest6
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
	     st = con.prepareStatement("insert into staffbranch3 values (?,?,?)");
	     st.setInt(1,10);
	     st.setString(2,"Manish");
	     st.setDouble(3,1000.0);
	     int count = st.executeUpdate();
	     System.out.println(count+"Rows inserted");
	     st.setInt(1,12);
	     st.setString(2,"Kowsalya");
	     st.setDouble(3,2000.0);
	     count = st.executeUpdate();
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