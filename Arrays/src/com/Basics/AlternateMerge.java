package com.Basics;

import java.util.Arrays;

public class AlternateMerge {


	static int[] merge(int a[],int b[]) {
		
		int merge[]=new int[a.length+b.length];
		
		int index=0;
		
		int max=Math.max(a.length, b.length);
		
		for (int i = 0; i < a.length; i++) {
			if(i<a.length) {
			merge[index++]=a[i];
//			index++;
			}
		
			if(i<b.length) {
			merge[index++]=b[i];
//			index++;
			}
		}
		return merge;
	}
	public static void main(String[] args) {


		int a[]= {1,2,3,4,5};
		int b[]= {4,3,2,1,0};
		
		int []mer=merge(a,b);
		System.out.println(Arrays.toString(mer));
	}

}
