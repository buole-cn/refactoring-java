package refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTest {

	@Test
	void test_max() {
		First me = new First();
		assertTrue(me.max(10, 1), "10 > 1");
		assertFalse(me.max(10, 10), "10 > 10");
		assertFalse(me.max(10, 50), "10 > 50");
	}

}
