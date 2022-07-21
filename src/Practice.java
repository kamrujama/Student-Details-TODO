import java.sql.*;

public class Practice {

	public static void main(String[] args) {
		try {
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get connection
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String user = "root";
		String pass = "";
		Connection conn = DriverManager.getConnection(url,user,pass);
		if(conn!=null)
			System.out.println("Connected");
		
		//create statement
		Statement stmt = conn.createStatement();
		
		//Run Query
//		String insert = "INSERT INTO student VALUES(202,'Iqbal','Nepal')";
//		stmt.executeUpdate(insert);
//		insert = "INSERT INTO student VALUES(203,'Aakib','Nepal')";
//		stmt.executeUpdate(insert);
//		System.out.println("Inserted");
		
//		String display = "SELECT rollno,sname,address FROM student";
//		String update = "UPDATE student set sname = 'New Name' where rollno=101";
//		stmt.executeUpdate(update);
		
		
		
//		String del = "DELETE FROM student where rollno=202";
//		stmt.executeUpdate(del);
//		String display = "SELECT rollno,sname,address FROM student";
//		ResultSet rs = stmt.executeQuery(display);
//		while(rs.next()) {
//			System.out.println("Roll No : "+rs.getInt("rollno"));
//			System.out.println("Name : "+rs.getString("sname"));
//			System.out.println("Address : "+rs.getString("address"));
//			System.out.println();
//		}
		}
		catch (Exception e) {
			System.out.println();
		}
		

	}

}
