

import java.util.Scanner;

//package com.phase.java;

public class Test {

	public static void main(String[] args) {
		
		
				Scanner sc = new Scanner(System.in);
				System.out.println("enter first number :");
				int number1 = sc.nextInt();

				System.out.println("enter second number :");
				int number2 = sc.nextInt();ac
				int result = 0;
				char choice = sc.next().charAt(0);
				switch (choice) {
				case '+':
					result = number1 + number2;
					System.out.println(result);
					break;

				case '-':
					result = number1 - number2;
					System.out.println(result);
					break;

				case '*':
					result = number1 * number2;
					System.out.println(result);
					break;

				case '/':
					result = number1 / number2;
					System.out.println(result);
					break;

				default:
					System.out.println("Invalid operator");
					break;

				}



	}

}