import java.util.Scanner;

class SubstringComparison {

    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStringsCharAt(String str1, String str2) {
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
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Take user input for start and end indexes
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        // Create a substring using charAt()
        String substringUsingCharAt = createSubstring(text, start, end);

        // Create a substring using the built-in substring() method
        String substringUsingBuiltIn = text.substring(start, end);

        // Compare the two substrings
        boolean areEqual = compareStringsCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in method: " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);

        // Close the scanner
        scanner.close();
    }
}
