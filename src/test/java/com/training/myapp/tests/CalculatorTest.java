package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Calculator;

public class CalculatorTest {
	
	@Test
	public void testPower() {
		assertEquals(27, Calculator.power(3, 3));
	}

}
