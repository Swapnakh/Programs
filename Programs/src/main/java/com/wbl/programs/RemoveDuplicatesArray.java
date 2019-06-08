package com.wbl.programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void removeDuplicates(int a[]) {

		Set st = new HashSet();

		for (int i = 0; i < a.length; i++) {
			if (st.add(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 134, 5, 5, 6, 8, 8, 9 };
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		RemoveDuplicatesArray.removeDuplicates(arr);

	}

}
