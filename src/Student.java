import java.sql.*;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Student {

	public static void main(String args[]) throws SQLException {
		String hostname="jdbc:mysql://localhost:3306/Student";
		String username="root";
		String pass="root";
		Connection connection = DaoConnection.getConnection(hostname, username, pass);
		System.out.println(connection);
		StudentCrud student= new StudentCrud();
		student.setRollno(new Random().nextInt());
		student.setAddress("nepal");
		student.setName("New");
		
		int result=student.addStdntInfo(connection, student);
		if(result > 0)
		{
			System.out.println("inserted");
		}
		else {
			System.out.println("not inserted");
		}
		
		List<StudentCrud> allstudentDetail = student.getAllstudentDetail(connection);
		Iterator<StudentCrud> iterator = allstudentDetail.iterator();
		System.out.println(allstudentDetail.toString());
		
		
//		try 
//		{
//		 Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
////		if(connection==null)
////			System.out.println("Not connected");
////		else
////			System.out.println("Connected");
//		Statement stmt = connection.createStatement();
////		String insert = "INSERT INTO student VALUES(101,'Ansari','Nepal')";
////		stmt.executeUpdate(insert);
//		String display = "SELECT rollno,sname,address FROM student";
//		ResultSet rs = stmt.executeQuery(display);
//		while(rs.next()) {
//			System.out.println("Roll No : "+rs.getInt("rollno"));
//			System.out.println("Name : "+rs.getString("sname"));
//			System.out.println("Address : "+rs.getString("address"));
//		}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
	}
	
}
