import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate that the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer."); 
        }

        // Create a String array to store the results
        String[] results = new String[number + 1];

        // Loop for checking the condition.
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; 
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; 
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; 
            } else {
                results[i] = String.valueOf(i); 
            }
        }

        // Loop  to display the results
        System.out.println("Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        input.close(); 
    }
}
