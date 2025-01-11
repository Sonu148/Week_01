import java.util.*;

class LargestElement2 {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input for a number with at least 10 digits
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); // Use long to accommodate large numbers

        // Define a variable for the initial array size
        int maxDigit = 10;

        // Define an array to store the digits
        int[] arr = new int[maxDigit];

        // Create an integer variable index with the value 0 to reflect the array index
        int index = 0;

        // Use a loop to extract digits from the number
        while (number > 0) {
            if (index == maxDigit) {
                // If the index reaches maxDigit, increase the array size
                maxDigit += 10; // Increase maxDigit by 10
                int[] temp = new int[maxDigit]; // Create a new array with the new size
                System.arraycopy(arr, 0, temp, 0, arr.length); // Copy existing elements
                arr = temp; // Assign the temp array back to arr
            }

            // Extract the last digit and store it in the array
            arr[index] = (int) (number % 10); // Extract the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        // Define variables to store the largest and second largest digits
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;

        // Loop through the array to find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            int x = arr[i];
            if (x > max) { // If current digit is greater than max
                secMax = max; // Update second largest
                max = x; // Update largest
            } else if (x > secMax && x != max) { // If current digit is the second largest
                secMax = x;
            }
        }

        // Display the largest and second-largest digits
        System.out.println("The largest digit is: " + max);
        System.out.println("The second largest digit is: " + secMax);

        sc.close(); // Close the scanner
    }
}
