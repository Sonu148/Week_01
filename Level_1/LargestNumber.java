import java.util.Scanner;
public class LargestNumber {
    public static void largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int smallest = Integer.MAX_VALUE; // Initialize to the largest possible value

        // Calculate the largest number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Calculate the smallest number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Display the largest and smallest number
        System.out.println("The largest number is " + largest + " and the smallest is " + smallest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[3];

        // Taking the input from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }

        largestAndSmallest(numbers);

        // Closing the scanner object
        input.close();
    }
}
