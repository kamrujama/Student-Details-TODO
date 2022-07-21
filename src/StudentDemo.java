import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDemo {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			if(con!=null)
				System.out.println("Connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
