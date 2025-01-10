import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking temperature in Fahrenheit.
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // Evaluating the result.
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // Display the result.
        System.out.println(fahrenheit + " Fahrenheit is " 
		+ celsius + " Celsius.");
         
        input.close();
    }
}
