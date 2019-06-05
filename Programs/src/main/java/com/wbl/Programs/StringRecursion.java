package com.wbl.Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringRecursion
{
     public String reverseMethod(String str) {
    
    	    	 reverse(str);
    	    	 return str;
     }
     public static void reverse(String str) {
    	 
    	 if(str.equals("") || str.length()==0) {
    		 
    		 System.out.println(str);
    	 }
    	 else {
    		 
    		 System.out.print(str.charAt(str.length()-1));
    		 reverse(str.substring(0,str.length()-1));
    		 
    	 }
     }
     
     @Test
     public void testRecursion1() {
         System.out.println("testreverse");
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
