package com.Basics;

import java.util.Arrays;

public class FindFrequency {

	static void frequency(int ar[]) {
		
		int count;
		boolean visited=true;
		for (int i = 0; i < ar.length-1; i++) {
			count=1;
			visited=false;
			for (int j = i-1; j >=0; j--) {
				if(ar[i]==ar[j]) {
					visited=true;
					break;
				}
			}
			if(visited==false) {
				for (int k = i+1; k < ar.length; k++) {
					if(ar[i]==ar[k]) {
						count++;
					}
				}
				System.out.println(ar[i]+"->"+count);
			}
		}
	}
	public static void main(String[] args) {


		int arr[]= {1,2,3,3,4,7,7};

		frequency(arr);
		
//		System.out.println(Arrays.toString(arr));
	}

}
