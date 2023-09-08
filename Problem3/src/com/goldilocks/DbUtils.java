package com.goldilocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbUtils {
	final static String URL;
	final static String username;
	final static String password;
	
	static {
		try {
//			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException ex) {
//			System.err.println("Fatal Error! Unable to start application");
			ex.printStackTrace();
			System.exit(1);
		}
		
		ResourceBundle bundle = ResourceBundle.getBundle("dbdetails");
		
		URL = bundle.getString("url");
		username = bundle.getString("username");
		password = bundle.getString("password");
	}
	
	public static Connection connectToDatabase() throws SQLException {
		return DriverManager.getConnection(URL, username, password);
	}
	
	public static void closeConnection(Connection conn) throws SQLException{
		if(conn != null)
			conn.close();
	}
}
