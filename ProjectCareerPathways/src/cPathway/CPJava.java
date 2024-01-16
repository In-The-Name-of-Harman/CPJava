package cPathway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CPJava {

	public static void main(String[] args) {
		String databaseURL = "jdbc:ucanaccess://dbCareerPathways.accdb";
		
		try {
			Connection connection = DriverManager.getConnection(databaseURL);
			
			System.out.println("Connected to your Access Database.");
			
			String sql = "create table tbGeneralInfo (OSIS_ID INT, Name String, Grade INT, Pathway String";
			
			Statement statement = connection.createStatement();
			

			
			int rows = statement.executeUpdate(sql);
			
			if (rows > 0) {
				System.out.println("didit.");
			}
				
			connection.close();
			
		} catch (SQLException e) {
			System.out.println("hmm...");
			e.printStackTrace();
			}

	}

}
