import java.util.Scanner;

public class NumberChecker {

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

    // Method to check if the number is a Duck Number (contains non-zero digit)
    public static boolean isDuckNumber(int number, int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int count = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, count);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit > smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
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

        // Step 3: Check if the number is a Duck Number
        boolean isDuck = isDuckNumber(number, digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Step 4: Check if the number is an Armstrong Number
        boolean isArmstrong = isArmstrongNumber(number, digits);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Step 5: Find largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest: " + largestAndSecondLargest[1]);

        // Step 6: Find smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest: " + smallestAndSecondSmallest[1]);

        // Close the scanner
        scanner.close();
    }
}
