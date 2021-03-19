package com.vikash.day1;

public class ProductOfOthers2P {
	public static void main(String[] args) {
		int[] nums = { 5, 3, 4, 2, 6, 8 };
		int[] array = productOfNumber(nums);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

	private static int[] productOfNumber(int[] nums) {
		int[] output = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			output[i] = multiple(nums, i);
		}
		return output;
	}

	private static int multiple(int[] nums, int i) {
		int multiple = 1;
		for (int j = 0; j < nums.length; j++) {
			if (j == i) {
				multiple = multiple * 1;
			} else {
				multiple = multiple * nums[j];
			}
		}
		return multiple;
	}
}
