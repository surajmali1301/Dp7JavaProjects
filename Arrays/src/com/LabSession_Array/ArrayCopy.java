package com.LabSession_Array;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayCopy {
	
	static void copy(int a[]) {
		
		int temp[]=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			temp[i]=a[i];
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {


		int arr[]= {1,2,3,4,5,6,7,8,9,0};

		copy(arr);
	}

}
