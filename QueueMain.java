package com.bridgelab.Assignment_14_Stack;

import java.util.Scanner;

/**
 * @author atik
 *	Ability to create queue
 */
public class QueueMain {
	public static Scanner scanner = new Scanner(System.in);
	public static int userMenu() {
		System.out.println(" 1. Display Queue\n 2. Insert element\n 3. exit");
		int choice = scanner.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		QueueImplementation queueImplementation = new QueueImplementation();
		
		boolean flag = true;
		while(flag){
			int choice = userMenu();
			switch (choice) {
			case 1: 
				System.out.println("Display queue elements : ");
				queueImplementation.display();
				flag = true;
				break;
			case 2:
				System.out.println("Enter element to insert into the queue : ");
				int element = scanner.nextInt();
				queueImplementation.enQueue(element);
				flag = true;
				break;
			default:
				flag = false;
				System.out.println("Thank you.");
				break;
			}
		}
	}
		
}
