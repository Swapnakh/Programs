package com.wbl.Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumbersTest {

	@Test
	public void test1() {
		int a=10;
		int result = PrimeNumber.primeMethod(a);
		Assert.assertFalse(false);
	}
	
	@Test
	public void test2() {
		int n = 101;
		int result =PrimeNumber.primeMethod(n);
		Assert..assertTrue(true);
	}
}
