package com.wbl.programs;

public class SecondMax {
	public static int secondMaxMethod(int a[]) {

		int max = a[0];
		int secondmax = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secondmax = max;
				max = a[i];
			} else if (a[i] > secondmax) {
				secondmax = a[i];
			}

		}

		System.out.println("The second maximim is " + secondmax);

		return secondmax;
	}

}
