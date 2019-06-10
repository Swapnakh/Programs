package com.wbl.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.programs.Reversenumbers;

public class StringRecursionTest {

	@Test
	public void testRecursion1() {
		System.out.println("testreverse ");
	String actual =	StringRecursion.reverseMethod("Hello World");
        Assert.assertEquals(actual, "dlrow olleh");
	}

	@Test
	public void testRecursion2() {
		System.out.println("testreverse using recursion");
		 String actual=StringRecursion.reverseMethod(" ");
		Assert.assertEquals(actual, " ");
	}

	@Test
	public void testRecursion3() {
		System.out.println("testreverse using recursion");
		 String actual=StringRecursion.reverseMethod("HELLO WORLD");
		Assert.assertEquals(actual, "DLROW OLLEH");
	}
	
	@Test
	public void testRecursion() {
		System.out.println("testreverse using recursion");
		 String actual=StringRecursion.reverseMethod("hElLo WoRlD");
		Assert.assertEquals(actual, "DlRoW oLleh");
	}
	
}
