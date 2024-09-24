package sampleprogram;

import java.util.Scanner;

public class PalindromeCheckAlternative {
	 public static void main(String[] args) {
	        // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
//	        System.out.print("Enter a string: ");
//	        String input = scanner.nextLine();

	        // Reverse the string
	        String input="hello world";
	        String reversed = new StringBuilder(input).reverse().toString();
	        System.out.println("reverse "+reversed);

	        // Check if the original string is equal to the reversed string
	        if (input.equals(reversed)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

}
