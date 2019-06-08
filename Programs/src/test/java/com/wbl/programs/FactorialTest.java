package com.wbl.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.programs.Factorial;

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
		
	}

	@Test
	public void test3() {
		int n = 0;
		int actual = Factorial.factorialMethod(n);
		Assert.assertEquals(actual,1 );
	}

	

}
