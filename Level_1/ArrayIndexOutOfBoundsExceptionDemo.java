import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Accessing an invalid index...");
        // Accessing an index larger than the array length to cause an exception
        System.out.println("Name at index 10: " + names[10]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing an invalid index...");
            System.out.println("Name at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array of names
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};

        // Displaying the available names
        System.out.println("Available names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }

        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException:");
        try {
            // Calling the method to generate the exception
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }

        System.out.println("\nHandling the exception within the method:");
        // Calling the method to handle the exception
        handleException(names);

        sc.close();
    }
}
