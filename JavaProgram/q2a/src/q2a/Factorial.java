package q2a;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Initialize a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Calculate and display the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Function to calculate factorial iteratively
    private static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Factorial is not defined for negative numbers
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
