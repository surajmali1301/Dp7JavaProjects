package com.LabSession_Array;

import java.util.Arrays;

public class shiftZero2 {

	static int[] rightShift(int a[]) {
		
		int temp[]=new int[a.length];
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				temp[index]=a[i];
				index++;;
			}
		}
		return temp;
	}
	public static void main(String[] args) {


		int arr[]= {1,0,2,3,0,4};

		System.out.println(Arrays.toString(rightShift(arr)));
	}

}
