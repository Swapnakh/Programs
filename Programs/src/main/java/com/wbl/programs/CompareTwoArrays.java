package com.wbl.programs;

public class CompareTwoArrays {

	public static boolean compareMethod(int a[], int b[]) {
		
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < b.length; j++) {
					if (a[i] == b[j]) {
						System.out.println("equal");
						return  true;
						break;
						

					}
				}
			}
		}
		System.out.println("false");
		return false;

	}

	public static void main(String args[]) {
		int a[] = { 5, 6, 8 };
		int b[] = { 5, 6, 8 };
		CompareTwoArrays.compareMethod();
	}

}
