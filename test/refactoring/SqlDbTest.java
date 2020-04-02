package refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class SqlDbTest {

	@Test
	void test_getConn() throws Exception {
		Connection conn = SqlDb.me().getConn();
		assertNotNull(conn);
		assertTrue(conn.isValid(0));
		assertFalse(conn.isClosed());
		assertEquals("PUBLIC", conn.getSchema());
		assertEquals("PUBLIC", conn.getCatalog());
	}

	@Test
	void test_close() throws Exception {
		Connection conn = SqlDb.me().getConn();
		SqlDb.me().close(conn);
		assertTrue(conn.isClosed());
	}
}
