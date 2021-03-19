package com.vikash.day1;

import java.util.HashMap;
import java.util.Map;

public class P8SeachElement {
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 9, 8, 7 };
		int[] array2 = { 4, 1, 2, 10, 15 };
		int[] array3 = { 5, 1, 2, 4, 10 };
		searchWord(array1, array2, array3);
	}

	private static void searchWord(int[] array1, int[] array2, int[] array3) {

		for (int i : array1) {
			addToMap(i);
		}
		for (int i : array2) {
			addToMap(i);
		}
		for (int i : array3) {
			addToMap(i);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 2) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}
	}

	private static void addToMap(int i) {
		map.put(i, map.getOrDefault(i, 0) + 1);

	}

}
