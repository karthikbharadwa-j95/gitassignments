package com.te.javabasics.common;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scanner.next();
		String str1 = "";
		// reverse a string
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}

		if (str1.equalsIgnoreCase(str)) {
			System.out.println("Given string is a palindrome");
		} else {
			System.out.println("Given string is not a palindrome");
		}
	}

}
