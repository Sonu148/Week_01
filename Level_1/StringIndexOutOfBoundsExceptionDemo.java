import java.util.*;

class StringIndexOutOfBoundsExceptionDemo {

    public static void generateStringIndexOutOfBoundsException(String text) {
        // Accessing an invalid index to generate the exception
        System.out.println("Character at index 100: " + text.charAt(100));
    }

    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            // Attempt to access an invalid index
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
        try {
            generateStringIndexOutOfBoundsException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(text);

        // Closing scanner
        scanner.close();
    }
}
