package refactoring;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerDaoTest {
	@BeforeEach
	public void init() throws SQLException {
		try (Statement stmt = SqlDb.me().getConn().createStatement()) {
			stmt.execute("DROP TABLE customer IF EXISTS;");
			stmt.execute("CREATE TABLE customer (" + 
					"id INTEGER IDENTITY PRIMARY KEY," + 
					"name VARCHAR(30)," + 
					"email  VARCHAR(50));");
		}
	}

	@Test
	void test_all() throws SQLException {
		ResultSet rs = CustomerDao.me().all();
		assertFalse(rs.next());
		try (Connection conn = SqlDb.me().getConn(); Statement stmt = conn.createStatement()) {
			stmt.execute("INSERT INTO customer(name, email) VALUES('mkyong', 'mkyong@gmail.com');");
			rs = CustomerDao.me().all();
			assertTrue(rs.next());
			assertEquals("mkyong", rs.getString("name"));
			assertEquals("mkyong@gmail.com", rs.getString("email"));
		}
		SqlDb.me().close(rs);
	}

	@Test
	void test_add() throws SQLException {
		CustomerDao.me().add("mkyong", "mkyong@gmail.com");
		ResultSet rs = CustomerDao.me().all();
		assertTrue(rs.next());
		assertEquals("mkyong", rs.getString("name"));
		assertEquals("mkyong@gmail.com", rs.getString("email"));
		SqlDb.me().close(rs);
	}
}
