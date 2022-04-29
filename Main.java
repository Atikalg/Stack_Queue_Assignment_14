package com.bridgelab.Assignment_14_Stack;

import java.util.Scanner;
/**
 * @author atik
 * Program to stack implementation push operation
 */
public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static int userMenu() {
		System.out.println(" 1.To display\r\n"
				+ " 2. push\r\n"
				+ " 3. pop \r\n"
				+ " 4. peek \r\n"
				+ " 5. exit");
		int choice = scanner.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		StackImplementation stackImplementation = new StackImplementation();
		boolean flag = true;
		while (flag) {
			int choice = userMenu();
			switch (choice) {
			case 1:
				System.out.println("Display queue elements : ");
				stackImplementation.display();
				flag = true;
				break;
			case 2:
				System.out.println("Enter element to insert into the queue : ");
				int element = scanner.nextInt();
				stackImplementation.push(element);
				flag = true;
				break;
			case 3:
				stackImplementation.pop();
				flag = true;
				break;
			case 4:
				System.out.print("Top element" + stackImplementation.peek());
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
