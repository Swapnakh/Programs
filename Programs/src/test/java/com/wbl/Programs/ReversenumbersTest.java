package com.wbl.Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReversenumbersTest {

	@Test
	public  static  void testresult1(){
		Reversenumbers rs=new Reversenumbers();
		int  actual =	 rs.reversemethod(121);
		int expected= 121;
			Assert.assertEquals(actual,expected);
		
		}
		
	@Test
	public  static  void testresult2(){
		Reversenumbers rs=new Reversenumbers();
		int  actual =	 rs.reversemethod(185);
		int expected= 581;
			Assert.assertEquals(actual,expected);
		
		}
		
	}
	
}
