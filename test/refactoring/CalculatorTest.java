package refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test_calcQuadraticEq() {
		Calculator cal = new Calculator();
		assertEquals("Equation has no roots", cal.calcQuadraticEq(1, 1, 1));
		assertEquals("x = -1.0", cal.calcQuadraticEq(1, 2, 1));
		assertEquals("x1 = -2.618033988749895, x2 = -0.3819660112501051", cal.calcQuadraticEq(1, 3, 1));
	}

	@Test
	void test_sum() {
		Calculator cal = new Calculator();
		assertEquals(2, cal.sum(1, 1));
		assertEquals(4, cal.sum(1, 2, 1));
		
		double[] ds = new double[] { 1, 2, 11, 5, 3 };
		assertEquals(22, cal.sum(ds));
	}
}
