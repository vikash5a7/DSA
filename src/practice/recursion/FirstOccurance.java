package practice.recursion;

public class FirstOccurance {
	public static void main(String[] args) {
		int[] array = { 3, 4, 6, 4, 2, 5 };
		int k = 3;
		int max = firstOccurance(array, 0, k);
		System.out.println(max);
	}

	private static int firstOccurance(int[] array, int i, int k) {
		if (array.length == i) {
			return -1;
		}

		if (array[i] == k) {
			return i;
		} else {
			int index = firstOccurance(array, i + 1, k);
			return index;
		}
	}

}
