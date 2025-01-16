import java.util.Scanner;

public class SplitTextIntoWords {

    // Method to find the length of the string without using length()
    public static int findLengthCustom(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }
        return count;
    }

    // Method to split the text into words without using split()
    public static String[] splitTextCustom(String text) {
        int length = findLengthCustom(text);
        int spaceCount = 0;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Create arrays for words and word boundaries
        int[] spaceIndexes = new int[spaceCount + 1];
        String[] words = new String[spaceCount + 1];

        // Store the space indexes
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Add the string length as the last boundary
        spaceIndexes[spaceCount] = length;

        // Extract words using space indexes
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1; // Move to the next word start
        }

        return words;
    }

    // Method to compare two arrays of strings
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a line of text: ");
        String inputText = sc.nextLine();

        // Splitting text using custom method
        String[] customSplit = splitTextCustom(inputText);

        // Splitting text using built-in split() method
        String[] builtInSplit = inputText.split(" ");

        // Comparing the results
        boolean areEqual = compareStringArrays(customSplit, builtInSplit);

        // Displaying the results
        System.out.println("\nCustom Split: " + String.join(", ", customSplit));
        System.out.println("Built-in Split: " + String.join(", ", builtInSplit));
        System.out.println("Are both splits equal? " + areEqual);

        sc.close();
    }
}
