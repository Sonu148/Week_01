import java.util.Scanner;

public class UppercaseComparison {

    // Method to convert text to uppercase using charAt()
    public static String toUpperCaseCustom(String text) {
        StringBuilder upperCaseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // If the character is lowercase, convert it to uppercase
            if (ch >= 'a' && ch <= 'z') {
                upperCaseText.append((char) (ch - 32));
            } else {
                // If it's not lowercase, keep it as is
                upperCaseText.append(ch);
            }
        }
        return upperCaseText.toString();
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

        // Converting text to uppercase using the custom method
        String upperCaseTextCustom = toUpperCaseCustom(inputText);

        // Converting text to uppercase using the built-in method
        String upperCaseTextBuiltIn = inputText.toUpperCase();

        // Comparing the two uppercase strings
        boolean areEqual = compareStrings(upperCaseTextCustom, upperCaseTextBuiltIn);

        // Displaying the results
        System.out.println("\nCustom Uppercase Conversion: " + upperCaseTextCustom);
        System.out.println("Built-in Uppercase Conversion: " + upperCaseTextBuiltIn);
        System.out.println("Are both uppercase strings equal? " + areEqual);

        sc.close();
    }
}
