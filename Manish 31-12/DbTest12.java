import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class DbTest12 
{
	public static void main(String[] args) throws Exception
	 {
		 String url="jdbc:oracle:thin:@localhost:1521:orcl";
		 Connection con = null;
		 CallableStatement st = null;
		 
		 try
		 {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 con = DriverManager.getConnection(url,"scott","tiger");
			 st = con.prepareCall("call insertMaster(?,?,?)");
			 st.setInt(1,2);
			 st.setString(2,"Kowsalya");
			 st.setDouble(3,1234.12);
			 st.executeUpdate();
          }
		 catch(Exception e)
		 { 
			e.printStackTrace();
			
		 }   
		 finally
		 {
			try
			{
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
