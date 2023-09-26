package com.Revision_Codes;

public class AlternatePrime {
    // to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) 
        	return false;
        if (num == 2) 
        	return true;
        if (num % 2 == 0) 
        	return false;

        for (int i = 3; i <=Math.sqrt(num); i += 2) {
            if (num % i == 0)//
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int count = 2;

        while (count <= 50) {
            if (isPrime(count)) {
                System.out.print(count + " ");
                count += 2; // Skip the next number
            }
            count++;
        }
    }
}
