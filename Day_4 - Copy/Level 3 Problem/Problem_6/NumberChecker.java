import java.util.*;

public class NumberChecker {

	  // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find the product of cube of the factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int[] factors, int number) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != number) {
                sum += factors[i];
            }
        }
        return sum == number;
    }

    // Method to check if a number is abundant
    public static boolean isAbundantNumber(int[] factors, int number) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != number) {
                sum += factors[i];
            }
        }
        return sum > number;
    }

    // Method to check if a number is deficient
    public static boolean isDeficientNumber(int[] factors, int number) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != number) {
                sum += factors[i];
            }
        }
        return sum < number;
    }

    // Method to check if a number is strong
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Number: " + number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(factors, number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(factors, number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(factors, number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
		
		input.close();
   }

}