package com.LabSession_StaticKeyword;

import java.util.*;

public class TicketBookingMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket.availableTickets = 25;

		System.out.print("Enter the no of Bookings : ");
		int noOfBookings = sc.nextInt();

		for (int i = 0; i < noOfBookings; i++) {
			System.out.print("Enter ticket Id: ");
			int tId = sc.nextInt();
			Ticket t1 = new Ticket();
			t1.setTicketId(tId);

			System.out.print("Enter the no of tickets: ");
			int noOfTickets = sc.nextInt();
			
			System.out.print("Enter the ticket price: ");
			int tPrice = sc.nextInt();
			t1.setTicketPrice(tPrice);
			
			int totalAmount = t1.calculateTicketCost(noOfTickets);

			if (totalAmount != -1) {
				System.out.println("\nAvailabe Tickets: " + t1.availableTickets);
				System.out.println("\nTotal Amount: " + totalAmount);
				System.out.println("\nAvailabe Tickets after booking: " + t1.getAvailableTickets());
			} else {
				System.out.println("\nTickets are not availabe.......");
			}
		}
		sc.close();

	}

}
