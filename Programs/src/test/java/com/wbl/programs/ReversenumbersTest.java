package com.wbl.programs;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.programs.Reversenumbers;

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
	
	@Test
	public  static  void testresult3(){
		Reversenumbers rs=new Reversenumbers();
		int  actual =	 rs.reversemethod(0);
		int expected= 0;
			Assert.assertEquals(actual,expected);
		
		}
		
	}
	

