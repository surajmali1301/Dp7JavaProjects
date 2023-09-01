package com.LoopLogicalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println(prime(23));
		
		for (int i = 0; i <=50; i++) {
			if (prime(i)) {
				System.out.println(i);
			}
		}

	}
	
	static boolean prime(int n) {
		boolean sts =true;
		
		if ((n==0)||(n==1)) {
			sts = false;
		} else {

			for (int i = 2; i <=n/2; i++) {
				if (n%2==0) {
					sts =false;
					break;
				}
			}
		}
		return true;
	}

}
