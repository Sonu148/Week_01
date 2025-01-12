import java.util.Scanner;

public class CollinearPoints {

    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the slopes of AB, BC, and AC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if the slopes are equal
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if the area is 0
        return (area == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the three points
        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter the coordinates of the third point (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check collinearity using slope method
        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the slope method.");
        } else {
            System.out.println("The points are NOT collinear using the slope method.");
        }

        // Check collinearity using area method
        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the area method.");
        } else {
            System.out.println("The points are NOT collinear using the area method.");
        }

        scanner.close();
    }
}
