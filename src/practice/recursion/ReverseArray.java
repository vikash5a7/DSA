package practice.recursion;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = {2,3,4,5,6,7};
		displayArray(array,0);
	}

	private static void displayArray(int[] array, int i) {
		if(i==array.length) {
			return;
		}
		displayArray(array, i+1);
		System.out.println(array[i]);
		
	}
}
