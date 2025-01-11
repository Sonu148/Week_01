import java.util.*;

class TeamBMI {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Create arrays to store the data of persons
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Take input for weight and height of persons
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();
            System.out.print("Weight (in kilograms): ");
            weight[i] = sc.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]); // Calculate BMI
            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        // Display height, weight, BMI, and weight status of each person
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", height[i], weight[i], bmi[i], status[i]);
        }

        sc.close(); // Close the scanner
    }
}
