import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate the BMI of each person and populate the array
    public void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // weight in kg
            double heightInCm = data[i][1]; // height in cm
            double heightInMeters = heightInCm / 100; // convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            data[i][2] = bmi; // store BMI in third column
        }
    }

    // Method to determine the BMI status based on the BMI value
    public String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2]; // get the BMI value
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of BMI_Calculator to call methods
        BMI_Calculator bmiCalculator = new BMI_Calculator();

        // Create a 2D array to store weight, height, and BMI for 10 persons
        double[][] data = new double[10][3];

        // Take user input for weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble(); // weight

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble(); // height
        }

        // Call method to calculate BMI
        bmiCalculator.calculateBMI(data);

        // Get the BMI status of all persons
        String[] status = bmiCalculator.getBMIStatus(data);

        // Display the weight, height, BMI, and status for each person
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI     | Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d | %.2f      | %.2f      | %.2f    | %s\n", 
                (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
