package refactoring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDao {
	private static final CustomerDao me = new CustomerDao();
	private static final String INSER = "INSERT INTO customer(name, email) VALUES(?, ?)";

	public static CustomerDao me() {
		return me;
	}

	private CustomerDao() {
	}

	public ResultSet all() throws SQLException {
		try (Connection conn = SqlDb.me().getConn(); Statement stmt = conn.createStatement()) {
			return stmt.executeQuery("SELECT * FROM customer WHERE 1=1");
		}
	}

	public void add(String name, String email) throws SQLException {
		try (Connection conn = SqlDb.me().getConn(); PreparedStatement stmt = conn.prepareStatement(INSER)) {
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.executeUpdate();
		}

	}
}
