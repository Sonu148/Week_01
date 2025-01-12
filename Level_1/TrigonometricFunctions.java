import java.util.Scanner;
public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of an angle.
       public double[] calculateTrigonometricFunctions(double angle) {
	
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate the sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrigonometricFunctions calculator = new TrigonometricFunctions();

        // Take user input
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate trigonometric functions by calling the function.
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        scanner.close();
    }
}
