package com.wbl.programs;

import org.testng.annotations.Test;

public class SwapTwoNumbersTest {

	@Test
	public void test1() {

		int a = 30;
		int b = 40;
		SwapTwoNumbers.swap(a, b);

	}

	@Test
	public void test2() {

		int a = -30;
		int b = -40;
		SwapTwoNumbers.swap(a, b);
	}

	@Test
	public void test3() {

		int a = -30;
		int b = 40;
		SwapTwoNumbers.swap(a, b);
		;
	}

	@Test
	public void test4() {

		int a = 0;
		int b = -40;
		SwapTwoNumbers.swap(a, b);
	}

	@Test
	public void test5() {

		int a = 3;
		int b = 0;
		SwapTwoNumbers.swap(a, b);
	}

	@Test
	public void test6() {

		int a = 0;
		int b = 0;
		SwapTwoNumbers.swap(a, b);
	}
}
