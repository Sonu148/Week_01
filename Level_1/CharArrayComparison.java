import java.util.Scanner;

class CharArrayComparison {

    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
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

        // Get characters using user-defined method
        char[] userDefinedArray = getCharacters(text);

        // Get characters using built-in toCharArray() method
        char[] builtInArray = text.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);

        // Display the results
        System.out.println("Characters using user-defined method: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters using built-in method: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both character arrays equal? " + areEqual);

        // Close the scanner
        scanner.close();
    }
}
