package com.QueueAssignment;
//5.	WAP to check if a queue has values
import java.util.LinkedList;
import java.util.Queue;

public class Q5_HasValue {

	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<>();

		if (!myQueue.isEmpty()) {
			System.out.println("Queue is not empty");
		} else {
			System.out.println("Queue is empty");
		}
	}
}
