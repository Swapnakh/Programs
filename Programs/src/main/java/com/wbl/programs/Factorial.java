package com.wbl.programs;

public class Factorial {

	public static int factorialMethod(int n) {
		int fact = 1;
		if (n == 1 | n == 0) {
			System.out.println("Factorial of " + n + " is: " + fact);
			return 1;
		} else if (n <= -1) {
			System.out.println("enter a postivie number");
		} else if (n > 1) {
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}

			System.out.println("Factorial of " + n + " is: " + fact);
		}

		return fact;
	}

	public static void main(String args[]) {

		Factorial.factorialMethod(0);

	}
}