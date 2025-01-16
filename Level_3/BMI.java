import java.util.Scanner;

public class BMI {

    // Method to find BMI and status based on weight (in kg) and height (in cm)
    public static String[] calculateBMI(double weight, double height) {
        double heightInMeters = height / 100; // Convert height from cm to meters
        double bmi = weight / (heightInMeters * heightInMeters); // BMI formula

        // Determine the status based on BMI value
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return the BMI and status as a string array
        return new String[] {String.format("%.2f", bmi), status};
    }

    // Method to process all team members' height and weight and compute BMI and status
    public static String[][] calculateAllBMI(double[][] heightWeight) {
        String[][] bmiDetails = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double height = heightWeight[i][1];
            String[] bmiStatus = calculateBMI(weight, height);

            // Store height, weight, BMI and status in the array
            bmiDetails[i][0] = String.format("%.2f", height); // Store height in cm
            bmiDetails[i][1] = String.format("%.2f", weight); // Store weight in kg
            bmiDetails[i][2] = bmiStatus[0]; // Store BMI
            bmiDetails[i][3] = bmiStatus[1]; // Store status
        }

        return bmiDetails;
    }

    // Method to display the BMI details in a tabular format
    public static void displayBMI(String[][] bmiDetails) {
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Person Height (cm)", "Weight (kg)", "BMI", "Status");
        for (String[] person : bmiDetails) {
            System.out.printf("%-15s %-15s %-15s %-15s\n", person[0], person[1], person[2], person[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPersons = 10; // Number of persons in the team
        double[][] heightWeight = new double[numberOfPersons][2];

        // Taking user input for height and weight of 10 persons
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = scanner.nextDouble(); // Weight input

            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = scanner.nextDouble(); // Height input
        }

        // Calculate BMI and status for all persons
        String[][] bmiDetails = calculateAllBMI(heightWeight);

        // Display the result in tabular format
        displayBMI(bmiDetails);

        scanner.close();
    }
}
