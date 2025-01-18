import java.util.Scanner;

public class FactorialCalculator {

    // Recursive function to calculate factorial
    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return number * factorial(number - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            long result = factorial(number);

            // Display the result
            System.out.println("The factorial of " + number + " is: " + result);
        }

        scanner.close();
    }
}
