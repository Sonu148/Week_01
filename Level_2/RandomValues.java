import java.util.Arrays;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random numbers between 1000 and 9999
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return randomNumbers;
    }

    // Method to find the average, min, and max values of an array
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num); // Finding the minimum value
            max = Math.max(max, num); // Finding the maximum value
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max}; // Returning average, min, and max as an array
    }

    public static void main(String[] args) {
        RandomValues randomValues = new RandomValues();

        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = randomValues.generate4DigitRandomArray(5);

        // Find the average, min, and max values
        double[] results = randomValues.findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
