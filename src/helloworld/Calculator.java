package helloworld;
import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("List of operations: add, subtract, multiply, divide, or alphabetize");
		System.out.println("Enter an operation: ");
        String operations = input.nextLine();
        operations = operations.toLowerCase();
        if (operations.equals("add") || operations.equals("subtract") || operations.equals("multiply") || operations.equals("divide") || operations.equals("alphabetize")) {
        	switch(operations) {
	        	case "add":
	        		System.out.println("Enter two integers: ");
	        		if (input.hasNextInt()) {
	        			int number1 = input.nextInt();
	        			int number2 = input.nextInt();
	        			System.out.println("Answer: " + (number1+number2));
	        		} else
	        			System.out.println("Invalid input entered. Terminating...");
	        		break;
	        	case "subtract":
	        		System.out.println("Enter two integers: ");
	        		if (input.hasNextInt()) {
	        			int number3 = input.nextInt();
	        			int number4 = input.nextInt();
	        			System.out.println("Answer: " + (number3-number4));
	        		} else
	        			System.out.println("Invalid input entered. Terminating...");
	        		break;
	        	case "multiply":
	        		System.out.println("Enter two doubles: ");
	        		double number5 = input.nextDouble();
	        		double number6 = input.nextDouble();
	        		double result1 = number5*number6;
	        		System.out.println("Answer: " + String.format("%.2f", result1));
	        		break;
	        	case "divide":
	        		System.out.println("Enter two doubles: ");
	        		double number7 = input.nextDouble();
	        		double number8 = input.nextDouble();
	        		if (number8 != 0) {
	        			double result2 = number7/number8;
	        			System.out.println("Answer: " + String.format("%.2f", result2));
	        		} else System.out.println("Invalid input entered. Terminating...");
	        		break;
	        	case "alphabetize":
	        		System.out.println("Enter two words: ");
	        		String word1 = input.nextLine();
	        		//word1 = word1.toLowerCase();
	        		String word2 = input.nextLine();
	        		//word2 = word2.toLowerCase();
	        		if (word1.compareTo(word2) == 0)
	        			System.out.println ("Chicken or Egg.");
	        		else if (word1.compareTo(word2) > 0)
	        			System.out.println(word2 + " comes before " + word1 + " alphabetically");
	        		else
	        			System.out.println(word1 + " comes before " + word2 + " alphabetically");
	        		break;
        	}
        } else {
        	System.out.println("Invalid input entered. Terminating...");
        }
	}
}
