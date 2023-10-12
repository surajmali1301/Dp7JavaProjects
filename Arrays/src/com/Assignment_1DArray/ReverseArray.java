package com.Assignment_1DArray;

import java.util.Arrays;

public class ReverseArray {

	static void reverse(int a[]) {
        int index = 0;
        int end = a.length - 1;
        int temp;

        while (index < a.length-1) {
            temp = a[index];
            a[index] = a[end];
            a[end] = temp;
            
            index++;
            end--;
        }
	}

	public static void main(String[] args) {

		int  arr[] = {3, 90, 45, 29, 37, 78};
		System.out.println("Before: "+Arrays.toString(arr));
		reverse(arr);
		
		System.out.println("After: "+Arrays.toString(arr));
	}

}
