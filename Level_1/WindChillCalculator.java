import java.util.Scanner;
public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WindChillCalculator calculator = new WindChillCalculator();

        // Take user input as temperature.
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = input.nextDouble();

        // Calculate wind chill
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.println("The wind chill temperature is: " + windChill + "°F");

        input.close();
    }
}
