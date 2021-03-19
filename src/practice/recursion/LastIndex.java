package practice.recursion;

public class LastIndex {
	public static void main(String[] args) {
		int[] array = { 3, 4, 6, 4, 2, 5,3 };
		int k = 3;
		int max = lastOccurance(array, 0, k);
		System.out.println(max);
	}

	private static int lastOccurance(int[] array, int i, int k) {
		if (array.length == i) {
			return -1;
		}
		int indexValue = lastOccurance(array, i + 1, k);
		if (indexValue == -1) {
			if (array[i] == k) {
				return i;
			} else {
				return -1;
			}
		} else {
			return indexValue;
		}
	}

}
