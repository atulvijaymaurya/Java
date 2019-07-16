package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld obj = new HelloWorld();
		String actual = obj.getMessage();
		String expected = "HelloWorld!";
		assertEquals(actual, expected);
	}

}