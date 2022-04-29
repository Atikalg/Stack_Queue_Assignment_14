package com.bridgelab.Assignment_14_Stack;
/**
 * @author atik
 * stack operation implementation
 */
public class StackImplementation {
	Node top;
	//display method
	public void display() {
	
		if(top == null) 
			System.out.println("Stack is empty");
		else {
			Node temp = top;
			while(temp.next != null) {
				System.out.print(temp.data + "  ");
				temp = temp.next;
			}
			System.out.print(temp.data + "  ");
			System.out.println();
		}	
	}
	//push method to input element in stack
	public void push(int item) {
		Node node = new Node();
		node.data = item;
		if(node == null) {
			node.next = null;
		}
		else {
			node.next = top;
			top = node;
		}
	}
	// pop method
	public void pop() {
		if(top == null) {
			System.out.println("Stack is empty.");
		}
		else {
			Node temp = top;
			System.out.println("Removing " + temp.data);
			top = top.next;
		}
	}
	// peek method
	public int peek() {
		if(top != null) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty.");
			return -1;
		}
	}
}
