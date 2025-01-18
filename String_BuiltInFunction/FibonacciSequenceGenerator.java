import java.util.Scanner;

public class FibonacciSequenceGenerator {

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        long first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first);

        for (int i = 1; i < terms; i++) {
            System.out.print(", " + second);
            long next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the number of terms input from the user
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Generate and print the Fibonacci sequence
        generateFibonacci(terms);

        scanner.close();
    }
}
