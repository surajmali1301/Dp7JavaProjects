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
		boolean status =true;
		
		if ((n==0)||(n==1)) {
			status = false;
		} 
		for (int i = 2; i <n; i++) {
			if(n%i==0) {
				status = false;
			}
		}
		
		return status;
	}

}
