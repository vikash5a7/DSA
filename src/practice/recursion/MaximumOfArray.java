package practice.recursion;

public class MaximumOfArray {
	public static void main(String[] args) {
		int[] array = { 3, 4, 6, 4, 2, 5 };
		int max = maxArray(array, 0);
		System.out.println(max);
	}

	private static int maxArray(int[] array, int i) {
		
		if(i==array.length-1) {
			return array[i];
		}
		int n =maxArray(array,i+1);
		if(n>array[i]) {
			return n;
		}else {
			return array[i];
		}
		
	}

}
