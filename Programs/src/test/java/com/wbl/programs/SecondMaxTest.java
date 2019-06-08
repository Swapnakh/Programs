package com.wbl.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.programs.SecondMax;

public class SecondMaxTest {
	
	@Test
	public void test1() {
		int a[] = {1,3,5,6,4,7,34,10,5,0,-2,11,};
		int result = SecondMax.secondMaxMethod(a);
		Assert.assertEquals(result, 11);
	}
	
	@Test
	public void test2() {
		int a[] = {-5,-3,-10, -32};
		int result =SecondMax.secondMaxMethod(a);
		Assert.assertEquals(result,-5);
	}
	
	@Test
	public void test3() {
		int a[] = {-3,2 ,2, 0};
		int result =SecondMax.secondMaxMethod(a);
		Assert.assertEquals(result, 0);
	}

}
