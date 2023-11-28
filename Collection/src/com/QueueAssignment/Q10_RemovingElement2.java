package com.QueueAssignment;

import java.util.LinkedList;
import java.util.Queue;

public class Q10_RemovingElement2 {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<>();

		myQueue.add(10);
		myQueue.add(20);
		myQueue.add(30);

		int removedElement1 = myQueue.poll();

		int removedElement2 = myQueue.remove();

		System.out.println("Removed elements from the queue: " + removedElement1 + ", " + removedElement2);
	}
}
