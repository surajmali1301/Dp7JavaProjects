package com.QueueAssignment;

import java.util.LinkedList;
import java.util.Queue;

public class Q9_RemoveElement {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<>();

		myQueue.add(10);
		myQueue.add(20);
		myQueue.add(30);

		if (!myQueue.isEmpty()) {
			int removedElement = myQueue.poll();
			System.out.println("Removed element from the queue: " + removedElement);
		} else {
			System.out.println("Queue is empty");
		}
	}
}
