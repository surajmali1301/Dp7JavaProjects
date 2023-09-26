package com.Revision_Codes;

public class Exam {

	public static void main(String[] args) {
//		int a=10;
//		
//		if(a==9) {
//			System.out.println("Hello");
//		System.out.println("Welcome");	
//		}
////		else 
////			System.out.println("Bye");
//		
		outer:
		for (int i = 1; i <=4; i++) {
			inner:
			for (int j = 1; j <=4; j++) {
				if(j==1)
					break outer;
			}
			System.out.print("A");
		}
		
		
//		int cnt =0;
//		while(true)
//		{
//			if(cnt>4) 
//				break;
//			if(cnt==0) {
//				cnt++;
////				continue;
//			}
//			System.out.println(cnt+",");
//			cnt++;
//		}
		
	}
}
