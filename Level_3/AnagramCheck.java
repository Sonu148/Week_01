import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check if the lengths of both strings are equal
        if (text1.length() != text2.length()) {
            return false; // If lengths are not equal, they cannot be anagrams
        }

        // Step 2: Create arrays to store the frequency of characters in both strings
        int[] freq1 = new int[256]; // Array to store frequency of characters for text1
        int[] freq2 = new int[256]; // Array to store frequency of characters for text2

        // Step 3: Loop through both strings to count the frequency of characters
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++; // Increment the frequency of character in text1
            freq2[text2.charAt(i)]++; // Increment the frequency of character in text2
        }

        // Step 4: Compare the frequencies of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // If the frequencies are not equal, the strings are not anagrams
            }
        }

        return true; // If all frequencies are equal, the strings are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the two texts
        System.out.println("Enter the first string:");
        String text1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams and display the result
        boolean result = areAnagrams(text1, text2);
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
