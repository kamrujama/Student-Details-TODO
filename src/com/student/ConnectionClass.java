package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	private static final String url = "jdbc:mysql://localhost:3306/studentdb";
	private static final String root = "root";
	private static final String pass = "root";
	private static Connection con=null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,root,pass);
		return con;
	}
//	public static void closeConnection() throws SQLException {
//		if(con!=null) {
//			con.close();
//		}
	}
	

