package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import soft2.calc;

class TestCases {


	@Test
	public void test() {
		calc c = new calc();
		int act= c.add(4,2);
		assertTrue (act>0);
	}
}


