import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert the string to a char array
        int[] frequency = new int[characters.length]; // Array to store frequency of each character
        String[] result = new String[characters.length]; // Array to store the character and its frequency

        // Outer loop to iterate over each character in the text
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip if the character has already been counted
                int count = 1; // Initialize frequency count
                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++; // Increment frequency for duplicate characters
                        characters[j] = '0'; // Set duplicate characters to '0' to avoid recounting
                    }
                }
                frequency[i] = count; // Store the frequency of the character
                result[i] = characters[i] + ": " + count; // Store the character and its frequency in result array
            }
        }
        
        return result; // Return the result array containing characters and their frequencies
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Finding the character frequencies using nested loops
        String[] frequencies = findCharacterFrequency(input);

        // Displaying the result
        System.out.println("Character frequencies:");
        for (String frequency : frequencies) {
            if (frequency != null) {
                System.out.println(frequency);
            }
        }

        scanner.close();
    }
}
