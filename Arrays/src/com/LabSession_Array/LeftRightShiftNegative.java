package com.LabSession_Array;

import java.util.Arrays;

public class LeftRightShiftNegative {

	static int[] leftShift(int a[]) {

		int temp[] = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				temp[index++] = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				temp[index++] = a[i];
			}
		}

		return temp;
	}

	static int[] rightShift(int a[]) {

		int temp[] = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				temp[index++] = a[i];

			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				temp[index++] = a[i];
			}
		}

		return temp;
	}

	public static void main(String[] args) {

		int arr[] = { 1, -2, 3, -4 };

		System.out.println("Left Shift: " + Arrays.toString(leftShift(arr)));
		System.out.println("Right Shift: " + Arrays.toString(rightShift(arr)));
	}

}
