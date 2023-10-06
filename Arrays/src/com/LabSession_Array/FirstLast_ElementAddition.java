package com.LabSession_Array;

import java.util.Arrays;

public class FirstLast_ElementAddition {
	
	static void addition(int a[]) {
		
		int temp[]=new int[a.length];
		int index=0;
		for (int i = 0; i < a.length/2; i++) {
			
			index=a[i]+a.length-i;
		
		}
		System.out.println(index);
		}


	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6};

		addition(arr);
	}

}
