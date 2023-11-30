package lab3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.time.Duration.ofMillis;

import static java.time.Duration.ofMinutes;

import org.junit.jupiter.params.provider.EnumSource;



class Testing {
	
	@Test
	void assertAllTest() {
		/* assertEquals(4,2+2);
		assertNotEquals(4,2+2);
		assertFalse(true); */
		
		assertAll("Which one has failed?", ()-> assertEquals(4,2+2),()->assertNotEquals(4,2+2),()->assertFalse(true));
	}
	
	@Test
	void groupedAssertions() {
		FullName fname = new FullName ("Yusuf Selman", "Abacý");
		assertAll("address", () -> assertEquals("Faruk", fname.getFirstName()), () -> assertEquals ("Abacý", fname.getLastName()));
	}
	
	@Test
	void testDivideByZero() {
		DivideCalculator dc = new DivideCalculator();
		assertThrows(ArithmeticException.class, () -> { dc.divide(10.0,0.0); });
	}

	@Test
	void timeoutNotExceeded() {
		
		assertTimeout(ofMinutes(2), () -> { System.out.println("Test assertTimeOut with a simple print"); });
	}
	
	@Test
	void timeoutExceeded() {
		
		assertTimeout(ofMillis(10), () -> { Thread.sleep(100); });
	}

	@Test
	void timeoutExceededWithPreemptiveTermination() {
		
		assertTimeoutPreemptively(ofMillis(10), () -> { Thread.sleep(100); });
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Hello", "World"})
	void testWithStrings(String argument) {
		System.out.println("Parameterized test with (String) argument: " + argument);
		assertEquals(argument, "Hello");
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0, 1})
	void testWithInts(int argument) {
		System.out.println("Parameterized test with (int) argument: " + argument);
		assertNotNull(argument);
	}
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void testWithEnum(TimeUnit argument) {
		System.out.println("Parameterized test with (TimeUnit) argument: " + argument);
		assertNotNull(argument);
	}	
}
