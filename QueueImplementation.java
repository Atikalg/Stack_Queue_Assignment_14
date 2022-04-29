package com.bridgelab.Assignment_14_Stack;

/**
 * @author atik
 * Queue display and insert and delete methods
 */
public class QueueImplementation {
	Node front = null;
	Node rear = null;
	//Display method
	public void display() {
		if(front == null) 
			System.out.println("Queue is empty");
		else {
			Node temp = front;
			while(temp.next != null) {
				System.out.print(temp.data + "  ");
				temp = temp.next;
			}
			System.out.print(temp.data + "  ");
			System.out.println();
		}	
	}
	//Inserting element method
	public void enQueue(int item) {
		Node node = new Node();
		node.data = item;
		if(front == null) {
			front = rear = node;
		}
		else {
			rear.next = node;
			rear = node;
		}
	}
	//Method to delete element
	public void deQueue() {
		if(front == null) {
			System.out.println("Queue is empty.");
		}
		Node temp = front;
		System.out.println("Removing " + temp.data);
		front = front.next;
		
		if(front == null)
			rear = null;
	}
}
