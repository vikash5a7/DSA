package practice.stack;

import java.util.Stack;

public class DetectExpression {
	public static void main(String[] args) {
		System.out.println(detectString("(a+b)f+(a+b)"));
	}

	private static boolean detectString(String string) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < string.length(); i++) {
			Character ch = string.charAt(i);
			if (ch == ')') {
				if (stack.peek() == '(') {
					return true;
				} else {
					while (stack.peek() != '(') {
						stack.pop();
					}
					stack.pop();
				}
			} else {
				stack.push(ch);
			}
		}
		return false;
	}
}
