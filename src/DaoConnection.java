import java.sql.Connection;
import java.sql.DriverManager;

public class DaoConnection {
	
	public static Connection getConnection(String hostname,String  username,String password)
	{
		Connection connection=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(hostname,username,password);
			if(connection!= null)
			{
				return connection;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
			
		}
		finally {
			if(connection!=null)
			{
				connection=null;
			}
		}
		return connection;
	}
	

}
