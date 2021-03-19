package com.vikash.day2;

import java.util.Stack;

public class P2ReverseString {
	public static void main(String[] args) {
		reverse("HelloWorld");
	}

	private static String reverse(String string) {
		System.out.println("Before Reverse String " + string);
		String reverse = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < string.length(); i++) {
			stack.push(string.charAt(i));
		}
		
		for (int i = 0; i < string.length(); i++) {
			reverse = reverse+stack.pop();
		}
		System.out.println("After Reverse String " + reverse);
		return reverse;
	}
}
