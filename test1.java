package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test1 {

	Calculator calc = new Calculator();
	StrReverse strRev = new StrReverse();
	
	Student st1 = new Student(505, "Yusuf", 92.34);
	Student st2 = new Student(465, "Ahmet", 100.00);
	
	@Test
	void addTest() {
		assertEquals(2,calc.add(1,1));
	}
	
	@Test
	void subtractTest () {
		assertEquals(4,calc.subtract(5,1));
	}

	@Test
	void productTest () {
		assertEquals(6,calc.product(2,3));
	}
	
	@Test
	void divideTest () {
		assertEquals(2,calc.divide(6,3));
	}
	
	@Test
	void strRevTest () {
		assertEquals("Hello World", strRev.strRev("dlroW olleH"));
	}
	
	@Test 
	void studentTest() {
		assertEquals(st1.stEquals(st1), true);
		assertEquals(st1.stEquals(st2), false);
	}
}
