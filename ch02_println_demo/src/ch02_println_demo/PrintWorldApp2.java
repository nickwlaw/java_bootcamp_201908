package ch02_println_demo;

import java.util.Scanner;

public class PrintWorldApp2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Console demo app!");

		Scanner sc = new Scanner(System.in);
		/* 
		 * useDelimiter() changes the behavior of the scanner.
		 * instead of looking for the next token after a space,
		 * it will look for the next token after each line end.
		 * on windows, a line end is a carriage return ("\\r") and a line feed ("\\n")
		 * on a mac, a line end is just a line feed ("\\n")
		 */
		sc.useDelimiter("\\r\\n");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter a whole number: ");
			int number1 = sc.nextInt();
			System.out.print("Enter another whole number: ");
			int number2 = sc.nextInt();

			System.out.print("Enter a sentence: ");
//			These will no longer work, because each token is now always going to be the full line
//			String word1 = sc.next();
//			String word2 = sc.next();
//			String word3 = sc.next();
//			String restOfSentence = sc.nextLine();
			String sentence = sc.next(); // now .next() will capture the entire line instead of just one word
			
//			System.out.println(word1);
//			System.out.println(word2);
//			System.out.println(word3);
//			System.out.println(restOfSentence);
			System.out.println(sentence);

			System.out.print("Enter a double: ");
			double decimal = sc.nextDouble();

			int sum = number1 + number2;

			if (decimal > 50.0) {
				System.out.println(decimal + " is greater than 50.0!");
			} else if (decimal < 50.0) {
				System.out.println(decimal + " is less than 50.0");
			} else {
				System.out.println(decimal + " is 50.0");
			}

			System.out.println("Your total is: " + sum);

			System.out.print("Continue? (y/n): ");
			choice = sc.next();

		}

		System.out.println("\nThanks for playing!");

		sc.close();
	}
}
