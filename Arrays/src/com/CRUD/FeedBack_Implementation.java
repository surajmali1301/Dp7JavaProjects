package com.CRUD;

import java.util.*;

public class FeedBack_Implementation implements FeedBackDetails {

	static Scanner sc = new Scanner(System.in);
	FeedBack f[] = new FeedBack[1];
	int count = 0;

	public void createFeedBack() {

		System.out.println("Enter Feedback Details ");

		for (int i = 0; i < f.length; i++) {

			System.out.print("Enter Your Name: ");
			String uName = sc.nextLine();
		

			System.out.print("Enter Email Id: ");
			String uEmail = sc.next();

			sc.nextLine(); // Consume the newline character left by next()

			System.out.print("Enter Your Feedback: ");
			String feedBack = sc.nextLine();

//            sc.next();

			System.out.print("Give Rating: ");
			int rating = sc.nextInt();
			
			System.out.println("------------------------------");

			f[count] = new FeedBack(uName, uEmail, feedBack, rating);
			count++;
		}

	}

	@Override
	public void showFeedBack() {

		for (FeedBack feedBack : f) {
			System.out.println(feedBack);
		}
		System.out.println("-------------------------------");
	}

	@Override
	public void editFeedBack() {

		System.out.println("*****Edit Feedback*****");
		for (int i = 0; i < f.length; i++) {

			if (f[i].getFeedBack() != null&&f[i].getRating()!=0) {
				System.out.print("Give New Feedback: ");
				f[i].setFeedBack(sc.nextLine());;
				
				sc.nextLine();
				
				System.out.print("Give new rating: ");
				f[i].setRating(sc.nextInt());
			}
		}

		System.out.println("Feedback Edited");
		
		System.out.println("\n------------------------");
	}

	@Override
	public void deleteFeedBack() {

		for (int i = 0; i < f.length; i++) {
			
			if (f[i].getFeedBack()!=null) {
				f[i]=null;
				
			}
		}
		System.out.println("Feedback Deleted");
		System.out.println("-----------------------");

	}

	@Override
	public void searchFeedBack() {
		
		
	}
	
	

}
