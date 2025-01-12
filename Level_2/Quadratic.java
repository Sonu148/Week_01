import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculating the discriminant (delta)

        // If delta is positive, there are two distinct real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2}; // Return both roots in an array
        }
        // If delta is zero, there is one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] {root}; // Return one root in an array
        }
        // If delta is negative, there are no real roots
        else {
            return new double[] {}; // Return empty array as there are no real roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of Quadratic class to call methods
        Quadratic quadratic = new Quadratic();

        // Take user input for a, b, and c (coefficients of the quadratic equation)
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        // Call method to find the roots
        double[] roots = quadratic.findRoots(a, b, c);

        // Display the results
        if (roots.length == 2) {
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root is real and equal:");
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("There are no real roots.");
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
