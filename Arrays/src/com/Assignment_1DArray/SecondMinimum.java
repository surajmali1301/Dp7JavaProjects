package com.Assignment_1DArray;

public class SecondMinimum {

    static void find2ndMinimum(int a[]) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin && a[i] != min) {
                secondMin = a[i];
            }
        }
        System.out.println("Second Minimum Number: " + secondMin);
    }

    public static void main(String[] args) {

        int arr[] = {-20, 0, -25, 15, 19, 37, 23 };
        find2ndMinimum(arr);
    }
}
