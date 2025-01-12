import java.util.*;

class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Display options to the user
        System.out.println("Select a conversion option:");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter your choice (1-5): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter yards: ");
                double yards = sc.nextDouble();
                System.out.println("Feet: " + convertYardsToFeet(yards));
                break;
            case 2:
                System.out.print("Enter feet: ");
                double feet = sc.nextDouble();
                System.out.println("Yards: " + convertFeetToYards(feet));
                break;
            case 3:
                System.out.print("Enter meters: ");
                double meters = sc.nextDouble();
                System.out.println("Inches: " + convertMetersToInches(meters));
                break;
            case 4:
                System.out.print("Enter inches: ");
                double inchesToMeters = sc.nextDouble();
                System.out.println("Meters: " + convertInchesToMeters(inchesToMeters));
                break;
            case 5:
                System.out.print("Enter inches: ");
                double inchesToCm = sc.nextDouble();
                System.out.println("Centimeters: " + convertInchesToCentimeters(inchesToCm));
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        sc.close();
    }
}
