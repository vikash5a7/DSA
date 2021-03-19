package com.vikash.day2;

import java.util.Stack;

public class P3BalancedBrackets {
	public static void main(String[] args) {
		boolean isBalanced = balanced("[])");
		if (isBalanced) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}

	private static boolean balanced(String string) {
		if (string.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.add(c);
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (c) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

}
