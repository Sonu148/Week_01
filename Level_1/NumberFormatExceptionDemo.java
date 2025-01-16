import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate the NumberFormatException
    public static void generateException(String text) {
        System.out.println("Attempting to parse: " + text);
        // This will throw NumberFormatException if the text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Attempting to parse: " + text);
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input as a String
        System.out.print("Enter a value to parse: ");
        String userInput = sc.nextLine();

        // Calling the method to generate the exception
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled in main: " + e.getMessage());
        }

        System.out.println("\nHandling exception within the method:");
        // Calling the method to handle the exception
        handleException(userInput);

        sc.close();
    }
}
