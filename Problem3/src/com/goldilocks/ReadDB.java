package com.goldilocks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDB {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			connection = DbUtils.connectToDatabase();
			
	        String query = "SELECT emp_name, emp_age FROM test";
	        
	        Statement statement = connection.createStatement();

            
            ResultSet resultSet = statement.executeQuery(query);

            
            while (resultSet.next()) {
                String empName = resultSet.getString("emp_name");
                int empAge = resultSet.getInt("emp_age");
                System.out.println("Employee Name: " + empName + ", Employee Age: " + empAge);
            }

            resultSet.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbUtils.closeConnection(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
