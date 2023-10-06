package com.Basics;

import java.util.Arrays;

public class MergeArray {

	static int[] merge(int a[],int b[]) {
		
		int merge[]=new int[a.length+b.length];
		
		int i=0;
		
		for (int j = 0; j < a.length; j++) {
			merge[i]=a[j];
			i++;
		}
		for (int j = 0; j < b.length; j++) {
			merge[i]=b[j];
			i++;
		}
		return merge;
	}
	public static void main(String[] args) {


		int a[]= {1,2,3,4,5};
		int b[]= {4,3,2,1};
		
		int []mer=merge(a,b);
		System.out.println(Arrays.toString(mer));
	}

}
