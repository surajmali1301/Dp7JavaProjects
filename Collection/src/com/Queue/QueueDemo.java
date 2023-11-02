package com.Queue;

class MyQueue {

	int front, rear;
	int size;
	int arr[];

	public MyQueue() {

	}

	public MyQueue(int size) {
		front = 0;
		rear = 0;
		this.size = size;
		arr = new int[this.size];
	}

	public void insert(int data) {
		if (rear < size) {
			arr[rear] = data;
			rear++;
			System.out.println("Element Inserted");
		} else {
			System.out.println("Queue is Full");
		}
	}

	public void delete() {

		int temp;
		if (rear > front) {
			System.out.println("Element Deleted: "+arr[front]);
			for (temp = front; temp < rear - 1; temp++) {
				arr[temp] = arr[temp + 1];
			}
			arr[--rear] = 0;
		}
		else {
			System.out.println("Queue is empty");
		}
	}

	public void display() {
		if (rear > front) {
			for (int i = front; i < rear; i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("");
		}
	}
	
}

public class QueueDemo {

	public static void main(String[] args) {


		MyQueue mq = new MyQueue(5);
		mq.delete();
		
		mq.insert(10);
		mq.insert(20);
		mq.insert(30);
		mq.insert(40);
		mq.insert(50);

		mq.display();
		
		mq.insert(60);
		
		mq.delete();
		
		mq.display();
	}

}
