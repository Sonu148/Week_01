import java.util.*;

class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Display options to the user
        System.out.println("Select a conversion option:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice (1-6): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                System.out.println("Celsius: " + convertFahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.print("Enter Celsius: ");
                double celsius = sc.nextDouble();
                System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
                break;
            case 3:
                System.out.print("Enter Pounds: ");
                double pounds = sc.nextDouble();
                System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));
                break;
            case 4:
                System.out.print("Enter Kilograms: ");
                double kilograms = sc.nextDouble();
                System.out.println("Pounds: " + convertKilogramsToPounds(kilograms));
                break;
            case 5:
                System.out.print("Enter Gallons: ");
                double gallons = sc.nextDouble();
                System.out.println("Liters: " + convertGallonsToLiters(gallons));
                break;
            case 6:
                System.out.print("Enter Liters: ");
                double liters = sc.nextDouble();
                System.out.println("Gallons: " + convertLitersToGallons(liters));
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        sc.close();
    }
}
