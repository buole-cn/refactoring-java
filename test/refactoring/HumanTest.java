package refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HumanTest {

	@Test
	void test_getFullAddress() {
		Human human = new Human("Tester", 20, "U.S.A", "NY", "Valley", "Oak", "7979");
		assertEquals("U.S.A, NY, Valley, Oak 7979", human.getFullAddress());
	}
}
