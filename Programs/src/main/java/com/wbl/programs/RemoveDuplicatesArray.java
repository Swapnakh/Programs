package com.wbl.programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void removeDuplicates(int a[]) {

	HashSet	 st = new HashSet();

		for (int i = 0; i < a.length; i++) {
			st.add(a[i]);
			}
		Iterator<Integer> it = st.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next());
	     }
		}
	

	public static void main(String[] args) {
		int arr[] = { 134, 5, 5, 6, 8, 8, 9 ,100, 100};
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		RemoveDuplicatesArray.removeDuplicates(arr);

	}

}
