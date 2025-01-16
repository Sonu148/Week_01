import java.util.Scanner;

public class SplitWordsWithLengths {

    // Method to find the length of a string without using length()
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

        // Create arrays for word boundaries and words
        int[] spaceIndexes = new int[spaceCount + 1];
        String[] words = new String[spaceCount + 1];

        // Store space indexes
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Add string length as the last boundary
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

    // Method to generate a 2D array of words and their lengths
    public static String[][] generateWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Word
            wordLengthArray[i][1] = String.valueOf(findLengthCustom(words[i])); // Length as String
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a line of text: ");
        String inputText = sc.nextLine();

        // Splitting text into words
        String[] words = splitTextCustom(inputText);

        // Generating 2D array with words and their lengths
        String[][] wordLengthArray = generateWordLengthArray(words);

        // Displaying the results in a tabular format
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (String[] entry : wordLengthArray) {
            System.out.println(entry[0] + "\t" + Integer.parseInt(entry[1]));
        }

        sc.close();
    }
}
