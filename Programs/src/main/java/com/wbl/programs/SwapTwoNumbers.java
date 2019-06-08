package com.wbl.programs;

public class SwapTwoNumbers {

	public static void swap(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swaping:" + " x = " + x + ", y = " + y);
	}

	public static void main(String args[]) {
		int a = 10;
		int b = 5;
        SwapTwoNumbers.swap(10,5);
	}

}
