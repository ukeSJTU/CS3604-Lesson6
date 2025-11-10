package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testAddSmallNumbers() {
		Main main = new Main();
		int result = main.add(1, 1);
		assertEquals(2, result);
	}

	@Test
	void testAddBoundaryNoOverflow() {
		Main main = new Main();
		int a = Integer.MAX_VALUE - 1;
		int b = 1;
		int result = main.add(a, b);
		assertEquals(Integer.MAX_VALUE, result);
	}

	@Test
	void testAddOverflowThrows() {
		Main main = new Main();
		assertThrows(ArithmeticException.class, () -> main.add(Integer.MAX_VALUE, 1));
	}

	@Test
	void testAddNegativeAThrows() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> main.add(-1, 5));
	}

	@Test
	void testAddNegativeBThrows() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> main.add(5, -1));
	}

	@Test
	void testAddBothNegativeThrows() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> main.add(-2, -3));
	}

}
