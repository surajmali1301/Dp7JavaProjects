package com.LabSession_Array;

import java.util.Arrays;

public class Ascending_Descending {
    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int mid = arr.length / 2;
        reverse(arr, mid, arr.length - 1);

        System.out.print("Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
