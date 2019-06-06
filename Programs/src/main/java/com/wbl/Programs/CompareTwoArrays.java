package com.wbl.Programs;

public class CompareTwoArrays {

	public static  boolean compareMethod() {
	 int a[]= {5, 6,8};
	 int b[]= {5,6,8};
	 if (a.length==b.length) {
	    for(int i=0; i<a.length;i++)
	   {
	       for(int j=i+1; j<b.length; j++) {
	    	   if (a[i]==b[j]) {
	    		   System.out.println("equal");
	    		   break;
	    	    retur2n true;
	    	    
	           }
	    	}
	    }	 
	 }
	 System.out.println("false");
	     return false;
	    	 
	}
	 public static void main(String args[]){
		 CompareTwoArrays.compareMethod();
	 }
	    
	 
}
	 
	 
	 
