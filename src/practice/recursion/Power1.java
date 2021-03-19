package practice.recursion;

public class Power1 {
	public static void main(String[] args) {
		int   n = power(345,45);
		System.out.println(n);
	}

	private static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int xpnb2 = power(x, n/2);
		int result = xpnb2*xpnb2;
		if(n%2==1) {
			result = result*x;
		}
		return result;
	}
}
