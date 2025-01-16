import java.util.Scanner;

public class TrimSpaces {

    // Method to trim the leading and trailing spaces using charAt()
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the first non-space character from the beginning
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the first non-space character from the end
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() and start, end index
    public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt() and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Trim leading and trailing spaces using custom method
        int[] trimIndexes = findTrimIndexes(input);
        String trimmedText = customSubstring(input, trimIndexes[0], trimIndexes[1]);

        // Trim using the built-in method for comparison
        String builtInTrimmedText = input.trim();

        // Compare the results
        boolean isEqual = compareStrings(trimmedText, builtInTrimmedText);

        // Display the results
        System.out.println("\nTrimmed text (custom method): '" + trimmedText + "'");
        System.out.println("Trimmed text (built-in method): '" + builtInTrimmedText + "'");
        System.out.println("Are the results the same? " + isEqual);

        sc.close();
    }
}
