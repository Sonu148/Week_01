import java.util.Scanner;

public class NumberChecker3 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int length = digits.length;
        int[] reversed = new int[length];
        
        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }
        
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a Duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 1: Store the digits of the number in an array
        int[] digits = storeDigits(number);

        // Step 2: Count of digits in the number
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Step 3: Reverse the digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();

        // Step 4: Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is Palindrome: " + isPalindrome);

        // Step 5: Check if the number is a Duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Close the scanner
        scanner.close();
    }
}
