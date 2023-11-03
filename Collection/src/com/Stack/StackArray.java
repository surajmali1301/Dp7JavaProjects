package com.Stack;

import java.util.Iterator;

class MyStack{
	
	int top;
	int size;
	int stc[];
	public MyStack(int size) {
		this.size=size;
	}
	
	boolean push(int data) {
		if (top<size-1) {
			top++;
			stc[top]=data;
			return true;
		} else {
			return false;
		}
	}
	
	void pop() {
		if(top!=1) {
			System.out.println("Element Deleted: "+stc[top]);
			top--;
		}
		else {
			System.out.println("Stack is empty");
		}
	}
	
	void display() {
		if(top!=-1) {
			System.out.println();
			System.out.print("[");
			for (int i = 0; i < stc.length; i++) {
				System.out.print(stc[i]+" ");
			}
			System.out.print("[");
			System.out.println();
		}
		else {
			System.out.println("Stack is empty");
		}
	}
	
}
public class StackArray {

	public static void main(String[] args) {


		MyStack s1 = new MyStack(5);
		
		s1.pop();
		s1.display();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		
		s1.display();
		
		s1.push(90);
		
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();

	}

}
