package com.vikash.day1;

public class P9removingElementFromArray {
	public static void main(String[] args) {
		int[] intArr = { 1, 2,3,4,5};
		removing(intArr, 4);
	}

	private static void removing(int[] intArr, int elem) {
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == elem) {
				for (int j = i; j < intArr.length - 1; j++) {
					intArr[j] = intArr[j + 1];
				}
				break;
			}
		}
		for (int i = 0; i < intArr.length - 1; i++) {
			System.out.print(" " + intArr[i]);
		}
	}
}
