import java.util.Scanner;

class MostFrequentCharacter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input);

        // Display the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        sc.close(); // Close Scanner
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop through the text to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment frequency of the character
        }

        // Find the character with the maximum frequency
        int maxFrequency = 0;
        char mostFrequentChar = '\0'; // Default value for most frequent character

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentChar = (char) i; // Update most frequent character
            }
        }

        return mostFrequentChar; // Return the most frequent character
    }
}
