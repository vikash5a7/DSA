package com.vikash.day1;

public class DigitCounter {
	public static void main(String[] args) {
		int numberOfDigit = numberOfDigit(34534534);
		System.out.println("the number of words " + numberOfDigit);
	}

	private static int numberOfDigit(int i) {
		return String.valueOf(i).length();
	}
}
