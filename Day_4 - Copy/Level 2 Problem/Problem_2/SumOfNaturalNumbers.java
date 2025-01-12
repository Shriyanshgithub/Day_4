import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        // Base case: if n is 1, return 1 (sum of the first natural number)
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum of first n numbers is n + sum of first (n-1) numbers
        return n + sumRecursive(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2; // Formula for the sum of first n natural numbers
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("The input is not a natural number. Exiting.");
            return;
        }

        // Calculate the sum using recursion
        int recursiveSum = sumRecursive(n);

        // Calculate the sum using the formula
        int formulaSum = sumFormula(n);

        // Display the results
        System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaSum);

        // Compare the results and show if they are equal
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the correct result.");
        } else {
            System.out.println("There is an error in the computations.");
        }
    }
}