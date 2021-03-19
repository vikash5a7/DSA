package com.vikash.day1;

public class P7PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(71));
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
