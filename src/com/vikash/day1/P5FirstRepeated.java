package com.vikash.day1;

import java.util.HashSet;
import java.util.Set;

public class P5FirstRepeated {
	public static void main(String[] args) {
		int[] array = {1,2,3,10,2,4,5,7,8};
		int n = firstOccurance(array);
		System.out.println("first--> " + n);
	}

	private static int firstOccurance(int[] array) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(array[0]);
		for (int i = 1; i < array.length; i++) {
			if(set.contains(array[i])) {
				return array[i];
			}else {
				set.add(array[i]);
			}
		}
		return -1;
	}
	
	
}
