import java.util.*;

class TeamBMI2DArray {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Create a 2D array to store height, weight, and BMI
        double[][] personData = new double[number][3];
        // Create an array to store the weight status
        String[] weightStatus = new String[number];

        // Take input for weight and height of persons
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            do {
                System.out.print("Height (in meters, positive value): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Weight (in kilograms, positive value): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            personData[i][2] = weight / (height * height); // Calculate BMI

            // Determine weight status based on BMI
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display height, weight, BMI, and weight status
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close(); // Close the scanner
    }
}
