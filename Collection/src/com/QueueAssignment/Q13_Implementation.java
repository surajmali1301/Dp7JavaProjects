package com.QueueAssignment;

class CustomQueue {
	private static final int MAX_SIZE = 10;
	private int[] array = new int[MAX_SIZE];
	private int front = 0;
	private int rear = -1;
	private int size = 0;

	public void enqueue(int element) {
		if (size == MAX_SIZE) {
			System.out.println("Queue is full. Cannot enqueue.");
			return;
		}
		rear = (rear + 1) % MAX_SIZE;
		array[rear] = element;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1; 
		}
		int removedElement = array[front];
		front = (front + 1) % MAX_SIZE;
		size--;
		return removedElement;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}

public class Q13_Implementation {
	public static void main(String[] args) {
		CustomQueue myQueue = new CustomQueue();

		// Enqueue
		myQueue.enqueue(10);
		myQueue.enqueue(20);
		myQueue.enqueue(30);

		while (!myQueue.isEmpty()) {
			int removedElement = myQueue.dequeue();
			System.out.println("Removed element from the custom queue: " + removedElement);
		}
	}
}
