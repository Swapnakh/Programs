package com.wbl.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.programs.Reversenumbers;

public class StringRecursionTest {

	@Test
	public void testRecursion1() {
		System.out.println("testreverse ");
        Assert.assertEquals(StringRecursion.reverseMethod("Hello World"), "dlrow olleh");
	}

	@Test
	public void testRecursion2() {
		System.out.println("testreverse using recursion");
		Assert.assertEquals(StringRecursion.reverseMethod("Hello World"), "Hello World");
	}

}
