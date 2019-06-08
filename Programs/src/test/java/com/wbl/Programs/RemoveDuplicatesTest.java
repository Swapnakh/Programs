package com.wbl.Programs;

import org.testng.annotations.Test;

public class RemoveDuplicatesTest {
	@Test
	public void test1() {
		int []arr = {10,20,20,30,30,40,50,50};
		RemoveDuplicate.removeDup(arr);
	}
	
	@Test
	public void test2() {
		int []arr = {8,3,4,6,8,4,6,3};
		RemoveDuplicate.removeDup(arr);
	}
}
