package com.LabSession_Array;

import java.util.Arrays;

public class AscendingDecending {

	static void arrange(int a[]) {
		
		int temp[]=new int[a.length/2];
		int index=0;
		for (int i = 0; i < a.length/2; i++) {
			
			if(a[i]>0) {
			temp[i]=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {


		int arr[]= {1,2,3,4,5,6,7,8,9};
		arrange(arr);

	}

}
