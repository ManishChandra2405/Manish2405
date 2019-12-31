import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
public class DbTest10
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
	     st = con.prepareStatement("Select * from Emp");
	     rs = st.executeQuery();
	     ResultSetMetaData rsmd = rs.getMetaData();
	     int count = rsmd.getColumnCount();
	     for(int i=1;i<=count;i++)
	    	 System.out.println(rsmd.getColumnName(i)+"  ");
	     System.out.println();
	     while(rs.next())
	     {
	    	 for(int i=1;i<=count;i++)
	    		 System.out.println(rs.getString(i)+" ");
	    	 System.out.println();
	     }
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
