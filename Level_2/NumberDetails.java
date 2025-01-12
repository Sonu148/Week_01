import java.util.Scanner;

public class NumberDetails {

    // Method to check whether the number is positive or negative
    public String isPositive(int number) {
        if (number >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    // Method to check whether the number is even or odd
    public String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers
    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 == number2) {
            return 0; // both are equal
        } else {
            return -1; // number1 is less
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of NumberDetails class to call methods
        NumberDetails details = new NumberDetails();

        // Create an array to store the 5 numbers
        int[] numbers = new int[5];

        // Take user input for the 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Loop through the array and apply the methods
        for (int i = 0; i < numbers.length; i++) {
            String sign = details.isPositive(numbers[i]);
            if (sign.equals("positive")) {
                String evenOdd = details.isEven(numbers[i]);
                System.out.println("Number " + numbers[i] + " is " + sign + " and it is " + evenOdd + ".");
            } else {
                System.out.println("Number " + numbers[i] + " is " + sign + ".");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = details.compare(numbers[0], numbers[numbers.length - 1]);

        // Display the comparison result
        if (comparisonResult == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("The first element is equal to the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
