package com.LinkedListAssignment;

import java.util.Collections;
import java.util.LinkedList;

public class Q_1Shuffle {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        Collections.shuffle(linkedList);

        System.out.println("Shuffled Linked List: " + linkedList);
    }
}
