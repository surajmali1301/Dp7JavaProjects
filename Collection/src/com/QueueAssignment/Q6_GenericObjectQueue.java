package com.QueueAssignment;
//6.	WAP to create a Queue with Integer objects without using generics
import java.util.LinkedList;
import java.util.Queue;

class CustomObject1 {
    //custom class definition
}

public class Q6_GenericObjectQueue {
    public static void main(String[] args) {
        Queue<CustomObject1> customObjectQueue1 = new LinkedList<>();

        customObjectQueue1.add(new CustomObject1());
        customObjectQueue1.add(new CustomObject1());

        System.out.println("Generic Object Queue: " + customObjectQueue1);
    }
}
