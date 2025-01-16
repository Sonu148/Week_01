import java.util.*;

class IllegalArgumentExceptionDemo {

    public static void generateIllegalArgumentException(String text) {
        // Using substring with invalid start and end indexes
        System.out.println("Substring: " + text.substring(5, 2));
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            // Attempt to use substring with invalid start and end indexes
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("\nDemonstrating IllegalArgumentException:");
        try {
            generateIllegalArgumentException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling IllegalArgumentException:");
        handleIllegalArgumentException(text);

        // Closing scanner
        scanner.close();
    }
}
