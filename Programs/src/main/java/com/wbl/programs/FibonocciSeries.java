package com.wbl.programs;

public class FibonocciSeries {
	
  public static  void fibonocciSeriesMethod (int n) 
		{
		
			 int  previous = 0, present = 1;
		        System.out.print("Fibonacci Series of "+n+" numbers:");
	 
		        int i=1;
		        while(i <= n)
		        { 
		        	System.out.print(previous+" ");
		           int sum = previous + present;
		            previous = present;
		            previous = sum;
		            i++;
		        }
		    }
	 
}
