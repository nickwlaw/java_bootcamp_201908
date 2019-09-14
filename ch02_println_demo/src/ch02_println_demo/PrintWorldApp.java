package ch02_println_demo;

import java.util.Scanner;

public class PrintWorldApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Console demo app!"); // welcome the user

		Scanner sc = new Scanner(System.in); // instantiate a Scanner and give it the System.in (java console) as its method for collecting user input
		
		String choice = "y"; // set the continue choice to 'y' to start so that we run the first time
		
		while (choice.equalsIgnoreCase("y")) { // check to see if the choice is a 'y' before moving on with our code

			System.out.print("Enter a whole number: "); // prompt the user for an int
			int number1 = sc.nextInt(); // collect the int without moving on to the next line
			sc.nextLine(); // move on to the next line
			
			System.out.print("Enter another whole number: ");
			int number2 = sc.nextInt();
			sc.nextLine();
			
			int sum = number1 + number2; // add the two ints together
			System.out.println("Your total is: " + sum); // display the sum to the user
			
			System.out.print("Enter a sentence with four or more words: "); // prompt the user for a string of multiple words
			String word1 = sc.next(); // collect the first word
			String word2 = sc.next(); // collect the second word
			String word3 = sc.next(); // collect the third word
			String restOfSentence = sc.nextLine(); // collect the rest of the sentence
			
			System.out.println(word1); // display the first word
			System.out.println(word2); // display the second word
			System.out.println(word3); // display the third word
			System.out.println(restOfSentence); // display the rest of the sentence

			System.out.print("Enter a double: "); // prompt the user for a double
			double decimal = sc.nextDouble(); // collect the double without moving on to the next line
			sc.nextLine(); // move on to the next line

			if (decimal > 50.0) { // check our double to see if it's over 50.0
				System.out.println(decimal + " is greater than 50.0!");
			} else if (decimal < 50.0) { // check our double to see if it's under 50.0
				System.out.println(decimal + " is less than 50.0");
			} else { // do this if our double is not over 50.0 or under 50.0
				System.out.println(decimal + " is 50.0");
			}


			System.out.print("Continue? (y/n): "); // prompt the user for a 'y' or 'n' to continue
			choice = sc.nextLine(); // collect the user's choice

		}

		System.out.println("\nThanks for playing!"); // bid our user farewell

		sc.close(); // close our scanner to prevent resource leaks
	}
}
