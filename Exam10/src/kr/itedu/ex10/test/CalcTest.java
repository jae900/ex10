package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(Calc.sum(2, 3),5);
		assertEquals(Calc.sum(5, 6),11);
		assertEquals(Calc.sum(7, 13),20);
	}

}
