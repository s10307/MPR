package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBconnector {

	public Connection connect() {
		Connection db = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			db = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/s10307",
					"root", "123");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cannot connect to database");
		}
		return db;
	}
}