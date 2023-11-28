package com.QueueAssignment;
//4.	Use 2 different method calls to add elements to a queue.
import java.util.LinkedList;
import java.util.Queue;

public class Q4_AddDiffrentElements {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<>();

		myQueue.offer(10);

		myQueue.add(20);

		System.out.println("Queue after adding elements: " + myQueue);
	}
}
