package com.wbl.programs;

public class PrimeNumber {

	public static int primeMethod(int n) {
		int m = n / 2, flag = 0;
		if (n <= 1)
			System.out.println(" it is not prime");

		for (int i = 2; i < m; i++) { // Checking from 2 to n-1
			if (n % i == 0) {
				System.out.println("it is not a prime number" + n);
				flag = 1;
				break;

			}

		}
		if (flag == 0) {
			System.out.println("it is a prime number" + n);
		}
		return (n);
	}

}
