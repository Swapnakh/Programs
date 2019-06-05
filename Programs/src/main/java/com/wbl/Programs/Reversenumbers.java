package com.wbl.Programs;


import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Reversenumbers
{
   public  int reversemethod(int a)
   {

      int reversenumbers =0;
    
      
      while( a != 0 )
      {
          reversenumbers = reversenumbers * 10;
          reversenumbers = reversenumbers + a%10;
          a = a/10;
      }

      System.out.println("Reversed numbers are : "+reversenumbers);
      return(reversenumbers);
   }
   


@Test
public void testReverse1() {
    System.out.println("testreverse");
    Reversenumbers rs = new Reversenumbers();
    Assert.assertEquals(reversemethod(156), 651);
}

@Test
public void testReverse2() {
    System.out.println("testreverse");
    Reversenumbers rs = new Reversenumbers();
    Assert.assertEquals(reversemethod(156), 156);
}
}
