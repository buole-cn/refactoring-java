package refactoring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlDb {
	private static final SqlDb me = new SqlDb();

	public static SqlDb me() {
		return me;
	}

	private SqlDb() {
	}

	public Connection getConn() throws SQLException {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			return DriverManager.getConnection("jdbc:hsqldb:testdb", "sa", "");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}
	}

	public void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException ignored) {
		}
	}

	public void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException ignored) {
		}
	}
}
