package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void testFor1() {
		Factorial test = new Factorial();
		int actual = test.calculateFactorial(0);
		int expected = 1;
		assertEquals(actual, expected);
	}
	
	@Test
	void testMorethan1() {
		Factorial test = new Factorial();
		int actual = test.calculateFactorial(5);
		int expected = 120;
		assertEquals(actual, expected);
	}
}
