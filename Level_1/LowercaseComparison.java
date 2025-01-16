import java.util.Scanner;

public class LowercaseComparison {

    // Method to convert text to lowercase using charAt()
    public static String toLowerCaseCustom(String text) {
        StringBuilder lowerCaseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // If the character is uppercase, convert it to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseText.append((char) (ch + 32));
            } else {
                // If it's not uppercase, keep it as is
                lowerCaseText.append(ch);
            }
        }
        return lowerCaseText.toString();
    }

    // Method to compare two strings using charAt()
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
        System.out.print("Enter text: ");
        String inputText = sc.nextLine();

        // Converting text to lowercase using the custom method
        String lowerCaseTextCustom = toLowerCaseCustom(inputText);

        // Converting text to lowercase using the built-in method
        String lowerCaseTextBuiltIn = inputText.toLowerCase();

        // Comparing the two lowercase strings
        boolean areEqual = compareStrings(lowerCaseTextCustom, lowerCaseTextBuiltIn);

        // Displaying the results
        System.out.println("\nCustom Lowercase Conversion: " + lowerCaseTextCustom);
        System.out.println("Built-in Lowercase Conversion: " + lowerCaseTextBuiltIn);
        System.out.println("Are both lowercase strings equal? " + areEqual);

        sc.close();
    }
}
