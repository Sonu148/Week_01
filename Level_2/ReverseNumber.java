import java.util.*;

class ReverseNumber {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking a number as input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create a temporary variable to preserve the original number for the second loop
        int tempNumber = number;

        // Take a count variable to count number of digits of the number
        int count = 0;
        while (tempNumber > 0) {
            tempNumber /= 10; // Remove last digit of the number
            ++count;
        }

        // Initialize an array with the size equal to the count of digits
        int reverseArray[] = new int[count];

        // Create an index variable to store elements in the array
        int index = 0;

        // Reverse the digits and store them in the array
        while (number > 0) {
            int temp = number % 10; // Extract the last digit of number
            reverseArray[index] = temp; // Store the last digit in array
            number /= 10; // Remove the last digit of number
            ++index;
        }

        // Display the array
        System.out.print("Reversed digits: ");
        for (int x : reverseArray) {
            System.out.print(x + " ");
        }
        System.out.println();

        sc.close(); // Close the scanner
    }
}
