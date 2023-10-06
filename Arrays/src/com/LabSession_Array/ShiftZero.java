package com.LabSession_Array;

import java.util.Arrays;

public class ShiftZero {

	static void shift(int a[]) {
		
		int temp[]=new int[a.length];
		int temp2[]=new int[a.length];
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				temp[index]=a[i];
				index++;;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				temp[index]=a[i];
				index++;;
			}
		}
		
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String[] args) {


		int arr[]= {0,1,2,0,3,-2};
		
		shift(arr);

	}

}
