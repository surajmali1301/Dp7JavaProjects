package com.QueueAssignment;

import java.util.LinkedList;
import java.util.Queue;

public class Q11_RemoveNon_Exixting {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<>();

		int removedElement = myQueue.poll();

		if (removedElement != -1) {
			System.out.println("Removed element from the queue: " + removedElement);
		} else {
			System.out.println("Queue is empty, cannot remove non-existing element");
		}
	}
}