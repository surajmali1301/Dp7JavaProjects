package com.LabSession_Array;

//find the element who has more frequency
public class FindFrequencyOfNumber {

	static void frequency(int ar[]) {

		int max = 0;
		int elementFreq = 0;

		for (int i = 0; i < ar.length; i++) {
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				elementFreq = ar[i];
			}
		}
		System.out.println("Max Frequency of " + elementFreq + " is " + max);
	}

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 2, 3, 3, 4, 7, 7, 7, 7 };

		frequency(arr);

//	System.out.println(Arrays.toString(arr));
	}

}
