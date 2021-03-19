package com.vikash.day1;

public class P6CoinProblem {
	public static void main(String[] args) {
		int num= coin(30);
		System.out.println("Output: "+ num);
		System.out.println("output: " + coin(23456));
	}

	private static int coin(int n) {
		int[] array = {2000,500,100,50,20,10,5,2,1};
		int count=0;
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			if(j<n) {
				count++;
				int notes = n/j;
				n= n-(notes*j);
				System.out.println("Rs."+j+"*"+notes);
			}
			if(n==0) {
				break;
			}
			
		}
		return count;
	}

}
