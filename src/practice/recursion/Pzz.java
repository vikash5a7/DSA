package practice.recursion;

public class Pzz {
	public static void main(String[] args) {
		pizz(3);
	}

	private static void pizz(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		pizz(n-1);
		System.out.print(n+" ");
		pizz(n-1);
		System.out.print(n+" ");
		
	}

}
