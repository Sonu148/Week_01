import java.util.Scanner;

public class NumberChecker4 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;
        
        // Find the number of digits in the original number
        int length = 0;
        while (temp > 0) {
            length++;
            temp /= 10;
        }

        // Extract the last 'length' digits of the square
        int lastDigits = square % (int) Math.pow(10, length);

        return lastDigits == number;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println("Is Prime: " + prime);

        // Check if the number is a neon number
        boolean neon = isNeonNumber(number);
        System.out.println("Is Neon Number: " + neon);

        // Check if the number is a spy number
        boolean spy = isSpyNumber(number);
        System.out.println("Is Spy Number: " + spy);

        // Check if the number is an automorphic number
        boolean automorphic = isAutomorphicNumber(number);
        System.out.println("Is Automorphic Number: " + automorphic);

        // Check if the number is a buzz number
        boolean buzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number: " + buzz);

        // Close the scanner
        scanner.close();
    }
}
