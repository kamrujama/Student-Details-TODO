package com.student;

import java.sql.*;


public class MainClass {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
			Connection con = null;
		try {
			
			con = ConnectionClass.getConnection();
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			if(con!=null) {			
				con.close();
//				System.out.println(con.isClosed());
//				con.createStatement();
				
			}
		}
		

	}

}
