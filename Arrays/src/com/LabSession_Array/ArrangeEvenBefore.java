package com.LabSession_Array;

import java.util.Arrays;

public class ArrangeEvenBefore {
	
	static int[] arrange(int a[]) {
	
		int tempArr[]=new int[a.length];
		int index=0;
		for(int n:a) {
			if(n%2==0) {//			2  4  6  8  0
				tempArr[index++]=n;// 0  1  2  3  4
						//  1--2--3--4--5
			}
		}
//		for(int n:a) {
//			if(n%2!=0) {
//				tempArr[index++]=n;
//			}
//		}
//		System.out.println(Arrays.toString(tempArr));
		
		return tempArr;
	}		
	public static void main(String[] args) {


		int[] arr = { 12, 5, 7, 24, 15, 8, 9, 2 };
		
		System.out.println(Arrays.toString(arrange(arr)));


	}

}
