import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentCrud {

	private int rollno;
	private String name;
	private String address;
	
	public int  addStdntInfo(Connection connection,StudentCrud student) throws SQLException
	{
//		Statement stmt = connection.createStatement();
//	String insert = "INSERT INTO student VALUES"+"(" 
//		 +student.getRollno()+ "," + "'" + student.getAddress()
//		+	"'"+ ","+"'" + student.getName()+ "'"+ ")";
		
		PreparedStatement prepareStatement = connection.prepareStatement("insert into student value (?,  ?,  ? )");
		prepareStatement.setInt(1, student.rollno);
		prepareStatement.setString(2, student.name);
		prepareStatement.setString(3, student.address);
		return prepareStatement.executeUpdate();
		
	
//	System.out.println("inser"+insert);
//	return stmt.executeUpdate(insert);
	
	
	
	}
	
	public List<StudentCrud> getAllstudentDetail(Connection con) throws SQLException
	{
		List<StudentCrud> listStudent=new ArrayList();
		StudentCrud student=new StudentCrud();
		Statement stmt = con.createStatement();
		ResultSet executeQuery = stmt.executeQuery("select * from student");
		System.out.println(executeQuery);
		
		while(executeQuery.next())
		{
			student.setRollno(executeQuery.getInt("rollno"));
			student.setName(executeQuery.getString("sname"));
			listStudent.add(student);
		}
		return listStudent;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentCrud [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
