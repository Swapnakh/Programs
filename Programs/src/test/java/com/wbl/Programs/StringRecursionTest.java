package com.wbl.Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringRecursionTest {
	
	@Test
    public void testRecursion1() {
        System.out.println("testreverse ");
        Reversenumbers rs = new Reversenumbers();
        Assert.assertEquals(reverseMethod("Hello World"), "dlrow olleh");
    }

    @Test
    public void testRecursion2() {
        System.out.println("testreverse using recursion");
        Reversenumbers rs = new Reversenumbers();
        Assert.assertEquals(reverseMethod("Hello World"), "Hello World");
    }

}
