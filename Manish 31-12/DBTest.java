import java.sql.*;
import java.lang.*;
class DBTest
{
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Class.forName("Oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection(url,"scott","tiger");
                Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Staffbranch4");
		while(rs.next())
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
	}

}
     