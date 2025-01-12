import java.util.Scanner;

public class EuclideanDistance {

    // Method to calculate Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Formula for Euclidean distance: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line given two points (x1, y1) and (x2, y2)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope (m) using the formula: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept (b) using the formula: b = y1 - m * x1
        double b = y1 - m * x1;

        // Return the slope (m) and y-intercept (b) as an array
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs for two points (x1, y1) and (x2, y2)
        System.out.print("Enter the coordinates of the first point (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        // Find the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];
        
        System.out.printf("Equation of the line: y = %.2fx + %.2f\n", slope, intercept);

        scanner.close();
    }
}
