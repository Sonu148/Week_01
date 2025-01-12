import java.util.Scanner;

public class NumberChecker2 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        return digits;
    }

    // Method to find the sum of digits in the number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of digits in the number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if the number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  // 10 for digits 0-9, first column for digit, second for frequency

        // Initialize the first column (digits) with values 0 to 9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 1: Store the digits of the number in an array
        int[] digits = storeDigits(number);

        // Step 2: Count of digits in the number
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Step 3: Sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        // Step 4: Sum of squares of digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Step 5: Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Step 6: Frequency of each digit
        int[][] frequencies = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequencies[i][1] > 0) {
                System.out.println(frequencies[i][0] + ": " + frequencies[i][1]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
