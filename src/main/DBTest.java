package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBTest {

	public static void main(String[] args) {
		DBTest test = new DBTest();
		test.connection();
	}
	
	void connection() {
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "Kelvin", "");
			System.out.println("Connection successful");
		} catch (SQLException e) {
			Logger.getLogger(DBTest.class.getName()).log(Level.SEVERE, null, e);
		}
	}

}
