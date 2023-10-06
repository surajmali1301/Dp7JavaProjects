package com.Advance;

public class PairOfSum {
	
	static void sumOfPair(int a[],int s) {
		
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>s) {
				continue;
			}
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==s) {
					System.out.println("("+a[i]+","+a[j]+")");
				}
			}
		}
	}

	public static void main(String[] args) {


		int ar[]= {1,2,3,4,5,6};
		
		int sum=7;
		
		sumOfPair(ar,sum);

	}

}
