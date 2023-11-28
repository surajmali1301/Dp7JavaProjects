package com.QueueAssignment;

import java.util.LinkedList;
import java.util.Queue;

class Q12_RemoveNonExisting2 {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<>();

		int removedElement1 = myQueue.poll();

		int removedElement2 = myQueue.remove();

		System.out.println("Removed elements from the queue: " + removedElement1 + ", " 
		+ removedElement2);
	}
}
