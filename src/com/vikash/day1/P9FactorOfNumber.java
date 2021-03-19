package com.vikash.day1;

public class P9FactorOfNumber {
	public static void main(String[] args) {
		factoreOfNum(100);
	}

	private static void factoreOfNum(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("Factor of " + i + ": ");
			factor(i);
			System.out.println();
		}

	}

	private static void factor(int i) {
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				System.out.print(j + " ");
			}
		}

	}

}
