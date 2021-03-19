package com.vikash.day1;

public class P4ouseThiefProblem {

	public static void main(String[] args) {
		int[] array = { 6, 8,9,4 };

				System.out.println(rob(array));
//		int[] array2 = {6,1,1,4};
////		System.out.println(rob(array2));
////		System.out.print(maxLoot(array2, array2.length));
//
//		int n = robbery(array, 0);
//		System.out.println("answer: " + n);
	}

	private static int robbery(int[] wealth, int currentIndex) {
		if (currentIndex >= wealth.length) {
			return 0;
		}
		int x = robbery(wealth, currentIndex + 2);
		System.out.println("x " + x);
		int steatCurrent = wealth[currentIndex] + x;
		System.out.println("steatCurrent " + steatCurrent);
		int skipCurrent = robbery(wealth, currentIndex + 1);
		System.out.println("skip " + skipCurrent);
		return Math.max(steatCurrent, skipCurrent);
	}

	public static int rob(int[] num) {
		int prevMax = 0;
		int currMax = 0;
		for (int x : num) {
			int temp = currMax;
			currMax = max(prevMax + x, currMax);
			prevMax = temp;
		}
		return currMax;
	}

	public static int max(int a, int b) {
		return (a >= b) ? a : b;
	}

	static int maxLoot2(int hval[], int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return hval[0];
		if (n == 2)
			return Math.max(hval[0], hval[1]);

		// dp[i] represent the maximum value stolen
		// so far after reaching house i.
		int[] dp = new int[n];

		// Initialize the dp[0] and dp[1]
		dp[0] = hval[0];
		dp[1] = Math.max(hval[0], hval[1]);

		// Fill remaining positions
		for (int i = 2; i < n; i++)
			dp[i] = Math.max(hval[i] + dp[i - 2], dp[i - 1]);

		for (int i = 0; i < dp.length; i++) {
			System.out.println(dp[i]);
		}

		return dp[n - 1];
	}

	static int maxLoot(int hval[], int n) {
		if (n == 0)
			return 0;

		int value1 = hval[0];
		if (n == 1)
			return value1;

		int value2 = Math.max(hval[0], hval[1]);
		if (n == 2)
			return value2;

		// contains maximum stolen value at the end
		int max_val = 0;

		// Fill remaining positions
		for (int i = 2; i < n; i++) {
			max_val = Math.max(hval[i] + value1, value2);
			value1 = value2;
			value2 = max_val;
		}
		return max_val;
	}

}
