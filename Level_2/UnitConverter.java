import java.util.*;

class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Display options to the user
        System.out.println("Select a conversion option:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter your choice (1-4): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter kilometers: ");
                double km = sc.nextDouble();
                System.out.println("Miles: " + convertKmToMiles(km));
                break;
            case 2:
                System.out.print("Enter miles: ");
                double miles = sc.nextDouble();
                System.out.println("Kilometers: " + convertMilesToKm(miles));
                break;
            case 3:
                System.out.print("Enter meters: ");
                double meters = sc.nextDouble();
                System.out.println("Feet: " + convertMetersToFeet(meters));
                break;
            case 4:
                System.out.print("Enter feet: ");
                double feet = sc.nextDouble();
                System.out.println("Meters: " + convertFeetToMeters(feet));
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        sc.close();
    }
}
