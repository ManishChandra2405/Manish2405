import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class DbTest11
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
	     st = con.prepareStatement("Select * from Emp",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	     rs = st.executeQuery();
	      
	     while(rs.next())
	      System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
	    	 System.out.println();
	     while(rs.previous()) 
	    System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
	    
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
