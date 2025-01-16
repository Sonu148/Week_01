import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string without using the String method length()
    public static int getStringLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length);  // Try accessing the character at index 'length'
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;  // Break when the index is out of bounds (i.e., end of string)
            }
        }
        return length;
    }

    // Method to find unique characters using charAt() and return them as a 1D array
    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is already present in the uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break; // No need to check further if character is already in uniqueChars
                }
            }

            // If it's a unique character, add it to the array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with the exact size of unique characters found
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to display the unique characters in the string
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Finding unique characters in the string
        char[] uniqueChars = findUniqueCharacters(input);

        // Displaying the result
        displayUniqueCharacters(uniqueChars);

        scanner.close();
    }
}
