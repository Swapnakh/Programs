package com.wbl.Programs;

public class Factorial {

	public static int factorialMethod(int n) {
		int i, fact = 1;

		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
		return fact;

	}

}
