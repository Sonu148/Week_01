import java.util.Scanner;

public class CharacterTypeTable {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert uppercase to lowercase
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch); // Store the character
            result[i][1] = checkCharacterType(ch); // Store the type
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        for (String[] row : data) {
            System.out.printf("%-12s\t%s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Analyze the string
        String[][] analysis = analyzeString(input);

        // Display the result in a tabular format
        displayTable(analysis);

        sc.close();
    }
}
