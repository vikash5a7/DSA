package com.vikash.day1;

public class P3DistictCombination {
	public static void findCombinations(int[] A, String out, int i, int n, int k) {
		if (k > n) {
			return;
		}
		if (k == 0) {
			System.out.println(out);
			return;
		}
		for (int j = i; j < n; j++) {
			findCombinations(A, out + " " + (A[j]), j + 1, n, k - 1);
		}
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3 };
		int k = 2;
		findCombinations(A, "", 0, A.length, k);
	}
}
