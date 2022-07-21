import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;


//class Operations{
//	Scanner sc = new Scanner(System.in);
//	String name,address;
//	int rollno;
//	public void insert() {
//		System.out.println("Enter the details : ");
//		System.out.println("Rollno : ");
//		rollno = sc.nextInt();
//		System.out.println("Name : ");
//		name = sc.nextLine();
//		System.out.println("Address : ");
//		address = sc.nextLine();
//	}
//}


public class CrudApp {

	public static void main(String[] args) throws SQLException {
		
		int rollno;
		boolean status=true;
		try {
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			while(status)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("1. Insert Data \n 2. Display \n 3. Delete \n 4. Update \n 5. Exit");
				System.out.println("Enter your choice : ");
				int choice = sc.nextInt();
				sc.nextLine();
				

				switch(choice) {
				case 1: 
					Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
					Statement stmt = conn.createStatement();
					
					System.out.println("Enter the details : ");
					System.out.print("Rollno : ");
					rollno = sc.nextInt();
					sc.nextLine();
					System.out.print("Address : ");
					String address = sc.nextLine();
					System.out.print("Name : ");
					String name = sc.nextLine();
					String insert = "INSERT INTO student"+"(rollno,sname,address)"+"VALUES(?,?,?)";
					PreparedStatement st = conn.prepareStatement(insert);
					st.setInt(1,rollno);
					st.setString(2,name);
					st.setString(3,address);
					st.execute();
					System.out.println("Insert Complete");
					conn.close();
					break;
				case 2: 
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
					Statement stmt1 = conn.createStatement();
					ResultSet rs = stmt1.executeQuery("SELECT rollno,sname,address FROM student ORDER BY sname");
					System.out.println("Roll_No \t Name \t Address");
					while(rs.next())
					{
						System.out.println(rs.getInt("rollno")+" \t "+rs.getString("sname")+" \t "+rs.getString("address"));
					}
					if(conn!=null)
					{
						conn.close();
						stmt1.close();
					}
					break;
				case 3: 
					Connection conn2  = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
					Statement stmt2 = conn2.createStatement();
					System.out.println("Enter The roll no to delete : ");
					rollno = sc.nextInt();
					String del = "DELETE FROM student WHERE rollno=(?)";
					PreparedStatement st1 = conn2.prepareStatement(del);
					st1.setInt(1, rollno);
					st1.executeUpdate();
					
					System.out.println("Delete Successfully");
					if(conn2!=null)
					{
						conn2.close();
						stmt2.close();
					}
					break;
				case 4: 
					Connection conn3  = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
					Statement stmt3 = conn3.createStatement();
					
					System.out.println("Enter the roll no to update : ");
					int rol = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the New details : ");
					System.out.print("New Address : ");
					String new_address = sc.nextLine();
					System.out.print("New Name : ");
					String new_name = sc.nextLine();
					String update = "UPDATE student"+"set name=(?) and address=(?) where rollno=(?)";
					PreparedStatement st12 = conn3.prepareStatement(update);
					st12.setString(1,new_name);
					st12.setString(2,new_address);
					st12.setInt(3,rol);
					st12.execute();
					System.out.println("Insert Complete");
					conn3.close();
					break;
				case 5: 
					status=false;
					break;
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
