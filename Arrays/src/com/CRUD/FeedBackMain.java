package com.CRUD;
import java.util.*;
public class FeedBackMain {

public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		
		FeedBack_Implementation fi = new FeedBack_Implementation();
		int op;
		do {
			System.out.println("1.Give Feedback\n2.Show Feedback\n3.Edit Feedback\n4.Delete Feedback\n5.Exit");
			System.out.println("--------------------------------");
			System.out.print("Choose Option: ");
			 op = sc.nextInt();
			
			switch (op) {
			case 1:fi.createFeedBack();
				break;
				
			case 2:fi.showFeedBack();
				break;
				
			case 3:fi.editFeedBack();
				break;
				
			case 4:fi.deleteFeedBack();
				break;

			case 5:
				System.exit(0);;
			}
		} while (true);
	}

}
