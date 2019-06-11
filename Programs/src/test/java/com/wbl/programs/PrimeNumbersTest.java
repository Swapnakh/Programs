package com.wbl.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.programs.PrimeNumber;

public class PrimeNumbersTest {

	@Test
	public void test1() {
		int a=10;
		int actual = PrimeNumber.primeMethod(a);
		Assert.assertEquals(actual,3628800);
	}
	
	@Test
	public void test2() {
		int n = 0;
		int actual =PrimeNumber.primeMethod(n);
		Assert.assertEquals(actual,1);
	}
	
	@Test
	public void test3() {
		int n = -5;
		int actual =PrimeNumber.primeMethod(n);
	
	}
	
}
