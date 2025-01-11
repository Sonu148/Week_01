import java.util.*;

class DigitFrequency {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Find the count of digits in the number
        int count = (int) Math.log10(number) + 1;

        // Initialize an array to store digits
        int[] digits = new int[count];

        // Fill the digits array with the digits of the number
        int index = 0;
        while (number > 0) {
            digits[index] = (int) (number % 10);  // Get the last digit
            number /= 10;  // Remove the last digit
            index++;
        }

        // Initialize a frequency array of size 10 to store frequency of each digit
        int[] frequency = new int[10];

        // Loop through the digits array and increase the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  // Only display digits that appear in the number
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        sc.close(); // Close the scanner
    }
}
