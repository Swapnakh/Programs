package com.wbl.Programs;

public class FibonocciSeries {
	
	
		 
		public static  void fibonocciMethod (int n) 
		{
		
			 int  previous = 0, next = 1;
		        System.out.print("Fibonacci Series of "+n+" numbers:");
	 
		        int i=1;
		        while(i <= n)
		        { 
		        	System.out.print(previous+" ");
		           int sum = previous + next;
		            previous = next;
		            next = sum;
		            i++;
		        }
		        
		}
	 


}
