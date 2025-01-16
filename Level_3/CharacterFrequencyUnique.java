import java.util.Scanner;

public class CharacterFrequencyUnique {

    // Method to find unique characters in the string using charAt() method
    public static char[] uniqueCharacters(String text) {
        boolean[] seen = new boolean[256]; // Array to track seen characters
        int uniqueCount = 0;

        // Count the unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!seen[currentChar]) {
                seen[currentChar] = true;
                uniqueCount++;
            }
        }

        // Create an array to store unique characters
        char[] uniqueChars = new char[uniqueCount];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (seen[i]) {
                uniqueChars[index++] = (char) i;
            }
        }
        
        return uniqueChars;
    }

    // Method to find the frequency of characters using the unique characters array
    public static String[][] findCharacterFrequency(String text) {
        // Find unique characters
        char[] uniqueChars = uniqueCharacters(text);
        
        // Create an array to store the frequencies of unique characters
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters to find their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }
            result[i][0] = String.valueOf(currentChar); // Store the character
            result[i][1] = String.valueOf(frequency); // Store the frequency
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
