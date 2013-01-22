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

			// Podłączenie do bazy jest możliwe tylko z określonego adresu IP
			// zabezpiecznie przed włamem którego nie wyłączę bo się ktoś
			// dostanie do pozostałych baz :(
			// proponuję dwa rozwiązania(postaram się z Panem skontaktować aby
			// to ustalić)
			// 1. Dam Panu creaty i przykładowe insterty do tablicy a Pan sobie
			// podłączy poniżej do swojej bazy
			// 2. Da mi Pan swoje IP danego dnia(idealnie gdyby miał Pan
			// statyczne) i udostępnie to Panu w ciąglu kilku minut :)
			db = DriverManager.getConnection(
					"jdbc:mysql://mysql51.iq.pl:3306/michalkoch_java",
					"michalkoch_java", "7hxvhhw3k6");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Połączenie z bazą ZAWIODŁO!");
		}
		return db;
	}
}