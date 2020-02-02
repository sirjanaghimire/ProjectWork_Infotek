package com.JavaProject;

import java.util.Scanner;

public class Scanner_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int num = scanner.nextInt();
		
		if (num<10) {
			System.out.println("the number " + num +" is less than 10");
		}
		else {
			System.out.println("the number " + num +" is greater than 10");

		}
		scanner.close();
		
		
	}

}
