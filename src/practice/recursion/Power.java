package practice.recursion;

public class Power {
	public static void main(String[] args) {
		int n = power(4,2);
		System.out.println(n);
	}

	private static int power(int i, int j) {
		if(j==0) {
			return 1;
		}
		return i * power(i,j-1);
	}
}
