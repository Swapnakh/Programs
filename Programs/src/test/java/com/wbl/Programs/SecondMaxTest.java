package com.wbl.Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondMaxTest {
	
	@Test
	public void test1() {
		int a[] = {1,3,5,6,4,7,34,10,5,0,-2,11};
		int result = SecondMax.secondMaxMethod(a);
		Assert.assertEquals(result, 11);
	}
	
	@Test
	public void test2() {
		int a[] = {5,9,7,39285, 444,38,-3,12,32};
		int result =SecondMax.secondMaxMethod(a);
		Assert.assertEquals(result, 444);
	}

}
