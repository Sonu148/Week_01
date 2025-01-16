import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from the start and end of the string iteratively
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }
        return true; // If all characters matched, it's a palindrome
    }

    // Logic 2: Recursive method to compare characters from start and end
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: If start index is greater than or equal to end, it's a palindrome
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false; // If characters don't match, it's not a palindrome
        }

        // Recursive call with the next characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed string using charAt() and toCharArray()
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray(); // Convert the text to a character array
        char[] reversed = new char[text.length()]; // Create a character array for the reversed string

        // Reverse the text using charAt() method
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare the original and reversed character arrays
        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i]) {
                return false; // If characters don't match, it's not a palindrome
            }
        }

        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // Logic 1: Iterative method to check palindrome
        boolean resultIterative = isPalindromeIterative(input);
        System.out.println("Palindrome check (Iterative method): " + resultIterative);

        // Logic 2: Recursive method to check palindrome
        boolean resultRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        System.out.println("Palindrome check (Recursive method): " + resultRecursive);

        // Logic 3: Using char arrays to check palindrome
        boolean resultCharArray = isPalindromeUsingCharArray(input);
        System.out.println("Palindrome check (CharArray method): " + resultCharArray);

        scanner.close();
    }
}
