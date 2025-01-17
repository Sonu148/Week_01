import java.util.Scanner;

class RemoveSpecificCharacter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Take the character to remove from the user
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);

        // Call the method to remove the character
        String modifiedString = removeCharacter(input, charToRemove);

        // Display the modified string
        System.out.println("Modified String: " + modifiedString);

        sc.close(); // Close Scanner
    }

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String text, char charToRemove) {
        // Create a StringBuilder to construct the new string
        StringBuilder result = new StringBuilder();

        // Loop through the text and append characters that are not equal to charToRemove
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != charToRemove) {
                result.append(text.charAt(i));
            }
        }

        // Convert StringBuilder back to String and return
        return result.toString();
    }
}
