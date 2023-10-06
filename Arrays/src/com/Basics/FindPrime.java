package com.Basics;

public class FindPrime {
	static void findPrimes(int arr[]) {
		int sum=0;
		for (int num : arr) {//prints all array numbers
			boolean status = true;
			if (num < 2) {
				status = false;
			} else {
				for (int i = 2; i <= num/2; i++) {
					if (num % i == 0) {
						status = false;
						break;
					}
				}
			}
			if (status) {
				sum+=num;
				System.out.println(num + " ");
			}
		}
		System.out.print("Sum: "+ sum);
	}

	public static void main(String[] args) {
		int[] num = { 1,2,3,4,5,6,7,8};

		findPrimes(num);
	}
}
