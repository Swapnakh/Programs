package com.wbl.Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
	@Test
	public void test1() {
		int n = 5;
		int actual = Factorial.factorialMethod(n);
		Assert.assertEquals(actual, 120);
	}

	@Test
	public void test2() {
		int n = -5;
		int actual = Factorial.factorialMethod(n);
		Assert.assertEquals(actual, 3628800);
	}

	@Test
	public void test3() {
		int n = 0;
		int actual = Factorial.factorialMethod(n);
		Assert.assertEquals(actual, 3628800);
	}

	@Test
	public void test4() {
		int n = 0;
		int actual = Factorial.factorialMethod(n);
		Assert.assertEquals(actual, 3628800);
	}

}
