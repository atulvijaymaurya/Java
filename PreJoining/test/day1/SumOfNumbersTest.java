package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void testEven() {
		SumOfNumbers even = new SumOfNumbers();
		int actual = even.sumOfEvenNumbers(10,30);
		int expected = 220;
		assertEquals(actual, expected);
	}
	
	@Test
	void testOdd() {
		SumOfNumbers even = new SumOfNumbers();
		int actual = even.sumOfOddNumbers(10,30);
		int expected = 200;
		assertEquals(actual, expected);
	}
}
