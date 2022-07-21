package com.student;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;


public class StudentClass{
	
	
	private int rollno;
	private String name,address;
	public void insertValue() throws ClassNotFoundException, SQLException 
	{
		Connection con= ConnectionClass.getConnection();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Details : ");
		System.out.println("Roll No : ");
		rollno = sc.nextInt();
		sc.nextLine();
		System.out.println("Name : ");
		name = sc.nextLine();
		System.out.println("Address : ");
		address = sc.nextLine();
		String insert= "INSERT INTO student Values(?,?,?)";
		PreparedStatement st = con.prepareStatement(insert);
	 
		st.setInt(1,rollno);
		st.setString(2,name);
		st.setString(3,address);
		st.execute();
		System.out.println("Successfuly Inserted");
		con.close();
			
	}
	public static ArrayList displayValue() 
	{
		return null;
	}
	public static void updateValue()
	{
		
	}
	public static void deleteValue()
	{
		
	}
	

}
