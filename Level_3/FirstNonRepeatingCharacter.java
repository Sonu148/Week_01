import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in the string
    public static char firstNonRepeatingCharacter(String text) {
        // Create an array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256]; // There are 256 ASCII characters

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment frequency for the character
        }

        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return a special character (e.g., '-')
        return '-';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Finding the first non-repeating character
        char result = firstNonRepeatingCharacter(input);

        // Displaying the result
        if (result == '-') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }

        scanner.close();
    }
}
