package com.QueueAssignment;
//9.	WAP to create a Queue using generics and add user defined class objects which 
//implements comparable interface. Observe order when removing from queue.
import java.util.LinkedList;
import java.util.Queue;

public class Q8_checkElement {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<>();

		myQueue.add(10);
		myQueue.add(20);
		myQueue.add(30);

		if (!myQueue.isEmpty()) {
			int topElement = myQueue.peek();
			System.out.println("Top element in the queue: " + topElement);
		} else {
			System.out.println("Queue is empty");
		}
	}
}
