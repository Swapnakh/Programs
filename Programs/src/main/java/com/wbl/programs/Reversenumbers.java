package com.wbl.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Reversenumbers {
	public int reversemethod(int a) {
		int reversenumbers = 0;

		while (a != 0) {
			reversenumbers = reversenumbers * 10;
			reversenumbers = reversenumbers + a % 10;
			a = a / 10;
		}

		System.out.println("Reversed numbers  are : " + reversenumbers);
		return (reversenumbers);
	}
}
