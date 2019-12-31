import java.sql.*;
 class DbTest3
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
	     st = con.prepareStatement("select * from Staffbranch where sal > ?");
	     st.setDouble(1,1000);
	     rs = st.executeQuery();
		  while(rs.next())
			System.out.println(rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" ");
		  st.setDouble(1,2000);
		  while(rs.next())
				System.out.println(rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" ");
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