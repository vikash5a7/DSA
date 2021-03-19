package practice.recursion;

public class Hanoi {
	public static void main(String[] args) {
		System.out.println("moving disk from A to B");
		Hanoi1(2, 'A', 'B', 'C');
		System.out.println("moving disk from A to C");
		Hanoi2(2, 'A', 'B', 'C');
	}

	private static void Hanoi2(int i, char id1, char id2, char id3) {
		if (i == 0) {
			return;
		}
		Hanoi1(i - 1, id1, id3, id2);
		System.out.println(i + "[ " + id1 + " -> " + id3 + "]");
		Hanoi1(i - 1, id3, id1, id2);
	}
	
	private static void Hanoi1(int i, char id1, char id2, char id3) {
		if (i == 0) {
			return;
		}
		Hanoi1(i - 1, id1, id3, id2);
		System.out.println(i + "[ " + id1 + " -> " + id2 + "]");
		Hanoi1(i - 1, id3, id2, id1);
	}
}
