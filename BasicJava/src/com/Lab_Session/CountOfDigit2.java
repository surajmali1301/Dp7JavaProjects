package com.Lab_Session;
import java.util.*;
class Count{
	static void num(int num) {
		for(int i=0;i<9;i++) {
			int count=0;
			int temp=num;
			while(temp>0) {
				int rem = temp%10;
				
				if(rem ==i) {
					count++;
				}
				temp/=10;
			}
			
			if(count>0) {
				System.out.println("Count of number "+i+" : "+count);
			}
		}
		
	}
}
public class CountOfDigit2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		Count.num(num);
	}

}
