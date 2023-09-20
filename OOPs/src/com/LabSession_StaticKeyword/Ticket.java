package com.LabSession_StaticKeyword;

public class Ticket {

	private int ticketId;
	private int ticketPrice;
	static int availableTickets;// 25

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>=0) {
		Ticket.availableTickets = availableTickets;
		}
		else {
			System.out.println("Enter positive value only-->(1,2,3)");
		}
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}
	
	public int calculateTicketCost(int noOfTickets) {
		if(noOfTickets <= availableTickets) {
			availableTickets -= noOfTickets;
			return noOfTickets * ticketPrice;
		}
		else {
			return -1;
		}
	}

}
