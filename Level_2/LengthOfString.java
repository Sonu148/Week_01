import java.util.Scanner;

public class LengthOfString {

    // Method to find string length without using length()
    public static int findLengthCustom(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputText = sc.next();

        // Calculating length using custom method
        int customLength = findLengthCustom(inputText);

        // Calculating length using built-in method
        int builtInLength = inputText.length();

        // Displaying the results
        System.out.println("\nCustom Length: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);

        sc.close();
    }
}
