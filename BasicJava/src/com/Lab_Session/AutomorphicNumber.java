package com.Lab_Session;

import java.util.*;

public class AutomorphicNumber {

    public static void main(String[] args) {
        int num = 625; // Change this to check for a different number

        if (isAutomorphic(num)) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }
    }

    static boolean isAutomorphic(int num) {
        int numCopy = num;
        int numDigits = 0;

        // Count the number of digits in num
        while (numCopy > 0) {
            numCopy /= 10;
            numDigits++;
        }

        int divisor = 1;

        // Compute the divisor for the modulo operation
        for (int i = 0; i < numDigits; i++) {
            divisor *= 10;
        }

        int square = num * num;

        // Check if the last digits of square are equal to num
        return square % divisor == num;
    }
}
