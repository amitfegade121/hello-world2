package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Greeter;

public class GreeterTest {
	
	@Test
	public void testGreet() {
		Greeter greeter = new Greeter();
		assertEquals("Hello, John", greeter.greet("John"));
	}

}
