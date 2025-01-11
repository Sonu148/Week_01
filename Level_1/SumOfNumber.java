import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        
        // Creating the scanner object to store the input.
        Scanner input = new Scanner(System.in);
        
        // Initialize the index and sum variable.
        int index = 0;
        double sum = 0.0;
        
        // Create the array to store the number (size is 10).
        double[] element = new double[10];
        
        while (true) {
            // Taking the user input as number.
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            
            // If the number is zero or negative, break the loop.
            if (number <= 0 || index >= 10) {
                break;
            }

            // If the array is full, break the loop.
            if (index >= element.length) {
               System.out.println("Array is full. Cannot store more numbers.");
                break;
            }
            
            // Store the number in the array.
            element[index] = number;
            index++;  // Increment the index for the next number.
        }
        
        // Display the numbers the user entered.
        System.out.println("\nThe numbers entered are:");
        for (int i = 0; i <index; i++) {
            System.out.println(element[i]);
            sum += element[i]; 
        }
        
        // Display the sum of the numbers.
        System.out.println("\nThe sum of the numbers is: " + sum);
    }
}
