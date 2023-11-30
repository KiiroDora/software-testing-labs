package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CFGtestTest {
	public CFGtest cfg = new CFGtest();
	
	@Test
	void test1() {
		assertEquals(cfg.foo(1, 1, 1), 1); //1-3-5
	}
	@Test
	void test2() {
		assertEquals(cfg.foo(2, 0, 2), 2); //1-2-3-4-5
	}
	@Test
	void test3() {
		assertEquals(cfg.foo(2, 1, 2), 3); //1-3-4-5
	}
	@Test
	void test4() {
		assertEquals(cfg.foo(3, 0, 0), 0); //1-2-3-5
	}

}
