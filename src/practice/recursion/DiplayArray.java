package practice.recursion;

public class DiplayArray {
	public static void main(String[] args) {
		int[] array = {2,3,4,5,6,7};
		displayArray(array,0);
	}

	private static void displayArray(int[] array, int i) {
		if(i==array.length) {
			return;
		}
		System.out.println(array[i]);
		displayArray(array, i+1);
		
	}
}
