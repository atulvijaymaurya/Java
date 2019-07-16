package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void testF() {
		MarkValidator test1 = new MarkValidator();
		char actual = test1.markGrade(35);
		char expected = 'F';
		assertEquals(actual, expected);
	}
	
	@Test
	void testD() {
		MarkValidator test1 = new MarkValidator();
		char actual = test1.markGrade(41);
		char expected = 'D';
		assertEquals(actual, expected);
	}
	
	@Test
	void testC() {
		MarkValidator test1 = new MarkValidator();
		char actual = test1.markGrade(61);
		char expected = 'C';
		assertEquals(actual, expected);
	}
	
	@Test
	void testB() {
		MarkValidator test1 = new MarkValidator();
		char actual = test1.markGrade(76);
		char expected = 'B';
		assertEquals(actual, expected);
	}
	
	@Test
	void testA() {
		MarkValidator test1 = new MarkValidator();
		char actual = test1.markGrade(91);
		char expected = 'A';
		assertEquals(actual, expected);
	}
}
