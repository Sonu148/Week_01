import java.util.*;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // Evaluating the result
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
        
		// Closing the scanner object.
        input.close();
    }
}
