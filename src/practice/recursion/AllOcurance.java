package practice.recursion;

public class AllOcurance {
	public static void main(String[] args) {
		int[] array = { 3, 4, 6, 4, 2, 5, 3, 4, 5, 3, 5, 4, 3 };
		int k = 3;
//		int found = 0;
		int[] max = allOccurance(array, 0, k, 0);
		for (int i = 0; i < max.length; i++) {
			System.out.println(max[i]);
		}
	}

	private static int[] allOccurance(int[] array, int i, int k, int found) {
		if (array.length == i) {
			return new int[found];
		}
		if (array[i] == k) {
			int[] arrayFound = allOccurance(array, i + 1, k, found + 1);
			arrayFound[found] = i;
			return arrayFound;
		} else {
			int[] arrayFound = allOccurance(array, i + 1, k, found);
			return arrayFound;
		}

	}

}
