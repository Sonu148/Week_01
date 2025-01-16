import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256]; // There are 256 ASCII characters

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment frequency for the character
        }

        // Create an array to store characters and their frequencies
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Loop through the frequency array and store characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Character as a string
                result[index][1] = String.valueOf(frequency[i]);  // Frequency as a string
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Finding the character frequencies
        String[][] frequencies = findCharacterFrequency(input);

        // Displaying the result in tabular format
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + "         | " + frequencies[i][1]);
        }

        scanner.close();
    }
}
