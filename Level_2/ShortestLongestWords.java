import java.util.Scanner;

public class ShortestLongestWords {

    // Method to find the length of a string without using length()
    public static int findLengthCustom(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
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

    // Method to generate a 2D array with words and their lengths
    public static String[][] generateWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Word
            wordLengthArray[i][1] = String.valueOf(findLengthCustom(words[i])); // Length as String
        }

        return wordLengthArray;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestLongest(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = shortestLength;

        for (String[] wordEntry : wordLengthArray) {
            int currentLength = Integer.parseInt(wordEntry[1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestWord = wordEntry[0];
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestWord = wordEntry[0];
            }
        }

        return new String[]{shortestWord, longestWord};
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

        // Finding shortest and longest words
        String[] result = findShortestLongest(wordLengthArray);

        // Displaying the results
        System.out.println("\nShortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);

        sc.close();
    }
}
