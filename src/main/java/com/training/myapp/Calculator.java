package com.training.myapp;

public class Calculator {

	public static long power(int x, int y) {
		if(y == 0)
			return 1;
		
		long result = 0;		
		for(int i = 1; i <= y; i++) {
			 result = result + (x * x); 
		}
		return result;
	}

}

