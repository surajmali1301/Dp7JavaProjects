package com.QueueAssignment;
//3.	WAP to create a Queue with user defined class objects &amp; using generics

import java.util.LinkedList;
import java.util.Queue;

class CustomObject {
	// Your custom class definition
}

public class Q3_StringGenerics {
	public static void main(String[] args) {
		Queue<CustomObject> customObjectQueue = new LinkedList<>();

		customObjectQueue.add(new CustomObject());
		customObjectQueue.add(new CustomObject());

		System.out.println("Custom Object Queue: " + customObjectQueue);
	}
}
